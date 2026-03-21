package decorator.house;

public class Main {
    void main() {
        Room livingRoom = new LivingRoom();
        Room bedroom = new Bedroom();

        IO.println(livingRoom.furniture());
        IO.println(bedroom.furniture());

        Room livingRoomWithWindow = new Window(livingRoom);
        Room livingRoomWithWindowAndDesk = new Desk(livingRoomWithWindow);
        Room livingRoomWithWindowDeskAndTelevision = new Television(livingRoomWithWindowAndDesk);
        Room livingRoomWithWindowDeskTelevisionAndChair = new Chair(livingRoomWithWindowDeskAndTelevision);

        IO.println(livingRoomWithWindowDeskTelevisionAndChair.furniture());

        Room bedroomWithWindow = new Window(bedroom);
        Room bedroomWithWindowAndDesk = new Desk(bedroomWithWindow);
        Room bedroomWithWindowDeskAndTelevision = new Television(bedroomWithWindowAndDesk);
        Room bedroomWithWindowDeskTelevisionAndChair = new Chair(bedroomWithWindowDeskAndTelevision);

        IO.println(bedroomWithWindowDeskTelevisionAndChair.furniture());

    }
}
