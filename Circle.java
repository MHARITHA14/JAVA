class circle{
int rad=10;
public void area()
{
System.out.println("area is:"+(3.14*rad*rad));
}
public void perimeter(){
System.out.println("Perimeter is:"+(2*3.14*rad));
}
public static void main(String[]args){
circle c=new circle();
c.area();
c.perimeter();
}
}