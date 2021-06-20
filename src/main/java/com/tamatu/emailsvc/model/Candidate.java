package com.tamatu.emailsvc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.tamatu.emailsvc.model.dto.CandidateDto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Candidate")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Candidate implements Serializable{
    
    private @Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;
    private String name, lastName, address, cityName, cellphone;

    @Override
    public String toString(){
        return "Candidate{" + "id=" + this.id + ", name='" + this.name + 
            '\'' + ", lastName='" + this.lastName + '\'' + ", address='" + this.address + '\'' +
            ", cityName='" + this.cityName + '\'' + ", cellphone='" + this.cellphone + '\'' + '}';
    }

    public static Candidate from(CandidateDto candidateDto){
        Candidate candidate = new Candidate();

        candidate.setId(candidate.getId());
        candidate.setName(candidateDto.getName());
        candidate.setLastName(candidateDto.getLastName());
        candidate.setAddress(candidateDto.getAddress());
        candidate.setCityName(candidateDto.getCityName());
        candidate.setCellphone(candidateDto.getCellphone());

        return candidate;
    }
}
