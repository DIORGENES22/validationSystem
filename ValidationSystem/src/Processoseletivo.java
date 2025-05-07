import java.util.Random;
import  java.util.concurrent.ThreadLocalRandom;
public class Processoseletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "JOAO", "MARIA", "JULIA", "PAULO", };
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
        

    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
            System.out.println("CONTATO REALIZADO COM SUCESSO");


        }while(continuarTentando && tentativasRealizadas <3);

        if(atendeu)
            System.out.println("Conseguimos contato com: " + candidato + " na " + tentativasRealizadas + " tentativa(s)");
        else
            System.out.println("Não conseguimos contato com: " + candidato + ", Número maximo de tentativas " + tentativasRealizadas +" tentativas realizadas");
    }



    //método auxiliar
    static boolean atender(){
        return new Random().nextInt(3) ==1;       
    }


    static void imprimirCandidatosSelecionados(String candidato) {
        String [] candidatos = {"FELIPE", "JOAO", "MARIA", "JULIA", "PAULO", }; 

        System.err.println("Imprimindo a lsita de candidatos informando o indice do elemento: ");
        for(int indice=0; indice < candidatos.length; indice++){
           System.out.println("O candidato de n° " + (indice+1) + " é " + candidatos[indice]);
        }

        //forma simplificada de imprimir os candidatos
        // for(String candidato : candidatos){
        //     System.out.println("O candidato selecionado foi: " + candidato);
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