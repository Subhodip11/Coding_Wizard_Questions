
public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,number=0;
        for(int i=2;;i++)
        {
        	if(checkprime(i))
        	c++;
        	if(c==10001)
        	{
        		number=i;
        		break;
        	}
        }
       System.out.println("The 10001 st number is "+number);
	}
	public static boolean checkprime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			  return false;
		}
		return true;
	}

}
