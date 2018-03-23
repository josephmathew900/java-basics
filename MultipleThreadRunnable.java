import java.util.*;
class MultiThread implements Runnable{
  Thread t[] = new Thread[50];
  MultiThread(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of threads:");
    int number = scan.nextInt();
    for(int i =0;i<number;i++){
      String thread_name = "T"+i;
      t[i] = new Thread(this,thread_name);
      System.out.println("Child thread created :"+t[i]);
      t[i].start();
    }
  }

  public void run(){
    //get reference to the current thread
    Thread currentThread = Thread.currentThread();
    String name = currentThread.getName();
    try{
      for(int i=5;i>0;i--){
        System.out.println("Child Thread "+name+":"+i);
        Thread.sleep(500);

      }
    }catch(InterruptedException e){
      System.out.println("Child Thread "+name+" interrupted!");
    }System.out.println("Child Thread"+name+" exiting!");

  }
}

class MultipleThreadRunnable{
  public static void main(String args[]){
    MultiThread obj = new MultiThread();


    try{
      for(int i=1;i<6;i++){
        System.out.println("Main Thread "+i);
        Thread.sleep(2500);

      }
    }catch(InterruptedException e){
      System.out.println("Main Thread interrupted!");
    }System.out.println("Main Thread exiting!");

  }
}
