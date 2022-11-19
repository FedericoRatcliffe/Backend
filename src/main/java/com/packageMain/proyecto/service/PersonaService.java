package com.packageMain.proyecto.service;

import com.packageMain.proyecto.modelo.Persona;
import java.util.List;
import org.springframework.stereotype.Service;


//ACA ESTAN TODOS LOS METODOS QUE USAMOS PARA EL PROYECTO CRUD

@Service
public interface PersonaService {
    
    // objeto de tipo List
    List<Persona>listar(); //listar todas las personas
    // objeto de tipo persona
    Persona listarId(int id); //listar una persona
    Persona add(Persona p);//agregar una persona
    Persona edit(Persona p);//editar una persona
    Persona delete(int id);//eliminar una persona
    
}
