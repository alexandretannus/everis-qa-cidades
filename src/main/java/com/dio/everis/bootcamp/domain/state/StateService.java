package com.dio.everis.bootcamp.domain.state;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class StateService {
    
    private StateRepository stateRepository;

    public Page<State> getAllStates(Pageable page) {
        return stateRepository.findAll(page);
    }

}
