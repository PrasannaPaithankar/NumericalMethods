import java.util.*;
class pi_using_coprime_probability
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        long i,j;
        int a=1;
        double x1,x2,x3,p,q,w,pi,c=0,r,d=0;
        while(a>0)
        {
            x1=0;
            x2=0;
            System.out.println("Enter random range");
            r=in.nextDouble();
            System.out.println("Enter precision");
            p=in.nextDouble();
            for(i=0;i<p;i++)
            {
                d=0;
                q=Math.ceil(r*Math.random());
                w=Math.ceil(r*Math.random());
                if(q==w)
                {
                    w--;
                }
                x1=Math.max(q,w);
                x2=Math.min(q,w);
                if((x1%2==0)&&(x2%2==0))
                {
                    d=1;
                }
                if(x1%x2==0)
                {
                    d=1;
                }
                for(j=3;j<=Math.sqrt(w);j++)
                {
                    if((x1%j==0)&&(x2%j==0))
                    {
                        d++;
                        break;
                    }
                }
                if(d==0)
                {
                    c++;
                }
            }
            System.out.println(c);
            pi=Math.sqrt((6*p)/c);
            System.out.println("Value of pi = "+pi);
            c=0;
            System.out.println("Enter 1 to run again");
            System.out.println("Enter 0 to exit");
            a=in.nextInt();
        }
    }
}  

                        
                        
                        
                        