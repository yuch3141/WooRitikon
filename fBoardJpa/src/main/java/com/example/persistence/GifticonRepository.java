package com.example.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.normalid;

@Repository
public interface GifticonRepository extends CrudRepository<normalid, Integer> {

}
