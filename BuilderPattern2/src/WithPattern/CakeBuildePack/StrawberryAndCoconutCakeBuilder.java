package WithPattern.CakeBuildePack;

import WithPattern.*;

public class StrawberryAndCoconutCakeBuilder implements CakeBuilder {
    private Cake strawberryAndCoconutCake;

    public StrawberryAndCoconutCakeBuilder() {
        this.strawberryAndCoconutCake = new Cake();
    }

    @Override
    public void setCakeName() {
        this.strawberryAndCoconutCake.setCakeName("Strawberry&Coconut");
    }

    @Override
    public void setCookerName() {

    }

    @Override
    public void setAmountFlour() {
        this.strawberryAndCoconutCake.setAmountFlour(100);
    }

    @Override
    public void setAmountEgg() {
        this.strawberryAndCoconutCake.setAmountEgg(100);

    }

    @Override
    public void setAmountSugar() {
        this.strawberryAndCoconutCake.setAmountSugar(250);

    }

    @Override
    public void setAmountButter() {
        this.strawberryAndCoconutCake.setAmountButter(400);

    }

    @Override
    public void setAmountChocolate() {

    }

    @Override
    public void setAmountSprinkle() {

    }

    @Override
    public void setAmountOrangeJuice() {

    }

    @Override
    public void setAmountMilk() {
        this.strawberryAndCoconutCake.setAmountMilk(300);

    }

    @Override
    public void setAmountStrawberry() {
        this.strawberryAndCoconutCake.setAmountStrawberry(100);

    }

    @Override
    public void setAmountCoconut() {

        this.strawberryAndCoconutCake.setAmountCoconut(70);

    }

    @Override
    public Cake getCake() {
        return this.strawberryAndCoconutCake;
    }
}
