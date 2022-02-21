package com.atguigu.factory;

import com.atguigu.bean.AirPlane;

public class AirPlaneFactory {

    public AirPlane getAirPlane(String jzName){
        System.out.println("AirPlaneFactory在为您造飞机。。。。。");
        AirPlane airPlane = new AirPlane();
        airPlane.setJzName(jzName);
        airPlane.setFjsName("lfy");
        airPlane.setJyLength(678);
        return airPlane;

    }
}
