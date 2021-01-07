import java.util.*;
public class q2 {
static Scanner ob=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s=ob.nextLine(),s1="";
       String r=ob.nextLine();
      for(int i=0;i<s.length();i++)
    	  s1+=Character.toLowerCase(s.charAt(i));
    		   for(int i=0;i<r.length();i++)
    			  for(int j=0;j<s1.length();j++)
    			   if(s1.charAt(j)==r.charAt(i))
    					  s1=s1.replace(r.charAt(i)+"","");
    		      
    		   System.out.println(s1);
    	      
       
	}

}
