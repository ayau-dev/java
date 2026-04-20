import java.util.*;

public class zad7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int r;

        do {
            r = rand.nextInt(10);
            System.out.println(r);
        } while (r != 0);
    }
}