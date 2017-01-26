package com.hws.springdata.jpa;

import org.springframework.data.repository.CrudRepository;

import com.hws.datajpa.domain.Users;

public interface UserRepository extends CrudRepository<Users, Long> {

}
