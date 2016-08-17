package codcivic.vinebusu;

import org.greenrobot.greendao.generator.DaoGenerator;
import org.greenrobot.greendao.generator.Entity;
import org.greenrobot.greendao.generator.Property;
import org.greenrobot.greendao.generator.Schema;

public class Generator {

    private static final int VERSION = 1;

    public static final String PACKAGE = "codcivic.vinebusu.dto";

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
        Entity agencyDto = schema.addEntity("AgencyDto");
        agencyDto.addStringProperty("agencyId").primaryKey();
        agencyDto.addStringProperty("agencyName");
        agencyDto.addStringProperty("agencyUrl");
        agencyDto.addStringProperty("agencyTimezone");
        agencyDto.addStringProperty("agencyLang");
        agencyDto.addStringProperty("agencyPhone");
        agencyDto.addStringProperty("agencyFareUrl");
        agencyDto.addStringProperty("agencyEmail");

        Entity routeDto = schema.addEntity("RouteDto");
        Property routeAgencyIdProperty = routeDto.addStringProperty("agencyId").getProperty();
        routeDto.addToOne(agencyDto, routeAgencyIdProperty);
        routeDto.addStringProperty("routeId").primaryKey();
        routeDto.addStringProperty("routeShortName");
        routeDto.addStringProperty("routeLongName");
        routeDto.addStringProperty("routeType");
        routeDto.addStringProperty("routeUrl");

        // one-to-many stops:routes
        // we add the stopId column to the routes table
        // http://greenrobot.org/greendao/documentation/relations/
        Entity stopDto = schema.addEntity("StopDto");
        Property stopIdProperty = routeDto.addStringProperty("stopId").getProperty();
        stopDto.addToMany(routeDto, stopIdProperty);
        stopDto.addStringProperty("stopId").primaryKey();
        stopDto.addStringProperty("stopCode");
        stopDto.addStringProperty("stopName");
        stopDto.addStringProperty("stopDesc");
        stopDto.addStringProperty("stopLat");
        stopDto.addStringProperty("stopLon");

        Entity tripDto = schema.addEntity("TripDto");
        tripDto.addStringProperty("tripId").primaryKey();
        tripDto.addStringProperty("serviceId");
        tripDto.addStringProperty("tripHeadsign");
        tripDto.addStringProperty("tripShortName");
    }

}
