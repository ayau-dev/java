package lab7;//1-tapsyrma
import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[20];
        int sum = 0;

        for (int i = 0; i < 20; i++) {
            A[i] = sc.nextInt();
            if (A[i] < 0) {
                sum += A[i];
            }
        }

        System.out.println("Теріс элементтердің қосындысы: " + sum);
    }
}



//2-tapsyrma
import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] B = new int[15];
        int sum = 0;

        for (int i = 0; i < 15; i++) {
            B[i] = sc.nextInt();
            if (B[i] > 0) {
                sum += B[i];
            }
        }

        System.out.println("Оң элементтердің қосындысы: " + sum);
    }
}



//3-tapsyrma
import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] A = new double[12];
        double product = 1;

        for (int i = 0; i < 12; i++) {
            A[i] = sc.nextDouble();
            if (A[i] < 0) {
                product *= A[i];
            }
        }

        System.out.println("Теріс элементтердің көбейтіндісі: " + product);
    }
}



//4-tapsyrma
import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] C = new double[25];
        double product = 1;

        for (int i = 0; i < 25; i++) {
            C[i] = sc.nextDouble();
            if (C[i] > 0) {
                product *= C[i];
            }
        }

        System.out.println("Оң элементтердің көбейтіндісі: " + product);
    }
}



//5-tapsyrma
import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] D = new double[17];
        double sum = 0;

        for (int i = 0; i < 17; i++) {
            D[i] = sc.nextDouble();
            sum += D[i];
        }

        double average = sum / 17;

        System.out.println("Арифметикалық орта: " + average);
    }
}



//6-tapsyrma
import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[10][10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            B[i] = 0;
            for (int j = 0; j < 10; j++) {
                A[i][j] = sc.nextInt();
                if (A[i][j] < 0) {
                    B[i] += A[i][j];
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
    }
}



//7-tapsyrma
import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] B = new double[5][5];
        double[] A = new double[5];

        for (int i = 0; i < 5; i++) {
            A[i] = 0;
            for (int j = 0; j < 5; j++) {
                B[i][j] = sc.nextDouble();
                if (B[i][j] > 0) {
                    A[i] += B[i][j];
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
        }
    }
}



//8-tapsyrma
import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] A = new double[12][6];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = sc.nextDouble();
            }
        }

        for (int j = 0; j < 6; j++) {
            double product = 1;
            for (int i = 0; i < 12; i++) {
                if (A[i][j] < 0) {
                    product *= A[i][j];
                }
            }
            System.out.println("Баған " + j + " көбейтіндісі: " + product);
        }
    }
}



//9-tapsyrma
import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] C = new int[5][5];
        int product = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                C[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            if (C[i][i] > 0) {
                product *= C[i][i];
            }
        }

        System.out.println("Негізгі диагональ оң элементтерінің көбейтіндісі: " + product);
    }
}



//10-tapsyrma
import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] D = new double[7][7];
        double sum = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                D[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 7; i++) {
            sum += D[i][i];
        }

        double average = sum / 7;

        System.out.println("Негізгі диагональ арифметикалық орта: " + average);
    }
}