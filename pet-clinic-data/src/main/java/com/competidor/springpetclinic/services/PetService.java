package com.competidor.springpetclinic.services;

import com.competidor.springpetclinic.model.Owner;
import com.competidor.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

  Pet findById(long id);
  Pet save(Pet pet);
  Set<Pet> findAll();

}
