package meth.ref;

@FunctionalInterface
interface MyFunc<T> {
    boolean func(T v1, T v2);
}

class HighTemp {
    private int hTemp;

    public HighTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThanHTemp(HighTemp ht3) {
        return hTemp < ht3.hTemp;
    }
}

public class InstanceMethodDemo {
    static <T> int counter(T[] vals, MyFunc<T> f, T v){
        int count = 0;
        for(int i = 0; i < vals.length; i++){
            if(f.func(vals[i],v)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int count;

        HighTemp[] weekDayHighs = {
                new HighTemp(89), new HighTemp(82),
                new HighTemp(90), new HighTemp(89),
                new HighTemp(89), new HighTemp(91),
                new HighTemp(84), new HighTemp(83)
        };
        HighTemp[] weekDayHighs2 = {
                new HighTemp(32), new HighTemp(12),
                new HighTemp(24), new HighTemp(19),
                new HighTemp(19), new HighTemp(12),
                new HighTemp(-1), new HighTemp(13)
        };

        //count = counter(weekDayHighs2,(hTemp, ht2) -> hTemp.sameTemp(ht2), new HighTemp(12) );
        count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12) );

        System.out.println(count + " Days had a high of 12");




    }
}
