package kaiky.massaki.dao;

import java.util.List;

public interface DaoInterface {
    Boolean insert(Object entity);
    Boolean update(Object entity);
    Boolean delete(Long pk);
    List<Object> select(Long pk);
    List<Object> selectALl();
}
