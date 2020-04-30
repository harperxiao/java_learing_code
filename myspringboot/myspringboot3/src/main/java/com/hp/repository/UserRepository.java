package com.hp.repository;

import com.hp.domain.User1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User1,Long> {

    public List<User1> findAll();

}
