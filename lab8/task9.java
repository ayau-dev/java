public class task9 {

    public static void main(String[] args) {

        for(double x=-5; x<=5; x++){

            if(x!=2){
                double y = (x+3)/(x-2);
                System.out.println("x=" + x + " y=" + y);
            }
        }
    }
}