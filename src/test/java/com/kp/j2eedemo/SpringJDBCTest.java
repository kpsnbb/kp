package com.kp.j2eedemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
public class SpringJDBCTest {
    @Autowired
    private JdbcTemplate template;
    @Test
    void execute(){
        template.execute("create table temp (id int primary key auto_increment,name varchar(50),balance decimal(18,2))");

    }
    @Test
    void add() {
        int result = template.update("insert into temp(name,balance) values('20002','10000')");
        System.out.println(result);
    }
    @Test
    void edit() {
        int result = template.update("update temp set name='20006' where id = 6");
        System.out.println(result);
    }
    @Test
    void del() {
        int result = template.update("delete from temp where id = 6");
        System.out.println(result);
    }
}
