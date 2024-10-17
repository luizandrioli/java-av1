import java.util.Scanner;

public class leitura{
    public static void main(string[] args){
        Scanner leitura = new Scanner(system.in);

        system.out.printIn("digite seu filme favorito");
        string filme= leitura.nextLine();
        system.out.printIn("qual o ano de lançamento");
        int ano = leitura.nextInt();
        system.out.printIn("de sua avaliaçao");
        double avaliacao = leitura.nextDouble();

        system.out.printIn(filme);
        system.out.printIn(ano);
        system.out.printIn(avaliacao);
    }
}