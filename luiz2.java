public class Main{
    public static void main(String [] args){
        Sistem.out.print("ola mundo");
        Sistem.out.print("Filme: Vingadores Guerra Infinita");


        int ano;
        ano=2018;
        Sistem.out.printIn("ano de lançamento:" + ano);
        boolean IncluidoNoPlano = true;
        double notaDoFilme= 8.1;

        double midia =(9.8+ 6.3+ 8.0)/3;
        Sistem.out.printIn(midia);
        String sinopse;
        sinopse="""
        Filme vingadores guerra infinita
        melhor filme do seculo!
        muito bom!
        Ano de lançamento 
        """+ ano;
        Sistem.out.printIn(sinopse);

        int classificacao=(int) (media/2);
        Sistem.out.printIn(classificacao);
    }
}