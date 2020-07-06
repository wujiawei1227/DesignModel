/**
 * @program: DesignModel
 * @description: 鸡蛋装饰类
 * @author: wudaren
 * @create: 2020-07-06 12:13
 **/

public class EggDecorator extends AbstrackDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
