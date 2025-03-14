package FIleView;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
    protected List<AbstractFile> files = new ArrayList<>();

    public Folder(String filename) {
        super(filename);
    }
    @Override
    public void add(AbstractFile element) {
        files.add(element);
    }

    @Override
    public void remove(AbstractFile element) {
        files.remove(element);
    }

    @Override
    public void display() {
        System.out.println(filename);
        for (AbstractFile file : files) {
            file.display();
        }
    }
}
