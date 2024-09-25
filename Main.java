public class Main {
    public static void main(String[] args) {
        //System.out.println(f.currentFood);
        //System.out.println(g.getCurrentFood());
        Feeder i = new Feeder(1000);
        System.out.println(i);
        //i.simulateOneDay(5);
        System.out.println(i.simulateManyDays(10,20));
        System.out.println(i);
    }
}
