import javax.swing.*;
public class Practica1 extends JFrame{
    private JLabel label1;
    public Practica1() {
        setLayout(null);
        label1=new JLabel("Alexis Ivan\nJuan Ramon\nEligardo\nDonadony");
        label1.setBounds(20,30,300,40);
        add(label1);
    }
    ////////////////////////////////////////////
    public static void main(String[] ar) {
        Practica1 formulario1=new Practica1();// se crea el objeto de la clase
        formulario1.setBounds(20,20,300,400);
        formulario1.setVisible(true);
    }
}
