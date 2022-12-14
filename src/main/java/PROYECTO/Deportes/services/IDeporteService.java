package PROYECTO.Deportes.services;
import PROYECTO.Deportes.models.DeporteEntity;
import java.util.List;
import java.util.Optional;


public interface IDeporteService {

    DeporteEntity add (DeporteEntity entity);
    Optional<DeporteEntity> getById (Integer id);

    List<DeporteEntity> getList();

    DeporteEntity update(DeporteEntity Deporte);

    void delete(Integer id);
}


