package firefighter.core.entity.subjectarea;

import firefighter.core.constants.Values;
import firefighter.core.entity.Entity;
import firefighter.core.entity.EntityLink;
import firefighter.core.entity.artifacts.Artifact;
import firefighter.core.entity.users.User;
import firefighter.core.utils.OwnDateTime;

public class BRSEvent extends Entity {      // Общий класс для всех аварий, событий....
    private int type= Values.EventNone;          // Тип события
    private int level=0;                        // Уровень
    private String title="";
    private String comment="";
    private OwnDateTime arrivalTime = new OwnDateTime();        // Время наступления
    private OwnDateTime endTime = new OwnDateTime(false);   // Время окончания
    private EntityLink<Artifact> artifact = new EntityLink<>(Artifact.class);
    private EntityLink<User> user = new EntityLink<>(); // Пользователь, связанный с событием
    public BRSEvent(){}
    public BRSEvent(int type, String title) {
        this.type = type;
        this.title = title;
    }
    public int getType() {
        return type; }
    public int getLevel() {
        return level; }
    @Override
    public String getTitle() {
        return title; }
    public String getComment() {
        return comment; }
    public BRSEvent(int type, int level, String title, String comment) {
        this.level = level;
        this.type = type;
        this.title = title;
        this.comment = comment;
    }
    public BRSEvent setUserId(long oid) {
        user.setOid(oid);
        return this; }
    public BRSEvent setType(int type) {
        this.type = type;
        return this; }
    public BRSEvent setLevel(int level) {
        this.level = level;
        return this; }
    public BRSEvent setTitle(String title) {
        this.title = title;
        return  this; }
    public BRSEvent setComment(String comment) {
        this.comment = comment;
        return this; }
    public OwnDateTime getArrivalTime() {
        return arrivalTime; }
    public BRSEvent setArrivalTime(OwnDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
        return this; }
    public OwnDateTime getEndTime() {
        return endTime; }
    public BRSEvent setEndTime(OwnDateTime endTime) {
        this.endTime = endTime;
        return this; }
    public BRSEvent setEndTime() {
        this.endTime = new OwnDateTime();
        return this; }
    public EntityLink<User> getUser() {
        return user; }
    public String toString(){
        return Values.eventTypes[type]+"["+Values.eventLevels[level]+"] "+title+(comment.length()!=0 ? "\n"+comment : "");
        }
    public EntityLink<Artifact> getArtifact() {
        return artifact; }
}

