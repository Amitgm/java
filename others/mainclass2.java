class books
{
String name;
String author;
books(String author,String name)
{
this.author=author;
this.name=name;
}
}
class electronics
{
String name;
String brand;
electronics(String brand,String name)
{
this.brand=brand;
this.name=name;
}
}
public class mainclass2
{
public static void main(String args[])
{
Object[] cart=new Object[5];
cart[0]=new books("Robert","rich dad");
cart[1]=new electronics("power bank","lenovo");
cart[2]=new electronics("galaxy","samsung");
cart[3]=new books("jack","jonas bros");
for (int i=0;i<cart.length;i++)
{
 if(cart[i]!=null)
{
 if(cart[i]instanceof books)
{
books b1=(books) cart[i];
System.out.println(b1.name);
System.out.println(b1.author);
}
else
{
electronics e1=(electronics) cart[i];
System.out.println(e1.name);
System.out.println(e1.brand);
}
}
}
}
}
