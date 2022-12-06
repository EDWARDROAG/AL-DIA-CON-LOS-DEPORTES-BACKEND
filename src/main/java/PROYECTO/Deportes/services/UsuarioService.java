package PROYECTO.ALQUILA.PC.ALQUILA.PC.services;
import PROYECTO.ALQUILA.PC.ALQUILA.PC.models.UsuarioEntity;
import PROYECTO.ALQUILA.PC.ALQUILA.PC.repository.UsuarioRepository;
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
