package PROYECTO.ALQUILA.PC.ALQUILA.PC.repository;
import PROYECTO.ALQUILA.PC.ALQUILA.PC.models.ComputerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  MarcadorRepository extends CrudRepository<MarcadorEntity, Integer> {
}