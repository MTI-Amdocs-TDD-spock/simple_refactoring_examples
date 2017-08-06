package examples;

import shared_classes.MyDate;

class DecomposeConditionalBefore{

    private static final int SUMMER_START = 1;
    private static final int SUMMER_END = 50 ;
    private float charge;
    private int quantity;
    private float winterRate;
    private float winterServiceCharge;
    private float summerRate;

    public DecomposeConditionalBefore() {
        this.charge = randomFloat();
        this.quantity = randomInt();
        this.winterRate = randomFloat();
        this.winterServiceCharge = randomFloat();
        this.summerRate = randomFloat();
    }

    public void execute(){
        MyDate date = new MyDate();

        if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
            charge = quantity * winterRate + winterServiceCharge;
        }
        else {
            charge = quantity * summerRate;
        }
    }

    private float randomFloat(){
        return (float)(Math.random() * 800) + 200;
    }

    private int randomInt(){
        return (int)(Math.random() * 800) + 200;
    }
}
