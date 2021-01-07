import java.util.*;
class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner ob=new Scanner(System.in);
     int n=ob.nextInt();
     int a[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
     String s[]= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
     String out="";
     
     for(int i=0;i<a.length&&n!=0;i++)
     {	   
    	 for(int j=0;j<n/a[i];j++)
    		   out+=s[i];
     n%=a[i];
     }
    
   System.out.println(out);
     

	
}

}
