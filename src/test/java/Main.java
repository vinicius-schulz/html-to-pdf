
public class Main {
    public static void main(String[] args) {
        FlyingSaucer test = new FlyingSaucer();
        try {
            test.generatePdf();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}