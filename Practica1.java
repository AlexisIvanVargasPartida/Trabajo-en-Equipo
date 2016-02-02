import javax.swing.*;
public class Practica1 extends JFrame {
    private JLabel label1;
    private JTextField textField;
    public Practica1() {
        setLayout(null);
        label1=new JLabel("Alexis Ivan \n Juan Ramon \n Eligardo \n Donadony");
        label1.setBounds(20,30,600,40);
        add(label1);
<<<<<<< HEAD
        textField = new JTextField(20);
        textField.setText("Hola Mundo :)");
        textField.setBounds(40,60,600,80);
        add(textField);
=======
	JOptionPane.showMessageDialog(null,"Este es un mensaje externo");
>>>>>>> 3e34fb772cb1895c7dd330569120273d560897f3
    }
    
    public static void main(String[] ar) {
        Practica1 formulario1=new Practica1();// se crea el objeto de la clase
        formulario1.setBounds(20,20,300,400);
        formulario1.setVisible(true);
    }
}
