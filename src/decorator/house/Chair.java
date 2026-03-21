package decorator.house;

public class Chair extends RoomDecorator{
    public Chair(Room r) {
        room = r;
    }

    @Override
    public String furniture() {
        String description =  "%s %s";
        return String.format(description, room.furniture(), " Chair");
    }
}
