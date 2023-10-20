import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LaptopFactory {

    static int idCount = 0;
    static Random random = new Random();
    static ArrayList<String> marci = new ArrayList<>(Arrays.asList("Dell", "Lenovo", "Asus", "Toshiba", "HP", "MacBook", "Samsung"));
    static ArrayList<Integer> rams = new ArrayList<>(Arrays.asList(2, 4, 8, 16, 32));
    static ArrayList<Double> preturi = new ArrayList<>(Arrays.asList(999.99, 3459.99, 2789.99, 5899.99, 1679.99, 3449.99));

    static Laptop generateLaptop(){
        return new Laptop(++idCount,
                marci.get(random.nextInt(marci.size())),
                rams.get(random.nextInt(rams.size())),
                random.nextInt(10)+18,
                preturi.get(random.nextInt(preturi.size())) );
    }
}
