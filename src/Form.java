import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Form extends JFrame {
    private JPanel panel1;
    private JButton AcceptCompression;
    private JTextField TextCompression;
    private JButton CompressionButton;
    private JLabel SelectionDecompression;
    private JButton DecompressionButton;
    private JLabel SelectionCompression;
    private JTextField TextDecompression;
    private JButton AcceptDecompression;
    private JComboBox comboBox1;
    private JTabbedPane Tabs;
    private JTextField TextPers;
    private JButton PersButton;
    private JButton AcceptPers;
    private JButton ajudaButton;
    private JPanel CompressionTab;
    private JPanel DecompressionTab;
    private JPanel PersTab;
    private JPanel ResultsTab;

    public Form() {
        JFrame jf = new JFrame();
        //JTabbedPane tabbedPane = new JTabbedPane();
        jf.setTitle("El Compresor");
        jf.setSize(400,250);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setContentPane(panel1);
        jf.pack();
        jf.setVisible(true);

        Tabs.setEnabledAt(3, false);
        Tabs.setBackgroundAt(3, Color.gray);
        Tabs.setForegroundAt(3, Color.white);

        /* COMPRESSION
         */
        AcceptCompression.setEnabled(false);

        CompressionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser c = new JFileChooser();
                c.setFileSelectionMode(2); //FILES_AND_DIRECTORIES
                c.showOpenDialog(CompressionButton);
                File file = c.getSelectedFile();
                TextCompression.setText(file.getAbsolutePath());
                AcceptCompression.setEnabled(true);
                enableResultsTab();
            }
        });


        /* DECOMPRESSION
         */
        AcceptDecompression.setEnabled(false);

        DecompressionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser d = new JFileChooser();
                d.setFileSelectionMode(2); //FILES_AND_DIRECTORIES
                d.showOpenDialog(DecompressionButton);
                File file = d.getSelectedFile();
                TextDecompression.setText(file.getAbsolutePath());
                AcceptDecompression.setEnabled(true);
                enableResultsTab();
            }
        });

        /* PERSONALISED
         */
        AcceptPers.setEnabled(false);

        PersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser p = new JFileChooser();
                p.setFileSelectionMode(2); //FILES_AND_DIRECTORIES
                p.showOpenDialog(PersButton);
                File file = p.getSelectedFile();
                TextPers.setText(file.getAbsolutePath());
                AcceptPers.setEnabled(true);
                enableResultsTab();
            }
        });

        ajudaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "Cal escollir l'algorisme amb el que es vol aplicar la compressio/descompressió.";
                JOptionPane.showMessageDialog(null, message);
            }
        });
    }

    private void enableResultsTab (){
        Tabs.setEnabledAt(3, true);
        Tabs.setBackgroundAt(3, Color.white);
        Tabs.setForegroundAt(3, Color.black);
    }

}