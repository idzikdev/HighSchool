package kolko;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AutoApp {
    public static void main(String[] args) {
        Auto auto1=new Auto("Ford","Focus",2004,171000);
        Auto auto2=new Auto("Skoda","Fabia",2001,151000);
        Auto auto3=new Auto("Fiat","Panda",2014,17200);
        List<Auto>autoList=new ArrayList<>();
        autoList.add(auto1);
        autoList.add(auto2);
        autoList.add(auto3);
        //System.out.println(autoList);
        Collections.sort(autoList,new KompModel());
        System.out.println(autoList);
    }
}
