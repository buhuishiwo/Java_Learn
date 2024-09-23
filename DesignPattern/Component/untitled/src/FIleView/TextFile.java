package FIleView;

public class TextFile extends AbstractFile{
    public TextFile(String fileName) {
        super(fileName);
    }

    @Override
    public void add(AbstractFile element) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove(AbstractFile element) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void display() {
        System.out.println(filename);
    }
}
