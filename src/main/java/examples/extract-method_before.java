package examples;

class ExtractMethodBefore{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExtractMethodBefore() {
        this.name = "John Doe";
    }

    void printOwing() {
        printBanner();

        //print details
        System.out.println("name: " + name);
        System.out.println("amount: " + getOutstanding());
    }

    private int getOutstanding() {
        return (int)(Math.random() * 800) + 200;
    }

    private void printBanner() {
        System.out.println("Printing Banner \n .... \n ....");
    }
}
