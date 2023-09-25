/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediaescolar;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class atividade {
    
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
       
              
        String nome,classi;
int idade,;

 double peso,altura,imc;
 
 
        System.out.println("Digite nome ");
        nome = sc.next();
        
        System.out.println("Digite idade");
        idade = sc.nextInt();
        
        System.out.println("Digite peso");
        peso = sc.nextDouble();
       
      System.out.println("Digite altura");
      altura = sc.nextDouble();
        
        
        imc = (peso)/altura/altura;
           if(imc<18.5){
        System.out.println("abaixo do peso normal");
        
    }else if(imc>=24.9){
        System.out.println("peso normal");
        
    }else if(imc>=24.9){
            System.out.println("excesso de peso");
            
    }else if(imc>29.9){
        System.out.println("obesidade classe 1");
        
    }else if(imc>=34.9){
        System.out.println("obesidade classe 2");
    
    }else if(imc>=39.9){
    System.out.println("obesidade classe 3");
}
}
}
       
    
        

                
        
               
        
