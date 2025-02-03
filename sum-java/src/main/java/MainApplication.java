public class MainApplication {
    public static void main(String[] args) {
        double sum = 0;
        double fact;
        for (int i = 0; i < 4; i++) {
            fact=0;
            if (i==0){
                sum = 1;
                continue;
            }
            for (int j = 0; j < i + 1; j++) {
                if (j == 0){
                    fact = 1;
                }
                else{
                    fact = fact * j;
                }
            }
            sum = sum + fact;
        }


        System.out.println(sum);
    }
}
