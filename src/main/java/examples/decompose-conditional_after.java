package examples;

import shared_classes.MyDate;

class DecomposeConditionalAfter{


    private float charge;
    private int quantity;

    public DecomposeConditionalAfter() {
        this.charge = randomFloat();
        this.quantity = randomInt();
    }

    public void execute(){
        MyDate date = new MyDate();

        if (notSummer(date)) {
            charge = winterCharge(quantity);
        }
        else {
            charge = summerCharge(quantity);
        }
    }

    private float summerCharge(int quantity) {
        //Logic to calculate
        // ....
        return randomFloat();
    }

    private float winterCharge(int quantity) {
        //Logic to calculate
        // ....
        return randomFloat();
    }

    private boolean notSummer(MyDate date) {
        return Math.random() < 0.5;
    }

    private float randomFloat(){
        return (float)(Math.random() * 800) + 200;
    }

    private int randomInt(){
        return (int)(Math.random() * 800) + 200;
    }
}

