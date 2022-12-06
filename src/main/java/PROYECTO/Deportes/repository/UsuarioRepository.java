package PROYECTO.Deportes.repository;
import PROYECTO.Deportes.models.UsuarioEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UsuarioRepository extends CrudRepository<UsuarioEntity, Integer> {
}