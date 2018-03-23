//Java program to implement Runnable and threads

class NewThread implements Runnable{
  Thread t;
  NewThread(){
    t = new Thread(this,"counter_thread");
    t.setPriority(4);
    System.out.println("Thread created : "+t);
    int priority = t.getPriority();
    String name = t.getName();
    System.out.println("Thread Name : "+name);
    System.out.println("Thread Priority :"+priority);
    t.start();
  }
  public void run(){
    try{
      for(int i = 5; i>0 ; i--){
        System.out.println("Child Thread : "+i);
        Thread.sleep(500);
      }
    }catch(InterruptedException e){
      System.out.println("Child thread interrupted!");
    }
    System.out.println("Child thread exiting!");

  }

}

class RunnableOne{
  public static void main(String args[]){
    NewThread obj1 = new NewThread();
    NewThread obj2 = new NewThread();
    try{
      for(int i=1;i<6;i++){
        System.out.println("Main Thread : "+i);
        Thread.sleep(1000);
      }
    }catch(InterruptedException e){
      System.out.println("Main thread interrupted!");


  }
  System.out.println("Main thread exiting!");

 }
}
