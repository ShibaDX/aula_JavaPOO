package kaiky.massaki.service;

import kaiky.massaki.dao.AlunoDao;
import kaiky.massaki.model.Aluno;

public class AlunoService {
    public Boolean salvar(Aluno aluno) {
        var dao = new AlunoDao();
        return dao.insert(aluno);
    }
}
