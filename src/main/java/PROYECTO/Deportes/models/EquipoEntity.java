package PROYECTO.ALQUILA.PC.ALQUILA.PC.models;
import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "EQUIPO")
public class EquipoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String name;
    private Integer deporte_id;

   
    @OneToMany(optional = false, fetch = FetchType.EAGER)
    private DeportesEntity deportes;


    public EquipoEntity() {
    }
    

    public EquipoEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDeporte_id() {
        return deporte_id;
    }

    public void setDeporte_id(Integer deporte_id) {
        this.deporte_id = deporte_id;
    }

    public DeportesEntity getDeportes() {
        return deportes;
    }

    public void setDeportes(DeportesEntity deportes) {
        this.deportes = deportes;
    }


    