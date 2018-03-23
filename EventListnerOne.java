import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="EventListnerOne" width="300" height="400">
</applet>
*/

public class EventListnerOne extends Applet implements ActionListener{
  Button add,sub,mul,div;
  TextField num1,num2,result;
  Label heading;

  public void init(){
    add = new Button("Add");
    sub = new Button("Sub");
    mul = new Button("Mul");
    div = new Button("Div");

    heading = new Label("Calculator");

    num1 = new TextField(10);
    num2 = new TextField(10);
    result = new TextField(10);

    add(heading);
    add(add);
    add(sub);
    add(mul);
    add(div);
    add(num1);
    add(num2);
    add(result);

    this.setLayout(null);
    add.setBounds(125, 10, 75, 20);
    div.setBounds(125, 50, 75, 20);
    sub.setBounds(200, 10, 75, 20);
    mul.setBounds(200, 50, 75, 20);
    num1.setBounds(10, 40, 100, 20);
    num2.setBounds(10, 70, 100, 20);
    result.setBounds(10, 150, 100, 20);
    heading.setBounds(20, 10, 100, 20);

    add.addActionListener(this);
    sub.addActionListener(this);
    div.addActionListener(this);
    mul.addActionListener(this);

  }


  public void actionPerformed(ActionEvent ae){
    Object source = ae.getSource();
    int n1,n2,res;
    n1 = Integer.parseInt(num1.getText());
    n2 = Integer.parseInt(num2.getText());

    if(source == add){
      res = n1 + n2;
      result.setText(Integer.toString(res));
    }
    else if(source == sub){
      res = n1 - n2;
      result.setText(Integer.toString(res));
    }else if(source == mul){
      res = n1 * n2;
      result.setText(Integer.toString(res));
    }else{
      res = n1 / n2;
      result.setText(Integer.toString(res));
    }
  }

/*
Another method
public void actionPerformed(ActionEvent ae){
String command = ae.getActionCommand(); //this will by default give the label of the Button
if(command.equals("Add")){
........
}else{
.......
}
}
*/
}
