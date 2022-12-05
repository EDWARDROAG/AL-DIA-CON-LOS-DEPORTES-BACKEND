package PROYECTO.ALQUILA.PC.ALQUILA.PC.models;
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
    private String correo
    private Integer contraseña

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

    public Integer getContraseña() {
        return contraseña;
    }

    public void setContraseña(Integer contraseña) {
        this.contraseña = contraseña;
    }

