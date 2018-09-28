package WithPattern;

import WithPattern.CakeBuildePack.ChocolateCakeBuilder;
import WithPattern.CakeBuildePack.OrangeCakeBuilder;
import WithPattern.CakeBuildePack.StrawberryAndCoconutCakeBuilder;

public class CakeMaker {
    public static void main(String[] args) {
        CakeBuilder chocolateCakeBuilder = new ChocolateCakeBuilder();
        CakeBuilder strawberryAndCoconutCakeBuilder = new StrawberryAndCoconutCakeBuilder();
        CakeBuilder orangeCakeBuilder = new OrangeCakeBuilder();

        CakeDirector cakeDirectorChocolate = new CakeDirector(chocolateCakeBuilder);
        CakeDirector cakeDirectorStrawberryAndCoconut = new CakeDirector(strawberryAndCoconutCakeBuilder);
        CakeDirector cakeDirectorOrange = new CakeDirector(orangeCakeBuilder);

        cakeDirectorChocolate.buildCake();
        cakeDirectorStrawberryAndCoconut.buildCake();
        cakeDirectorOrange.buildCake();

        Cake chocolateCake = cakeDirectorChocolate.getCake();
        Cake strawberryAndCoconutCake = cakeDirectorStrawberryAndCoconut.getCake();
        Cake orangeCake = cakeDirectorOrange.getCake();

        System.out.println(chocolateCake);
        System.out.println(strawberryAndCoconutCake);
        System.out.println(orangeCake);
    }
}
