public class Multiplication {

    public static void TableDe(int n) {
        int resultat = 0;

        for (int i = 1; i < 11; i++) {
            resultat = i * n;
            System.out.print("" + n);
            System.out.print("*" + i);
            System.out.println("=" + resultat);
        }

    }

    public static void TablesDeMultiplication() {
        int resultat = 0;

        for (int j = 1; j < 11; j++) {
            for (int i = 1; i < 11; i++) {
                resultat = i * j;
                System.out.print("" + j);
                System.out.print("*" + i);
                System.out.println("=" + resultat);
            }
        }

    }

    public static void main(String[] args) {

        if (args.length == 0) {
            TablesDeMultiplication();
        }

        else {
            TableDe(Integer.parseInt(args[0]));
        }

    }
}