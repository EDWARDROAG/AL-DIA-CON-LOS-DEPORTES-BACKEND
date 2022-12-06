package PROYECTO.Deportes.models;
import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "MARCADOR")
public class MarcadorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int id_equipo1;
    private int id_equipo2;
    private int resultado_equipo1;
    private int resultado_equipo2;
    private String fecha_de_encuentro;


    public MarcadorEntity() {
    }


    public MarcadorEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_equipo1() {
        return id_equipo1;
    }

    public void setId_equipo1(int id_equipo1) {
        this.id_equipo1 = id_equipo1;
    }

    public int getId_equipo2() {
        return id_equipo2;
    }

    public void setId_equipo2(int id_equipo2) {
        this.id_equipo2 = id_equipo2;
    }

    public int getResultado_equipo1() {
        return resultado_equipo1;
    }

    public void setResultado_equipo1(int resultado_equipo1) {
        this.resultado_equipo1 = resultado_equipo1;
    }

    public int getResultado_equipo2() {
        return resultado_equipo2;
    }

    public void setResultado_equipo2(int resultado_equipo2) {
        this.resultado_equipo2 = resultado_equipo2;
    }

    public String getFecha_de_encuentro() {
        return fecha_de_encuentro;
    }

    public void setFecha_de_encuentro(String fecha_de_encuentro) {
        this.fecha_de_encuentro = fecha_de_encuentro;
    }

}

    