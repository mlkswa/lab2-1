public class Metod {
    static double eps = 0.000000001;

    public static double f(double x){
        return (Math.pow(x,3) - 3 * x * x - 6 * x - 8);
    }

    public static double df(double x){
        return (3 * x * x - 6 * x - 8);
    }

    static void newton(double x0){
        System.out.println(x0);
        double x1 = x0 - f(x0) / df(x0);
        if (Math.abs(x1 - x0) > eps){
            newton(x1);
        }
    }
    static void  divideTwo(double a, double b){
        double x = (a+b)/2;
        if(Math.abs(b-a) > eps) {
            if (f(a) * f(x) > 0) {
                a = x;
            } else {
                b = x;
            }
            divideTwo(a, b);
        }
    }
        public static void main(String[] args){
        newton(-4);
        divideTwo(3,1);
        }
}
