package firefighter.core.entity.subjectarea.events;

import firefighter.core.UniException;
import firefighter.core.constants.Values;

public class EventSystem extends EventFacade {
    public EventSystem(){
        super(Values.EventSystem);
        }
    public EventSystem(String  title, String comment){
        super(Values.EventSystem,Values.ELError,title,comment);
        }
    public EventSystem(String  title, UniException ex){
        super(Values.EventSystem,Values.ELError,title,ex.toString());
        }
}
