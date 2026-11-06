package com.spring.spring_demo;

public class ElementaryStudent implements Student{
  public ElementaryStudent() {
    System.out.println("In Constructor: " + getClass().getSimpleName());
  }

  @Override
  public String getDailyAssignment() {
    return "Have to complete 日本語　しゅくだい";
  }
}
