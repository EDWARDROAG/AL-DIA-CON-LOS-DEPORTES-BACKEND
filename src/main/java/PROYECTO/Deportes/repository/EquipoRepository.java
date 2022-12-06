package PROYECTO.Deportes.repository;

import PROYECTO.Deportes.models.EquipoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  EquipoRepository extends CrudRepository<EquipoEntity, Integer> {
}