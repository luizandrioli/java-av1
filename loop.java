public class Loop{
    public static void main (string[] args){
        Scanner leitura= new Scanner (system.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i =0;i < 3;i++){
            system.out.printIn("diga sua avaliacao para o filme")
            nota= leitura.nextDouble();
            mediaAvaliacao +=nota;
        }
        System.out.printIl("média das avaliaçoes"+ mediaAvaliacao/3);

    }
}