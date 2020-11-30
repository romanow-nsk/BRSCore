package firefighter.core.entity.subjectarea.events;

import firefighter.core.entity.artifacts.Artifact;
import firefighter.core.entity.subjectarea.BRSEvent;

public class EventFacade {
  protected BRSEvent event=new BRSEvent();
    public BRSEvent getEvent() {
        return event;
        }
    public EventFacade(){}
    public EventFacade(BRSEvent essEvent){
        event = essEvent;
        }
    public EventFacade(int type){
        event.setType(type);
        }
    public EventFacade(int type, int level,String title, String comment){
        event.setType(type).setLevel(level).setTitle(title).setComment(comment);
        }
    public EventFacade(int type, int level){
        event.setType(type).setLevel(level);
        }
    public String toString(){
        return event.toString();
        }
    public EventFacade setLevel(int level){
        event.setLevel(level);
        return this;
        }
    public EventFacade setArtifact(long artId){
        event.getArtifact().setOid(artId);
        return this;
        }
    public EventFacade setArtifact(Artifact art){
        event.getArtifact().setOidRef(art);
        return this;
        }
}
