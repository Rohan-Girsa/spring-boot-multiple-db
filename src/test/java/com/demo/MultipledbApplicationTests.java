package com.demo;

import com.demo.mysqlone.entity.UserOne;
import com.demo.mysqlone.repo.UserOneRepo;
import com.demo.mysqltwo.entity.UserTwo;
import com.demo.mysqltwo.repo.UserTwoRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MultipledbApplicationTests {

    @Autowired
    private UserOneRepo userOneRepo;
    @Autowired
    private UserTwoRepo userTwoRepo;
    @Test
    void dbTest() {
        UserOne uone = userOneRepo.findById(974).get();
        System.out.println(uone.toString());

        UserTwo utwo = userTwoRepo.findById(11).get();
        System.out.println(utwo.toString());
    }

}
