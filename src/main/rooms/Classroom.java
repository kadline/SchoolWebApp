package main.rooms;

public class Classroom {

    private int roomNumb;
    private int maxAlunis = 20;

    public int getRoomNumb() {
        return roomNumb;
    }

    public void setRoomNumb(int roomNumb) {
        this.roomNumb = roomNumb;
    }

    public int getMaxAlunis() {
        return maxAlunis;
    }

    public void setMaxAlunis(int maxAlunis) {
        this.maxAlunis = maxAlunis;
    }
}
