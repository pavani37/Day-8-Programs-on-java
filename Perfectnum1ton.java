public class Perfectnum1ton
{
public static void main(String arg[])
{
int sum=0;
for(int i=0;i<500;i++)
{
sum=0;
for(int j=1;j<i;j++)
{
if(i%j==0)
{
sum=sum+j;
}
}
if(sum==i && sum!=0)
System.out.print(i+"\t");
}
}
}