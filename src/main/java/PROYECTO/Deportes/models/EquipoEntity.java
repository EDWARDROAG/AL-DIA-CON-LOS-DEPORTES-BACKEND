package PROYECTO.Deportes.models;
import javax.persistence.*;



@Entity
@Table(name = "EQUIPO")
public class EquipoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String name;
    private Integer deporte_id;


//    @OneToMany( fetch = FetchType.EAGER)
//    private DeporteEntity deportes;


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

//    public DeporteEntity getDeportes() {
//        return deportes;
//    }
//
//    public void setDeportes(DeporteEntity deportes) {
//        this.deportes = deportes;
//    }
}

    