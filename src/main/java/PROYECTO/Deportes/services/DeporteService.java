package PROYECTO.Deportes.services;
import PROYECTO.Deportes.models.DeporteEntity;
import PROYECTO.Deportes.repository.DeporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class DeporteService implements IDeporteService {

    @Autowired
    DeporteRepository entityRepository;


    @Override
    public DeporteEntity add(DeporteEntity entity) {
        entityRepository.save(entity);
        return entity;

    }

    @Override
    public Optional<DeporteEntity> getById(Integer id) {
        return entityRepository.findById(id);
    }

    @Override
    public List<DeporteEntity> getList() {
        return (List<DeporteEntity>) entityRepository.findAll();
    }

    @Override
    public DeporteEntity update(DeporteEntity entity) {
        entityRepository.save(entity);
        return entity;
    }

    @Override
    public void delete(Integer id) {
        entityRepository.deleteById(id);
    }
}
