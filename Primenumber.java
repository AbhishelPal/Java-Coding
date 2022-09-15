import java.util.Scanner;
class Primenumber
{
void primedigit(int a)
{
    boolean flag = false;
    for (int i = 2; i <= a / 2; i++) 
    {
      if (a % 2 == 0) 
      {
        flag = true;
       break;
     }
    }
    if (!flag)
    {
    System.out.println(a + " ");
    } 
}
public static void main (String args[])
{ 
Scanner sc = new Scanner(System.in);
System.out.println("Enter a no: ");
int w = sc.nextInt();
System.out.println("last no: ");
int q = sc.nextInt();
Primenumber p = new Primenumber();
System.out.println("prime no from : " + w + " to " + q + "are");
for(int j = w ; j<=q ; j++)
{
p.primedigit(j);
}
}
}
