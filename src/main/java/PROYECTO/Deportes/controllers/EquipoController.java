package PROYECTO.Deportes.controllers;

import PROYECTO.Deportes.models.UsuarioEntity;
import PROYECTO.Deportes.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EquipoController {

    @Autowired
    IUsuarioService entityService;

    @GetMapping("/api/Equipo/all")
    public ResponseEntity<?> getAll() {
       try {
           List<UsuarioEntity> list= entityService.getList();
           return  new ResponseEntity<>(list, HttpStatus.OK);
       }catch (Exception ex){
           return  new ResponseEntity<>("Error:"+ex.getMessage(), HttpStatus.BAD_REQUEST);
       }
    }

    @GetMapping("/api/Equipo/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Integer id) {

        try {
            Optional<UsuarioEntity> entity= entityService.getById(id);
            return  new ResponseEntity<>(entity, HttpStatus.OK);
        }catch (Exception ex){
            return  new ResponseEntity<>("Error:"+ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/api/Equipo/save")
    public ResponseEntity<?> post(
            @RequestBody UsuarioEntity entity) {

        try {
           // entity.setRol(new RolEntity(Roles.Equipo.ordinal()));
            UsuarioEntity RestModel= entityService.add(entity);
            return  new ResponseEntity<>(RestModel, HttpStatus.CREATED);
        }catch (Exception ex){
            return  new ResponseEntity<>("Error:"+ex.getMessage(), HttpStatus.BAD_REQUEST);
        }


    }

    @PutMapping("/api/Equipo/update")
    public ResponseEntity<?> put(@RequestBody UsuarioEntity entity) {


        try {
            //entity.setRol(new RolEntity(Roles.Equipo.ordinal()));
            UsuarioEntity RestModel= entityService.update(entity);
            return  new ResponseEntity<>(RestModel, HttpStatus.CREATED);
        }catch (Exception ex){
            return  new ResponseEntity<>("Error:"+ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/api/Equipo/{id}")

    public ResponseEntity<?> delete(@PathVariable("id")Integer id) {
        try {
            entityService.delete(id);
            return  new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }catch (Exception ex){
            return  new ResponseEntity<>("Error:"+ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
