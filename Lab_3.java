package Lab_3;

class Task1 {
    public static void main (String[] args){
        printResults(0, 0, 0);
        printResults(0, 1, 1);
        printResults(1, 0, 1);
        printResults(1, 1, 1);
        printResults(2, 1, 2);
        printResults(1, 2, 3);
        printResults(2, -10, 10);
        printResults(2, 10, -10);
        printResults(1, 10, 10);
        printResults(-10, 10, 10);
        printResults(1, Double.MAX_VALUE, 10);
        printResults(1, 10, 50);
        printResults(Double.MAX_VALUE, 1, 10);
        printResults(Double.NaN, Double.NaN, 10);
    }

    public static double task(double a, double b, int k) {
        double ans = 0;
        if (a < 0 || b < 0 || k<30 || Double.isNaN(a) || Double.isNaN(b) || Double.isNaN(k)){
            throw new IllegalArgumentException("param a = " + a + " param b = " + b);
        }
        for(int i = 1; i<=k; i++){
           ans += Math.sqrt(a*i*Math.sqrt(b/i));
        }
        return ans;
    }
    static void printResults(double a, double b, int k){
        System.out.print("a: " + a + " b: " + b + " result: ");
        try {
            System.out.println(task(a, b, k));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}

class task_2{
    public static void main (String[] args){
        printResults(0, 0);
        printResults(0, 1);
        printResults(1, 0);
        printResults(1, 1);
        printResults(2, 1);
        printResults(1, 2);
        printResults(2, -10);
        printResults(1, 10);
        printResults(-10, 10);
        printResults(Double.MAX_VALUE, 1);
        printResults(Double.NaN, Double.NaN);
    }

    public static double task(double t, double n) {
        if (t < 0 || n < 0 || Double.isNaN(t) || Double.isNaN(n)){
            throw new IllegalArgumentException("param t = " + t + " param n = " + n);
        }
        double ans = 0;
        if(t<0){
            for(int i = 0; i < n; i++){
                ans += Math.pow(t, 2)*i;
            }
        }
        else{
            for(int i = 0; i < n; i++){
                ans += Math.sqrt(t*i);
            }
        }
        return ans;
    }

    static void printResults(double t, double n){
        System.out.print("t: " + t + " n: " + n + " result: ");
        try {
            System.out.println(task(t, n));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}

class task_3{
    public static void main (String[] args){
        printResults(0);
        printResults(1);
        printResults(0.1);
        printResults(0.0001);
        printResults(10);
        printResults(Double.MAX_VALUE);
        printResults(Double.NaN);
    }

    public static double task(double Epsilon) {
        if (Epsilon == 0 || Double.isNaN(Epsilon)){
            throw new IllegalArgumentException("param Epsilon = " + Epsilon );
        }
        double ans = 0;
        double fraction;
        double i = 1;
        do{
            fraction = 0;
            fraction = 1/(i*i);
            ans += fraction;
            i++;
        }while(Math.abs(fraction)>Epsilon);
        return ans;
    }
    static void printResults(double Epsilon){
        System.out.print("Epsilon: " + Epsilon  + " result: ");
        try {
            System.out.println(task(Epsilon));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
