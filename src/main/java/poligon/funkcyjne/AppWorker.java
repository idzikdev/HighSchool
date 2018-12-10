package poligon.funkcyjne;

import poligon.funkcyjne.Repository;
import poligon.funkcyjne.Worker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class AppWorker {
    public static void print(List<Worker> list){
        Iterator<Worker> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static List<Worker> workerList(List<Worker> list, Predicate<Worker> predicate){
        List<Worker> result=new ArrayList<>();
        for (Worker worker:list
             ) {
            if (predicate.test(worker)) result.add(worker);
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        Repository repo=new Repository();
        List<Worker> workers=repo.getWorkerList();
        Predicate<Worker> below30= worker -> worker.getAge()<30;
        print(workerList(workers,below30));
    }
}
