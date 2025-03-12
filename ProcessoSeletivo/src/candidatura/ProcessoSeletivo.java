package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
       
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA"};
        
        int candidatoSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        
        while(candidatoSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

                System.out.println("O candidato" + candidato + "Solicitou esse valor de salario " + salarioPretendido);
                if (salarioBase >= salarioPretendido){
                    System.out.println("O candidato " + candidato + "foi selecionado para a vaga");
                    candidatoSelecionados++;
                }
                candidatosAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato (double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com uma contra proposta");
        else {
            System.out.println("Aguardando o resulado dos demais resultados");
        }
    }
    
}
