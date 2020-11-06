
public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        long s=0,m=0;
        int cnt=0;
        for(long k=2;k<=1000000;k++)
        {
       	 cnt=1;
       	 long n=k;
       	 //continuing the loop upto which the number becomes one
       	 while(n!=1)
       	 {
       		 if(n%2==0)
       			 n/=2;
       		 else
       			 n=3*n+1;
       		 cnt++;
       		 
       	 }
       	 
       	 if(cnt>s&&n==1)
       	 {
       		 s=cnt;
       		 
       		 m=k;
       	 }
        }
        System.out.println("The starting which produces the longest chain under 1 million is "+m);
	}

}
