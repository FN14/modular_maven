package fn14.study.maven.app;
import com.google.gson.Gson;
import fn14.modular.maven.data.Person;
 
/** 
 * Hello world!
 * 
 */  
public class App 
{ 
    public static void main( String[] args )
    {   
        Gson gson = new Gson();    
        Person ps = new Person("Muhammad Firmansyah"); 
        String json = gson.toJson(ps);
        System.out.println(json);
    }
}
