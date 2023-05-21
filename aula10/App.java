import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        //Basta descomentar o exercicio que quer utilizar

        ex01();
        //ex02();
        //ex03();
        //ex04();
        //ex05();
        //ex06();
    }

    private static void ex01(){
        Scanner sc = new Scanner(System.in);
        
        Integer anos;
        Integer meses;
        Integer dias;

        System.out.println("Digite sua idade");
        
        System.out.print("Anos: ");
        anos = sc.nextInt();

        System.out.print("Meses: ");
        meses = sc.nextInt();
        
        System.out.print("Dias: ");
        dias = sc.nextInt();

        System.out.println("Idade em dias: " + (anos*365 + meses*30 + dias) + " dias");
        sc.close();
    }

    private static void ex02(){
        Double media1;
        Double media2;

        media1 = (9 + 8 + 7)/ Double.valueOf(3);
        media2 = (4 + 5 + 6)/ Double.valueOf(3);

        System.out.println("Media dos numeros 9, 8 e 7: " + media1);
        System.out.println("Media dos numeros 4, 5 e 6: " + media2);
        System.out.println("Soma das medias: " + (media1+media2));
        System.out.println("Media das medias: " + (media1+media2)/2);
    }

    private static void ex03(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        
        BigDecimal valor = sc.nextBigDecimal();
        BigDecimal taxa = BigDecimal.valueOf(1.15);

        valor = valor.multiply(taxa);

        System.out.println("Valor com reajuste de 15%: " + valor);
        sc.close();
    }

    private static void ex04(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a taxa do IPI (%): ");
        BigDecimal taxa = sc.nextBigDecimal();

        System.out.print("Codigo da peca 1: ");
        sc.nextLine();
        sc.nextLine();

        System.out.print("Valor da peca 1: ");
        BigDecimal valor1 = sc.nextBigDecimal();

        System.out.print("Quantidade da peca 1: ");
        BigDecimal qtd1 = sc.nextBigDecimal();

        System.out.print("Codigo da peca 2: ");
        sc.nextLine();
        sc.nextLine();

        System.out.print("Valor da peca 2: ");
        BigDecimal valor2 = sc.nextBigDecimal();

        System.out.print("Quantidade da peca 2: ");
        BigDecimal qtd2 = sc.nextBigDecimal();
        
        BigDecimal valorTotal = valor1.multiply(qtd1)
        .add(valor2.multiply(qtd2))
        .multiply(taxa.divide(BigDecimal.valueOf(100)).add(BigDecimal.valueOf(1)));
        
        System.out.println("Valor Total: " + valorTotal);
        sc.close();
    }

    private static void ex05(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salario minimo: ");
        BigDecimal salarioMinimo = sc.nextBigDecimal();

        System.out.print("Digite o valor do seu salario: ");
        BigDecimal salario = sc.nextBigDecimal();

        BigDecimal qtdSalarios = salario.divide(salarioMinimo, 2 , RoundingMode.HALF_UP);

        System.out.println("Seu salario sao " + qtdSalarios + " salarios minimos");
        sc.close();
    }

    private static void ex06(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        Integer i = sc.nextInt();

        System.out.println("Antecessor: " + (i-1));
        System.out.println("Sucessor: " + (i+1));
    }
}