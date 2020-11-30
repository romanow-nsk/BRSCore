package firefighter.dataserver;

import firefighter.core.API.RestAPIBase;

public interface I_DBTarget<T extends RestAPIBase> {
    public void createAll(T face, String pass);
}

