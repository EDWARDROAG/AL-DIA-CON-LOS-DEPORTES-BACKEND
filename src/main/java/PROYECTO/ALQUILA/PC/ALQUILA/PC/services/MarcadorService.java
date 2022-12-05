package PROYECTO.ALQUILA.PC.ALQUILA.PC.services;
import PROYECTO.ALQUILA.PC.ALQUILA.PC.models.MarcadorEntity;
import PROYECTO.ALQUILA.PC.ALQUILA.PC.repository.MarcadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class MarcadorService implements IMarcadorService {

    @Autowired
    MarcadorRepository entityRepository;


    @Override
    public MarcadorEntity add(MarcadorEntity entity) {
        entityRepository.save(entity);
        return entity;

    }

    @Override
    public Optional<MarcadorEntity> getById(Integer id) {
        return entityRepository.findById(id);
    }

    @Override
    public List<MarcadorEntity> getList() {
        return (List<MarcadorEntity>) entityRepository.findAll();
    }

    @Override
    public MarcadorEntity update(MarcadorEntity entity) {
        entityRepository.save(entity);
        return entity;
    }

    @Override
    public void delete(Integer id) {
        entityRepository.deleteById(id);
    }
}
