import java.util.*;
public class DizariumNum

{
    Scanner k=new Scanner(System.in);
    void dizarium()
    {
        System.out.println("Enter a number to check Dizarium:");
        int n=k.nextInt();
        int temp1=n,rem,res=0;
        while(n!=0)
        {
            rem=n%10;
            res+=rem;
            n=n/10;
        }
        int rev=0,temp2=res;
        while(res!=0)
        {
            int r=res%10;
            rev=rev*10+r;
            res/=10;
        }
        if(rev*temp2==temp1)
        System.out.println("Dizzarium");
        else
        System.out.println("Not Dizzarium");
    }
    
}