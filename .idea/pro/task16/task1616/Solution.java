package com.javarush.task.pro.task16.task1616;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones()
    {
        TreeSet<String> noOneNeedsThisFuckingMethods = new TreeSet<String>();
        for (String usefulShit: ZoneId.getAvailableZoneIds())
        {
            noOneNeedsThisFuckingMethods.add(usefulShit);
        }
        
        return noOneNeedsThisFuckingMethods;
    }

    static ZonedDateTime getBeijingDateTime()
    {
        ZoneId BeijingDateTime = ZoneId.of("Asia/Shanghai");
        return ZonedDateTime.now(BeijingDateTime);
    }
}
