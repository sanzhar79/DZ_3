public class Main {
    public static void main(String[] args) {
        double sum=0;
        int amount=0;
        boolean aprove=false;

        double numbers[] = new double[15];
        numbers[0] = -14;
        numbers[1] = 3;
        numbers[2] = -5;
        numbers[3] = 10;
        numbers[4] = 15;
        numbers[5] = 22;
        numbers[6] = 31;
        numbers[7] = -22;
        numbers[8] = -33;
        numbers[9] = 1;
        numbers[10] = -6;
        numbers[11] = 77;
        numbers[12] = -66;
        numbers[13] = 22;
        numbers[14] = 13;

        for (double num : numbers) {
            if (num < 0) {
                aprove=true;
            }else if(num>0 && aprove){
                sum+=num;
                amount++;
                System.out.println(num);
            }

        }
        System.out.println(sum/amount);
    }
}