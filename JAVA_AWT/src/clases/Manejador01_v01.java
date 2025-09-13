import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Manejador01_v01 extends JFrame implements ActionListener{
    Button b1, b2;
    JButton jb1, jb2;
    JPanel pc;

    public Manejador01_v01(){
        setTitle("Manejador");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        b1 = new Button("Rojo");
        b2 = new Button("Azul");
        jb1 = new JButton("Amarillo");
        jb2 = new JButton("Blanco");

        pc = new JPanel();
        pc.setBackground(Color.ORANGE);

        b1.addActionListener(this);
        b2.addActionListener(this);
        jb1.addActionListener(this);
        jb2.addActionListener(this);

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(jb1, BorderLayout.WEST);
        add(jb2, BorderLayout.EAST);
        add(pc, BorderLayout.CENTER);
    }

    @Override
     public void actionPerformed(ActionEvent e){
        if(b1.equals(e.getSource())){
            System.out.println("Presionaste el boton rojo");
            pc.setBackground(Color.RED);
        }
        if(e.getSource().equals(b2)){
            System.out.println("Presionaste el boton azul");
            pc.setBackground(Color.BLUE);
        }
    }

    /*public static void main(String[] args) {
        Manejador m = new Manejador();
        m.setVisible(true);
    }*/
}
