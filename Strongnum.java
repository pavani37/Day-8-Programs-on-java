import java.util.*;
public class Strongnum
{
public static void main(String[] args) {
int n,i;
int fact,lastdig;
Scanner sc = new Scanner(System.in);
System.out.print("\nEnter the number : " );
n = sc.nextInt();
int total = 0;
int temp = n;
while(n != 0)
{
i = 1;
fact= 1;
lastdig = n % 10;
while(i <= lastdig)
{
fact = fact * i;
i++;
}
total = total + fact;
n = n / 10;
}
if(total == temp)
System.out.println(temp+ " is a strong number");
else
System.out.println(temp+ " is not a strong number");
}
}
