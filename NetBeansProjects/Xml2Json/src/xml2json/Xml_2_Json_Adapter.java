/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml2json;

/**
 *
 * @author aneeshamad
 */

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;



public class Xml_2_Json_Adapter {
    
//converting xml to json

public JSONObject convert(String xml) throws JSONException {

        if(xml == null || xml.isEmpty()) {

            return null;
        }

        return XML.toJSONObject(xml);
    
}
}