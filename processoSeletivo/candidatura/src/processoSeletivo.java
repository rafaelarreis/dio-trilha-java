package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();

    }
    static void selecaoCandidatos(){
        String [] candidatos={"FELIPE","MARCIA","JULIA","JOAO","ARTUR","BIANCA","FABIO","MIRELA","DANIELA","JORGE","DAVI"};
    int candidatosSelecionados = 0;
    int candidatosAtual=0;
    double salarioBase=2000.0;
    while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
        String candidato = candidatos[candidatosAtual];
        double salarioPretendido=valorPretendido();
        System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
        if(salarioBase>= salarioPretendido){
            System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            candidatosSelecionados++;
            }else{
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga");
        }  
        candidatosAtual++;  
    }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
}