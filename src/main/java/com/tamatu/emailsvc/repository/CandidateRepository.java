package com.tamatu.emailsvc.repository;

import com.tamatu.emailsvc.model.Candidate;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate, Long>{
    
}
