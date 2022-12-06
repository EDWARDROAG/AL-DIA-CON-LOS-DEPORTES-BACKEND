package PROYECTO.Deportes.services;
import PROYECTO.Deportes.models.UsuarioEntity;
import java.util.List;
import java.util.Optional;


public interface IUsuarioService {

    UsuarioEntity add (UsuarioEntity entity);
    Optional<UsuarioEntity> getById (Integer id);

    List<UsuarioEntity> getList();

    UsuarioEntity update(UsuarioEntity Usuario);

    void delete(Integer id);
}


