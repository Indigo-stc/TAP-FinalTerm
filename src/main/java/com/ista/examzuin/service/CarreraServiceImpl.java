package com.ista.examzuin.service;

import com.ista.examzuin.entity.Carrera;
import com.ista.examzuin.repository.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarreraServiceImpl extends GenericServiceImpl<Carrera, Long> implements CarreraService {

    @Autowired
    private CarreraRepository carreraRepository;

    @Override
    public CrudRepository<Carrera, Long> getDao() {
        return carreraRepository;
    }

}
