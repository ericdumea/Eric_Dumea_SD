package com.mkyong.repos;

import com.mkyong.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends CrudRepository<User,Long> {

   User findByEmail(String email);


}
