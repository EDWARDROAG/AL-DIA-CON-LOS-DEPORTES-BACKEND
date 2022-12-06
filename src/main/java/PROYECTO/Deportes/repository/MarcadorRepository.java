package PROYECTO.Deportes.repository;
import PROYECTO.Deportes.models.MarcadorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  MarcadorRepository extends CrudRepository<MarcadorEntity, Integer> {
}