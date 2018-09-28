package WithPattern;

public class CakeDirector {
    private CakeBuilder cakeBuilder;

    public CakeDirector(CakeBuilder cakeBuilder) {
        this.cakeBuilder = cakeBuilder;
    }

    public void buildCake(){
        this.cakeBuilder.setCakeName();
        this.cakeBuilder.setCookerName();
        this.cakeBuilder.setAmountFlour();
        this.cakeBuilder.setAmountEgg();
        this.cakeBuilder.setAmountButter();
        this.cakeBuilder.setAmountMilk();
        this.cakeBuilder.setAmountSugar();
        this.cakeBuilder.setAmountChocolate();
        this.cakeBuilder.setAmountSprinkle();
        this.cakeBuilder.setAmountCoconut();
        this.cakeBuilder.setAmountStrawberry();
        this.cakeBuilder.setAmountOrangeJuice();
    }

    public Cake getCake(){
        return this.cakeBuilder.getCake();
    }
}
