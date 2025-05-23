package kaiky.massaki.gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Janela extends JFrame{

    private JLabel jlNome;
    private JTextField tfNome;

    private JLabel jlSobrenome;
    private JTextField tfSobrenome;

    private JButton btConfirmar;

    public Janela(){
        setTitle("Cadastro de Aluno");
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        var jPanel = new JPanel(new GridBagLayout());

        jlNome = new JLabel("Nome");
        jPanel.add(jlNome, montarConstraints(0,0));
        tfNome = new JTextField(20);
        jPanel.add(tfNome, montarConstraints(1,0));

        jlSobrenome = new JLabel("Sobrenome");
        jPanel.add(jlSobrenome, montarConstraints(0,1));
        tfSobrenome = new JTextField(20);
        jPanel.add(tfSobrenome, montarConstraints(1,1));

        btConfirmar = new JButton("Confirmar");
        btConfirmar.addActionListener(e -> confirmar(e));
        jPanel.add(btConfirmar,montarConstraints(1,2));

        add(jPanel);
    }

    private boolean isBlank(JTextField campo, String mensagem) {
        if (campo.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, mensagem);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private void confirmar(ActionEvent event) {

        if(isBlank(tfNome, "Informe o nome!")) return;
        if(isBlank(tfSobrenome, "Informe o sobrenome!")) return;

        System.out.println("Salvando no Banco de Dados");
        System.out.println("Nome: " + tfNome.getText());
        System.out.println("Sobrenome: " + tfSobrenome.getText());

    }

    private GridBagConstraints montarConstraints(int x, int y){
        var constraint = new GridBagConstraints();
        constraint.insets = new Insets(5,5,5,5);
        constraint.gridx = x;
        constraint.gridy = y;
        return constraint;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            var janela = new Janela();
            janela.setVisible(true);
        });
    }
}
