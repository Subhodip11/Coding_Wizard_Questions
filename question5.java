
public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long l=0;
		int a=0,b=0;
       for(int i=100;i<=999;i++)
       {
    	   for(int j=i+1;j<=999;j++)
    	   {
    		   long mult=i*j;
    		   //check for wether the multiplied term is palindrome or not 
    		   if(checkpal(mult))
    			   if(mult>l)
    			   {
    				   l=mult;
    				   a=i;
    				   b=j;
    			   }
    			   
    			   
    	   }
    	   
    	   
       }
       System.out.println("The largest palidromic number with 3 terms is "+l+" and the numbers are "+a+" and "+b);
	}
    public static boolean checkpal(long mult)
    {
    	String str=mult+"",str2="";
    	for(int i=str.length()-1;i>=0;i--)
    		str2=str2+str.charAt(i)+"";
    
    	if(str.equals(str2))
    		return true;
    	else
    		return false;
    }

}
