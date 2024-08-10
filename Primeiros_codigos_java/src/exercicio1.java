import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base1, altura, area, perimetro, diagonal;

        System.out.println("Digite a base do retangulo: ");
        base1 = sc.nextDouble();
        System.out.println("Digite a Altura do Retangulo: ");
        altura = sc.nextDouble();


        area = base1 * altura;
        perimetro = (base1 + altura) * 2;
        diagonal = Math.sqrt((base1 * base1) + (altura * altura));

        System.out.println("AREA: " + String.format("%.4f", area));
        System.out.println("PERIMETRO: " + String.format("%.4f", perimetro));
        System.out.println("DIAGONAL: " + String.format("%.4f", diagonal));

    }
}