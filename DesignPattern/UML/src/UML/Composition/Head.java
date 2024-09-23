package UML.Composition;

public class Head {
    private Mouth mouth;
    public Head(Mouth mouth) {
        mouth = new Mouth();
    }
}
