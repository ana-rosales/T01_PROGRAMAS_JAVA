import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Manejador01_v03 extends JFrame implements ActionListener{
    Button b1, b2;
    JButton jb1, jb2;
    JPanel pc;

    public Manejador01_v03(){
        setTitle("Programa 01");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        pc = new JPanel();
        pc.setBackground(Color.WHITE);

        b1 = new Button("Azul");
        b2 = new Button("Naranja");
        jb1 = new JButton("Verde");
        jb2 = new JButton("Rojo");

        b1.addActionListener(this);
        b2.addActionListener(this);
        jb1.addActionListener(this);
        jb2.addActionListener(this);

        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(jb1,BorderLayout.WEST);
        add(jb2,BorderLayout.EAST);
        add(pc, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(b1.equals(e.getSource())){
            System.out.println("Presionaste el boton azul");
            pc.setBackground(Color.BLUE);
        }
        if(e.getSource().equals(b2)){
            System.out.println("Presionaste el boton naranja");
            pc.setBackground(Color.ORANGE);
        }
        if(jb1.equals(e.getSource())){
            System.out.println("Presionaste el boton verde");
            pc.setBackground(Color.GREEN);
        }
        if(e.getSource().equals(jb2)){
            System.out.println("Presionaste el boton rojo");
            pc.setBackground(Color.RED);
        }
    }

    /*public static void main(String[] args) {
        Programa01 m = new Programa01();
        m.setVisible(true);
    }*/
}
