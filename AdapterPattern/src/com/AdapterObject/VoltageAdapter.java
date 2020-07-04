package com.AdapterObject;

import com.AdapterObject.Voltage220V;
import com.AdapterObject.Voltage5V;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-03 21:09
 **/

public class VoltageAdapter implements Voltage5V {
    private Voltage220V v;//关联关系-聚合
    //通过构造器传入一个Voltage220V实例
    public VoltageAdapter(Voltage220V v) {
        this.v = v;
    }
    @Override
    public int output5V() {
        int i = 0;
        if (null!=v){
            //获取220电压
            int j=v.output220V();
            i=j/44;
        }
        return i;
    }
}
