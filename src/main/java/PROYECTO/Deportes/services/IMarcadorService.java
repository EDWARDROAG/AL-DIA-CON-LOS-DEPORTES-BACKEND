package PROYECTO.Deportes.services;
import PROYECTO.Deportes.models.MarcadorEntity;
import java.util.List;
import java.util.Optional;


public interface IMarcadorService {

    MarcadorEntity add (MarcadorEntity entity);
    Optional<MarcadorEntity> getById (Integer id);

    List<MarcadorEntity> getList();

    MarcadorEntity update(MarcadorEntity Marcador);

    void delete(Integer id);
}


