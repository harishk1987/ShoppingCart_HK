/**
 * 
 */
package Login;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @author Lenovo
 *
 */
public class LoginTest {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
		// TODO Auto-generated method stub
			//Step 1: parse json physical file into java object using json parse class
		JSONParser par = new JSONParser();
		Object obj = par.parse(new FileReader("./Data/CommonData.json"));
		//step2 : Convert java object into json object using downcasting
		
		JSONObject map = (JSONObject) obj;
		//Step 3:get the value from json file
		System.out.println(map.get("url"));
		System.out.println(map.get("browser"));
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
		
		
	}

}
