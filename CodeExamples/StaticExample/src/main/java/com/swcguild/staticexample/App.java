
package com.swcguild.staticexample;

/**
 *
 * @author warde
 */
public class App {
    
    public static void main(String[] args) {
        AdderNonStaticMethod myAdder = new AdderNonStaticMethod();
        
        int sum = myAdder.add(3, 2);
        
        int sum2 = AdderStaticLibrary.add(15, 23);
        
    }

}
