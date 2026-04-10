package Checkpoint.SmartphoneStore;

public class Main {
    void main() {
        Client c1 = new Client("Andrey", Client.ClientType.PREMIUM);
        Client c2 = new Client("Julia", Client.ClientType.NORMAL);
        Client c3 = new Client("Victor", Client.ClientType.VIP);

        Smartphone c1Smartphone = new Iphone17();
        c1Smartphone.setClient(c1);

        IO.println(c1Smartphone.getDescription() + "\n" + c1Smartphone.cost());

        Smartphone c1SmartphoneWithExtraCharger = new Charger(c1Smartphone);
        Smartphone c1SmartphoneWithExtraChargerAndEarpods = new Earpods(c1SmartphoneWithExtraCharger);
        Smartphone c1SmartphoneWithExtraChargerEarpodsAndCase = new Case(c1SmartphoneWithExtraChargerAndEarpods);
        Smartphone c1SmartphoneWithExtraChargerEarpodsCaseAndScreenProtector = new ScreenProtector(c1SmartphoneWithExtraChargerEarpodsAndCase);
        Smartphone c1SmartphoneWithExtraChargerEarpodsCaseScreenProtectorAndCameraSupport = new CameraSupport(c1SmartphoneWithExtraChargerEarpodsCaseAndScreenProtector);

        IO.println(c1SmartphoneWithExtraChargerEarpodsCaseScreenProtectorAndCameraSupport.getDescription() + "\n" + c1SmartphoneWithExtraChargerEarpodsCaseScreenProtectorAndCameraSupport.cost());

        Smartphone c2Smartphone = new Iphone17();
        c2Smartphone.setClient(c2);

        Smartphone c2SmartphoneWithCase = new Case(c2Smartphone);
        Smartphone c2SmartphoneWithCaseAndScreenProtector = new ScreenProtector(c2SmartphoneWithCase);

        IO.println(c2SmartphoneWithCaseAndScreenProtector.getDescription() + "\n" + c2SmartphoneWithCaseAndScreenProtector.cost());

        c2.setClientType(Client.ClientType.VIP);

        IO.println(c2SmartphoneWithCaseAndScreenProtector.getDescription() + "\n" + c2SmartphoneWithCaseAndScreenProtector.cost());
    }
}
