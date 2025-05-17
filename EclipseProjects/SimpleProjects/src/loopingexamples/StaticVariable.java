package loopingexamples;

public class StaticVariable {

static int Count=0;

StaticVariable()
{

Count++;
System.out.println(Count);
}

public static void main(String...args)
{
StaticVariable c1=new StaticVariable();
StaticVariable c2=new StaticVariable();
StaticVariable c3=new StaticVariable();
}
}

