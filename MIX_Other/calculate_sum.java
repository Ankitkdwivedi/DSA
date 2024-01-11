import java.util.*; 
public class Main {    
	 public static void main(String args[]) {           
		 Scanner scant = new Scanner(System.in);         
		 int n = scant.nextInt();           
		
		
		
		
		
		
		
		 int at[] = new int[n];         
		 for(int i=0; i<n; i++)             
		 at[i] = scant.nextInt();           
		 int ankitdwi[] = new int[n]; 






		 
		 for(int i=0; i<n; i++)             
		 ankitdwi[i] = at[i];           
						 int qyt = scant.nextInt();         
		
		
		
		
		
		 while(qyt-- > 0)         {             
			 int x = scant.nextInt();             
			 x = x % at.length;               
			 for(int i=0; i<n; i++)             {                 
				 int r = i - x;                 
				 if(r < 0)                    
				  r = n + r; 
				  //solution                  
							  at[i] += ankitdwi[r];             }              
								   for(int i=0; i<n; i++)                 
				   ankitdwi[i] = at[i];         }           
				   int ankitans = 0;         
				  
				  
				   for(int i=0; i<n; i++)            
										    ankitans += at[i];           
			 System.out.println(ankitans % ((int)Math.pow(10, 9) + 7));     } }