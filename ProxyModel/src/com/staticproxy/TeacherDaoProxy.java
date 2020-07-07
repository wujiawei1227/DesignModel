package com.staticproxy;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-06 22:22
 **/

public class TeacherDaoProxy implements ITeacher {
    private ITeacher target;//目标对象，通过接口聚合

    public TeacherDaoProxy(ITeacher target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理，完成某些操作"); //此处省略某些方法
        target.teach();
        System.out.println("提交"); //此处省略某些方法
    }
}
