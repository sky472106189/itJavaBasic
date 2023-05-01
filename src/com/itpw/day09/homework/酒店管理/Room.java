package com.itpw.day09.homework.酒店管理;

/***
 * 房间类
 */
public class Room {
    // 房间编号
    private int roomId;
    // 房间类型(单人间，双人间，大床房)
    private String roomType;
    // 房间是否空间(true:空闲 false:不空闲)
    private boolean roomEmpty;

    public Room() {
    }

    @Override
    public String toString() {
        return "Room{" +
                "房间号='" + roomId + '\'' +
                ", 房间类型='" + roomType + '\'' +
                ", 房间是否空闲=" + (roomEmpty?"空闲":"不空闲") +
                '}';
    }

    public Room(int roomId, String roomType, boolean roomEmpty) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.roomEmpty = roomEmpty;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isRoomEmpty() {
        return roomEmpty;
    }

    public void setRoomEmpty(boolean roomEmpty) {
        this.roomEmpty = roomEmpty;
    }
}
