/*
 * 
 * The purpose of this program is to demonstrate the use of static and dynamic
 * arrays in java
 * 
 */

package javaarrays;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nathanael Greene
 */
public class JavaArrays {

   
    public static void main(String[] args) {
        ArrayList<String> dynamicList = new ArrayList();
        int[] setNumberArray = new int[12];
        Scanner input;
        String userWord;
                       
        for(int i = 0; i < 12; i++) {
            setNumberArray[i] = i+1;
        }
        
        System.out.print("Please type in a random word that is up to 12"
                + " letters long (or EXIT to see your results): ");
        input = new Scanner(System.in);
        userWord = input.next();
       
        while(!"EXIT".equals(userWord)) {
            dynamicList.add(userWord);
            
            System.out.print("Please type in a random word that is up to 12"
                + " letters long (or EXIT to see your results): ");
            input = new Scanner(System.in);
            userWord = input.next();
            
        }
        
        for(int i = 0; i <= dynamicList.size() - 1; i++) {
            System.out.print(dynamicList.get(i).length() + " ");
            System.out.println(dynamicList.get(i));
                     
        }
        dynamicList.sort(null);
        for (int j = 0; j <= dynamicList.size() - 1; j++) {
            System.out.println(dynamicList.get(j));
        }
        
    }

}
