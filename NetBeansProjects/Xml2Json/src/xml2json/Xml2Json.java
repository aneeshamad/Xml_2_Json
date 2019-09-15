
package xml2json;

import org.json.JSONException;

/**
 *
 * @author aneeshamad
 */
public class Xml2Json {

    /**
     * @param args the command line arguments
     * @throws org.json.JSONException
     */
    public static void main(String[] args) throws JSONException {
        
        // To Test  
        String xml_data1 = "<student>"
                + "<name>Anees Hamad</name>"
                + "<age>22</age>"
                + "</student>";
        
        String xml_data2 ="<?xml version=”1.0” encoding=”UTF-8”?> "+"<note>"+
                         "<to>Tovee</to>"+
                         "<from>Jani</from>"+
                         " <heading>Reminder</heading>"+
                         "<body> Don’t forget me this weekend!</body>"+
                         "</note> ";
         
        Xml_2_Json_Adapter xml_2_json =new Xml_2_Json_Adapter ();
        
        String Json_data1 =  xml_2_json.convert(xml_data1).toString();
        String Json_data2 =  xml_2_json.convert(xml_data2).toString();
        System.out.print(Json_data1+"\n");
        System.out.print(Json_data2+"\n");

    }
    
}
