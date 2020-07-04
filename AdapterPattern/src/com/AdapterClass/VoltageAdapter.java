package com.AdapterClass;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-03 21:09
 **/

public class VoltageAdapter extends Voltage220V implements Voltage5V {

    @Override
    public int output5V() {
        //获取220V电压
        int i = output220V();
        //转成5V
        int j = i / 44;
        return j;
    }
}
