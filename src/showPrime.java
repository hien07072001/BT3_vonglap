public class showPrime {
    public static void main(String[] args) {
        for (int j=1;j<100;j++){
            if (isPrime(j)==true)
                System.out.println("so nguyen to:"+j );
        }

    }
    private static boolean isPrime(int number) {

        if (number == 2) {
            return true;
        }
        if (number > 2) {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0)
                    return false;
            }
            return true;
        }
        return false;
    }


}
