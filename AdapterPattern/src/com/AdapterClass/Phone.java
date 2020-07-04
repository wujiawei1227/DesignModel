package com.AdapterClass;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-03 21:01
 **/

public class Phone {
    //充电
    public void charging(Voltage5V v){
        if (v.output5V()==5){
            System.out.println("电压为5V，可以充电");
        }else if (v.output5V()>5){
            System.out.println("电压大于5V，不能充电");
        }
    }
}
