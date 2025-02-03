public class MainApplication {
    public static void main(String[] args) {
    double x = 1.5;
    double sum = 0;
    double fact = 0;
    double problem=0;
    for (int k = 0; k<4; k++) {
        if (k == 0) {
            fact = 1;
        }
        else {
            fact = fact * k;
        }
        double a;
        double b;
        double c;
        a = Math.pow (-1, k);
        b = Math.pow (x, 2*k+1);
        c = fact * (2*k + 1);
        problem = a*b/c;
        sum = sum + problem;
    }
        System.out.println(sum);

    }
}

