public class Contador {

    private int value = 0;

    public Contador() {
    }

    public Contador(int start) {
        this.value = start;
    }

    public Contador(Contador c) {
        this.value = c.getValue();
    }

    public int getValue() {
        return this.value;
    }

    public void increment() {
        this.value++;
    }
}



