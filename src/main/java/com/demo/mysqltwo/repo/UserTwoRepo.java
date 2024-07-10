package com.demo.mysqltwo.repo;

import com.demo.mysqltwo.entity.UserTwo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserTwoRepo extends JpaRepository<UserTwo,Integer> {
}
