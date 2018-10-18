package com.imooc.girl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRespository extends JpaRepository<Girl, Integer>{

        //通过年龄查询
        public List<Girl> findByAge(Integer age);

        //通过罩杯查询
        public List<Girl> findByCupSize(String CupSize);
}
