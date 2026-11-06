package com.spring.spring_demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.spring_demo.Student;



@RestController
public class SampleRestController {

  private Student myStudent;
  private Student anotherStudent;


  // public SampleRestController(Student theStudent) {
  //   myStudent = theStudent;
  // }
  
  public SampleRestController(@Qualifier("elementaryStudent") Student student){
    myStudent = student;
  }
    @GetMapping("/assignment")
    public String getAssignment() {
        return myStudent.getDailyAssignment();
    }
    
}
