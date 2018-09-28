package NoPattern;

public class CakeMaker {
    public static void main(String[] args) {
        Cake chocolateCake = new Cake("Chocolate", "Alvaro",
                100,100,250,500,
                100,30,0,
                300,0,0);
        Cake strawberryAndCoconutCake = new Cake("Strawberry&Coconut", null,
                100,100,250,400,
                0,0,0,
                300,100,70);
        Cake orangeCake = new Cake("Orange", null,
                100,100,250,350,
                0,0,150,
                0,0,0);


        System.out.println(chocolateCake + "\n" + strawberryAndCoconutCake + "\n" + orangeCake + "\n");
    }
}
