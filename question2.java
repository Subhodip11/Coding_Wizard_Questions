import java.util.*;
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ob=new Scanner(System.in);
        char ch=' ';
        char compch[]= {'r','p','s'};
        char compch1=' ';
        Random random=new Random();
        int usercnt1=0,compcnt1=0;
        char input=' ';
        do
        {
        	System.out.println("WELCOME TO THE GAME OF ROCK,PAPER,SCISSOR");
        for(int i=1;i<=3;i++)
        {
        	int usercnt=0,compcnt=0;
        	System.out.println("ROUND "+i);
        	System.out.println("Enter User's choice :");
        	ch=ob.next().charAt(0);
        	ch=Character.toLowerCase(ch);
        	compch1=compch[random.nextInt(compch.length)];
        	System.out.println("Computer's generated choice :"+compch1);
        	if((ch=='r'&&compch1=='p')||(ch=='p'&&compch1=='s')||(ch=='s'&&compch1=='r'))
        		compcnt++;
        	else if(ch=='r'&&compch1=='s'||(ch=='p'&&compch1=='r')||(ch=='s'&&compch1=='p'))
        		usercnt++;
        	else if((ch=='r'&&compch1=='r')||(ch=='p'&&compch1=='p')||(ch=='s'&&compch1=='s'))
        	{
        		compcnt++;
        		usercnt++;
        	}
        	        	
        	//checking the player who wins the match
        	if(usercnt>compcnt)
        		System.out.println("User won the round");
        	if(usercnt==compcnt)
        		System.out.println("Round of tie");
        	if(usercnt<compcnt)
        		System.out.println("Computer won the round");
        	usercnt1+=usercnt;
        	compcnt1+=compcnt;
        	System.out.println(" ----------------- ");
        		
        }
        if(usercnt1>compcnt1)
        	System.out.println("3 Rounds over, User scored "+usercnt1+",user won the game");
        if(usercnt1<compcnt1)
        	System.out.println("3 Rounds over, Computer scored "+compcnt1+",computer won the game");
        if(usercnt1==compcnt1)
        	System.out.println("3 Rounds over, User and Computer scored same, It's a tie");
        System.out.println("Want to play more rounds ?\nEnter (y/Y) to continue or (n|N) to terminate");
        input=ob.next().charAt(0);
        usercnt1=0;
        compcnt1=0;
       
        }while(input=='y'||input=='Y');
        
	}

}
