package com.flight.repository;

import org.springframework.data.repository.CrudRepository;

import com.flight.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}
