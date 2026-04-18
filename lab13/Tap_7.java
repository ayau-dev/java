import java.util.*;

public class Tap_7 {
    public static void main(String[] args) {
        Arrays.asList("java","code")
                .stream()
                .map(s->Character.toUpperCase(s.charAt(0))+s.substring(1))
                .forEach(System.out::println);
    }
}