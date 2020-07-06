/**
 * @program: DesignModel
 * @description:
 * 实现了抽象与实现部分分离 从而极大的提供了系统的灵活性，让抽象部分和实现部分独立开来，有助于系统进行分层设计，从而产生更好的结构化系统
 * 桥接模式替代多层继承方案，可以减少子类的个数，降低系统的管理和维护成本
 * 常见使用场景
 *   1、JDBC驱动程序
 *   2、银行转账系统
 *          转账分类：网上转账 手机转账 ATM转账
 *          转账用户类型：普通用户 银卡用户 金卡用户
 *   3、消息管理
 *              消息类型：即时消息 延时消息
 *              消息分类 手机短信 邮件信息 qq信息
 * @author: wudaren
 * @create: 2020-07-06 10:49
 **/

public class client {
    public static void main(String[] args) {
        Phone phone=new FoldedPhone(new XiaoMi());
        phone.call();
    }

}
