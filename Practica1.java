import javax.swing.*;
import java.awt.event.*;
public class Practica1 extends JFrame implements ActionListener{
    private JLabel label1;
private JButton boton1;	
    public Practica1() {
        setLayout(null);
        label1=new JLabel("Alexis Ivan\nJuan Ramon\nEligardo\nDonadony");
        label1.setBounds(20,30,300,40);
        add(label1);
	 boton1=new JButton("Finalizar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            System.exit(0);
        }
    }
  
    
    public static void main(String[] ar) {
        Practica1 formulario1=new Practica1();
        formulario1.setBounds(20,20,400,400);
        formulario1.setVisible(true);
    }
}
