
package com.swcguild.battleship;

import java.util.Scanner;

public class BattleShip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String board1[][] = new String[10][10];
        String board2[][] = new String[10][10];
        String targetBoard1[][] = new String[10][10];
        String targetBoard2[][] = new String[10][10];
        int coordinate[] = new int[2];
        int player1Score= 0;
        int player2Score = 0;
        String hit = "";

        board1 = initialize();//sets all boards to blank values
        board2 = initialize();
        targetBoard1 = initialize();
        targetBoard2 = initialize();
        
        System.out.println("player1's turn hit enter");
        sc.nextLine();
        drawBoard(board1);
        board1=setBoard(board1);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("player2's turn hit enter");
        sc.nextLine();
        drawBoard(board2);
        board2=setBoard(board2);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        do {
            drawBoard(targetBoard1);
            System.out.println("Player1 turn");
            System.out.println("Enter target coordinates: ");
            coordinate= validateMove(targetBoard1);
        if(board2[coordinate[0]][coordinate[1]].equals("x")){
            hit="Hit";
            player1Score++;
            targetBoard1[coordinate[0]][coordinate[1]]="x";
            
            
        }else{
            hit ="Miss";
            targetBoard1[coordinate[0]][coordinate[1]]="o";
        } 
            drawBoard(targetBoard1);
            System.out.println(hit);
            System.out.println("hit enter");
            sc.nextLine();
            
            drawBoard(targetBoard2);
            System.out.println("Player2 turn");
            System.out.println("Enter target coordinates: ");
            coordinate= validateMove(targetBoard2);
        
        if(board1[coordinate[0]][coordinate[1]].equals("x")){
            System.out.println("Hit");
            player2Score++;
            targetBoard2[coordinate[0]][coordinate[1]]="x";
        }else{
            System.out.println("Miss");
            targetBoard2[coordinate[0]][coordinate[1]]="o";
            
        }
            drawBoard(targetBoard2);
            System.out.println(hit);
            System.out.println("hit enter");
            sc.nextLine();

        } while (player1Score<14 && player2Score<14);
      
            if(player1Score > player2Score){
                System.out.println("Player 1 wins");
        }else{
                System.out.println("Player2 wins");
            }
    }
    public static String[][] initialize(){
        String board[][] = new String[10][10];
        for(int i = 0; i< 10;i++){
            for(int j = 0; j <10; j++){
                board[i][j]=" ";
            }
        }
        return board;
    }
    
    public static String[][]setBoard(String[][]board){
        Scanner sc = new Scanner(System.in);
        int ship = 4; 
        int x = 0;
        int y = 0;
        int move[] = new int[2];
        
        do {
            System.out.println("enter start point of ship");
            move = validateMove(board);
            board[move[0]][move[1]] = "x";

            System.out.println("the size of the ship is: " +(ship+1) + " enter end point of ship");
            board = addShip(board,ship,move);
            drawBoard(board);
            ship--;
        } while (ship>0);
        
        
        
        return board;
    }
    
    
    public static void drawBoard(String[][] board){
            System.out.println("   0  1  2  3  4  5  6  7  8  9 ");
        for(int i = 0; i < 10; i++){
            System.out.print(i+" ");
            for(int j = 0; j<10; j++){
                System.out.print(board[i][j] + " |");
            }
            System.out.println("\r ___|__|__|__|__|__|__|__|__|__|");
            
        }
    }
    
    public static int[] validateMove(String[][] board){
        Scanner sc = new Scanner(System.in);
        
        int move[] = new int[2];
        boolean valid = false;
        do {
            System.out.print("enter x coordinate 0-9: ");
            move[1] = sc.nextInt();
            System.out.print("enter y  coordinate 0-9: ");
            move[0] = sc.nextInt();

            if(board[move[0]][move[1]].equals(" ")){
                board[move[0]][move[1]] = "x";
                drawBoard(board);
                
                valid = true;
            }else{
                System.out.println("invalid move");
            }
        } while (!valid);
        return move;
    }

    private static String[][] addShip(String[][] board, int ship,int move[]) {
        
        String resetBoard[][] = resetArray(board);
        boolean repeat = true;
        do {
            board = resetArray(resetBoard);
            drawBoard(board);
            
            int move2[] = validateMove(board);
            if(move[1] == move2[1]){  
            if(Math.abs(move[0]-move2[0])==ship) {
                repeat = false;
                if((move[0]-move2[0]) < 0){
                    for(int i = move[0]; i <= ship; i++){
                        board[i][move[1]] = "x"; 
                        
                    }
                }else{
                        for(int i = move2[0]; i <= ship; i++){
                            board[i][move[1]] = "x"; 
                            
                        }
                    }
                }
            }
        
        if(move[0] == move2[0]){
            if(Math.abs(move[1]-move2[1])==ship) {
                repeat = false;

                if((move[1]-move2[1]) < 0){
                    for(int i = move[1]; i <= ship; i++){
                        board[move[0]][i] = "x";                        
                    }
                }else{
                        for(int i = move2[1]; i <= ship; i++){
                            board[move[0]][i] = "x"; 
                        }
                    }
                }
                
            }
            
        } while (repeat);

            return board;           
        }
        
        public static String[][] resetArray(String[][] board){
            String board2[][] = new String[10][10];
            for(int i = 0; i<10; i++){
                for(int j=0; j<10; j++){
                    board2[i][j] = board[i][j];
                }
            }
        return board2;
        }
        
        
    }

