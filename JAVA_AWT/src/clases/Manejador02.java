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

public class Manejador02 extends JFrame implements ActionListener{
    Button b1, b2;
    JButton jb1, jb2;
    JPanel pc, pc2;
    JLabel etiquetaNombre, etiquetaPanel2;
    JTextField nombreDado;
    JButton btnEnviarDatos;

    public Manejador02(){
        setTitle("Programa 01");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3,2));

        etiquetaNombre = new JLabel("Escribe tu nombre: ");
        nombreDado = new JTextField(20);
        btnEnviarDatos = new JButton("Enviar");

        pc = new JPanel();
        pc.setBackground(Color.WHITE);

        pc2 = new JPanel();
        etiquetaPanel2 = new JLabel();

        pc.add(etiquetaNombre);
        pc.add(nombreDado);
        pc.add(btnEnviarDatos);

        b1 = new Button("Azul");
        b2 = new Button("Naranja");
        jb1 = new JButton("Verde");
        jb2 = new JButton("Rojo");

        b1.addActionListener(this);
        b2.addActionListener(this);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        btnEnviarDatos.addActionListener(this);

        add(b1);
        add(b2);
        add(jb1);
        add(jb2);
        add(pc);
        add(pc2);
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
        if(e.getSource().equals(btnEnviarDatos)){
            String nombre = nombreDado.getText();
            JOptionPane.showMessageDialog(null, "Hola, "+nombre);
            etiquetaPanel2.setText("Hola, "+nombre);
        }
    }
}
