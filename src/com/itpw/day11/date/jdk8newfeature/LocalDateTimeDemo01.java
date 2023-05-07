package com.itpw.day11.date.jdk8newfeature;

import java.time.LocalDateTime;

public class LocalDateTimeDemo01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        // 1、获取时间信息
        System.out.println(now.getYear());// 年
        System.out.println(now.getMonthValue());// 月
        System.out.println(now.getDayOfYear());// 年中第几天
        System.out.println(now.getDayOfMonth());// 这个月第几天
        System.out.println(now.getDayOfWeek());// 周几
        System.out.println(now.getHour());// 小时（24小时制）
        System.out.println(now.getMinute());// 分钟
        System.out.println(now.getSecond());// 秒
        System.out.println(now.getNano());// 纳秒 (1,000,000,000纳秒 = 1秒)
        System.out.println(now);

        // 2、修改时间信息(with方法)
        LocalDateTime change = now.withYear (2000);
            // 链式编程
        change.withDayOfMonth(25).withDayOfYear(100).withHour(12)
                .withMinute(24).withSecond(50).withNano(1000);
        System.out.println(change);

        // 3、加法
        LocalDateTime afterAddTime = now.plusYears(10).plusMonths(2).plusDays(10)
                .plusWeeks(1).plusHours(12).plusMinutes(5)
                .plusSeconds(50).plusNanos(10000);
        System.out.println(afterAddTime);

        // 4、减法
        LocalDateTime afterSubTime = now.minusYears(1).minusMonths(1).minusDays(5)
                .minusWeeks(2).minusHours(10).minusMinutes(4)
                .minusSeconds(45).minusNanos(1000);
        System.out.println(afterSubTime);

        // 5、指定时间
        LocalDateTime of = LocalDateTime.of(2012, 2, 20, 13, 44, 49);
        System.out.println(of);

        // 6、判断2个日期、时间，是否相等、之前或之后:equals、isBefore、isAfter
        System.out.println(of.equals(now));
        System.out.println(of.isBefore(now));
        System.out.println(of.isAfter(now));
    }
}
