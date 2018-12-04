package kolko;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class AutoApp {
    public static List<Auto> returnAutos(List<Auto> list, Predicate<Auto> warunek){
        List<Auto> returnList=new ArrayList<>();
        for (Auto auto:list
             ) {
           if (warunek.test(auto)){
               returnList.add(auto);
           }
        }
        return returnList;
    }


    public static void main(String[] args) {
        Auto auto1=new Auto("Ford","Focus",2004,171000);
        Auto auto2=new Auto("Skoda","Fabia",2001,151000);
        Auto auto3=new Auto("Fiat","Panda",2014,17200);
        List<Auto>autoList=new ArrayList<>();
        autoList.add(auto1);
        autoList.add(auto2);
        autoList.add(auto3);
        //System.out.println(autoList);
//        Collections.sort(autoList,new KompModel());
//        System.out.println(autoList);
        Predicate<Auto> predicate2004= auto -> auto.getRocznik()>2004;
        List<Auto> resultList=returnAutos(autoList,predicate2004);
        System.out.println(resultList);

        Predicate<Auto> predicateSkoda= auto -> auto.getMarka().equals("Skoda");
        List<Auto> resultListSkoda=returnAutos(autoList,predicateSkoda);
        System.out.println(resultListSkoda);
    }
}
