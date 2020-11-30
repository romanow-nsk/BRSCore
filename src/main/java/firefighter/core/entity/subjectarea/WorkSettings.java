package firefighter.core.entity.subjectarea;

import firefighter.core.entity.base.WorkSettingsBase;

public class WorkSettings extends WorkSettingsBase {
    private int archiveDepthInDay=30;               // Глубина архива в днях
    private int streamDataPeriod=10;                // Цикл опроса потоковых данных (сек)
    private int streamDataLongPeriod=60;            // Длинный цикл опроса потоковых данных (сек)
    private int failureTestPeriod=10;               // Период обнаружения аварий (сек)
    private int GUIrefreshPeriod=10;                // Период обновления форм GUI
    private int eventTestPeriod=10;                 // Период опроса дисретных событий (сек)
    private int maxRegisterAge=100;                 // Период устаревания кэша регистров (мс)
    private boolean emulated=true;                  // Эмулятор ПЛМ
    private String plmIP="10.198.70.204";           // Внутренний IP-адрес ПЛМ ModbusTCP
    private int plmPort=502;                        // Порт ПЛМ ModbusTCP
    private int plmTimeOut=5;                       // Тайм-аут (сек) ожидания  ModbusTCP
    private int plmRegGroupSize=80;                 // Размер группы регистров команды ModbusTCP
    private boolean mainServer=false;               // Режим главного сервера СМУ (Вступает в действие при перезагрузке)
    private String mailHost="mail.nstu.ru";
    private String mailBox="romanow@corp.nstu.ru";
    private String mailPass="Longlivernr123";
    private String mailSecur="starttls";
    private int mailPort=587;
    private String mailToSend="romanow@ngs.ru";
    private boolean mailNotifycation=false;
    private int fileScanPeriod=10;                // Цикл опроса источник файлов (сек)
    private int mainServerPeriod=20;              // Цикл снятия данных клавным сервером (сек)

    //-------------------------------------------------------------------------------------------
    public int getArchiveDepthInDay() {
        return archiveDepthInDay; }
    public void setArchiveDepthInDay(int archiveDepthInDay) {
        this.archiveDepthInDay = archiveDepthInDay; }
    public int getStreamDataPeriod() {
        return streamDataPeriod; }
    public void setStreamDataPeriod(int streamDataPeriod) {
        this.streamDataPeriod = streamDataPeriod; }
    public int getStreamDataLongPeriod() {
        return streamDataLongPeriod; }
    public void setStreamDataLongPeriod(int streamDataLongPeriod) {
        this.streamDataLongPeriod = streamDataLongPeriod; }
    public int getFailureTestPeriod() {
        return failureTestPeriod; }
    public void setFailureTestPeriod(int failureTestPeriod) {
        this.failureTestPeriod = failureTestPeriod; }
    public int getGUIrefreshPeriod() {
        return GUIrefreshPeriod; }
    public void setGUIrefreshPeriod(int GUIrefreshPeriod) {
        this.GUIrefreshPeriod = GUIrefreshPeriod; }
    public int getEventTestPeriod() {
        return eventTestPeriod; }
    public void setEventTestPeriod(int eventTestPeriod) {
        this.eventTestPeriod = eventTestPeriod; }
    public int getMaxRegisterAge() {
        return maxRegisterAge; }
    public void setMaxRegisterAge(int maxRegisterAge) {
        this.maxRegisterAge = maxRegisterAge; }
    public boolean isEmulated() {
        return emulated; }
    public void setEmulated(boolean emulated) {
        this.emulated = emulated; }
    public String getPlmIP() {
        return plmIP; }
    public void setPlmIP(String plmIP) {
        this.plmIP = plmIP; }
    public int getPlmPort() {
        return plmPort; }
    public void setPlmPort(int plmPort) {
        this.plmPort = plmPort; }
    public int getPlmTimeOut() {
        return plmTimeOut; }
    public void setPlmTimeOut(int plmTimeOut) {
        this.plmTimeOut = plmTimeOut; }
    public int getPlmRegGroupSize() {
        return plmRegGroupSize; }
    public void setPlmRegGroupSize(int plmRegGroupSize) {
        this.plmRegGroupSize = plmRegGroupSize; }
    public boolean isMainServer() {
        return mainServer; }
    public void setMainServer(boolean mainServer) {
        this.mainServer = mainServer; }
    public String getMailHost() {
        return mailHost; }
    public void setMailHost(String mailHost) {
        this.mailHost = mailHost; }
    public String getMailBox() {
        return mailBox; }
    public void setMailBox(String mailBox) {
        this.mailBox = mailBox; }
    public String getMailPass() {
        return mailPass; }
    public void setMailPass(String mailPass) {
        this.mailPass = mailPass; }
    public String getMailSecur() {
        return mailSecur; }
    public void setMailSecur(String mailSecur) {
        this.mailSecur = mailSecur; }
    public int getMailPort() {
        return mailPort; }
    public void setMailPort(int mailPort) {
        this.mailPort = mailPort; }
    public String getMailToSend() {
        return mailToSend; }
    public void setMailToSend(String mailToSend) {
        this.mailToSend = mailToSend; }
    public boolean isMailNotifycation() {
        return mailNotifycation; }
    public void setMailNotifycation(boolean mailNotifycation) {
        this.mailNotifycation = mailNotifycation; }
    public int getFileScanPeriod() {
        return fileScanPeriod; }
    public void setFileScanPeriod(int fileScanPeriod) {
        this.fileScanPeriod = fileScanPeriod; }
    public int getMainServerPeriod() {
        return mainServerPeriod; }
    public void setMainServerPeriod(int mainServerPeriod) {
        this.mainServerPeriod = mainServerPeriod; }
}
