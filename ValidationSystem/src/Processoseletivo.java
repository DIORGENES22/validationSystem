import  java.util.concurrent.ThreadLocalRandom;
public class Processoseletivo {
    public static void main(String[] args) {
        selecaodeCandidatos();
   

    }

    static void selecaodeCandidatos(){
        String [] candidatos = {"FELIPE", "JOAO", "MARIA", "JULIA", "PAULO", "ANA", "CARLOS", "LUCAS", "MARCOS", "GUSTAVO"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Candidato: " + candidato + " Solicitou este valor : " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.err.println("O Candidato: " + candidato + " foi selecionado para a proxima fase do processo seletivo");
                candidatosSelecionados++;
            }
            candidatoAtual++;

         }
      
        }
        static double valorPretendido(){
            return ThreadLocalRandom.current().nextDouble(1800.0, 2000.0);
    }
   
    static void analisarCandidatos(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
      }else if (salarioBase== salarioPretendido)
            System.err.println("Ligar para o candidato");
        else{
            System.out.println("Aguardndo o resultado dos demais candidatos");
        }

       
    }


}