import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        int totalJogos = 0;
        int golsGremio;
        int golsInter;
        int vitGremio = 0;
        int vitInter = 0;
        int empates = 0;
        int flag = 1; 

        while (flag == 1) { 
            totalJogos++;

            System.out.println("Digite os gols do gremio");
            golsGremio = leitor.nextInt();
            System.out.println("Digite os gols do inter");
            golsInter = leitor.nextInt();

            if (golsGremio > golsInter) {
                vitGremio++;
            } else if (golsInter > golsGremio) {
                vitInter++;
            } else {
                empates++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            flag = leitor.nextInt();

            while (flag != 1 && flag != 2) {
                System.out.println("Novo grenal (1-sim 2-nao)");
                flag = leitor.nextInt();
            }

        }

        leitor.close(); 

        System.out.println(totalJogos + " grenais");
        System.out.println("Inter:" + vitInter);
        System.out.println("Gremio:" + vitGremio);
        System.out.println("Empates:" + empates);

        if (vitGremio > vitInter) {
            System.out.println("Gremo venceu mais");
        } else if (vitInter > vitGremio) {
            System.out.println("Inter venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }

    }

}
