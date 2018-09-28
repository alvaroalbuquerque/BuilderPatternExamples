package WithPattern.CakeBuildePack;

import WithPattern.*;

public class OrangeCakeBuilder implements CakeBuilder {
    private Cake orangeCake;

    public OrangeCakeBuilder() {
        this.orangeCake = new Cake();
    }

    @Override
    public void setCakeName() {
        this.orangeCake.setCakeName("Orange");
    }

    @Override
    public void setCookerName() {

    }

    @Override
    public void setAmountFlour() {
        this.orangeCake.setAmountFlour(100);

    }

    @Override
    public void setAmountEgg() {
        this.orangeCake.setAmountEgg(100);

    }

    @Override
    public void setAmountSugar() {
        this.orangeCake.setAmountSugar(250);

    }

    @Override
    public void setAmountButter() {
        this.orangeCake.setAmountButter(350);

    }

    @Override
    public void setAmountChocolate() {

    }

    @Override
    public void setAmountSprinkle() {

    }

    @Override
    public void setAmountOrangeJuice() {
        this.orangeCake.setAmountOrangeJuice(120);

    }

    @Override
    public void setAmountMilk() {

    }

    @Override
    public void setAmountStrawberry() {

    }

    @Override
    public void setAmountCoconut() {

    }

    @Override
    public Cake getCake() {
        return this.orangeCake;
    }
}
