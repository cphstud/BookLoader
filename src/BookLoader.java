import java.text.Format;
import java.text.Normalizer;
import java.util.Random;

public class BookLoader {
    static Random rd = new Random();

    public static void loadBooks(Book[] books) {
        for(int i=0;i<books.length;i++) {
            int rd2 = rd.nextInt(50)+40;
            int rd = (int)(Math.random()*1000);
            // TODO:Hvad sker der mon her?
            String s= String.format("%c%c",rd2,rd2+1);
            Book b = new Book(i,"Kurts "+s,rd2);
            books[i]=b;
        }
    }
}
