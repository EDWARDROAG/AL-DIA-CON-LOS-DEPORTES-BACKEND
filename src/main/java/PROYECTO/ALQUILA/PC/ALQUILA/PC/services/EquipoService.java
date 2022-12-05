package PROYECTO.ALQUILA.PC.ALQUILA.PC.services;
import PROYECTO.ALQUILA.PC.ALQUILA.PC.models.EquipoEntity;
import PROYECTO.ALQUILA.PC.ALQUILA.PC.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class EquipoService implements IEquipoService {

    @Autowired
    EquipoRepository entityRepository;


    @Override
    public EquipoEntity add(EquipoEntity entity) {
        entityRepository.save(entity);
        return entity;

    }

    @Override
    public Optional<EquipoEntity> getById(Integer id) {
        return entityRepository.findById(id);
    }

    @Override
    public List<EquipoEntity> getList() {
        return (List<EquipoEntity>) entityRepository.findAll();
    }

    @Override
    public EquipoEntity update(EquipoEntity entity) {
        entityRepository.save(entity);
        return entity;
    }

    @Override
    public void delete(Integer id) {
        entityRepository.deleteById(id);
    }
}
