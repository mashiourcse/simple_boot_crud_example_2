package com.codemash.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.codemash.model.Users;


@Repository
public interface UserRepository extends ListCrudRepository<Users, Integer> {

}
