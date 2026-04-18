public class task7 {

    public static void main(String[] args) {

        for(double x=-5; x<=5; x++){

            double y = Math.cos(x-1) + Math.abs(x);

            System.out.println("x=" + x + " y=" + y);
        }
    }
}