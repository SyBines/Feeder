public class Main {
    public static void main(String[] args) {
        //System.out.println(f.currentFood);
        //System.out.println(g.getCurrentFood());
        Feeder i = new Feeder(1000);
        i.simulateOneDay(5);
        System.out.println();
        System.out.println(i.toString(5));
    }
}
