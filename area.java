class rectangle
{
int length;
int width;
void getdata(int x, int y);
{
length=x;
width=y;
}
int rectarea()
{
int area=length*width;
return area;
}
}
class area
{
public static void main(String args[])
{
int area1 , area2;
rectangle rect1=new rectangle();
rectangle rect2=new rectangle();
rect1.length=10;
rect1.width=20;
area1 = rect1.length * rect1.width;
rect2.getdata(20,12);
area2=rect2.rectarea();
System.out.println("Area1= " +area1);
System.out.println("Area2= " +area2);
}
}