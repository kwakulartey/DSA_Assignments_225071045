
public class population {
    public static void main(String[] args) {
        double population = 2000; 
        double target = 2000000;    
        double growthRate = 0.15;   
        double years = 0;           

        while (population <= target) {
            population *= (1 + growthRate); 
            years += 0.5;                  
        }

        System.out.println("Years to exceed 2,000,000: " + years);
    }
}
