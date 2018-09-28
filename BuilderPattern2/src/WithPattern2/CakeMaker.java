package WithPattern2;

public class CakeMaker {
    public static void main(String[] args) {
        Cake chocolateCake = new Cake.CakeBuilder("Chocolate",100,100)
                .setCookerName("Alvaro")
                .setAmountButter(500)
                .setAmountMilk(300)
                .setAmountSugar(250)
                .setAmountChocolate(100)
                .setAmountSprinkle(30)
                .build();
        Cake strawberryAndCoconutCake = new Cake.CakeBuilder("Strawberry&Coconut", 100,100)
                .setAmountButter(400)
                .setAmountMilk(300)
                .setAmountSugar(250)
                .setAmountStrawberry(100)
                .setAmountCoconut(70)
                .build();
        Cake orangeCake = new Cake.CakeBuilder("Orange", 100,100)
                .setAmountButter(350)
                .setAmountSugar(250)
                .setAmountOrangeJuice(150)
                .build();





        System.out.println(chocolateCake + "\n" + strawberryAndCoconutCake + "\n" + orangeCake + "\n");


    }
}
