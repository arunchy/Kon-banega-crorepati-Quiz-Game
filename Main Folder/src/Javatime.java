
// Java program to demonstrate
//schedule method calls of Timer class

import java.util.Timer;
import java.util.TimerTask;




public class Javatime{
    
    public static void main(String[] args) {
      
        Timer t1=new Timer();
        TimerTask tsk1=new TimerTask() {
            int count=0;
          @Override
          public void run(){                                                                                       
            System.out.println("Hello world "+count);
            count++;
           
          }




        };
        t1.schedule(tsk1, 0,1000);
        
    }




}





// class Helper extends TimerTask
// {
// 	public static int i = 0;
// 	public void run()
// 	{
// 		System.out.println("Timer ran " + ++i);
// 	}
// }

// public class Javatime
// {
// 	public static void main(String[] args)
// 	{
		
// 		Timer timer = new Timer();
// 		TimerTask task = new Helper();
		
// 		timer.schedule(task, 2000, 5000);
		
// 	}
// }
