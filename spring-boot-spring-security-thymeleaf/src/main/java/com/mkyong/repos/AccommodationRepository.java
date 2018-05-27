package com.mkyong.repos;

import com.mkyong.entity.Accommodation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccommodationRepository extends CrudRepository<Accommodation,Long> {

}
