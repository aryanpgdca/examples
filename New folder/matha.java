class matho
{
static float mul(float x ,float y)
{
return x*y;
}
static float div(float x , float y)
{
return x/y;
}
}
class matha
{
public static void main(String argsa[])
{
float a = matho.mul(4,5);
float b = matho.div(a,2);
System.out.println("B =" + b);
}
}