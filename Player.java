/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessgame;

/**
 *
 * @author Alunos
 */
public class Player {
    
    int number;
    
    public int guess(){
        number = (int)(Math.random()*10);
        return number;
    }
    
}