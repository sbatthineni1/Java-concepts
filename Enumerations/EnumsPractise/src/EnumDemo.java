import java.util.Arrays;

enum Apple {
    Jonathan(6), GoldenDel(5), redDel(4), Winesapp(7), Cortland(8);
    int sweetness;
    final int price;

    Apple(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class EnumDemo {

    public static void main(String[] args) {
        Apple ap;
        Apple[] allApples = Apple.values();
        System.out.println(Arrays.toString(allApples));
        //[Jonathan, GoldenDel, redDel, Winesapp, Cortland]
        for (Apple a : allApples) {
            System.out.println(a + " " +a.ordinal());
            /*
            Jonathan
            GoldenDel
            redDel
            Winesapp
            Cortland
             */
        }
        ap = Apple.valueOf("GoldenDel");
        System.out.println(ap + " price is " + ap.getPrice());
        System.out.println(ap.price);
        /*
        GoldenDel contains 5
        5
         */

    }

}


