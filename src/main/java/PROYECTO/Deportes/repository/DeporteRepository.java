package PROYECTO.Deportes.repository;

import PROYECTO.Deportes.models.DeporteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  DeporteRepository extends CrudRepository<DeporteEntity, Integer> {
}