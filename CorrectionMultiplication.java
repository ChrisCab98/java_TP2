public class CorrectionMultiplication {

    public static void tableDe(int Nb) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * Nb);
        }
    }

    public static void tableDeMultiplication() {
        for (int i = 1; i <= 10; i++) {
            tableDe(i);
        }
    }

    public static void main(String args[]) {
        // tableDe(5);
        tableDeMultiplication();
    }

}