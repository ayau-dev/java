import java.util.*;

public class StringTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Жол енгізіңіз: ");
        String str = sc.nextLine();

        // Тапсырма 1: Дауысты және дауыссыз санын табу
        int vowels = 0, consonants = 0;
        String vowelLetters = "aeiouAEIOUаәеёиіоуүұыAEIOUYӘІҢҒҮҰҚӨҺ";

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowelLetters.indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Дауысты: " + vowels);
        System.out.println("Дауыссыз: " + consonants);

        // Тапсырма 2: Бос орындарды жою
        String noSpaces = str.replace(" ", "");
        System.out.println("Бос орынсыз: " + noSpaces);

        // Тапсырма 3: Ең ұзын сөз
        String[] words = str.split(" ");
        String longest = "";
        for (String w : words) {
            if (w.length() > longest.length())
                longest = w;
        }
        System.out.println("Ең ұзын сөз: " + longest);

        // Тапсырма 4: Бос орынсыз таңба саны
        int count = str.replace(" ", "").length();
        System.out.println("Таңба саны (бос орынсыз): " + count);

        // Тапсырма 5: startsWith()
        System.out.print("Қандай сөзден басталсын: ");
        String startWord = sc.nextLine();
        System.out.println("Бастала ма: " + str.startsWith(startWord));

        // Тапсырма 6: endsWith()
        System.out.print("Қандай таңбамен аяқталсын: ");
        String endWord = sc.nextLine();
        System.out.println("Аяқтала ма: " + str.endsWith(endWord));

        // Тапсырма 7: Кері айналдыру
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Кері жол: " + reversed);

        // Тапсырма 8: Сандарды жою
        String noDigits = str.replaceAll("\\d", "");
        System.out.println("Сандарсыз: " + noDigits);

        // Тапсырма 9: Дауыстыларды * ауыстыру
        String replacedVowels = str.replaceAll("[aeiouAEIOUаәеёиіоуүұы]", "*");
        System.out.println("Дауыстылар орнына *: " + replacedVowels);

        // Тапсырма 10: Тек цифр ма?
        boolean onlyDigits = str.matches("\\d+");
        System.out.println("Тек цифрлар ма: " + onlyDigits);

        sc.close();
    }
}