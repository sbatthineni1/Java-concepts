// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        DaysOfWeek day = DaysOfWeek.thursday;
        int values = 4;
        if (values == day.dayRating) {
            System.out.println("Its almost friday");
            //Its almost friday
        }

        for (DaysOfWeek dayname : DaysOfWeek.values()) {
            System.out.println(dayname + "-->" + dayname.dayRating);
            /*
            sunday-->8
            monday-->1
            tuesday-->2
            wednesday-->3
            thursday-->11
            friday-->9
            saturday-->10
             */
        }
        DaysOfWeek dayValue = DaysOfWeek.valueOf("friday");
        System.out.println(dayValue.dayRating);


    }
}