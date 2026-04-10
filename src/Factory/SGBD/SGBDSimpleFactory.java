package Factory.SGBD;

public class SGBDSimpleFactory {
    public static SGBD CreateSGBD(String user, String password, String ConnectionString, int type) throws Exception {
        SGBD sgbd;
        switch (type) {
            case 1:
                sgbd = new Oracle(user, password, ConnectionString);
                break;
            case 2:
                sgbd = new MySQL(user, password, ConnectionString);
                break;
            case 3:
                sgbd = new SQLServer(user, password, ConnectionString);
                break;
            default:
                throw new IllegalArgumentException("Tipo de SGBD inválido. Escolha 1, 2 ou 3.");
        }

        return sgbd;
    }
}
