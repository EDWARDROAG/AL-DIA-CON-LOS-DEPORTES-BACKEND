package PROYECTO.ALQUILA.PC.ALQUILA.PC.services;
import PROYECTO.ALQUILA.PC.ALQUILA.PC.models.DeporteEntity;
import java.util.List;
import java.util.Optional;


public interface IDeporteService {

    DeporteEntity add (DeporteEntity entity);
    Optional<DeporteEntity> getById (Integer id);

    List<DeporteEntity> getList();

    DeporteEntity update(DeporteEntity Deporte);

    void delete(Integer id);
}


