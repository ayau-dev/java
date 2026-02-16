//// 1. Шартты операторлар (if / switch)
////Пайдаланушы енгізген санның оң, теріс немесе нөл екенін анықтайтын бағдарлама жазыңыз.
//    // 1-tapsyrma
//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Санды енгізіңіз: ");
//        int number = scanner.nextInt();
//
//        if (number > 0) {
//            System.out.println("Сан оң.");
//        } else if (number < 0) {
//            System.out.println("Сан теріс.");
//        } else {
//            System.out.println("Сан нөлге тең.");
//        }
//
//        scanner.close();
//    }
//}
//
//
////Енгізілген санның 3-ке және 5-ке бөлінетінін тексеретін бағдарлама құрыңыз.
//    //2-tapsyrma
//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Санды енгізіңіз: ");
//        int number = scanner.nextInt();
//
//        if (number % 3 == 0 && number % 5 == 0) {
//            System.out.println("Сан 3-ке және 5-ке бөлінеді.");
//        } else if (number % 3 == 0) {
//            System.out.println("Сан 3-ке бөлінеді.");
//        } else if (number % 5 == 0) {
//            System.out.println("Сан 5-ке бөлінеді.");
//        } else {
//            System.out.println("Сан 3-ке де, 5-ке де бөлінбейді.");
//        }
//
//        scanner.close();
//    }
//}
//
//
//
//
////Switch-Case мысалы бойынша (апта күні)
////Пайдаланушы енгізген ай нөмірі (1–12) бойынша ай атауын шығарыңыз.
//    //Тапсырма 1
//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Ай нөмірін енгізіңіз (1-12): ");
//        int month = scanner.nextInt();
//
//        switch (month) {
//            case 1:
//                System.out.println("Қаңтар");
//                break;
//            case 2:
//                System.out.println("Ақпан");
//                break;
//            case 3:
//                System.out.println("Наурыз");
//                break;
//            case 4:
//                System.out.println("Сәуір");
//                break;
//            case 5:
//                System.out.println("Мамыр");
//                break;
//            case 6:
//                System.out.println("Маусым");
//                break;
//            case 7:
//                System.out.println("Шілде");
//                break;
//            case 8:
//                System.out.println("Тамыз");
//                break;
//            case 9:
//                System.out.println("Қыркүйек");
//                break;
//            case 10:
//                System.out.println("Қазан");
//                break;
//            case 11:
//                System.out.println("Қараша");
//                break;
//            case 12:
//                System.out.println("Желтоқсан");
//                break;
//            default:
//                System.out.println("Қате! 1 мен 12 аралығында сан енгізіңіз.");
//        }
//
//        scanner.close();
//    }
//}
//
//
////Қарапайым калькулятор жасаңыз: екі сан және амал таңбасы (+, -, *, /) енгізіледі, есептеу switch арқылы орындалады.
//    //2-tapsyrma
//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Бірінші санды енгізіңіз: ");
//        double num1 = scanner.nextDouble();
//
//        System.out.print("Екінші санды енгізіңіз: ");
//        double num2 = scanner.nextDouble();
//
//        System.out.print("Амал таңбасын енгізіңіз (+, -, *, /): ");
//        char operator = scanner.next().charAt(0);
//
//        switch (operator) {
//            case '+':
//                System.out.println("Нәтиже: " + (num1 + num2));
//                break;
//            case '-':
//                System.out.println("Нәтиже: " + (num1 - num2));
//                break;
//            case '*':
//                System.out.println("Нәтиже: " + (num1 * num2));
//                break;
//            case '/':
//                if (num2 != 0) {
//                    System.out.println("Нәтиже: " + (num1 / num2));
//                } else {
//                    System.out.println("Қате! Нөлге бөлуге болмайды.");
//                }
//                break;
//            default:
//                System.out.println("Қате! Дұрыс амал енгізіңіз.");
//        }
//
//        scanner.close();
//    }
//}
//
//
//
//
//
////2. Циклдер
////For циклі бойынша
////Тапсырма 1
////1-ден 100-ге дейінгі жұп сандарды экранға шығарыңыз.
//public class main {
//    public static void main(String[] args) {
//
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//
//    }
//}
//
//
//
////Тапсырма 2
////1-ден N-ге дейінгі сандардың қосындысын есептеңіз (N — пайдаланушы енгізеді).
//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("N санын енгізіңіз: ");
//        int n = scanner.nextInt();
//
//        int sum = 0;
//
//        for (int i = 1; i <= n; i++) {
//            sum += i;   // sum = sum + i
//        }
//
//        System.out.println("1-ден " + n + "-ге дейінгі сандардың қосындысы: " + sum);
//
//        scanner.close();
//    }
//}
//
//
//
//
////While циклі бойынша
////Тапсырма 1
////Пайдаланушы оң сан енгізгенше бағдарлама қайталанып сұрау жасасын.
//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int number = 0;
//
//        while (number <= 0) {
//            System.out.print("Оң сан енгізіңіз: ");
//            number = scanner.nextInt();
//        }
//
//        System.out.println("Дұрыс сан енгізілді: " + number);
//        scanner.close();
//    }
//}
//
//
////Тапсырма 2
////Берілген N санының факториалын while циклі арқылы есептеңіз.
//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("N санын енгізіңіз: ");
//        int n = scanner.nextInt();
//
//        long factorial = 1;
//        int i = 1;
//
//        while (i <= n) {
//            factorial *= i;
//            i++;
//        }
//
//        System.out.println(n + " санының факториалы: " + factorial);
//
//        scanner.close();
//    }
//}
//
//
//
//
//
////Do-While циклі бойынша
////Тапсырма 1
////Пайдаланушы дұрыс пароль енгізгенше, парольді қайта сұрайтын бағдарлама құрыңыз.
//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        String correctPassword = "1234";
//        String inputPassword;
//
//        do {
//            System.out.print("Парольді енгізіңіз: ");
//            inputPassword = scanner.nextLine();
//
//            if (!inputPassword.equals(correctPassword)) {
//                System.out.println("Қате пароль! Қайта енгізіңіз.");
//            }
//
//        } while (!inputPassword.equals(correctPassword));
//
//        System.out.println("Қош келдіңіз!");
//
//        scanner.close();
//    }
//}
//
//
////Тапсырма 2
////Қарапайым мәзір ұйымдастырыңыз (1 – хабарлама шығару, 2 – қосу, 3 – шығу). Бағдарлама 3 таңдалғанша қайталансын.
//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int choice;
//
//        do {
//            System.out.println("\n--- МӘЗІР ---");
//            System.out.println("1 - Хабарлама шығару");
//            System.out.println("2 - Қосу");
//            System.out.println("3 - Шығу");
//            System.out.print("Таңдауыңызды енгізіңіз: ");
//
//            choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("Сәлем! Бұл қарапайым мәзір.");
//                    break;
//
//                case 2:
//                    System.out.print("Бірінші сан: ");
//                    int a = scanner.nextInt();
//                    System.out.print("Екінші сан: ");
//                    int b = scanner.nextInt();
//                    System.out.println("Қосынды: " + (a + b));
//                    break;
//
//                case 3:
//                    System.out.println("Бағдарлама аяқталды.");
//                    break;
//
//                default:
//                    System.out.println("Қате таңдау! Қайта енгізіңіз.");
//            }
//
//        } while (choice != 3);
//
//        scanner.close();
//    }
//}
//
//
////3. Массивтер
////Бірөлшемді массив
////Тапсырма 1
////Массив ішіндегі ең үлкен элементті табыңыз.
//public class main {
//    public static void main(String[] args) {
//
//        int[] arr = {3, 7, 2, 9, 5};
//
//        int max = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//
//        System.out.println("Ең үлкен элемент: " + max);
//    }
//}
//
//
////Тапсырма 2
////Массивтегі жұп элементтердің санын анықтаңыз.
//public class main {
//    public static void main(String[] args) {
//
//        int[] arr = {3, 7, 2, 9, 6};
//
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                count++;
//            }
//        }
//
//        System.out.println("Жұп элементтер саны: " + count);
//    }
//}
//
//
////Екіөлшемді массив
////Тапсырма 1
////Матрицаның барлық элементтерінің қосындысын есептеңіз.
//public class main {
//    public static void main(String[] args) {
//
//        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
//        int sum = 0;
//
//        for (int[] row : m) {
//            for (int val : row) {
//                sum += val;
//            }
//        }
//
//        System.out.println("Қосынды: " + sum);
//    }
//}
//
//
////Тапсырма 2
////Екіөлшемді массивтің әр жолындағы ең үлкен элементті табыңыз.
//public class main {
//    public static void main(String[] args) {
//
//        int[][] m = {{3,8,1},{4,2,9},{7,5,6}};
//
//        for (int i = 0; i < m.length; i++) {
//            int max = m[i][0];
//            for (int val : m[i]) {
//                if (val > max) max = val;
//            }
//            System.out.println((i+1)+"-жол ең үлкені: "+max);
//        }
//    }
//}





