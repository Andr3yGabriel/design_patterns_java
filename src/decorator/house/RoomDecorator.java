package decorator.house;

public abstract class RoomDecorator extends Room{
    Room room;

    public abstract String furniture();
}
