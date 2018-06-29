package Lab_P05_RandomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList random= new RandomArrayList();
        random.add("Pesho");
        random.add("Pesh2");
        random.add("Pesh3");
        random.add("Pesh4");
        random.add("Pesh5");

        System.out.println(random.getRandomElement());
    }
}
