package firefighter.dataserver;

import com.google.gson.Gson;
import firefighter.core.API.RestAPIBase;
import firefighter.core.DBRequest;
import firefighter.core.constants.ConstList;
import firefighter.core.constants.Values;
import firefighter.core.constants.ValuesBase;
import firefighter.core.entity.EntityList;
import firefighter.core.entity.baseentityes.JLong;
import firefighter.core.entity.baseentityes.JString;
import firefighter.core.entity.users.Person;
import firefighter.core.entity.users.User;
import firefighter.core.utils.City;
import firefighter.core.utils.Street;
import retrofit2.Response;

import java.util.ArrayList;

public class DBExample implements I_DBTarget<RestAPIBase> {
    private static void putId(Response<JLong> ans){
        if (!ans.isSuccessful())
            System.out.println(ans.message());
        else
            System.out.println("id="+ans.body());
    }
    static EntityList<City> cityList=new EntityList<>();
    static EntityList<Street> strList=new EntityList<>();
    static EntityList<User> ulist=new EntityList<>();
    static EntityList<Person> plist = new EntityList<>();
    static Gson gson = new Gson();


    @Override
    public void createAll(RestAPIBase service, String pass) {
        try {
            String token = service.debugToken(Values.DebugTokenPass).execute().body().getValue();
            Response<JString> res = service.clearDB(token,Values.DebugTokenPass).execute();
            System.out.println(res.body());
            System.out.println(service.getConstAll(token).execute().body());
            ArrayList<ConstList> constList = service.getConstByGroups(token).execute().body();
            System.out.println(constList);
            putId(service.addUser(token,new User(Values.UserGuestType,"Гость","","","Гость","112233","89335555555")).execute());
            putId(service.addUser(token,new User(Values.UserAdminType,"Админ","Павел","Ильич","tt2","1234","89136666666")).execute());
            ulist = service.getUserList(token,Values.GetAllModeActual,0).execute().body();
            System.out.println(ulist);
            //------------------------- Улицы и НП
            service.addEntity(token,new DBRequest(new City("Новосибирск"),gson),0).execute();
            service.addEntity(token,new DBRequest(new City("Бердск"),gson),0).execute();
            service.addEntity(token,new DBRequest(new City("Коченево",Values.CCountry),gson),0).execute();
            cityList.load(service.getEntityList(token,"City",Values.GetAllModeActual,0).execute().body());
            System.out.println(cityList);
            service.addEntity(token,new DBRequest(new Street("Немировича-Данченко",Values.SStreet,cityList.get(0).getOid()),gson),0).execute();
            service.addEntity(token,new DBRequest(new Street("Экваторная",Values.SStreet,cityList.get(0).getOid()),gson),0).execute();
            service.addEntity(token,new DBRequest(new Street("Ватутина",Values.SStreet,cityList.get(0).getOid()),gson),0).execute();
            service.addEntity(token,new DBRequest(new Street("Гоголя",Values.SStreet,cityList.get(0).getOid()),gson),0).execute();
            service.addEntity(token,new DBRequest(new Street("Фрунзе",Values.SStreet,cityList.get(0).getOid()),gson),0).execute();
            service.addEntity(token,new DBRequest(new Street("Геодезическая",Values.SStreet,cityList.get(0).getOid()),gson),0).execute();
            service.addEntity(token,new DBRequest(new Street("Карла Маркса",Values.SProspect,cityList.get(0).getOid()),gson),0).execute();
            service.addEntity(token,new DBRequest(new Street("Ольги Жилиной",Values.SStreet,cityList.get(0).getOid()),gson),0).execute();
            service.addEntity(token,new DBRequest(new Street("Крылова",Values.SStreet,cityList.get(0).getOid()),gson),0).execute();
            service.addEntity(token,new DBRequest(new Street("Ленина",Values.SStreet,cityList.get(0).getOid()),gson),0).execute();
            service.addEntity(token,new DBRequest(new Street("Ленина",Values.SStreet,cityList.get(1).getOid()),gson),0).execute();
            service.addEntity(token,new DBRequest(new Street("Ленина",Values.SStreet,cityList.get(2).getOid()),gson),0).execute();
            strList.load(service.getEntityList(token,"Street",Values.GetAllModeActual,1).execute().body());
            System.out.println(strList);
            City city = cityList.get(0);
            //--------------------- Контрагенты ------------------------------------------------------------------------
            Person person = new Person("Иванов","Иван","Иванович","директор","9139999999","111@ru.ru");
            service.addEntity(token,new DBRequest(person,gson),1).execute();
            person = new Person("Петров","Иван","Иванович","директор","9139999990","222@ru.ru");
            service.addEntity(token,new DBRequest(person,gson),1).execute();
            person = new Person("Зайкова","Мария","Петровна","глав.бух.","9139999997","333@ru.ru");
            service.addEntity(token,new DBRequest(person,gson),1).execute();
            person = new Person("Волкова","Мария","Петровна","глав.бух.","9139999994","444@ru.ru");
            service.addEntity(token,new DBRequest(person,gson),1).execute();
            person = new Person("Зуева","Мария","Петровна","инженер","9139999991","444@ru.ru");
            service.addEntity(token,new DBRequest(person,gson),1).execute();
            person = new Person("Минаева","Мария","Петровна","инженер","9139999992","444@ru.ru");
            service.addEntity(token,new DBRequest(person,gson),1).execute();
            plist.load(service.getEntityList(token,"Person",Values.GetAllModeActual,0).execute().body());
            //-----------------------------------------------------------------------------------
        } catch (Exception ex) {
            System.out.println(ex.toString()+"\n");
            }
        }
    }

