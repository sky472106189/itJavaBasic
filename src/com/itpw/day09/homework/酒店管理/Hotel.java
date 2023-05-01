package com.itpw.day09.homework.酒店管理;

/***
 * 酒店类
 *  1楼统一单人间，2楼统一双人间，3楼统一大床房。如果超过3楼就报错
 */
public class Hotel {
    private Room[][] rooms;

    public Hotel() {
        this(new Room[3][3]);
    }

    /***
     * 新建楼层，要求楼层不超过3楼，楼层房间数不超过10间
     * 1楼是单人间，2楼是双人间，3楼是大床房
     * @param rooms 房间二维数组
     */
    public Hotel(Room[][] rooms) {
        // 让酒店的楼引用指向形参
        this.rooms = rooms;
        if (rooms.length > 3 || rooms[0].length > 10) {
            System.out.println("不允许建设超过3楼或者楼层房间数超过10间的酒店");
        } else {
            // 先对第一楼操作
            for (int i = 0; i < rooms.length; i++) {
                for (int j = 0; j < rooms[i].length; j++) {
                    Room room = new Room();
                    room.setRoomEmpty(true);
                    rooms[i][j] = room;
                    if (i == 0) {
                        room.setRoomType("单人间");
                        room.setRoomId((i + 1) * 100 + (j + 1));
                    } else if (i == 1) {
                        room.setRoomType("双人间");
                        room.setRoomId((i + 1) * 100 + (j + 1));
                    } else if (i == 2) {
                        room.setRoomType("大床房");
                        room.setRoomId((i + 1) * 100 + (j + 1));
                    }
                }
            }
        }
    }

    /***
     * 根据房间号预定房间
     * @param target 房间号
     */
    public void hotelReserve(int target) {
        int floor = (target / 100) -1;
        int index = (target % 100) -1;
        if((floor+1)>rooms.length||(index+1)>rooms[0].length){
            System.out.println("房间号输入有误，请重新输入");
        }else{
            if(rooms[floor][index].isRoomEmpty()) {
                rooms[floor][index].setRoomEmpty(false);
                System.out.println("预定成功");
            }else{
                System.out.println("房间已被预定，请重新选择");
            }
        }
    }

    /***
     * 根据房间号退房
     * @param target
     */
    public void quitRooms(int target){
        int floor = (target / 100) -1;
        int index = (target % 100)-1;
        if((floor+1)>rooms.length||(index+1)>rooms[0].length){
            System.out.println("房间号输入有误，请重新输入");
        }else{
            if(rooms[floor][index].isRoomEmpty()) {
                System.out.println("该房间已退房，请确定退房号无误");
            }else{
                rooms[floor][index].setRoomEmpty(true);
                System.out.println("预定成功");
            }
        }
    }

    /***
     * 展示所有房间状态
     */
    public void displayRooms(){
        for (Room[] room : rooms) {
            for (Room room1 : room) {
                System.out.println(room1);
            }
        }
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }
}
