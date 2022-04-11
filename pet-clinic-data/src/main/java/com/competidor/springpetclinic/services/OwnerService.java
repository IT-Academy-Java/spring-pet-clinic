package com.competidor.springpetclinic.services;

import com.competidor.springpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

  Owner findByLastName(String lastName);

}
