package package1;

public abstract class FirstAbstract {
    abstract void tagLine();
}
class Honda extends FirstAbstract
{
 void tagLine()
 {
 System.out.println("Start Something Special");
 }
}
class Toyota extends FirstAbstract
{
 void tagLine()
 {
 System.out.println("Drive Your Dreams");
 }
}