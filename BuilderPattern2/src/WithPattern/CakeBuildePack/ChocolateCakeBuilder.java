package WithPattern.CakeBuildePack;

import WithPattern.*;

public class ChocolateCakeBuilder implements CakeBuilder {
    private Cake chocolateCake;
    public ChocolateCakeBuilder() {
        super();
        this.chocolateCake = new Cake();
    }

    @Override
    public void setCakeName() {
        this.chocolateCake.setCakeName("Chocolate");
    }

    @Override
    public void setAmountFlour() {
        this.chocolateCake.setAmountFlour(100);
    }

    @Override
    public void setAmountEgg() {
        this.chocolateCake.setAmountEgg(100);
    }

    @Override
    public void setCookerName() {
        chocolateCake.setCookerName("Alvaro");
    }

    @Override
    public void setAmountSugar() {
        chocolateCake.setAmountSugar(250);
    }

    @Override
    public void setAmountButter() {
        chocolateCake.setAmountButter(500);
    }

    @Override
    public void setAmountChocolate() {
        chocolateCake.setAmountChocolate(100);
    }

    @Override
    public void setAmountSprinkle() {
        chocolateCake.setAmountSprinkle(30);
    }

    @Override
    public void setAmountOrangeJuice() {

    }

    @Override
    public void setAmountMilk() {
        chocolateCake.setAmountMilk(300);
    }

    @Override
    public void setAmountStrawberry() {

    }

    @Override
    public void setAmountCoconut() {

    }

    @Override
    public Cake getCake() {
        return this.chocolateCake;
    }
}
