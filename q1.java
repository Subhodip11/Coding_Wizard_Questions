import java.util.*;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner ob=new Scanner(System.in);
       int n=ob.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       a[i]=ob.nextInt();
       int enter_sum=ob.nextInt(),pos=-1;
       for(int i=0;i<a.length;i++)
       {
    	   if(enter_sum==a[i])
    	   {
    		   System.out.println("1 element prrsent with entered sum ");
    		   break;
    	   }
    	   for(int j=i+1;j<a.length;j++)
    	   {   for(int k=j+1;k<a.length;k++)
    			 if(enter_sum==(a[i]+a[j]+a[k]))
    			 {
    				 System.out.println("Triplet "+a[i]+","+a[j]+","+a[k]);
    				 pos=0;
    				 break;
    			 }
    	   if(pos==0)
    		   break;
    	   }
    	   if(pos==0)
    		   break;
       }
       if(pos==-1)
    	   System.out.println("Triplet not present");
	}

}
