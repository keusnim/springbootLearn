package com.example.classbase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class contentController {

    @Autowired
    private ContentRespository contentRespository;

    //查看课程内容列表
    @GetMapping(value = "/content/findall")
    public List<Content> contentfindall(){
        return contentRespository.findAll();
    }

    //添加授课课程内容
    @PostMapping(value="/content/add")
    public Content contentadd(Content content){
       /* content.setTeacherName(content.getTeacherName());
        content.setFirst(content.getFirst());
        content.setSecond(content.getSecond());
        content.setThird(content.getThird());
        content.setFourth(content.getFourth());
        content.setFifth(content.getFifth());
        content.setSixth(content.getSixth());
        content.setSeventh(content.getSeventh());
        content.setEighth(content.getEighth());
        content.setNinth(content.getNinth());
        content.setTenth(content.getTenth());
        content.setEleventh(content.getEleventh());
        content.setTwelfth(content.getTwelfth());
        content.setThirteenth(content.getThirteenth());
        content.setFourteenth(content.getFourteenth());
        content.setFifteenth(content.getFifteenth());
        content.setSixteenth(content.getSixteenth());
*/
        return contentRespository.save(content);
    }

    //查询课程内容
    @GetMapping(value = "/content/find/{teacherId}")
    public Content contentfindone(@PathVariable("teacherId") Integer teacherId){
        return contentRespository.findById(teacherId).get();
    }




}
