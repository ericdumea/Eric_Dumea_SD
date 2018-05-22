package com.mkyong.service;

import com.mkyong.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    List<User> findByEmail(String email);

}
