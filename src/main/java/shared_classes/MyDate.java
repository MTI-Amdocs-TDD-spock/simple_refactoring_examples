package shared_classes;

public class MyDate {
    public boolean before(int summerStart) {
        return Math.random() < 0.5;
    }

    public boolean after(int summerEnd) {
        return Math.random() < 0.5;
    }
}
