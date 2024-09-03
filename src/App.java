
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        while (true){
            System.out.println("Bem vindo a Asa Videos");
            System.out.println("Menu:");

            System.out.println("");
            System.out.println("1. Ver Filmes de Ação");
            System.out.println("2. Ver Filmes de Comédia");
            System.out.println("3. Ver Filmes de Drama");
            System.out.println("4. Ver Filmes de Terror");
            System.out.println("5. Ver Filmes de Ficção Científica");
            System.out.println("6. Ver Filmes Nacionais");
            System.out.println("");
            System.out.println("Digite a opção:");
            int op = leitor.nextInt();

            //Substituir o println pela exibição na tela uma lista de 10 filmes daquele gênero.
            if (op == 1){// Pedro
                System.out.println("Vendo Filmes de Ação");
                String[] filmesAcao = new String[10];
                filmesAcao[0] = "O Poderoso Chefão";
                filmesAcao[1] = "Homem de Aço"; 
                filmesAcao[2] = "O Último Grande Herói";
                filmesAcao[3] = "Tropa de Elite";
                filmesAcao[4] = "Deixe estar";
                filmesAcao[5] = "Missão Impossível";
                filmesAcao[6] = "O Justiceiro";
                filmesAcao[7] = "Bater ou Correr";
                filmesAcao[8] = "O Fugitivo";
                filmesAcao[9] = "O Grande Golpe";
                for (int i = 0; i < 10; i++) {
                    System.out.println((i+1) + ". " + filmesAcao[i]);
                    } 
                
            }else if (op == 2){// Ryan
                System.out.println("Vendo Filmes de Comédia");
            }else if (op == 3){// Pietra e André
                System.out.println("Vendo Filmes de Drama");
            }else if (op == 4){// Matheus
                System.out.println("Vendo Filmes de Terror");
            }else if (op == 5){// Italo
                System.out.println("Vendo Filmes de Ficção Cientifica");
            }else if (op == 6){// Raphael
                System.out.println("Vendo Filmes Nacionais");
            }
            
        }
    }
}
