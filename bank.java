import java.util.*;

class Main{
    public static void main(String[] args)
{
    Scanner sc= new Scanner(System.in);
    List n= new ArrayList<>();
    List a= new ArrayList<>();
    for(int i=1; i<100; i++){
        String s= "ACC00"+i;
        System.out.print("CREATE "+s);
        String account= sc.next();
        System.out.print("DEPOSIT "+s);
        int amount= sc.nextInt();
        System.out.print("WITHDRAW "+s);
        int wa= sc.nextInt();
        if(wa<=amount){
            int sb= amount-wa; 
            n.add(account);
            a.add(sb);
        }
        else{
            System.out.println("Invalid Amount...Please check !");
        }
        System.out.println("Do you want to create another account: (Y/N) ");
        String ch= sc.next();
        if (ch.equalsIgnoreCase("n")){
            break;
        }
    }
        for(int i=n.size()-1; i>=0; i--){
            System.out.println(n.get(i)+" "+a.get(i));
        }
    }
}