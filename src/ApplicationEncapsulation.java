class Plantt {
    private String name;

    public static final int ID = 7;

    public String getData() {
        String data = "some stuff " + calculateGrowthForecast();
        return data;
    }

    private int calculateGrowthForecast() {
        return 9;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class ApplicationEncapsulation {

    public static void main(String[] args) {

    }

}
