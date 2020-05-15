package edamanAPI;

import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


//public class MainStart {
//    
//
//    public static void main(String[] args){
//
//
//   }


public class edaman {
	private  HttpURLConnection connection;
    private  String foodItem;
    private  String query;
    
    //Method 1 : Java.net.HttpURLConnection
    private BufferedReader reader;
    
    private String line;
    private StringBuffer responseContent =  new StringBuffer();
    
    private Scanner input  = new Scanner(System.in);
    
    
    public edaman() {
		
	}
    
    public String getCaloricValue(String queryString) {
    	String Result = "";
    	
    	//System.out.println("Please enter a food item: ");
        this.foodItem = queryString;
        		
        query = foodItem.replace(" ","%20");
        System.out.println("FoodItem - " + foodItem + "\nQuery - " + query);
        
        
        try {
            URL url = new URL("https://api.edamam.com/api/nutrition-data?app_id=ecaaac31&app_key=2ac7954552432529c3c90cbf478e2826&ingr="+ query);
            //URL url = new URL("http://jsonplaceholder.typicode.com/albums");
            connection = (HttpURLConnection) url.openConnection();

            //Request Setup
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();
            System.out.println(status);

            if (status > 299){
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));

                while((line = reader.readLine())!= null){
                    responseContent.append(line);
                }
                reader.close();
            } else {

                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while((line = reader.readLine())!= null){
                    responseContent.append(line);
                }
                reader.close();
            }

            System.out.println(responseContent.toString());


            Result = parse(responseContent.toString());


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            connection.disconnect();
        }
        
        return Result;
        
    }
        
        
       
       private String parse(String responseBody){
            Gson gson;
            ENERCKCAL__ calorie; //= new ENERCKCAL();
            PROCNTKCAL protein;// = new PROCNTKCAL();
            FATKCAL fat;// = new FATKCAL();
            CHOCDFKCAL carbs;// = new CHOCDFKCAL();
           gson = new Gson();
           Result result = gson.fromJson(responseBody,Result.class);
           TotalNutrientsKCal totalnutrients = result.getTotalNutrientsKCal();
           calorie = totalnutrients.getENERCKCAL();
           protein = totalnutrients.getPROCNTKCAL();
           fat = totalnutrients.getFATKCAL();
           carbs = totalnutrients.getCHOCDFKCAL();
           
           
           String text = "Ingredients: " + foodItem +" \n" + "Total Calories: " + calorie.getQuantity() + "\nProtein: " + protein.getQuantity() + "\nFat: " + fat.getQuantity() + "\nCarbs: " + carbs.getQuantity();

           return text;
       }
        
        
	

}
