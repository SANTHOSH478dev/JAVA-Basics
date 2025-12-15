import java.util.Scanner;
public class Q11{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int dmk=0,admk=0,bjp=0,tvk=0,n;
    do{
        System.out.println("Enter your vote(1.DMK 2.ADMK 3.BJP 4.TVK) or -1 to end:");
         n=sc.nextInt();
       switch(n){
            case 1:
            dmk++;
            break;
            case 2:
            admk++;
            break;
            case 3:
            bjp++;
            break;
            case 4:
            tvk++;
            break;
            case -1:
            break;
            default:
            System.out.println("Invalid Vote");
        }
    }while(n!=-1);
    System.out.println("DMK Votes:"+dmk);
    System.out.println("ADMK Votes:"+admk);
    System.out.println("BJP Votes:"+bjp);
    System.out.println("TVK Votes:"+tvk);
    if(dmk>admk && dmk>bjp && dmk>tvk){
        System.out.println("DMK is the winner");
    }
    else if(admk>dmk && admk>bjp && admk>tvk){
        System.out.println("ADMK is the winner");
    }
    else if(bjp>dmk && bjp>admk && bjp>tvk){
        System.out.println("BJP is the winner");
    }
    else if(tvk>dmk && tvk>admk && tvk>bjp){
        System.out.println("TVK is the winner");
    }
    else{
        System.out.println("It's a tie");
    }
}}