package NoPattern;

public class Cake {
    private String cakeName;
    private String cookerName;
    private double amountFlour;
    private double amountEgg;
    private double amountSugar;
    private double amountButter;
    private double amountChocolate;
    private double amountSprinkle;
    private double amountOrangeJuice;
    private double amountMilk;
    private double amountStrawberry;
    private double amountCoconut;

    public Cake(String cakeName, String cookerName,
                double amountFlour, double amountEgg,
                double amountSugar, double amountButter,
                double amountChocolate, double amountSprinkle,
                double amountOrangeJuice, double amountMilk,
                double amountStrawberry, double amountCoconut) {
        this.cakeName = cakeName;
        this.cookerName = cookerName;
        this.amountFlour = amountFlour;
        this.amountEgg = amountEgg;
        this.amountSugar = amountSugar;
        this.amountButter = amountButter;
        this.amountChocolate = amountChocolate;
        this.amountSprinkle = amountSprinkle;
        this.amountOrangeJuice = amountOrangeJuice;
        this.amountMilk = amountMilk;
        this.amountStrawberry = amountStrawberry;
        this.amountCoconut = amountCoconut;
    }

    public double getAmountFlour() {
        return amountFlour;
    }

    public double getAmountEgg() {
        return amountEgg;
    }

    public double getAmountSugar() {
        return amountSugar;
    }

    public double getAmountButter() {
        return amountButter;
    }

    public double getAmountChocolate() {
        return amountChocolate;
    }

    public double getAmountSprinkle() {
        return amountSprinkle;
    }

    public double getAmountOrangeJuice() {
        return amountOrangeJuice;
    }

    public double getAmountMilk() {
        return amountMilk;
    }

    public double getAmountStrawberry() {
        return amountStrawberry;
    }

    public double getAmountCoconut() {
        return amountCoconut;
    }

    private String ThereIsToString(Double amount){
        if(amount != 0){
            return Double.toString(amount);
        }else{
            return "NONE";
        }
    }

    private String cookerToString(String name){
        if(name != null){
            return name;
        }else{
            return "Anonymous";
        }
    }

    @Override
    public String toString() {
        return "~ Cake Recipe (Name: " + this.cakeName + " [By: " + this.cookerToString(this.cookerName) +"] )"+
                "\nFlour: " + this.amountFlour +
                "\nEgg: " + this.amountEgg +
                "\nSugar: " + this.ThereIsToString(this.amountSugar)+
                "\nButter: " + this.ThereIsToString(this.amountButter)+
                "\nChocolate: " + this.ThereIsToString(this.amountChocolate)+
                "\nSprinkle: " + this.ThereIsToString(this.amountSprinkle) +
                "\nOrange Juice: " + this.ThereIsToString(this.amountOrangeJuice)+
                "\nMilk: " + this.ThereIsToString(this.amountMilk)+
                "\nStrawberry: " + this.ThereIsToString(this.amountStrawberry)+
                "\nCoconut: " + this.ThereIsToString(this.amountCoconut)+ "\n";
    }
}
