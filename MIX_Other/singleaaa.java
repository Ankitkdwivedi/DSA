import java.util.*;  public class Main {
         
    public static void main(String[] args) {         
        Scanner sct = new Scanner(System.in);         
           
           int numberOfTrees = sct.nextInt();         
           
           int[] arrayankit = new int[numberOfTrees];         
        int minHeight = Integer.MAX_VALUE;         
        int maxHeight = Integer.MIN_VALUE;         
        for (int i = 0; i < numberOfTrees; i++) {             
            arrayankit[i] = sct.nextInt();             
            minHeight = Math.min(minHeight, arrayankit[i]);             
            maxHeight = Math.max(maxHeight, arrayankit[i]);         
            }         int woodNeeded = sct.nextInt();         
            int lside = minHeight;         
            int rside = maxHeight;        
             while (lside < rside) {             
                 int mid = lside + (rside - lside + 1) / 2;             
                 long cutting = 0;            
                  for (int i = 0; i < numberOfTrees; i++) {                 
                      if (arrayankit[i] > mid) {                    
                           cutting += arrayankit[i] - mid;                 
                           }             }             
                           if (cutting >= woodNeeded) {                
                                lside = mid;             } 
                                else {                 
                                    rside = mid - 1;             
               }         }        
                   System.out.println(lside);     
       } 
       }