class student
{
int id;
String name;
double man;
student(int id,String name,double man)
{
this.id=id;
this.name=name;
this.man=man;
}
}
public class mainclass
{
public static void main(String[] args)
{
student[] bag=new student[50];
bag[0]=new student(1234,"alex",78.01);
bag[1]=new student(123,"mart",87.01);
for(int i=0;i<=bag.length;i++)
{
if(bag[i].name.length()>5)
{
if(bag[i] !=null)
{
System.out.println(bag[i].name);
}
}
}
double sum=0.0;
int count=0;
for(int j=0;j<=bag.length;j++)
{
if(bag[j] !=null)
{
sum=sum+bag.length;
count++;
}
}
System.out.println("avg is"+sum/count);
}
}