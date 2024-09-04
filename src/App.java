
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("As Tranças do Rei Careca", "Ficção Científica"));
        filmes.add(new Filme("A Vida é Bela", "Comédia"));
        filmes.add(new Filme("Os Caça-Fantasmas", "Comédia"));
        filmes.add(new Filme("Superbad - É Hoje", "Comédia"));
        filmes.add(new Filme("O Grande Lebowski", "Comédia"));
        filmes.add(new Filme("Apertem os Cintos... O Piloto Sumiu!", "Comédia"));
        filmes.add(new Filme("Se Beber, Não Case!", "Comédia"));
        filmes.add(new Filme("O Diário de uma Princesa", "Comédia"));
        filmes.add(new Filme("O Máskara", "Comédia"));
        filmes.add(new Filme("Anchorman - A Lenda de Ron Burgundy", "Comédia"));
        filmes.add(new Filme("Trovão Tropical", "Comédia"));
        filmes.add(new Filme("Uma Noite no Museu", "Comédia"));
        filmes.add(new Filme("Como Perder um Homem em 10 Dias", "Comédia"));
        filmes.add(new Filme("A Morte lhe Cai Bem", "Comédia"));
        filmes.add(new Filme("O Pai da Noiva", "Comédia"));
        filmes.add(new Filme("Os Embalos de Sábado à Noite", "Comédia"));   




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
            int op = Integer.parseInt(leitor.nextLine());

            //Substituir o println pela exibição na tela uma lista de 10 filmes daquele gênero.
            if (op == 1){// Pedro
                System.out.println("Vendo Filmes de Ação");
                
                
            }else if (op == 2){// Ryan
                
               System.out.println("Vendo Filmes de Comédia");
               for (Filme f : filmes){
                if (f.getGenero().equals("Ficção Comédia")){
                    System.out.println(f);
                }
            }
            
                
            }else if (op == 3){// Pietra e André
                System.out.println("Vendo Filmes de Drama");
                
            }else if (op == 4){// Matheus
                System.out.println("Vendo Filmes de Terror");
                
            }else if (op == 5){// Italo
                System.out.println("Vendo Filmes de Ficção Científica");
                for (Filme f : filmes){
                    if (f.getGenero().equals("Ficção Científica")){
                        System.out.println(f);
                    }
                }
            }else if (op == 6){// Raphael
                System.out.println("Vendo Filmes Nacionais");
            }

            leitor.nextLine();
            
        }
    }
}
