package WithPattern;

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

    public Cake(){}

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

    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }

    public void setCookerName(String cookerName) {
        this.cookerName = cookerName;
    }

    public void setAmountFlour(double amountFlour) {
        this.amountFlour = amountFlour;
    }

    public void setAmountEgg(double amountEgg) {
        this.amountEgg = amountEgg;
    }

    public void setAmountSugar(double amountSugar) {
        this.amountSugar = amountSugar;
    }

    public void setAmountButter(double amountButter) {
        this.amountButter = amountButter;
    }

    public void setAmountChocolate(double amountChocolate) {
        this.amountChocolate = amountChocolate;
    }

    public void setAmountSprinkle(double amountSprinkle) {
        this.amountSprinkle = amountSprinkle;
    }

    public void setAmountOrangeJuice(double amountOrangeJuice) {
        this.amountOrangeJuice = amountOrangeJuice;
    }

    public void setAmountMilk(double amountMilk) {
        this.amountMilk = amountMilk;
    }

    public void setAmountStrawberry(double amountStrawberry) {
        this.amountStrawberry = amountStrawberry;
    }

    public void setAmountCoconut(double amountCoconut) {
        this.amountCoconut = amountCoconut;
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
