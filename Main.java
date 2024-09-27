public class Main {
    public static void main(String[] args) {
        //Test Cases for simulateManyDays
        Feeder i = new Feeder(2400);
        System.out.println(i.simulateManyDays(10,4));
        Feeder g = new Feeder(250);
        System.out.println(g.simulateManyDays(10,5));
        Feeder l = new Feeder(0);
        System.out.println(l.simulateManyDays(5,10));
        //Test Cases for simulateOneDay
        Feeder b = new Feeder(500);
        System.out.println(b.simulateOneDay(12));
        Feeder a = new Feeder(1000);
        System.out.println(a.simulateOneDay(22));
        Feeder x = new Feeder(100);
        System.out.println(x.simulateOneDay(5));
    }
}
