package com.packageMain.proyecto.modelo;


import com.packageMain.proyecto.service.PersonaService;
import com.packageMain.proyecto.service.PersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//SE AGREGAN LOS METODOS DE LA INTERFAZ

@Service
public class PersonaServiceImp implements PersonaService{
    
    @Autowired
    private PersonaRepositorio repositorio; 
    
    @Override
    public List<Persona> listar() {
        return repositorio.findAll();
    }

    //RETONA DEL REPOSITORIO EL METODO FINDBYID
    @Override
    public Persona listarId(int id) {
        return repositorio.findByid(id);
    }
    
    //AGREGAR PERSONA
    @Override
    public Persona add(Persona p) {
        return repositorio.save(p);
    }

    @Override
    public Persona edit(Persona p) {
        return repositorio.save(p);
    }

    @Override
    public Persona delete(int id) {
        Persona p = repositorio.findByid(id);
        if(p!=null){
           repositorio.delete(p); 
        }
        return p;
    }
    
}


