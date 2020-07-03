/**
 * @program: DesignModel
 * @description:
 * 将复杂对象的的建造过程抽象出来，使这个抽象过程的不同实现方法可以后遭出不同属性的对象
 * 用户只通过指定复杂对象的类型和内容就可以构建他们 ，不需要知道内部的具体构建细节
 * @author: wudaren
 * @create: 2020-07-03 17:07
 **/

public class BuilderTest {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse=new CommonHouse();
        HouseDirector houseDirector=new HouseDirector(commonHouse);
        House houseBuilder = houseDirector.constructHouse();
        System.out.println(houseBuilder);

    }
}
