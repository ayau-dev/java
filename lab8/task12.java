public class task12 {

    public static void main(String[] args) {

        for(double x=-5; x<=5; x++){

            double d = 3*x*x + 2*x + 1;

            if(d!=0){
                double y = 1/d;
                System.out.println("x=" + x + " y=" + y);
            }
        }
    }
}