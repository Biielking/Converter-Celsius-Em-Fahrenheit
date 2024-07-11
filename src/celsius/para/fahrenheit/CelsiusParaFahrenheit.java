package celsius.para.fahrenheit;

import java.util.Scanner;

public class CelsiusParaFahrenheit {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       boolean continueRunnig = true;
       
       while(continueRunnig){
       //entrada da temperatura celcius
       System.out.println(" Qual a temperatura de celsius: ");
       Double celsius = in.nextDouble();
    
       //conversao para Fahrenheit
      Double Fahrenheit = (celsius * 9/5)+32;
      System.out.println(celsius+" Graus celcius e: " +Fahrenheit+ " Graus Fahrenheit ");
       
      // Vai perguntar ao Usuario Se Deseja converter outra temperatura
      System.out.println(" Voce Deseja converter outra temperatura? (Sim)/Nao): ");
      String resposta = in.next();
      
      if(resposta.equalsIgnoreCase("Nao")){
         continueRunnig = false;
      }
       }
     in.close();
    } 
}
