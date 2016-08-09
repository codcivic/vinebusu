package rocod.vinebusu;

import org.greenrobot.greendao.generator.DaoGenerator;
import org.greenrobot.greendao.generator.Entity;
import org.greenrobot.greendao.generator.Schema;

public class Generator {

    private static final int VERSION = 1;

    public static final String PACKAGE = "rocod.vinebusu.dto";

    public static final String PATH = "./app/src/main/java";

    public static void main(String[] args) {
        Schema schema = new Schema(VERSION, PACKAGE);
        addEntities(schema);
        try {
            new DaoGenerator().generateAll(schema, PATH);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addEntities(Schema schema) {
        Entity routeDto = schema.addEntity("RouteDto");
        routeDto.addStringProperty("name");
    }

}
