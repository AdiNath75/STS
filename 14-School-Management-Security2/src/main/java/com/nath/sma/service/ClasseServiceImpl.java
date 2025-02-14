package com.nath.sma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nath.sma.entity.Classe;
import com.nath.sma.repository.ClasseRepository;

@Service
public class ClasseServiceImpl implements ClasseService {

    private ClasseRepository classeRepository;

    @Autowired
    public void setClasseRepository(ClasseRepository classeRepository){
        this.classeRepository = classeRepository;
    }

    @Override
    public Iterable<Classe> getAllClasse() {
        return classeRepository.findAll();
    }

    @Override
    public void deleteClasse(Classe classe) {
        classeRepository.delete(classe);
    }

    @Override
    public void saveClasse(Classe classe) {
        classeRepository.save(classe);
        
    }

    @Override
    public Classe getClasseById(long id) {
        return classeRepository.findById(id);
    }
    
}
