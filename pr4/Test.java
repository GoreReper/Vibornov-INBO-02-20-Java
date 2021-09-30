package pr4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Test extends JFrame{
    JFrame frame = new JFrame("Football");
    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");
    JLabel lab1 = new JLabel("Result: 0 X 0");
    JLabel lab2 = new JLabel("Last scorer: N/A");
    JLabel lab3 = new JLabel("Winner: DRAW");
    int mi = 0;
    int ma = 0;





    public Test() {

        but1.setBounds(10,10,100,50);
        but1.setActionCommand("Milan");
        but2.setBounds(120,10,100,50);
        but2.setActionCommand("Madrid");
        ActionListener act = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (e.getActionCommand()){
                    case "Milan":
                        mi++;
                        break;
                    case "Madrid":
                        ma++;
                        break;

                }
                lab1.setText("Result: " + mi + " X " + ma);
                lab2.setText("Last scorer: " + e.getActionCommand());
                if ((ma > mi) | (ma < mi )){
                    lab3.setText("Winner: " + e.getActionCommand());
                } else if (ma == mi){
                    lab3.setText("Winner: DRAW");
                }

            }
        };
        but1.addActionListener(act);
        but2.addActionListener(act);
        lab1.setLocation(10,220);
        lab2.setLocation(110,120);
        lab3.setLocation(0,0);









        frame.add(but1);
        frame.add(but2);
        frame.add(lab1);
        frame.add(lab2);
        frame.add(lab3);
        frame.setVisible(true);
        frame.setSize(250,200);
        frame.getContentPane().setBackground( new Color(0,122,0) );






    }

    public static void main(String[] args){
        new Test();
    }

}

