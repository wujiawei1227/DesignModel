/**
 * @program: DesignModel
 * @description:分离变化部分 封装接口
 * Context上下文角色 起承上启下的作用 屏蔽高层模块对策略、算法的直接访问，封装可能存在的变化
Strategy：策略角色 是对策略、算法家族的抽象通常为接口，定义每个策略或算法必须具有的方法和属性
ConcreteStrategyA：具体策略对象 实现策略角色中的方法
 * @author: wudaren
 * @create: 2020-07-09 11:01
 **/

public class Client {
    public static void main(String[] args) {
        Context context=new Context(new ConcreteStrategyB());
        context.contextInterface();
    }

}
