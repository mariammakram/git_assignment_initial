
class LucasSeries implements ISubscriber  
{   
    public static int lucas(int x) 
    { 
  
        if (x == 0) 
            return 2; 
        if (x == 1) 
            return 1; 

        return lucas(x - 1) +  
               lucas(x - 2); 
    } 
  
  
        @Override
	public void notifySubscriber(String input) {
            int n;
            n=Integer.parseInt(input);
            System.out.println(lucas(n)); 
            
            
        }

} 