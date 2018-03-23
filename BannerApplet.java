import java.awt.*;
import java.applet.*;
/*
<applet code="BannerApplet" width=350 height=50>
</applet>
*/
public class BannerApplet extends Applet implements Runnable{
  String msg = " Scrolling Banner Applet!";
  Thread t;
  public void init(){
    setBackground(Color.cyan);
  }

  public void start(){
    t = new Thread(this);
    t.start();
  }

  public void run(){
    while(true){
      try{
        repaint();
        Thread.sleep(250);
      }catch(InterruptedException e){
        System.out.println("Thread Interrupted!");
      }
    }
  }

  public void paint(Graphics g){
    char ch;
    ch = msg.charAt(0);
    msg = msg.substring(1,msg.length());
    msg+=ch;
    g.drawString(msg,50,30);
  }
}
