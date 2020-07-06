/**
 * @program: DesignModel
 * @description:
 * ABattercake 定义需要实现业务的抽象方法 煎饼果子
 * Battercake 用于定义具体的构建对象 ，可以在此处给他增加额外的职责（方法）
 * AbstrackDecorator 继承ABattercake，并创建ABattercake实例对象，用于给具体构建Battercake增加职责
 * EggDecorator/SausageDecorator 具体装饰类的子类，负责向构件添加新的职责，每一个具体装饰类都定义新的行为，可以调用在抽象装饰类中的定义的方法
 * 并增加新的方法用以扩充对象的行为
 * @author: wudaren
 * @create: 2020-07-06 12:17
 **/

public class client {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake=new Battercake();
        aBattercake=new EggDecorator(aBattercake);
        aBattercake=new EggDecorator(aBattercake);
        System.out.println(aBattercake.getDesc());
    }
}
