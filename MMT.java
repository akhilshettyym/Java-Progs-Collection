import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
//import java.awt.*;
public class MMT {


        static JLabel l1,l2,l3,l4,l5;
        public static void main(String[] args) {
            JFrame f = new JFrame("Mouse events");
            f.setLayout(new FlowLayout());
            f.setSize(350,180);
            //f.resizable(false);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel p = new JPanel();
            l1 = new JLabel("Label 1");
            p.add(l1);
            f.add(l1);
            l2 = new JLabel("Label 2");
            p.add(l2);
            f.add(l2);
            l3 = new JLabel("Label 3");
            p.add(l3);
            f.add(l3);
            l4 = new JLabel("Label 4");
            p.add(l4);
            f.add(l4);
            l5 = new JLabel("Label 5");
            p.add(l5);
            f.add(l5);
            MouseList m1 = new MouseList();
            MouseMotionList m2=new MouseMotionList();
            f.addMouseListener(m1);
            f.addMouseMotionListener(m2);
            f.setVisible(true);
        }
        static class MouseList implements MouseListener{
            public void mouseClicked(MouseEvent e) {
                l2.setText("mouse clicked at point:" +e.getX()+" "+e.getY());
            }

            public void mouseEntered(MouseEvent e) {
                l1.setText("mouse entered at point:"+e.getX()+" "+e.getY());
            }

            public void mouseExited(MouseEvent e) {
                l1.setText("Mouse exited at point:"+e.getX()+" "+e.getY());
            }

            public void mousePressed(MouseEvent e) {
                l3.setText("Mouse pressed at point:"+e.getX() +" "+e.getY());
            }

            public void mouseReleased(MouseEvent e) {
                l2.setText("mouse released at point:"+e.getX()+ " "+e.getY());
            }
        }

        static class MouseMotionList implements MouseMotionListener{
            public void mouseDragged(MouseEvent e) {
                l4.setText("Mouse dragged at point"+e.getX()+" "+e.getY());
            }
            public void mouseMoved(MouseEvent e) {
                l5.setText("Mouse moved at point:"+e.getX()+" "+e.getY());
            }
        }
    }



