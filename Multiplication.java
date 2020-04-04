public class Multiplication {

    private int num;

    public Multiplication(int Monnum) {
        System.out.println("Contructeur par défaut");
        num = Monnum;
        System.out.println("la valeur de num : " + num);

    }

    public static void TableDe(int n) {
        int resultat = 0;

        System.out.println("Methode statique");

        for (int i = 1; i < 11; i++) {
            resultat = i * n;
            System.out.print("" + n);
            System.out.print("*" + i);
            System.out.println("=" + resultat);
        }

    }

    public void TableDe() {
        int resultat = 0;

        System.out.println("Methode pas statique");

        for (int i = 1; i < 11; i++) {
            resultat = i * num;
            System.out.print("" + num);
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
            // TableDe(Integer.parseInt(args[0]));
            Multiplication table = new Multiplication(Integer.parseInt(args[0]));
            table.TableDe();

            for (int i = 0; i < args.length; i++)
            {
                table.TableDe();
            }

        }

    }
}