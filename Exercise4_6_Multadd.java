public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
       return a * b + c;
        
    }

    public static double expSum(double x) {
        double expNegX = Math.exp(-x);

        double term1 = x * expNegX;
        double term2 = Math.sqrt(1 - expNegX);

        return term1 + term2;
    }

    public static void main(String[] args) {
        double pi = Math.PI;

        System.out.println("---Multadd Basit Testler---");

        double testResult1 = multadd(2.0, 3.0, 4.0);
        System.out.println("2 * 3 + 4 = "  + testResult1);

        double testResult2 = multadd(1.5, 10.0, 0.5);
        System.out.println("1.5 * 10 + 0.5 = " + testResult2);

        System.out.println("--- Multadd Matematiksel Hesaplamalar ---");

        double a1 = Math.cos(pi / 4);
        double b1 = 0.5;
        double c1 = Math.sin(pi / 4);

        double result1 = multadd(a1, b1, c1);
        System.out.println("sin(pi/4) + cos(pi/4) = " + result1);


        double a2 = Math.log(10);
        double b2 = 1.0;
        double c2 = Math.log(20);

        double result2 = multadd(a2, b2, c2);
        System.out.println("log 10 + log 20 = " + result2);

        System.out.println("--- expSum Testleri ---");

        double x1 = 1.0;
        double expSumResult1 = expSum(x1);
        System.out.println("expSum(0.5) sonucu: " + expSumResult1);

        double x2 = 0.5;
        double expSumResult2 = expSum(x2);
        System.out.println("expSum(0.5) sonucu: " + expSumResult2);

        System.out.println("---------------------\n");   
    }
}
