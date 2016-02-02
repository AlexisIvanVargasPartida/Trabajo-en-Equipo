import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Practica1 extends JFrame implements ActionListener,ItemListener{

    private JButton boton1; 
    private JLabel label1;
    private JTextField textField;
    private JComboBox combo;
    private JPanel JPanel1;

    public Practica1() {
       
       this.getContentPane().setBackground(Color.blue);
         setLayout(null);
	//Agregando combobox
	combo=new JComboBox();
	combo.setBounds(10,10,80,20);
        add(combo);
        combo.addItem("rojo");
        combo.addItem("vede");
        combo.addItem("azul");
        combo.addItem("amarillo");
        combo.addItem("negro");
        combo.addItemListener(this);
        label1=new JLabel("Alexis Ivan \n Juan Ramon \n Eligardo \n Donadony");
        label1.setBounds(20,30,600,40);
        add(label1);
        textField = new JTextField(20);//se crea un textfield con tamaño de 20
        textField.setText("Hola Mundo :)");
        textField.setBounds(40,60,600,80);
        add(textField);
        JOptionPane.showMessageDialog(null,"Este es un mensaje externo");
        boton1=new JButton("Finalizar");
        boton1.setBounds(100,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
        
        JPanel1=new JPanel();
        JPanel1.setBackground(Color.RED);
        JPanel1.setSize(1000,1000);
        add(JPanel1);
    }
 public void itemStateChanged(ItemEvent e) {
        if (e.getSource()==combo) {
            String seleccionado=(String)combo.getSelectedItem();
            setTitle(seleccionado);
        }
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            System.exit(0);
        }
    }
    
    public static void main(String[] ar) {
        Practica1 formulario1=new Practica1();// se crea el objeto de la clase
        formulario1.setBounds(0,0,800,800);
        formulario1.setVisible(true);
    }
}
