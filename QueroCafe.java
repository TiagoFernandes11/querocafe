import java.util.Scanner;


public class QueroCafe {


    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        float resposta;
        float numero_alunos;
        float mililitros;
        int quantidade_limite;
        System.out.println("Digite o numero de alunos ");
        numero_alunos = sc.nextInt();
        
        System.out.println("Digite a maxima por produção: ");
        quantidade_limite = sc.nextInt();

        System.out.println("Digite a quantidade por alunos ");
        mililitros = sc.nextInt();

        resposta = calculaQuantidade(numero_alunos, mililitros);

        if(resposta>10){ 
            System.out.println((resposta/quantidade_limite) * quantidade_limite);
        }
        else{
            if(resposta%quantidade_limite > 0){
                System.out.println(resposta + quantidade_limite - (resposta%quantidade_limite));
            }
        }
        sc.close();
    }

    public static float calculaQuantidade(float numero_alunos, float mililitros) {
        return (float) ((numero_alunos * mililitros) / 1000.00);
    }
}

