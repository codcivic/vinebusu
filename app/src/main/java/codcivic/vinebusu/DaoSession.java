package codcivic.vinebusu;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig routeDtoDaoConfig;

    private final RouteDtoDao routeDtoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        routeDtoDaoConfig = daoConfigMap.get(RouteDtoDao.class).clone();
        routeDtoDaoConfig.initIdentityScope(type);

        routeDtoDao = new RouteDtoDao(routeDtoDaoConfig, this);

        registerDao(RouteDto.class, routeDtoDao);
    }
    
    public void clear() {
        routeDtoDaoConfig.getIdentityScope().clear();
    }

    public RouteDtoDao getRouteDtoDao() {
        return routeDtoDao;
    }

}
