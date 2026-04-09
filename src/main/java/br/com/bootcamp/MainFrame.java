package br.com.bootcamp;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JTextField txtRefeicao = new JTextField(20);
    private JCheckBox chkSaudavel = new JCheckBox("É saudável?");
    private JButton btnSalvar = new JButton("Registrar");

    public MainFrame() {
        super("NutriLog v1.0.0");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Refeição:"));
        add(txtRefeicao);
        add(chkSaudavel);
        add(btnSalvar);

        btnSalvar.addActionListener(e -> {
            try {
                Refeicao r = new Refeicao(txtRefeicao.getText(), chkSaudavel.isSelected());
                Database.salvar(r);
                JOptionPane.showMessageDialog(this, "Refeição salva!");
                txtRefeicao.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage());
            }
        });

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        try {
            Database.inicializar();
            SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
