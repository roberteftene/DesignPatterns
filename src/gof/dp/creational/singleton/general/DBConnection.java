package gof.dp.creational.singleton.general;

public class DBConnection {

    String dbName;
    String schema;

    private static DBConnection instance = null;

    private DBConnection() {}

    private DBConnection(String dbName, String schema) {
        this.dbName = dbName;
        this.schema = schema;
        System.out.println("Connecting...");
    }

    public static synchronized DBConnection getInstance(String dbName, String schema) {
        if (instance == null) {
            instance = new DBConnection(dbName,schema);
        }
        if(!dbName.equals(instance.dbName) || !schema.equals(instance.schema)) {
            throw new UnsupportedOperationException("You already have an active connection");
        }
        return instance;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }
}
