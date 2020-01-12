package pack;

public class ImageProxy implements Element {
    private String imageName;
    Image image = null;

    public ImageProxy(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void print() {
        if (this.image == null) {
            this.image = new Image(this.imageName);
        }
        this.image.print();
    }

    @Override
    public void add(Element element) {
        System.out.println("ERORR proxy img");
    }

    @Override
    public void remove(Element element) {
        System.out.println("ERORR proxy img");
    }

    @Override
    public Element getElement(int index) {
        System.out.println("ERORR proxy img");
        return null;
    }
}
