package question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your message: ");
        String msg = scanner.nextLine();
        scanner.close();
    
        int cont = 0;
        
        String[] emoji = msg.split("\\s+");
        for(int i = 0; i < emoji.length; i++){
          if(emoji[i].equals(":-)")){
            cont++;
          }
          if(emoji[i].equals(":-(")){
            cont--;
          }
        } 

        if(cont == 0){
          System.out.println("neutral");
        }
        if(cont > 0){
          System.out.println("fun");
        }
        if(cont < 0){
          System.out.println("upset");
        }
    }
}
