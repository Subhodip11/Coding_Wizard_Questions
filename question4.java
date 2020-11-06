import java.util.*;
public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter a date :");
        String str=ob.nextLine();
       String a=str.replaceAll("[a-zA-Z]","");
       String s1[]=a.split("\\s");
       int dd=Integer.parseInt(s1[0]);
       int yy=Integer.parseInt(s1[2]);
       String b=str.replaceAll("[0-9]","");
       String s2[]=b.split("\\s");
       String mm=s2[1];
       mm=mm.toUpperCase();
       
       //calculating the day number
       int notleap[]= {31,59,90,120,151,181,212,243,273,304,334,365};   //used if year not leap actually it is addition of days in a respective month
       int leap[]= {31,60,91,121,152,182,213,244,274,305,335,366};      //used if year is leap and has same meaning as notleap otherwise
       int daynumber=0;
       switch(mm)
       {
       case "JANUARY":
    	   if(mm.equals("JANUARY")&&dd<32)
    	   {
    		   daynumber=dd;
    		   System.out.println("Day Number :"+daynumber);
    	   }
    	   else
    		   System.out.println("Wrong Date input");
    	   break;
       case "FEBRUARY":
    	   
    	   if(mm.equals("FEBRUARY")&&dd<30)
    	   {
    		   if(leapyear(yy)==1)
    		   daynumber=dd+leap[0];
    		   else
    			   daynumber=dd+notleap[0];
    		   System.out.println("Day Number :"+daynumber);
    	   }
    	   else
    		   System.out.println("Wrong Date input");
    	   break;
       case "MARCH":
    	   if(mm.equals("MARCH")&&dd<32)
    	   {
    		   if(leapyear(yy)==1)
    			   daynumber=dd+leap[1];
    		   else
    			   daynumber=dd+notleap[1];
    		   System.out.println("Day Number :"+daynumber);
    	   }
    	   else
    		   System.out.println("Wrong Date input");
    	   break;
       case "APRIL":
    	   if(mm.equals("APRIL")&&dd<30)
    	   {
    		   if(leapyear(yy)==1)
    			   daynumber=dd+leap[2];
    		   else
    			   daynumber=dd+notleap[2];
    		   System.out.println("Day Number :"+daynumber);
    	   }
    	   else
    		   System.out.println("Wrong Date input");
    	   break;
       case "MAY":
    	   if(mm.equals("MAY")&&dd<31)
    	   {
    		   if(leapyear(yy)==1)
    			   daynumber=dd+leap[3];
    		   else
    			   daynumber=dd+notleap[3];
    		   System.out.println("Day Number :"+daynumber);
    	   }
    	   else
    		   System.out.println("Wrong Date input");
    	   break;
       case "JUNE":
    	   if(mm.equals("JUNE")&&dd<30)
    	   {
    		   if(leapyear(yy)==1)
    			   daynumber=dd+leap[4];
    		   else
    			   daynumber=dd+notleap[4];
    		   System.out.println("Day Number :"+daynumber);
    	   }
    	   else
    		   System.out.println("Wrong Date input");
    	   break;
       case "JULY":
    	   if(mm.equals("JULY")&&dd<32)
    	   {
    		   if(leapyear(yy)==1)
    			   daynumber=dd+leap[5];
    		   else
    			   daynumber=dd+notleap[5];
    		   System.out.println("Day Number :"+daynumber);
    	   }
    	   else
    		   System.out.println("Wrong Date input");
    	   break;
       case "AUGUST":
    	   if(mm.equals("AUGUST")&&dd<32)
    	   {
    		   if(leapyear(yy)==1)
    			   daynumber=dd+leap[6];
    		   else
    			   daynumber=dd+notleap[6];
    		   System.out.println("Day Number :"+daynumber);
    	   }
    	   else
    		   System.out.println("Wrong Date input");
    	   break;
       case "SEPTEMBER":
    	   if(mm.equals("SEPTEMBER")&&dd<31)
    	   {
    		   if(leapyear(yy)==1)
    			   daynumber=dd+leap[7];
    		   else
    			   daynumber=dd+notleap[7];
    		   System.out.println("Day Number :"+daynumber);
    	   }
    	   else
    		   System.out.println("Wrong Date input");
    	   break;
       case "OCTOBER":
    	   if(mm.equals("OCTOBER")&&dd<32)
    	   {
    		   if(leapyear(yy)==1)
    			   daynumber=dd+leap[8];
    		   else
    			   daynumber=dd+notleap[8];
    		   System.out.println("Day Number :"+daynumber);
    	   }
    	   else
    		   System.out.println("Wrong Date input");
    	   break;
       case "NOVEMBER":
    	   if(mm.equals("NOVEMBER")&&dd<31)
    	   {
    		   if(leapyear(yy)==1)
    			   daynumber=dd+leap[9];
    		   else
    			   daynumber=dd+notleap[9];
    		   System.out.println("Day Number :"+daynumber);
    	   }
    	   else
    		   System.out.println("Wrong Date input");
    	   break;
       case "DECEMBER":
    	   if(mm.equals("DECEMBER")&&dd<32)
    	   {
    		   if(leapyear(yy)==1)
    			   daynumber=dd+leap[10];
    		   else
    			   daynumber=dd+notleap[10];
    		   System.out.println("Day Number :"+daynumber);
    	   }
    	   else
    		   System.out.println("Wrong Date input");
    	   break;
    	default:
    		System.out.println("Wrong Date input");
    		
       }
       
    	   
     }
      
	
    public static int leapyear(int yy)
    {
    	int checkleap=0;
    	if(yy%4==0)
    	{
    		if(yy%100==0)
    		{
    			if(yy%400==0)
                 checkleap=1;
    			else
    				checkleap=0;
    		}
    		else
    			checkleap=1;
    	}
    	else
    		checkleap=0;
    return checkleap;
    }
}
