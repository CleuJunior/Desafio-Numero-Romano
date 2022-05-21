package com.example.challenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChallengerService {
    private final ChallengerRepository challengerRepository;

    @Autowired
    public ChallengerService(ChallengerRepository challengerRepository) { this.challengerRepository = challengerRepository; }

    @Transactional(readOnly = true)
    public List<ChallengerDTO> findAllChallengerText() {

        return challengerRepository.findAll()
                .stream().map(ChallengerDTO::new).collect(Collectors.toList());

    }


    @Transactional
    public Challenger insertText(Challenger challenger){

       return  challengerRepository.saveAndFlush(challenger);

    }


}
