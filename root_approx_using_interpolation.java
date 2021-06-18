import java.util.*;
class root_approx_using_interpolation
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        long p;
        int i,j;
        double x1=0,x2=0,x3=0,y1=0,y2=0,y3=0;
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

            for(j=0;;j++)
            {
                System.out.println("Enter x1");
                x1=in.nextDouble();
                System.out.println("Enter x2");
                x2=in.nextDouble();
                y1=0;
                y2=0;
                for(i=1;i<d+1;i++)
                {
                    y1+=co[i]*Math.pow(x1,i);
                }
                y1+=co[0];
                for(i=1;i<d+1;i++)
                {
                    y2+=co[i]*Math.pow(x2,i);
                }
                y2+=co[0];
                if((y1*y2)<0)
                {
                    break;
                }
                else
                {
                    System.out.println("\f");
                    System.out.println("Change inputs");

                }
            }
            System.out.println("The coefficients are");
            for(i=d;i>-1;i--)
            {
                System.out.print(co[i]+" ");
            }
            System.out.println("The coordinates are: ("+x1+","+y1+")  ("+x2+","+y2+")");
            System.out.println("");
            System.out.println("Enter precision");
            p=in.nextLong();
            for(i=0;i<p;i++)
            {
                x3=0;
                y3=0;
                x3=x1+(y1*((x1-x2)/(y2-y1)));
                for(j=1;j<d+1;j++)
                {
                    y3+=co[j]*Math.pow(x3,j);
                }
                y3+=co[0];
                System.out.println("The coordinates are: ("+x3+","+y3+")");
                if((y3*y1)>0)
                {
                    x1=x3;
                    y1=y3;
                }
                else if((y3*y2)>0)
                {
                    x2=x3;
                    y2=y3;
                }

            }
            System.out.println("The approximation of the root is "+x3);
            a=in.nextInt();
        }
    }
}

        
        
        
        
        
