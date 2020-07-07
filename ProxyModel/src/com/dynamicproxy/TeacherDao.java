package com.dynamicproxy;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-06 22:49
 **/

public class TeacherDao implements ITeacher {
    @Override
    public void teach() {
        System.out.println("老师授课中");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello"+name);
    }
}
