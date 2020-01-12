package pack;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy align;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        if (align != null) {
            align.print(text);
        } else {
            System.out.println(text);
        }
    }

    public String getText(Paragraph p){
        return text;
    }

    public AlignStrategy getAlignStrategy() {
        return align;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.align = alignStrategy;
    }

    @Override
    public void add(Element element) {
        System.out.println("ERORR");
    }

    @Override
    public void remove(Element element) {
        System.out.println("ERORR");

    }

    @Override
    public Element getElement(int index) {
        System.out.println("ERORR");
        return null;
    }

}
