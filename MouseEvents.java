//Java program to handle mouse EventListnerOne

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="MouseEvents" width="500" height="450">
</applet>
*/

public class MouseEvents extends Applet implements MouseListener, MouseMotionListener{
  String msg="";
  int displayX=0;
  int displayY=10;

  int mouseX,mouseY;

  public void init(){
    setBackground(Color.cyan);
    addMouseListener(this);
    addMouseMotionListener(this);

  }

public void mouseClicked(MouseEvent me){
  mouseX = me.getX();
  mouseY = me.getY();
  msg = "Mouse clicked at "+mouseX+","+mouseY;
  displayX=0;
  displayY=10;
  repaint();
}

public void mouseEntered(MouseEvent me){
  msg = "Mouse Entered!";
  displayX=0;
  displayY=10;
  repaint();
}

public void mouseExited(MouseEvent me){
  msg = "Mouse Exited!";
  displayX=0;
  displayY=10;
  repaint();
}

public void mouseReleased(MouseEvent me){
  mouseX = me.getX();
  mouseY = me.getY();
  msg = "Mouse release!";
  displayX = mouseX;
  displayY = mouseY;
  repaint();
}
public void mousePressed(MouseEvent me){

}

public void mouseMoved(MouseEvent me){

}
public void mouseDragged(MouseEvent me){

}
public void paint(Graphics g){
  g.drawString(msg,displayX,displayY);
}

}
