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
 * DAO for table "STOP_DTO".
*/
public class StopDtoDao extends AbstractDao<StopDto, String> {

    public static final String TABLENAME = "STOP_DTO";

    /**
     * Properties of entity StopDto.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property StopId = new Property(0, String.class, "stopId", true, "STOP_ID");
        public final static Property StopCode = new Property(1, String.class, "stopCode", false, "STOP_CODE");
        public final static Property StopName = new Property(2, String.class, "stopName", false, "STOP_NAME");
        public final static Property StopDesc = new Property(3, String.class, "stopDesc", false, "STOP_DESC");
        public final static Property StopLat = new Property(4, String.class, "stopLat", false, "STOP_LAT");
        public final static Property StopLon = new Property(5, String.class, "stopLon", false, "STOP_LON");
    };

    private DaoSession daoSession;


    public StopDtoDao(DaoConfig config) {
        super(config);
    }
    
    public StopDtoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"STOP_DTO\" (" + //
                "\"STOP_ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: stopId
                "\"STOP_CODE\" TEXT," + // 1: stopCode
                "\"STOP_NAME\" TEXT," + // 2: stopName
                "\"STOP_DESC\" TEXT," + // 3: stopDesc
                "\"STOP_LAT\" TEXT," + // 4: stopLat
                "\"STOP_LON\" TEXT);"); // 5: stopLon
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"STOP_DTO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, StopDto entity) {
        stmt.clearBindings();
 
        String stopId = entity.getStopId();
        if (stopId != null) {
            stmt.bindString(1, stopId);
        }
 
        String stopCode = entity.getStopCode();
        if (stopCode != null) {
            stmt.bindString(2, stopCode);
        }
 
        String stopName = entity.getStopName();
        if (stopName != null) {
            stmt.bindString(3, stopName);
        }
 
        String stopDesc = entity.getStopDesc();
        if (stopDesc != null) {
            stmt.bindString(4, stopDesc);
        }
 
        String stopLat = entity.getStopLat();
        if (stopLat != null) {
            stmt.bindString(5, stopLat);
        }
 
        String stopLon = entity.getStopLon();
        if (stopLon != null) {
            stmt.bindString(6, stopLon);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, StopDto entity) {
        stmt.clearBindings();
 
        String stopId = entity.getStopId();
        if (stopId != null) {
            stmt.bindString(1, stopId);
        }
 
        String stopCode = entity.getStopCode();
        if (stopCode != null) {
            stmt.bindString(2, stopCode);
        }
 
        String stopName = entity.getStopName();
        if (stopName != null) {
            stmt.bindString(3, stopName);
        }
 
        String stopDesc = entity.getStopDesc();
        if (stopDesc != null) {
            stmt.bindString(4, stopDesc);
        }
 
        String stopLat = entity.getStopLat();
        if (stopLat != null) {
            stmt.bindString(5, stopLat);
        }
 
        String stopLon = entity.getStopLon();
        if (stopLon != null) {
            stmt.bindString(6, stopLon);
        }
    }

    @Override
    protected final void attachEntity(StopDto entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public StopDto readEntity(Cursor cursor, int offset) {
        StopDto entity = new StopDto( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // stopId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // stopCode
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // stopName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // stopDesc
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // stopLat
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // stopLon
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, StopDto entity, int offset) {
        entity.setStopId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setStopCode(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setStopName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setStopDesc(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setStopLat(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setStopLon(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    @Override
    protected final String updateKeyAfterInsert(StopDto entity, long rowId) {
        return entity.getStopId();
    }
    
    @Override
    public String getKey(StopDto entity) {
        if(entity != null) {
            return entity.getStopId();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}