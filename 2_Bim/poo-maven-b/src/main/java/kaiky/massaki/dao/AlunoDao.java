package kaiky.massaki.dao;

import kaiky.massaki.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDao extends Dao implements DaoInterface {

    @Override
    public Boolean insert(Object entity) {
        try {
            var aluno = (Aluno) entity;
            var insertSql = "INSERT INTO aluno(nome, cpf, endereco) VALUES(?, ?, ?)";
            var ps = getConnection().prepareStatement(insertSql);
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getCpf());
            ps.setString(3, aluno.getEndereco());

            ps.execute();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Boolean update(Object entity) {
        return null;
    }

    @Override
    public Boolean delete(Long pk) {
        return null;
    }

    @Override
    public List<Object> select(Long pk) {
        return List.of();
    }

    @Override
    public List<Object> selectALl() {
        List<Aluno> alunos = new ArrayList<>();
        try {
            var selectSql = "SELECT * FROM aluno";
            var rs = getConnection().prepareStatement(selectSql).executeQuery();
            while (rs.next()){
                alunos.add(new Aluno(
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getString("cpf"),
                        rs.getString("endereco")
                ));
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return List.of();
    }
}
