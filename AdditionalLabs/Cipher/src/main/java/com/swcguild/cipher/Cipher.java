/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.cipher;
import com.swcguild.consoleio.ConsoleIO;
/**
 *
 * @author apprentice
 */
public class Cipher {

    String[] alph = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    String input = "";
    String phrase = "";
    String code = "";
    String keyPhrase = "";
    int n = 0;

    ConsoleIO io = new ConsoleIO();

    public void run() {

        Boolean exit = false;

        do {

            input = io.scanString("1) Caesar\r2)Gilbert\r3)Vigenere\r4)decipher Caesar\r5)decipher Gilber\r6)decipher vigenere\r7)exit");

            switch (input) {
                case "1":
                    phrase = io.scanString("Input string to code");
                    n = Integer.parseInt(io.scanString("input shift key"));
                    code = caesar(phrase, n);
                    break;
                case "2":
                    phrase = io.scanString("Input string to code");
                    keyPhrase = io.scanString("input keyPhrase");
                    code = gilbert(phrase, keyPhrase);
                    break;
                case "3":
                    phrase = io.scanString("Input string to code");
                    keyPhrase = io.scanString("Enter key phrase");

                    code = vigenere(phrase, n);
                    break;
                case "4":
                    code = caesar(code, -n);
                    break;
                case "5":
                    code = degilbert(code, keyPhrase);
                    break;
                case "6":
                    code = vigenere(code, -n);
                    break;
                case "7":
                    exit = true;
                default:
                    io.printString("unknown command");
            }

            io.printString("\rthe code is "+code + "\r");
        } while (!exit);

    }

    private String caesar(String input, int n) {
        char letter;

        int number = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            letter = input.charAt(i);
            for (int j = 0; j < alph.length; j++) {
                if (Character.toString(letter).equals(alph[j])) {
                    sb.append(alph[(j + n) % 26]);
                }
            }
        }
        return sb.toString();
    }

    private String gilbert(String phrase, String keyPhrase) {
        
        
        int num2 = 0;
        int num = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for(int i=0,j =0; i< phrase.length();i++,j++){
            if(j>=keyPhrase.length()){
                j=0;
            }
            sb2.append(keyPhrase.charAt(j));
        }
        keyPhrase = sb2.toString();
        for (int i = 0; i < phrase.length(); i++) {
            for (int j = 0; j < alph.length; j++) {
                if (Character.toString(phrase.charAt(i)).equals(alph[j])) {
                    num = j;
                }
                if (Character.toString(keyPhrase.charAt(i)).equals(alph[j])) {
                    num2=j;
                }
            }
           
            sb.append(alph[(num + num2) % 26]);
        }
        return sb.toString();
    }

    private String vigenere(String phrase, int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        private String degilbert(String phrase, String keyPhrase) {
        
        int num2 = 0;
        int num = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            for (int j = 0; j < alph.length; j++) {
                if (Character.toString(phrase.charAt(i)).equals(alph[j])) {
                    num = j;
                }
                if (Character.toString(keyPhrase.charAt(i)).equals(alph[j])) {
                    num2=j;
                }
            }
            
            sb.append(alph[Math.abs(num - num2) % 26]);
        }
        return sb.toString();
    }
}
