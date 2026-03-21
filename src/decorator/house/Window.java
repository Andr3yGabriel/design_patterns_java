package decorator.house;

public class Window extends RoomDecorator{
    public Window(Room r) {
        room = r;
    }

    @Override
    public String furniture() {
        String description =  "%s %s";
        return String.format(description, room.furniture(), " Window");
    }
}
