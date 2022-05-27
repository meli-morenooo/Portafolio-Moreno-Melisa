package com.portfolio.cmgm.Interface;

import com.portfolio.cmgm.Entity.Persona;
import java.util.List;

/**
 *
 * @author Melisa
 */
public interface IPersonaService {
    // Traer una lista de personas
    public List<Persona> getPersona();
    
    // Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    // Eliminar un objeto. Lo buscamos por ID
    public void deletePersona(Long id);
    
    // Buscar una persona por ID
    public Persona findPersona(Long id);
}
