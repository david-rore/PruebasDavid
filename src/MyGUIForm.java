import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUIForm extends JFrame {
    private JLabel PathEntrada;
    private JPanel RootPanel;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JComboBox comboBox1;
    private JButton goButton;

    public MyGUIForm(){

        add(RootPanel);

        setTitle("Compresor/Descompresor grupo 11");
        setSize(400,500);

        goButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Acción completada");
            }
        });
    }

}
