import java.util.Scanner;
public class Stopwatch {
    long time=System.currentTimeMillis();

  public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
long start,end;
double tim;
System.out.println("Type any character to start the stopwatch");
char s=sc.next().charAt(0);
start=System.currentTimeMillis();
System.out.println("Type any character to stop the stopwatch");
char m=sc.next().charAt(0);
end=System.currentTimeMillis();
tim=(end-start)/1000.0;
System.out.println(tim);
  }
}
