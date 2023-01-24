
// important 

import java.util.*;
public class BigScale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first digit : ");
        int digit = sc.nextInt();
        String str1 = "";
        String str2 = ""; 
        int array1[] = new int[digit];

        for(int i=0;i<digit;i++){
            array1[i] = sc.nextInt();
            str1+=array1[i];
        }

        System.out.print("enter secoend digit : ");
        int digit2 = sc.nextInt();
        int array2[] = new int[digit2];
        
        for(int j=0;j<digit2;j++){
           array2[j] =sc.nextInt();
           str2+=array2[j]; 
        }
         // System.out.println(Arrays.toString(array1));
        // System.out.println(Arrays.toString(array2));
        // System.out.println(str1);
        // System.out.println(str2);1

         
        int sum = Integer.parseInt(str2) + Integer.parseInt(str1);
        System.out.println(sum);
        String str = Integer.toString(sum);
        System.out.println(" ========> " + str.charAt(1));
        char r[] = new char[str.length()];
        
         for(int i=0;i<str.length();i++){
            r[i] = str.charAt(i);
         }
        System.out.println(Arrays.toString(r)); 
    }
}
