import java.util.Locale;
import java.util.Scanner;

public class matrizes {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, m;

        System.out.print("Quantas linhas vai ter a matriz? ");
        m = sc.nextInt();
        System.out.print("Quantas Colunas vai ter a matriz? ");
        n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matriz[i][j] = sc.nextInt();
                }
            }
        
        System.out.println();

        System.out.println("\nMatriz Criada: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
                System.out.println("Essa foi a função criada por esse matriz.");
            }
    }
}
