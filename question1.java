import java.util.Scanner;
public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the Sequence in with tge conversion is to be done :");
        String s=ob.nextLine();
        s=s.toUpperCase();
        int pos=0;
         char ch[]=s.toCharArray();
         for(int i=0;i<s.length();i++)
         {
        	 if(ch[i]=='A'||ch[i]=='C'||ch[i]=='G'||ch[i]=='T')
        	 {
        		 if(ch[i]=='A')
        			 ch[i]='U';
        		 else if(ch[i]=='C')
        			 ch[i]='G';
        		 else if(ch[i]=='G')
        			 ch[i]='C';
        		 else if(ch[i]=='T')
        			 ch[i]='A';
        	 }
        	 else   //if character is not in between a,c,g,t then pos is incremented which if more 
        	 {      //than 0 then the input character is not in between mentioned characters
        		 pos++;
        		 break;
        	 }
        	 
         }
         
         if(pos==0)
        	 System.out.println(ch);
         else
        	 System.out.println("INVALID Input");
       
	}

}
