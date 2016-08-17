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
 * DAO for table "AGENCY_DTO".
*/
public class AgencyDtoDao extends AbstractDao<AgencyDto, String> {

    public static final String TABLENAME = "AGENCY_DTO";

    /**
     * Properties of entity AgencyDto.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property AgencyId = new Property(0, String.class, "agencyId", true, "AGENCY_ID");
        public final static Property AgencyName = new Property(1, String.class, "agencyName", false, "AGENCY_NAME");
        public final static Property AgencyUrl = new Property(2, String.class, "agencyUrl", false, "AGENCY_URL");
        public final static Property AgencyTimezone = new Property(3, String.class, "agencyTimezone", false, "AGENCY_TIMEZONE");
        public final static Property AgencyLang = new Property(4, String.class, "agencyLang", false, "AGENCY_LANG");
        public final static Property AgencyPhone = new Property(5, String.class, "agencyPhone", false, "AGENCY_PHONE");
        public final static Property AgencyFareUrl = new Property(6, String.class, "agencyFareUrl", false, "AGENCY_FARE_URL");
        public final static Property AgencyEmail = new Property(7, String.class, "agencyEmail", false, "AGENCY_EMAIL");
    };


    public AgencyDtoDao(DaoConfig config) {
        super(config);
    }
    
    public AgencyDtoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"AGENCY_DTO\" (" + //
                "\"AGENCY_ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: agencyId
                "\"AGENCY_NAME\" TEXT," + // 1: agencyName
                "\"AGENCY_URL\" TEXT," + // 2: agencyUrl
                "\"AGENCY_TIMEZONE\" TEXT," + // 3: agencyTimezone
                "\"AGENCY_LANG\" TEXT," + // 4: agencyLang
                "\"AGENCY_PHONE\" TEXT," + // 5: agencyPhone
                "\"AGENCY_FARE_URL\" TEXT," + // 6: agencyFareUrl
                "\"AGENCY_EMAIL\" TEXT);"); // 7: agencyEmail
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"AGENCY_DTO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, AgencyDto entity) {
        stmt.clearBindings();
 
        String agencyId = entity.getAgencyId();
        if (agencyId != null) {
            stmt.bindString(1, agencyId);
        }
 
        String agencyName = entity.getAgencyName();
        if (agencyName != null) {
            stmt.bindString(2, agencyName);
        }
 
        String agencyUrl = entity.getAgencyUrl();
        if (agencyUrl != null) {
            stmt.bindString(3, agencyUrl);
        }
 
        String agencyTimezone = entity.getAgencyTimezone();
        if (agencyTimezone != null) {
            stmt.bindString(4, agencyTimezone);
        }
 
        String agencyLang = entity.getAgencyLang();
        if (agencyLang != null) {
            stmt.bindString(5, agencyLang);
        }
 
        String agencyPhone = entity.getAgencyPhone();
        if (agencyPhone != null) {
            stmt.bindString(6, agencyPhone);
        }
 
        String agencyFareUrl = entity.getAgencyFareUrl();
        if (agencyFareUrl != null) {
            stmt.bindString(7, agencyFareUrl);
        }
 
        String agencyEmail = entity.getAgencyEmail();
        if (agencyEmail != null) {
            stmt.bindString(8, agencyEmail);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, AgencyDto entity) {
        stmt.clearBindings();
 
        String agencyId = entity.getAgencyId();
        if (agencyId != null) {
            stmt.bindString(1, agencyId);
        }
 
        String agencyName = entity.getAgencyName();
        if (agencyName != null) {
            stmt.bindString(2, agencyName);
        }
 
        String agencyUrl = entity.getAgencyUrl();
        if (agencyUrl != null) {
            stmt.bindString(3, agencyUrl);
        }
 
        String agencyTimezone = entity.getAgencyTimezone();
        if (agencyTimezone != null) {
            stmt.bindString(4, agencyTimezone);
        }
 
        String agencyLang = entity.getAgencyLang();
        if (agencyLang != null) {
            stmt.bindString(5, agencyLang);
        }
 
        String agencyPhone = entity.getAgencyPhone();
        if (agencyPhone != null) {
            stmt.bindString(6, agencyPhone);
        }
 
        String agencyFareUrl = entity.getAgencyFareUrl();
        if (agencyFareUrl != null) {
            stmt.bindString(7, agencyFareUrl);
        }
 
        String agencyEmail = entity.getAgencyEmail();
        if (agencyEmail != null) {
            stmt.bindString(8, agencyEmail);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public AgencyDto readEntity(Cursor cursor, int offset) {
        AgencyDto entity = new AgencyDto( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // agencyId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // agencyName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // agencyUrl
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // agencyTimezone
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // agencyLang
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // agencyPhone
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // agencyFareUrl
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // agencyEmail
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, AgencyDto entity, int offset) {
        entity.setAgencyId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setAgencyName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAgencyUrl(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAgencyTimezone(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAgencyLang(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setAgencyPhone(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setAgencyFareUrl(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setAgencyEmail(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    @Override
    protected final String updateKeyAfterInsert(AgencyDto entity, long rowId) {
        return entity.getAgencyId();
    }
    
    @Override
    public String getKey(AgencyDto entity) {
        if(entity != null) {
            return entity.getAgencyId();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
