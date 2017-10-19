import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alumnos on 19/10/2017.
 */
public class FormularioExcepciones {
    private JButton button1;
    private JPanel panel1;
    private JTextField numero2;
    private JTextField numero1;
    private JButton Division;

    public FormularioExcepciones() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                System.out.println("Hola " + nombre.getText());
//                JOptionPane.showMessageDialog(null, "Hola " + nombre.getText());
                JOptionPane.showMessageDialog(null, "Quiero dividir: " + numero1.getText() + "y" + numero2.getText());

            }
        });
        Division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                JOptionPane.showMessageDialog();
//                System.out.println("El resultado es: " + numero1.getText()/numero2.getText());
            }
        });
    }

    public static void main(String[] args)
    {
        FormularioExcepciones formulario = new FormularioExcepciones();
        JFrame ventana = new JFrame();
        ventana.setContentPane(formulario.panel1);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);
    }
}
