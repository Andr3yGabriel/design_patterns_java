package decorator.house;

public class Television extends RoomDecorator{
    public Television(Room r) {
        room = r;
    }

    @Override
    public String furniture() {
        String description =  "%s %s";
        return String.format(description, room.furniture(), " Television");
    }
}
