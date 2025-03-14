import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InternalFrameSingletonExample extends JFrame {
    private JDesktopPane desktopPane;
    private InternalFrameSingleton internalFrame;

    public InternalFrameSingletonExample() {
        setTitle("Internal Frame Singleton Example");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 创建桌面面板
        desktopPane = new JDesktopPane();
        add(desktopPane, BorderLayout.CENTER);

        // 创建菜单栏
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createInternalFrame();
            }
        });
        fileMenu.add(newMenuItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
    }

    // 创建内部窗体
    private void createInternalFrame() {
        if (internalFrame == null) {
            internalFrame = InternalFrameSingleton.getInstance();
            internalFrame.setSize(200, 150);
            internalFrame.setLocation(20, 20);
            internalFrame.setVisible(true);
            desktopPane.add(internalFrame);
        } else {
            internalFrame.toFront();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new InternalFrameSingletonExample().setVisible(true);
            }
        });
    }
}

// 内部窗体类（单例模式）
class InternalFrameSingleton extends JInternalFrame {
    private static InternalFrameSingleton instance;

    private InternalFrameSingleton(String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable) {
        super(title, resizable, closable, maximizable, iconifiable);
    }

    public static synchronized InternalFrameSingleton getInstance() {
        if (instance == null) {
            instance = new InternalFrameSingleton("Document", true, true, true, true);
        }
        return instance;
    }
}
