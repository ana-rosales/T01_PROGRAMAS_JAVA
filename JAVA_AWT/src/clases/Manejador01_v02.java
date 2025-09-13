import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Manejador01_v02 extends JFrame implements ActionListener{
    Button b1, b2;
    JButton jb1, jb2;
    JPanel pc;
    JPanel pd;
    JLabel texto;
    JTextField casillaNombre;
    JButton be;

    public Manejador01_v02(){
        setTitle("Manejador");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3,2));
        b1 = new Button("Rojo");
        b2 = new Button("Azul");
        jb1 = new JButton("Amarillo");
        jb2 = new JButton("Blanco");

        pc = new JPanel();
        pc.setBackground(Color.ORANGE);

        pd = new JPanel();
        texto = new JLabel("Escribe tu nombre");
        casillaNombre = new JTextField(20);
        be = new JButton("Enviar");

        b1.addActionListener(this);
        b2.addActionListener(this);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        be.addActionListener(this);

        add(b1);
        add(b2);
        add(jb1);
        add(jb2);
        add(pc);
        add(pd);
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
        if(jb1.equals(e.getSource())){
            System.out.println("Presionaste el boton amarillo");
            pc.setBackground(Color.YELLOW);
        }
        if(e.getSource().equals(jb2)){
            System.out.println("Presionaste el boton blanco");
            pc.setBackground(Color.WHITE);
        }
        if (e.getSource().equals(be)) {
            System.out.println("Enviando...");
            JOptionPane.showMessageDialog(null, "Hola" + casillaNombre.getText());    
        }
    }

    /*public static void main(String[] args) {
        Manejador m = new Manejador();
        m.setVisible(true);
    }*/
}
