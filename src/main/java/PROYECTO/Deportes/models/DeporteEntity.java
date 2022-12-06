package PROYECTO.Deportes.models;
import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "DEPORTE")
public class DeporteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

//    @OneToMany(fetch = FetchType.EAGER)
//    private EquipoEntity Equipo;


    public DeporteEntity() {
    }
    

    public DeporteEntity(int id) {
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
//
//    public EquipoEntity getEquipo() {
//        return Equipo;
//    }
//
//    public void setEquipo(EquipoEntity equipo) {
//        Equipo = equipo;
//    }
    }


