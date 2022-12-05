package PROYECTO.ALQUILA.PC.ALQUILA.PC.services;
import PROYECTO.ALQUILA.PC.ALQUILA.PC.models.EquipoEntity;
import java.util.List;
import java.util.Optional;


public interface IEquipoService {

    EquipoEntity add (EquipoEntity entity);
    Optional<EquipoEntity> getById (Integer id);

    List<EquipoEntity> getList();

    EquipoEntity update(EquipoEntity Equipo);

    void delete(Integer id);
}


