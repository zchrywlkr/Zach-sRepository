
package com.swcguild.methodexamples;

/**
 *
 * @author warde
 */
public class MethodExamples {
    
    public static void main(String[] args) {
        printHiYa();
        
        System.out.println(calculatePi());
        
        System.out.println(add(5, 2));
        
        int num1 = 10;
        int num2 = 5;
        int sum = add(num1, num2);
        System.out.println(sum);
    }
    
    public static void printHiYa() {
        System.out.println("HiYa");
    }
    
    public static double calculatePi() {
        return 3.14159;
    }
    
    public static int add1And1() {
        return 1 + 1;
    }
    
    public static int add1And2() {
        return 1 + 2;
    }
    
    public static int add(int a, int b) {
        return a + b;
    }
    

}
