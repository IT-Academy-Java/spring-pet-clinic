package com.competidor.springpetclinic.services;

import com.competidor.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

  Vet findById(Long id);
  Vet save(Vet vet);
  Set<Vet> findAll();

}
