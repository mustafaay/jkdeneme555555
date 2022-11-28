package utilities;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class ObjectMapperUtils {

    // new ObjectMapper().readValue(jsonInString, HashMap.class);

    private static ObjectMapper mapper;

    static {
        mapper=new ObjectMapper();
    }

    // 1. Method: Json datasini Java Objesine cevirir(De-Serialization)

    public  static <T> T convertJsonToJava(String json,Class <T> cls){ // Generic Method (Her turlu data tipiyle calisan method)

        T javaResult= null;
        try {
           javaResult= mapper.readValue(json,cls);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return javaResult;
    }


}
