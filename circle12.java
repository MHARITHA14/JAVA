import java.util.*;
class circle12{
int rad;
public void getdata()
{
Scanner sc=new Scanner(System.in);
rad=sc.nextInt();
}
public void area()
{
System.out.println("area is:"+(3.14*rad*rad));
}
public void perimeter(){
System.out.println("Perimeter is:"+(2*3.14*rad));
}
public static void main(String[]args){
circle12 c=new circle12();
c.area();
c.perimeter();
}
}