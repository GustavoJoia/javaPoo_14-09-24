/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessgame;

/**
 *
 * @author Alunos
 */
public class GuessGame {
    
    Player p1, p2, p3;
    
    public void StartGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        
        int targetNumber = (int) (Math.random()*10);
        System.out.println("Estou pensando em um número de 0 à 9...");
        
        while(true){
            
            System.out.println("O número a adivinhar é"+targetNumber);
            guessp1 = p1.guess();
            guessp2 = p2.guess();
            guessp3 = p3.guess();
            
            if(guessp1==targetNumber){
                p1isRight = true;
            }
            if(guessp2==targetNumber){
                p2isRight = true;
            }
            if(guessp3==targetNumber){
                p3isRight = true;
            }
            if(p1isRight || p2isRight || p3isRight){
                System.out.println("Temos um vencedor!");
                System.out.println("Jogador 1 acertou?"+p1isRight);
                System.out.println("Jogador 2 acertou?"+p2isRight);
                System.out.println("Jogador 3 acertou?"+p3isRight);
                break;
            } else {
                System.out.println("Os jogadores devem tentar novamente.");
            }
            
        }
        
    }
            
}