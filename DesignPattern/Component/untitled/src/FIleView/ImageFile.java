package FIleView;

public class ImageFile extends AbstractFile{
    public ImageFile(String filename) {
        super(filename);
    }

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
