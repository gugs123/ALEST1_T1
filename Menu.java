import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);

   
   public void Executa() {
  
      while(true)   
      menu(); 
      String leitor = teclado.nextLine();

         switch (leitor) {

            case "1":

               break;

            case "2":

               break;

            case "3":

               break;

            case "4":

               break;

            case "5":

               break;

            case "6":
            System.out.println("O programa foi encerrado!");
            System.exit(0);

               break;

            default:
            
               break;
         }
   }

   public void menu() {
      System.out.println("[1] Exibir todo o índice remissivo: ");
      System.out.println("[2] Exibir o percentual de Stopwords do texto: ");
      System.out.println("[3] Exibir a palavra com maior número de ocorrências: ");
      // . Pesquisar palavras, isto é, o usuário informa uma palavra e o programa
      // lista os
      // números das páginas em que a palavra ocorre;
      System.out.println("[4] Digite uma palavra que deseja encontrar no texto:  ");
      System.out.println("[5] Exibir o índice remissivo: ");
      System.out.println("[6] Sair do programa.");
   }
}
