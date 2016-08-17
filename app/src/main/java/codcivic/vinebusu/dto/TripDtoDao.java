package codcivic.vinebusu.dto;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TRIP_DTO".
*/
public class TripDtoDao extends AbstractDao<TripDto, String> {

    public static final String TABLENAME = "TRIP_DTO";

    /**
     * Properties of entity TripDto.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property TripId = new Property(0, String.class, "tripId", true, "TRIP_ID");
        public final static Property ServiceId = new Property(1, String.class, "serviceId", false, "SERVICE_ID");
        public final static Property TripHeadsign = new Property(2, String.class, "tripHeadsign", false, "TRIP_HEADSIGN");
        public final static Property TripShortName = new Property(3, String.class, "tripShortName", false, "TRIP_SHORT_NAME");
    };


    public TripDtoDao(DaoConfig config) {
        super(config);
    }
    
    public TripDtoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TRIP_DTO\" (" + //
                "\"TRIP_ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: tripId
                "\"SERVICE_ID\" TEXT," + // 1: serviceId
                "\"TRIP_HEADSIGN\" TEXT," + // 2: tripHeadsign
                "\"TRIP_SHORT_NAME\" TEXT);"); // 3: tripShortName
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TRIP_DTO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TripDto entity) {
        stmt.clearBindings();
 
        String tripId = entity.getTripId();
        if (tripId != null) {
            stmt.bindString(1, tripId);
        }
 
        String serviceId = entity.getServiceId();
        if (serviceId != null) {
            stmt.bindString(2, serviceId);
        }
 
        String tripHeadsign = entity.getTripHeadsign();
        if (tripHeadsign != null) {
            stmt.bindString(3, tripHeadsign);
        }
 
        String tripShortName = entity.getTripShortName();
        if (tripShortName != null) {
            stmt.bindString(4, tripShortName);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TripDto entity) {
        stmt.clearBindings();
 
        String tripId = entity.getTripId();
        if (tripId != null) {
            stmt.bindString(1, tripId);
        }
 
        String serviceId = entity.getServiceId();
        if (serviceId != null) {
            stmt.bindString(2, serviceId);
        }
 
        String tripHeadsign = entity.getTripHeadsign();
        if (tripHeadsign != null) {
            stmt.bindString(3, tripHeadsign);
        }
 
        String tripShortName = entity.getTripShortName();
        if (tripShortName != null) {
            stmt.bindString(4, tripShortName);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public TripDto readEntity(Cursor cursor, int offset) {
        TripDto entity = new TripDto( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // tripId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // serviceId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // tripHeadsign
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // tripShortName
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TripDto entity, int offset) {
        entity.setTripId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setServiceId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTripHeadsign(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTripShortName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final String updateKeyAfterInsert(TripDto entity, long rowId) {
        return entity.getTripId();
    }
    
    @Override
    public String getKey(TripDto entity) {
        if(entity != null) {
            return entity.getTripId();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}