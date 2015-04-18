/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.tictactoe;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TicTacToe {

    public static void main(String[] args) {
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
        do {
            Scanner sc = new Scanner(System.in);
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
            System.out.println("Player 2 enter move");
            move = sc.nextLine();
            board = move(board, move, "o");
            moves++;
            
            drawBoard(board);
            winner = winner(board, "o");

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
        if (board[0].equals(board[4]) && board[0].equals(board[8])) { // checks diagnol wins
            if (player.equals("x")) {
                return 1;
            } else {
                return 2;
            }
        }
        
        if (board[2].equals(board[4]) && board[2].equals(board[6])) { // checks diagnol wins
            if (player.equals("x")) {
                return 1;
            } else {
                return 2;
            }
        }

        return 0;
    }
}
