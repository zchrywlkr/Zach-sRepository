/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.tictactoe;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TicTacToe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String board[] = new String[9];
        board[0] = "1";
        board[1] = "2";
        board[2] = "3";
        board[3] = "4";
        board[4] = "5";
        board[5] = "6";
        board[6] = "7";
        board[7] = "8";
        board[8] = "9";
        String move = "";
        int winner = 0; // the value of 1 will mean x wins 2 o wins
        int moves = 0;
        int numberPlayers = 0;

        System.out.println("\"1\" or \"2\" players");
        numberPlayers = sc.nextInt();
        sc.nextLine(); //clears the enter key from sc.nextInt();
        do {
            if(numberPlayers == 1){
                board = move(board,board[ai(board,moves)],"o");
                drawBoard(board);
                winner = winner(board, "o");
            }
            
            if (winner != 0 || moves == 9) { //checks to see if game should end
                break;
            }
            drawBoard(board);
            System.out.println("Player 1 enter move");
            move = sc.nextLine();
            moves++;
            board = move(board, move, "x");
            drawBoard(board);
            winner = winner(board, "x");
            if (winner != 0 || moves == 9) { //checks to see if game should end
                break;
            }
            if (numberPlayers == 2) {  //checks to see if there are 2 players
                System.out.println("Player 2 enter move");
                move = sc.nextLine();
                board = move(board, move, "o");
                moves++;

                drawBoard(board);
                winner = winner(board, "o");
            }else{
                
            }

        } while (winner == 0 && moves < 9);

        if (winner == 1) {
            System.out.println("Xs win!");
        } else if (winner == 2) {
            System.out.println("Os win go baltimore!");
        } else {
            System.out.println("Its a tie");
        }
    }

    public static void drawBoard(String[] board) {

        System.out.println("  " + board[0] + "  |  " + board[1] + "  |  " + board[2] + "  ");
        System.out.println("_____|_____|_____");
        System.out.println("  " + board[3] + "  |  " + board[4] + "  |  " + board[5] + "  ");
        System.out.println("_____|_____|_____");
        System.out.println("  " + board[6] + "  |  " + board[7] + "  |  " + board[8] + "  ");
        System.out.println("     |     |     ");
    }

    public static String[] move(String[] board, String move, String player) {
        for (int i = 0; i < board.length; i++) {
            if (board[i].equals(move)) {
                board[i] = player;
            }
        }
        return board;
    }

    public static int winner(String[] board, String player) {

        for (int i = 0; i < 9; i += 3) {
            if (board[i].equals(board[i + 1]) && board[i].equals(board[i + 2])) {//checks for horizontal  wins
                if (player.equals("x")) {
                    return 1;
                } else {
                    return 2;
                }
            }
        }
        
        for (int i = 0; i < 4; i++) {
            if (board[i].equals(board[i + 3]) && board[i].equals(board[i + 6])) {//checks for vertical wins
                if (player.equals("x")) {
                    return 1;
                } else {
                    return 2;
                }
            }
        }
        if (board[0].equals(board[4]) && board[0].equals(board[8])) { // checks diagonal wins
            if (player.equals("x")) {
                return 1;
            } else {
                return 2;
            }
        }

        if (board[2].equals(board[4]) && board[2].equals(board[6])) { // checks diagonal wins
            if (player.equals("x")) {
                return 1;
            } else {
                return 2;
            }
        }

        return 0;
    }
    
    public static int ai(String [] board, int moves){
        Random r = new Random();
        int move = 0;
        if(moves == 0){//determines if its the first move the computer will make
            move = 1+r.nextInt(1); //the computer will randomly choose 1 of 2 first moves
            if(move ==1 ){
                return 0;
            }else if(move == 2){
                return 8;
           
            }
        }
        
        for(int i = 0; i<3; i++){//checks for vertical block moves and wins
            if(board[i].equals(board[i+3])&&(!board[i+6].equals("x") && !board[i+6].equals("o"))){
                return i+6;
            }else if(board[i].equals(board[i+6])&&(!board[i+3].equals("x") && !board[i+3].equals("o"))){
                return i+3;
            }else if(board[i+3].equals(board[i+6])&&(!board[i].equals("x") && !board[i].equals("o"))){
                return i;
            }
        }
        
        for(int i = 0; i<6; i+= 3){//checks for horizontal block moves and wins
            if(board[i].equals(board[i+1])&&(!board[i+2].equals("x") && !board[i+2].equals("o"))){
                return i+2;
            }else if(board[i].equals(board[i+2])&&(!board[i+1].equals("x") && !board[i+1].equals("o"))){
                return i+1;
            }else if(board[i+1].equals(board[i+2])&&(!board[i].equals("x") && !board[i].equals("o"))){
                return i;
            }
        }
        
        if(board[0].equals(board[4])&&(!board[8].equals("x") && !board[8].equals("o"))){ //checks for diagonal blocking moves and wins
            return 8;
        }else if(board[0].equals(board[8])&&(!board[4].equals("x") && !board[4].equals("o"))){
            return 4;
        }else if(board[4].equals(board[8])&&(!board[0].equals("x") && !board[0].equals("o"))){
            return 0;
        }
        if(board[2].equals(board[4])&&(!board[6].equals("x") && !board[6].equals("o"))){ //checks for diagonal blocking moves and wins
            return 6;
        }else if(board[2].equals(board[6])&&(!board[4].equals("x") && !board[4].equals("o"))){
            return 4;
        }else if(board[4].equals(board[6])&&(!board[2].equals("x") && !board[2].equals("o"))){
            return 2;
        }
        
        if(!board[0].equals("x") && !board[0].equals("o")){ //moves to first position if open
            return 0;
        }else if(!board[8].equals("x") &&  !board[8].equals("o")){ //moves to 9th postion if open
            return 8;
        }else if(!board[2].equals("x") &&  !board[2].equals("o")){ //moves to 3rd positon if open 
            return 2;
        }else if(!board[6].equals("x") &&  !board[6].equals("o")){
            return 6;
        }
        
        for(int i =0; i<9; i++){
            if(!board[i].equals("x") && !board[i].equals("o")){ // if the computer runs through all the checks it will just move to aan open spot
            return i;
            }
        }
        
        return 0;
    }
}
