package com.AdapterObject;

/**
 * @program: DesignModel
 * @description:被适配的类
 * @author: wudaren
 * @create: 2020-07-03 21:05
 **/

public class Voltage220V implements Voltage220 {
    //输出220V的电压
    @Override
    public int output220V() {
        int src=220;
        System.out.println("电压为="+src+"伏");
        return src;
    }


}
