import pack.*;

import align.*;

public class Main {

    public static void main(String[] args) {
        Book Carte1 = new Book("Carte1");
        Section capitol1 = new Section("Capitolul 1");
        capitol1.add(new Paragraph("text1"));
        capitol1.add(new Paragraph("text2"));
        capitol1.add(new Image("Image1"));
        Carte1.add(capitol1);
        Paragraph p = new Paragraph("paragraf1");
    ////////    p.setAlignStrategy(p.) ?????
        Carte1.add(p);
        Carte1.print();

    }
}
