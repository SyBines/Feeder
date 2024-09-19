public class Main {
    public static void main(String[] args) {
        Feeder g = new Feeder(500);
        System.out.println(g);
        //System.out.println(f.currentFood);
        //System.out.println(g.getCurrentFood());
        g.simulateOneDay(12);
        Feeder i = new Feeder(100);
        i.simulateOneDay(5);
        System.out.println(i);
    }
}
