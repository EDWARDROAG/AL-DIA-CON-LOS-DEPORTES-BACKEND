package PROYECTO.Deportes.services;
import PROYECTO.Deportes.models.UsuarioEntity;
import PROYECTO.Deportes.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    UsuarioRepository entityRepository;


    @Override
    public UsuarioEntity add(UsuarioEntity entity) {
        entityRepository.save(entity);
        return entity;

    }

    @Override
    public Optional<UsuarioEntity> getById(Integer id) {
        return entityRepository.findById(id);
    }

    @Override
    public List<UsuarioEntity> getList() {
        return (List<UsuarioEntity>) entityRepository.findAll();
    }

    @Override
    public UsuarioEntity update(UsuarioEntity entity) {
        entityRepository.save(entity);
        return entity;
    }

    @Override
    public void delete(Integer id) {
        entityRepository.deleteById(id);
    }
}
