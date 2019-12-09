import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUIForm2 extends JFrame{
    private JPanel Panel2, Panel3;
    private JButton nextButton;
    private JComboBox comboBox1;

    public MyGUIForm2(){

        add(Panel2);
        setContentPane(Panel2);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("Compresor/Descompresor grupo 11");
        //setSize(400,500);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Acción completada");
                //String pathIn = botton.getText();
                //botton.setText("");
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(MainSwing.compression == true)
                    System.out.println("es true");
                else
                    System.out.println("es false");
                MainSwing.compression = false;

            }
        });
    }
}
