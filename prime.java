public class prime {
    
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;  
        if (number % 2 == 0) return false; 

        int lim = 1;
        while (lim * lim <= number) {
            lim++;
        }

        for (int i = 3; i <= lim; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

   
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(10));  
        System.out.println(isPrime(2));   
        System.out.println(isPrime(1));   
    }
}
