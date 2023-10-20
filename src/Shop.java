import java.util.*;

public class Shop {

    static ArrayList<Laptop> laptopuri = new ArrayList<>();

    public static void main(String[] args) {

        //Laptop laptop = new Laptop(1, "Dell", 16, 15, 3899.99);
       // System.out.println(laptop);

        for (int i = 0; i < 15; i++){
            laptopuri.add(LaptopFactory.generateLaptop());
        }
        printList();

       // Comparator<Laptop> dupaMarca = new Comparator<Laptop>() {
       //     @Override
       //    public int compare(Laptop o1, Laptop o2) {
        //        return o1.getMarca().compareTo(o2.getMarca());
        //    }
      //  };

        laptopuri.sort((laptop1, laptop2) -> laptop1.getMarca().compareTo(laptop2.getMarca()));
        laptopuri.sort((laptop1, laptop2) -> Integer.compare(laptop1.getRam(), laptop2.getRam()));
        laptopuri.sort((laptop1, laptop2) -> Double.compare(laptop1.getPret(), laptop2.getPret()));

        //Sa se determine si printeze cate laptopuri de marca DELL cu diagonala de peste 18 centimetri sunt in shop.
        long numLaptopDell = laptopuri.stream()
                .filter(laptop -> laptop.getMarca().equalsIgnoreCase("Dell"))
                .filter(laptop -> laptop.getDiagonala() >= 18)
                .count();

        System.out.printf("in shop avem %d Dell >= 18cm \n", numLaptopDell);

       //long lapSub400 = laptopuri.stream()
          //      .filter(laptop -> laptop.getPret() < 400).count();

        boolean lapSub400 = laptopuri.stream()
                .anyMatch(laptop -> laptop.getPret() < 400);
        System.out.printf("in shop %s avem Dell mai ieftin de 400 lei \n", lapSub400? "" : "nu");

        double[] preturiSamsung = laptopuri.stream()
                .filter(laptop -> laptop.getMarca().equalsIgnoreCase("Samsung"))
                .mapToDouble(laptop1 -> laptop1.getPret())
                .toArray();

        System.out.println("Preturi laptopuri marca Samsung: " + Arrays.toString(preturiSamsung));

        boolean first5Ram5 = laptopuri.stream()
                .limit(5)
                .allMatch(laptop -> laptop.getRam() > 4);

        Optional<Laptop> primulDell = laptopuri.stream()
                .filter(laptop -> laptop.getMarca().equalsIgnoreCase("Dell"))
                .findFirst();


        primulDell.ifPresent(laptop -> System.out.println("exista laptop marca Dell: " + laptop));
    }

    static void printList(){
       // for(Laptop laptop : laptopuri) System.out.println(laptop);
        laptopuri.forEach(System.out::println);
    }
}
