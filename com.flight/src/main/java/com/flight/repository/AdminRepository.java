package com.flight.repository;

import org.springframework.data.repository.CrudRepository;

import com.flight.entity.AdminEntity;

public interface AdminRepository extends CrudRepository<AdminEntity, Integer> {

}
