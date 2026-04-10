package Factory.SGBD;

import java.util.Scanner;

public class Main {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.print("Escolha o tipo de SGBD desejado (1 - Oracle, 2 - MySQL, 3 - SQL Server): ");
        int type = sc.nextInt();
        try {
            String connectionString;
            switch (type){
                case 1:
                    connectionString = "jdbc:oracle:thin:root/root@localhost:1521:xe";
                    break;
                case 2:
                    connectionString = "jdbc:mysql://localhost:3306/nome_do_banco?user=root&password=root";
                    break;
                case 3:
                    connectionString = "jdbc:sqlserver://localhost:1433;databaseName=nome_do_banco;user=root;password=root;encrypt=true;trustServerCertificate=true;";
                    break;
                default:
                    throw new IllegalArgumentException("Tipo de SGBD inválido. Escolha 1, 2 ou 3.");
            }
            SGBD sgbd = SGBDSimpleFactory.CreateSGBD("root", "root", connectionString, type);
            IO.println("Conexão estabelecida com sucesso!");
            IO.println("SGBD: " + sgbd.toString());
            IO.println("Usuário: " + sgbd.getUser());
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
