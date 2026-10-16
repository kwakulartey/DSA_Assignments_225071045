import java.util.Random;

public class RandomExamples {
    public static void main(String[] args) { 
        Random rand = new Random();

        
        for(int i =0; i<5; i++){
            int randomInt = rand.nextInt(1000 -500)+500;
            System.out.println(randomInt);

        }

        char c1= 'A';
        System .out.println((int)c1);
        System .out.println(c1+1);
        
    }
}
