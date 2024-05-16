package gen.prac;

public class Main {
    public static void main(String[] args) {
        var nationalUSParks = new Park[]{
                new Park("YellowStone", "44.4882, -110.5916"),
                new Park("Grand Canyon", "36.1085, -112.0965"),
                new Park("Yosemite", "37.8855, -119.5390")

        };
        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderlayer();


        var nationalUSRivers = new River[]{
                new River("Missisipi", "44.4882, -110.5916", "36.1085, -112.0965"),
                new River("Missouri", "36.1085, -112.0965", "36.1085, -112.0965"),

        };
        Layer<River> riverLayer = new Layer<>(nationalUSRivers);
        riverLayer.addElements(new River("Colorado", "37.8855, -119.5390", "36.1085, -112.0965"));
        riverLayer.renderlayer();
    }


}
