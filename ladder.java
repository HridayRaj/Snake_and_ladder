import java.util.Random;
import java.util.Scanner;
class ladder{
 public static void main(String[] args) {

    int p1=0 , p2=0 , n=0,h=0;
    Scanner in=new Scanner(System.in);
    Random rand=new Random();
    int d1,d2,d3,d4;
    int l1,l2,l3,l4,l5,l6;
    int s1,s2,s3,s4,s5,s6;
    System.out.println("*************\t**************\t***************\t********\n****** Welcome to the Snake and Ladder Game ******\n");
    System.out.println("\tPress Enter to Continue");
    String b1=in.nextLine();
    System.out.println("\tEnter the Name of Player 1:");
    String n1=in.nextLine();
    System.out.println("\tEnter the Name of Player 2:");
    String n2=in.nextLine();
    System.out.println("\t*****Press Enter to Know the position of the ladders***** \t\n>>>");
    String b=in.nextLine();
    l1=rand.nextInt(20);
    l2=rand.nextInt(30);
    l3=rand.nextInt(80);
    l4=rand.nextInt(40);
    l5=rand.nextInt(50);
    l6=rand.nextInt(60);
    System.out.println("\tLadder are at postions \n\t"+l1+"\n\t"+l2+"\n\t"+l3+"\n\t"+l4+"\n\t"+l5+"\n\t"+l6+"\n\t");
    System.out.println("\t*****Press Enter to Know the position of the Snakes***** \t\n>>>");
    String b4=in.nextLine();
    s1=rand.nextInt(100);
    s2=rand.nextInt(100);
    s3=rand.nextInt(100);
    s4=rand.nextInt(100);
    s5=rand.nextInt(100);
    s6=rand.nextInt(100);
    System.out.println("\tSnakes are at postions \n\t"+s1+"\n\t"+s2+"\n\t"+s3+"\n\t"+s4+"\n\t"+s5+"\n\t"+s6+"\n\t");
    while(h==0){
        if(n%2==0){
            System.out.println("\tP1 Press Enter to Roll the Dice:");
            String en=in.nextLine();
            int mov1=rand.nextInt(7);
            p1=p1+mov1;
            if(p1==l1||p1==l2||p1==l3||p1==l4||p1==l5||p1==l6){
                int lad=rand.nextInt(20);
                p1=p1+lad;
                System.out.println("\tCongrats for the Ladder keep Playing !!!!");
            }
            else
            if(p1==s1||p1==s2||p1==s3||p1==s4||p1==s5||p1==s6){
                int bite=rand.nextInt(20);
                p1=p1-bite;
                System.out.println("\tOops the bite Hurts!!!!!");
                if((p1)<=0){
                    p1=0;
                }else{
                    p1=p1-bite;
                }
                
              
            }
            System.out.println("\tp1 Current position is :"+p1) ; 
            if(p1>=100){
                System.out.println("\t\t*******\t"+n1+"_____*****\tYOU WON");
                break;
            }
            n+=1;

        }else{
            System.out.println("\tP2 Press Enter to Roll the Dice:");
            String en1=in.nextLine();
            int mov2=rand.nextInt(7);
            p2=p2+mov2;
            if(p2==l1||p2==l2||p2==l3||p2==l4||p2==l5||p2==l6){
                int lad=rand.nextInt(20);
                p2=p2+lad;
                System.out.println("\tCongrats for the Ladder keep Playing !!!!");
            }
            else
            if(p2==s1||p2==s2||p2==s3||p2==s4||p2==s5||p2==s6){
                int bite2=rand.nextInt(20);
                p2=p2-bite2;
                System.out.println("\tOops the bite Hurts!!!!!");
                
                if(p2<=0){
                    p2=0;
                }else{
                    p2=p2-bite2;
                    
                }
               
            
                
            }
            System.out.println("\tp2 current postion is :"+p2);
            if(p2>=100){
              System.out.println("\t\t*******\t"+n2+"*****\tYOU WON");
               break;
            }
            n+=1;



            

        }



    }
    System.out.println("\t\t\t\t*******\tGAME OVER\t*********");



    

  
}
}