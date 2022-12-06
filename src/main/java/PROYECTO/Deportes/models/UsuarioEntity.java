package PROYECTO.Deportes.models;
import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "USUARIO")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String name;
    private Integer edad;
    private String correo;
    private Integer contrasenha;

    public UsuarioEntity() {
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(Integer contrasenha) {
        this.contrasenha = contrasenha;
    }
}
