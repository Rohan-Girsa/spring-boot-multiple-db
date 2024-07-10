package com.demo.mysqlone.repo;

import com.demo.mysqlone.entity.UserOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserOneRepo extends JpaRepository<UserOne,Integer> {
}
