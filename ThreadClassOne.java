//Java program to extend Thread class

class NewThread extends Thread{
  NewThread(){
    setName("counter_thread");
    setPriority(4);
    System.out.println("Thread created : " + this);
    int priority = getPriority();
    String name = getName();
    System.out.println("Thread name is "+name);
    System.out.println("Thread priority is "+priority);
    start();
  }
  public void run(){
    try{
      for(int i=5;i>0;i--){
        System.out.println("Child Thread :"+i);
        Thread.sleep(500);
      }
    }catch(InterruptedException e){
        System.out.println("Exception "+e);
      }System.out.println("Child thread exiting!");

    }
  }

 class ThreadClassOne{
   public static void main(String args[]){
     NewThread obj = new NewThread();
     try{
       for(int i=1;i<6;i++){
         System.out.println("Main Thread :"+i);
         Thread.sleep(1000);
       }
       }catch(InterruptedException e){
         System.out.println("Exception "+e);
       }System.out.println("Main thread exiting!");
     }
   }
