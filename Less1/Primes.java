public class Primes {
    public static void main (String[] args)
   {		
       int i = 0;
       int num = 0;

       System.out.println("Простые числа от 1 до 1000:");

       for (i = 1; i <= 1000; i++)         
       { 		  	  	  
          int devided = 0;
          for(num = i-1; num>=2; num--)
	        {
             if(i%num==0)
                {
                    devided++;
                }
	        }
            if (devided == 0) {
                System.out.println(i);
            }
       }	
   }
    
}
