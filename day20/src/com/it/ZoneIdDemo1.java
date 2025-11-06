package com.it;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo1 {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        //ctrl + f 查找
        System.out.println(availableZoneIds);
        //获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        //获得一个指定时区
        ZoneId zoneId1 = ZoneId.of("Asia/Aqtau");
        System.out.println(zoneId1);

    }
}
