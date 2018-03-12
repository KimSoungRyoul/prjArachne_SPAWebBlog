package org.prj.arachne.domain.tistory;

public enum TistoryCategory {


    SPRING_JAVA("스프링프레임워크(+자바)"),
    OS_CPROGRAMMING("OS & C 계열"),
    BUSSINESSCLUB("수기/창업동아리"),
    DEVDIARY("수기/개발일기");


    final String category_kor;

    TistoryCategory(String category_kor){

        this.category_kor=category_kor;


    }

    public String getCategory(){

        return category_kor;
    }



}
