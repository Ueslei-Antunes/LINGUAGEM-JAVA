import java.util.Locale; //essa bibliteca faz com que seja imprimido o '.' ao invés da ',' como separador de sinais

public class Conceitos_de_java {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US); //após adicionar a biblioteca precisa por esse comando
        
        int idade;
        double salario, altura;
        char sexo;
        String nome;
    
        idade = 20;
        salario = 5800.5;
        altura = 1.63;
        sexo = 'F';
        nome = "Maria Silva";
    
        System.out.println("IDADE = " + idade);
        System.out.println("SALARIO = " + String.format("%.2f", salario)); //dessa forma nos definimos quantas casas decimais queremos depois da ','
        System.out.println("ALTURA = " + String.format("%.2f", altura));
        System.out.println("sexo = " + sexo);
        System.out.println("NOME = " + nome);
        System.out.println(" ");
        System.out.println("A funcionaria " + nome + ", sexo " + sexo + ", ganha " + String.format("%.2f", salario) + " e tem " + idade + " anos"); 
        
        System.out.println(" ");
        System.out.println(" ");


        //casting
        int a, b;
        double resultado;
        a = 5;
        b = 2;
        
        resultado = (double) a / b;
        System.out.println(resultado); 
    
    }
}