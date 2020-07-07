package com.staticproxy;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-06 22:20
 **/

public class TeacherDao implements ITeacher {
    @Override
    public void teach() {
        System.out.println("老师授课中");
    }
}
