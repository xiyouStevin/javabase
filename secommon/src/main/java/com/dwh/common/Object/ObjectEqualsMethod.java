package com.dwh.common.Object;

import com.dwh.common.Model.Object.School;

/**
 * @author: Steven
 * @create: 2024-06-19 14:34
 * @Description: equals();比较两个对象是否相等
 */
public class ObjectEqualsMethod {

    public static void main(String[] args){
        School hightSchool = new School();
        School collegeSchool = new School();

        System.out.println(hightSchool.equals(collegeSchool));

        School currentSchool = collegeSchool;
        System.out.println(collegeSchool.equals(currentSchool));
    }
}
