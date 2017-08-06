package examples;

class ConsolidateDuplicateConditionalFragmentAfter{

    private double price;

    public ConsolidateDuplicateConditionalFragmentAfter() {
        this.price = (int)(Math.random() * 800) + 100; // just a random price
    }

    public void execute(){

        double total;
        if (isSpecialDeal()) {
            total = price * 0.95;
        }
        else {
            total = price * 0.98;
        }
        send();
    }

    private void send() {
        System.out.println("sending....");
    }

    private boolean isSpecialDeal() {
        return Math.random() < 0.5;
    }
}

