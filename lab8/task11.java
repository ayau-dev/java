public class task11 {

    public static void main(String[] args) {

        for(double x=-5; x<=5; x++){

            if(x!=0){
                double y = 3 - 2/x - 3/(x*x);
                System.out.println("x=" + x + " y=" + y);
            }
        }
    }
}