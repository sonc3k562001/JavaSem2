import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Bai3Reade {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();

        try{
            Object obj = jsonParser.parse(new FileReader("Bai3.json"));
            JSONObject jsonObject = (JSONObject) obj;
            String header = (String)jsonObject.get("header");
            System.out.println(header);

            JSONArray action = (JSONArray)jsonObject.get("action");
            JSONArray id = (JSONArray)jsonObject.get("id");
            JSONArray item = (JSONArray)jsonObject.get("item");

            Iterator iterator = item.iterator();
            Iterator iterator2 = action.iterator();
            Iterator iterator3 = id.iterator();
            while (iterator.hasNext()){
                System.out.println("action:"+iterator.next());
                System.out.println("id:"+iterator2.next());
                System.out.println("item:"+iterator3.next());
                System.out.println();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
