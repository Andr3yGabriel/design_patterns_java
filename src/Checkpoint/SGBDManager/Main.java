package Checkpoint.SGBDManager;

public class Main {
    void main() {
        User u1 = new User("Andrey");
        User u2 = new User("Julia");
        User u3 = new User("Victor");
        User u4 = new User("Gabriel");

        MySQL msql = new MySQL();
        PostgreSQL psql = new PostgreSQL();
        Oracle oracle = new Oracle();
        SQLServer sqlserver = new SQLServer();

        MySQLCommand msqlCommand = new MySQLCommand(msql);
        PostgreSQLCommand psqlCommand = new PostgreSQLCommand(psql);
        OracleCommand oracleCommand = new OracleCommand(oracle);
        SQLServerCommand sqlserverCommand = new SQLServerCommand(sqlserver);

        msqlCommand.add(u1);
        msqlCommand.add(u2);
        msqlCommand.list();

        psqlCommand.add(u3);
        psqlCommand.add(u4);
        psqlCommand.list();

        oracleCommand.add(u1);
        oracleCommand.add(u3);
        oracleCommand.list();

        sqlserverCommand.add(u2);
        sqlserverCommand.add(u4);
        sqlserverCommand.list();

        sqlserverCommand.add(u1);
        sqlserverCommand.add(u2);
        sqlserverCommand.add(u3);
        sqlserverCommand.add(u4);
        sqlserverCommand.list();

        msqlCommand.remove(u1);
        msqlCommand.list();
        msqlCommand.undo();
        msqlCommand.list();
    }
}
