package kaiky.massaki;

import kaiky.massaki.gui.AlunoGui;
import kaiky.massaki.model.Aluno;
import kaiky.massaki.service.AlunoService;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::iniciar);

    }

    private static void iniciar() {
        var alunoGui = new AlunoGui();
        alunoGui.setVisible(true);
    }
}
