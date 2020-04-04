public class CorrectionMultiplication {

    private int nb;

    public CorrectionMultiplication(int pNb)
     {
         nb = pNb;
     }

    public void tableDe() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * nb);
        }
    }

    public static void tableDeMultiplication() {
        for (int i = 1; i <= 10; i++) {
            CorrectionMultiplication m = new CorrectionMultiplication(i);
            m.tableDe();
        }
    }

    public static void main(String args[]) {
        // tableDe(5);
        tableDeMultiplication();
    }

}