package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GirlController {

    @Autowired
    private GirlRespository girlRespository;


   //查询女生列表
   @GetMapping(value="/girls")
    public List<Girl> girlList(){
        return girlRespository.findAll();
    }

    //添加一个女生
    @PostMapping(value="/girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age){
       Girl girl=new Girl();
       girl.setAge(age);
       girl.setCupSize(cupSize);

       return girlRespository.save(girl);
    }

    //查询一个女生
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id){
        return girlRespository.findById(id).get();
    }

    //更新一个女生
    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age){
       Girl girl=new Girl();
       girl.setId(id);
       girl.setCupSize(cupSize);
       girl.setAge(age);

       return girlRespository.save(girl);
    }

    //删除一个女生
    @DeleteMapping(value = "/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        girlRespository.deleteById(id);
    }

    //按照年龄查找女生
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
       return  girlRespository.findByAge(age);
    }

    //通过罩杯查找女生
    @GetMapping(value = "/girls/cupSize/{cupSize}")
    public List<Girl> girlListByCupSize(@PathVariable("cupSize") String cupSize){
       return girlRespository.findByCupSize(cupSize);
    }
}
