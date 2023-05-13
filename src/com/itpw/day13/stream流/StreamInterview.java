package com.itpw.day13.stream流;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
停车记录表中记录三个字段：车牌号，停车日期，停车时长；要求统计出，
某月份停车时长最长的前5，如果存在相同时长则按照车牌号的字段序统计；
要求自己定义数据结构，赋值，输出结果。数据举例:
    {“B01562”,“2021-05-26”,“15”},
    {“B01562”,“2021-05-27”,“18”},
    {“B01563”,“2021-05-27”,“17”},
    {“B01560”,“2021-05-27”,“11”},
    {“B01563”,“2021-05-26”,“16”}
*/
public class StreamInterview {
    public static void main(String[] args) {
        List<ParkingForm> list = new ArrayList<>();
        ParkingForm p1 = new ParkingForm("B01562", "2021-05-26", 15);
        ParkingForm p2 = new ParkingForm("B01562", "2021-05-27", 18);
        ParkingForm p3 = new ParkingForm("B01563", "2021-05-27", 17);
        ParkingForm p4 = new ParkingForm("B01463", "2021-05-27", 17);
        ParkingForm p5 = new ParkingForm("B01560", "2021-05-27", 11);
        ParkingForm p6 = new ParkingForm("B01563", "2021-05-26", 16);
        ParkingForm p7 = new ParkingForm("B01563", "2021-06-26", 16);
        Collections.addAll(list, p1, p2, p3, p4, p5, p6, p7);

        findTop5Parking(list, 5);
    }

    /***
     * 找到该月停车最长的5台车信息
     * @param list 停车集合
     * @param month 月份
     */
    public static void findTop5Parking(List<ParkingForm> list, int month) {

        list.stream().filter(parkingForm -> {
            if (parkingForm.getDate().get(Calendar.MONTH) + 1 == 5) {
                return true;
            }
            return false;
        }).sorted((o1, o2) -> {
            if (o1.getDuration() - o2.getDuration() < 0) {
                return 1;
            } else if (o1.getDuration() - o2.getDuration() > 0) {
                return -1;
            } else {
                return o2.getCarLicenseNumber().compareTo(o1.getCarLicenseNumber());
            }
        }).limit(5).forEach(o1 -> System.out.println(o1));
    }

}

/***
 * 停车记录
 */
class ParkingForm {
    /***
     * 车牌号
     */
    private String carLicenseNumber;
    /***
     * 日期字符串
     */
    private String inputDate;
    /**
     * 停车时长
     */
    private Integer duration;
    /**
     * 日期字符串的Date格式
     * 由前台的inputDate自动转换
     */
    private Calendar date;

    /***
     * 有参构造
     * 对日期字符串进行格式化，用date来存
     * @param carLicenseNumber 车牌号
     * @param inputDate 日期字符串
     * @param duration 停车时长
     */
    public ParkingForm(String carLicenseNumber, String inputDate, Integer duration) {
        this.carLicenseNumber = carLicenseNumber;
        this.inputDate = inputDate;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = sdf.parse(inputDate);
            date = Calendar.getInstance();
            date.setTime(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.duration = duration;
    }

    public String getCarLicenseNumber() {
        return carLicenseNumber;
    }

    public void setCarLicenseNumber(String carLicenseNumber) {
        this.carLicenseNumber = carLicenseNumber;
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Calendar getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "ParkingForm{" +
                "carLicenseNumber='" + carLicenseNumber + '\'' +
                ", inputDate='" + inputDate + '\'' +
                ", duration=" + duration +
                '}';
    }
}
