import java.util.*;
public class FanPattern {

    public static void main(String[] args) 
    {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
		    int num = i+1;
		    for(int j=0; j<n; j++)
		    {
		        if(j<=i)
		        {
		           System.out.print(num+" ");
		           num--;
		        }
		        else
		          System.out.print("*"+" ");
  		    }
  		    num = n-i;
  		   for(int k=0; k<n; k++)
  		    {
  		        
  		        if(k<n && num>=1)
  		        {
  		           System.out.print(num+" ");
  		           num--;
  		        }
  		         else
  		           System.out.print("*"+" ");
  		    }
		    System.out.println();
		}
		
		
		for(int i=0; i<n; i++)
		{
		    int num = i+1;
		    for(int j=0; j<n; j++)
		    {
		        if(i+j >= n-1)
		        {
		           System.out.print(num+" ");
		           num--;
		        }
		        else
		          System.out.print("*"+" ");
  		    }
  		    
  		    num = 1;
  		   for(int k=0; k<n; k++)
  		    {
  		        
  		        if(n-i+k+1>n && num>0)
  		        {
  		           System.out.print(num+" ");
  		           num++;
  		        }
  		         else
  		           System.out.print("*"+" ");
  		    }
  		    
  		    System.out.println();
		}
	

	}
}
