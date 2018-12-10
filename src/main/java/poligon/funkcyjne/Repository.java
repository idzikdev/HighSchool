package poligon.funkcyjne;

import lombok.Getter;
import poligon.funkcyjne.Worker;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


@Getter
public class Repository {
    private List<Worker> workerList;
    public void addWorker(Worker worker){
        workerList.add(worker);
    }

    public Repository() throws IOException {
        workerList=new ArrayList<>();
        List<String> stringList= Files.readAllLines(Paths.get("src/main/java/poligon/funkcyjne/mock_data.csv"));
        for (String el:stringList
             ) {
            String [] els=el.split(",");
            workerList.add(
                    new Worker(
                            els[0],
                            els[1],
                            Integer.valueOf(els[2]),
                            Double.valueOf(els[3])
                    )
            );
        }
    }
}
