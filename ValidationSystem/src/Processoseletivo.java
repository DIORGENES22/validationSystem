
public class Processoseletivo {
    public static void main(String[] args) {
        System.err.println("Processo Seletivo");
        analisarCandidatos(1900.0);
        analisarCandidatos(2200.0);
        analisarCandidatos(2000.0);

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