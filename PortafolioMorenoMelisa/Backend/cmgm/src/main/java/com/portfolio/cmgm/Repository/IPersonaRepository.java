package com.portfolio.cmgm.Repository;

import com.portfolio.cmgm.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Melisa
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
