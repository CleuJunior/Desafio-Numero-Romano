package com.example.challenger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChallengerRepository extends JpaRepository<Challenger, Long> {

//    @Query("SELECT t.text FROM tb_challenger t WHERE t = true")
//    List<Challenger> getBookByUUID();

}
