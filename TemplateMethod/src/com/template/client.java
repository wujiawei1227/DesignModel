package com.template;

/**
 * @program: DesignModel
 * @description: 封装不变部分 扩展可变部分 行为由父类控制，子类实现 符合开闭原则
 * SoyaMilk 抽象模板类 其中模板方法make被final修饰 以免被子类重写
 * 钩子方法 ：在抽象类中定义一个方法，默认不做任何事，子类可以根据实际情况要不要覆盖它，从而改变行为
 * @author: wudaren
 * @create: 2020-07-09 12:14
 **/

public class client {
    public static void main(String[] args) {
        PeanutSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }
}
