package firefighter.core.constants;

import firefighter.core.entity.subjectarea.WorkSettings;
import firefighter.core.entity.users.User;

public class Values extends ValuesBase{
    // 1. Константы наследуются (аннотации)
    // 2. Массивы строк перекрываются
    // 3. статическая инициализация наследуется
    private final static int ReleaseNumber=8;                // номер сборки сервера
    private final static String ApkName = "Unity.apk";       // Имя файла
    private final static String mongoDBName = "ess";
    private final static String mongoDBUser = "ess";
    private final static String ServerName="ESSDataserver.jar";
    private final static String mongoDBPassword = "ess";
    public final static String modulePackage = "firefighter.desktop.module";
    public final static int SettingEnableRegister=410; //410,480,485
    public final static int SettingEnableCommand=240;
    public final static User superUser=new User(ValuesBase.UserSuperAdminType, "Система", "", "", "UnityDataserver", "pi31415926","9130000000");
    public static void init(){}
    static {
        env = new I_Environment() {
            @Override
            public String mongoDBName() {
                return mongoDBName; }
            @Override
            public String mongoDBUser() {
                return mongoDBUser; }
            @Override
            public String mongoDBPassword() {
                return mongoDBPassword; }
            @Override
            public String apkName() {
                return ApkName; }
            @Override
            public String serverName() {
                return ServerName; }
            @Override
            public User superUser() {
                return superUser; }
            @Override
            public Class valuesClass() {
                return Values.class; }
            @Override
            public int releaseNumber() {
                return ReleaseNumber; }
            @Override
            public String[] userTypes() {
                return UserTypeList; }
            };
        EntityFactory.put(new TableItem("Настройки", WorkSettings.class));
        //------------------------------ Убраны -----------------------------------------------
        //PrefixMap.put("MetaBit.beginTime","b");
       }
    //------------- Уровни событий -----------------
    public final static int ELInfo=0;
    public final static int ELWarning=1;
    public final static int ELError=2;
    public final static int ELFailure=3;
    public final static int ELCrash=4;
    public final static String eventLevels[] = {"Информация","Предупреждение","Ошибка","Авария","Крах"};
    //------------- Типы и подтипы событий -----------------
    public final static int EventNone=0;
    public final static int EventNotifycation=1;
    public final static int EventHostServer=2;
    public final static int EventExternal=3;
    public final static int EventSystem=4;
    public final static int EventState=5;
    public final static int EventFailure=6;
    public final static int EventCommand=7;
    public final static int EventSetting=8;
    public final static int EventFile=9;
    //------------- Подтипы событий -----------------
    public final static int EventDEStateReg=11;
    public final static int EventDEBitReg=12;
    public final static int EventFailBitReg=13;
    public final static int EventFailSettingReg=14;
    public final static String eventTypes[] = {"","Уведомление","Сервер СМУ","Внешнее","Системное","Соcтояние","Авария",
            "Команда","Уставка","Файл","","ДС регистровое","ДС битовое","Авария-бит","Авария-уставка"};
    //------------- Типы пользователей -----------------------------------------------------
    @CONST(group = "User", title = "Гость")
    public final static int UserGuestType = 0;
    @CONST(group = "User", title = "Суперадмин")
    public final static int UserSuperAdminType = 1;
    @CONST(group = "User", title = "Администратор")
    public final static int UserAdminType = 2;
    @CONST(group = "User", title = "СНЭ - уровень 1")
    public final static int UserESSAccessType1 = 3;
    @CONST(group = "User", title = "СНЭ - уровень 2")
    public final static int UserESSAccessType2 = 4;
    @CONST(group = "User", title = "СНЭ - уровень 3")
    public final static int UserESSAccessType3 = 5;
    public final static String UserTypeList[] = {"Гость", "Суперадмин", "Администратор", "СНЭ - уровень 1", "СНЭ - уровень 2", "СНЭ - уровень 3"};
    }
