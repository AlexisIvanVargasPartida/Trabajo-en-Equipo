import javax.swing.*;
import java.awt.event.*;
public class Practica1 extends JFrame implements ActionListener{

    private JButton boton1; 
    private JLabel label1;
    private JTextField textField;

    public Practica1() {
        setLayout(null);
        label1=new JLabel("Alexis Ivan \n Juan Ramon \n Eligardo \n Donadony");
        label1.setBounds(20,30,600,40);
        add(label1);
        textField = new JTextField(20);//se crea un textfield con tamaño de 20
        textField.setText("Hola Mundo :)");
        textField.setBounds(40,60,600,80);
        add(textField);
        JOptionPane.showMessageDialog(null,"Este es un mensaje externo");
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
        Practica1 formulario1=new Practica1();// se crea el objeto de la clase
        formulario1.setBounds(20,20,300,400);
        formulario1.setVisible(true);
    }
}
