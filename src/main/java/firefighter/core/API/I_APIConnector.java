package firefighter.core.API;

import firefighter.core.DBRequest;
import firefighter.core.entity.Entity;
import firefighter.core.entity.baseentityes.JLong;
import firefighter.core.entity.users.Account;
import firefighter.core.entity.users.User;

public interface I_APIConnector {
    public void addEntity(String token, DBRequest body,int level, I_APICallBack<JLong> back);
    public void getEntity(String token, String className, long id, int level, I_APICallBack<Entity> back);
    public void ping(I_APICallBack back);
    public void login(Account account, I_APICallBack<User> back);
    }
