import java.util.*;
class root_approx_using_transformation
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        long p;
        int i,j;
        double x=0,r,b;
        int a=1;
        while(a>0)
        {
            System.out.println("Enter the degree of equation");
            int d=in.nextInt();
            double co[]=new double[d+1];
            System.out.println("Enter the coefficients one by one");
            System.out.println("from decreasing order of degree");
            for(i=d;i>-1;i--)
            {
                co[i]=in.nextDouble();
            }
            for(i=d;i>-1;i--)
            {
                System.out.print(co[i]+" ");
            }
            System.out.println("");
            r=100*(Math.random());
            x=r;
            System.out.println("Enter precision");
            p=in.nextLong();
            for(i=0;i<p;i++)
            {
                b=0;
                for(j=1;j<d;j++)
                {
                    b+=(co[j])*(Math.pow(x,j));
                }
                b=b+co[0];
                b=(-1*b)/(co[d]);
                x=Math.pow(b,Math.pow(d,-1));
                System.out.println(x);
                if(b==x)
                {
                    break;
                }
            }
            System.out.println("The approximation of the root is "+x);
            a=in.nextInt();
        }
    }
}

                
                
                
            