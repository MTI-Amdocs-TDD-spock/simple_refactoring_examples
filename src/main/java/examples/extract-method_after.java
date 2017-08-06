
package examples;
class ExtractMethodAfter{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExtractMethodAfter() {
        this.name = "John Doe";
    }

    void printOwing() {
        printBanner();
        printDetails(getOutstanding());
    }

    void printDetails(double outstanding) {
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }
/////// helper methods
    private int getOutstanding() {
        return (int)(Math.random() * 800) + 200;
    }

    private void printBanner() {
        System.out.println("Printing Banner \n .... \n ....");
    }
}



