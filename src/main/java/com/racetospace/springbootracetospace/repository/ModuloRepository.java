package com.racetospace.springbootracetospace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.racetospace.springbootracetospace.model.Modulo;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ModuloRepository extends JpaRepository<Modulo, Integer>{
    @Query(value="SELECT * FROM modulos WHERE modulos_dificultad LIKE ('Principiante')",nativeQuery=true)
    List<Modulo> findModulosWithP();

    @Query(value="SELECT * FROM modulos WHERE modulos_dificultad LIKE ('Intermedio')",nativeQuery=true)
    List<Modulo> findModulosWithI();

    @Query(value="SELECT * FROM modulos WHERE modulos_dificultad LIKE ('Avanzado')",nativeQuery=true)
    List<Modulo> findModulosWithA ();

    

}


