package com.racetospace.springbootracetospace.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.racetospace.springbootracetospace.model.Modulo;
import com.racetospace.springbootracetospace.repository.ModuloRepository;

@Service
@Transactional
public class ModuloService {
    //se conecta con el archivo repository para poder ocuparlo a nivel 
    //de las instrucciones creadas en esta
    private ModuloRepository moduloRepository;

    public ModuloService(ModuloRepository moduloRepository){
        this.moduloRepository = moduloRepository;
    }

    public void saveModulo(Modulo modulo){
        //este .save está haciendo el trabajo de in insert into,
        //pero java ya lo reconoce por defecto, entonces lo hará de manera automatica cuando
        //reconozca este método
        this.moduloRepository.save(modulo);
    }

    public void updateModulo(Modulo modulo){
        //apesar de ser una funcion de actualización se ocupa
        //el mismo metodo de guardardo
        this.moduloRepository.save(modulo);
    }

    public void deleteModulo(Integer id){
        moduloRepository.deleteById(id);
    }

    public List<Modulo> findAll(){
        return moduloRepository.findAll();
    }

    public List<Modulo> modulosConP(){
        return moduloRepository.findModulosWithP();
    }

    public List<Modulo> modulosConI(){
        return moduloRepository.findModulosWithI();
    }

    public List<Modulo> modulosConA(){
        return moduloRepository.findModulosWithA();
    }





}
