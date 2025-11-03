public class Main {
    public static void main(String[] args) {
        int rozmiar = 5;

        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                if (i == 0 || i == rozmiar - 1 || j == 0 || j == rozmiar - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
}
