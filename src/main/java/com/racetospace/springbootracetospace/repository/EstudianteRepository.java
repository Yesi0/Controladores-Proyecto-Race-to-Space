package com.racetospace.springbootracetospace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.racetospace.springbootracetospace.model.Estudiante;

import java.util.List;


 
//Vas a crear un archivo repositorio en donde cuando te conectes a la base
//vas a trabajar con objetos de tipo Equipo, con ID tipo Integer

//cambiar class, por interface, es decir, una conjunción de instrucciones
public interface EstudianteRepository extends JpaRepository <Estudiante,Integer> {

    //Esta es una Query Nativa, sin parámetros que nos permite obtener
    //Los estudiantes que contengan una LL en su nombre
    //Es una consulta personalizada

    @Query(value="SELECT * FROM estudiantes WHERE estudiantes_nombre LIKE ('%LL%')",nativeQuery=true)

    List <Estudiante> findEstudiantesWithLL ();

    //Es otra Query Nativa, con parámetros que nos permite obtener
    //Los estudiantes pertenecientes a un equipo
    //El cual yo voy a específicar cuando llame a la consulta
    //También es una consulta personalizada


    @Query(value="SELECT * FROM estudiantes WHERE modulos_id=?1",nativeQuery=true)

    

    // Ejemplo 2: @Query(value="SELECT * FROM estudiantes WHERE equipo_id=?1 AND nombre=?2",nativeQuery=true)
   
    List <Estudiante> findEstudiantesByModulo (Integer modulo);
    //Ejemplo 2: List <Estudiantes> finEstudiantesByEquipo (Integer equipo, String nombre);


//***** COMO HACER UNA FUNCIÓN DE MODIFICACIÓN CON QUERYS NATIVAS --> EJEMPLO DE OTRO PROYECTO *******
        //@Modifying
//@Query(value = "UPDATE PRODUCT p SET p.STOCK = p.stock+10 WHERE p.id = ?1", nativeQuery = true)
        //void sumarStock(Long recetaID); */
    

}

