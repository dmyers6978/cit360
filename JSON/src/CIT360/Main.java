package CIT360;
import org.json.simple.JSONObject;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Scanner;

public class Main {


        public static <JSONOutputStream, JSONInputStream, TestObject> void main(String[] args) throws IOException {

            JSONObject person = new JSONObject();
            System.out.println("What is your first name?");
            Scanner firstNameIn = new Scanner(System.in);
            String firstName = firstNameIn.next();
            person.put("firstName",firstName);
            System.out.println("What is your last name?");
            Scanner lastNameIn = new Scanner(System.in);
            String lastName = lastNameIn.next();
            person.put("lastName",lastName);
            System.out.println("What is your age?");
            Scanner ageIn = new Scanner(System.in);
            String age = ageIn.next();
            person.put("age",new Integer(age));
            Integer counter = 0;
            while(counter.equals(0)) {
                System.out.println("What is your gender? (M/F)");
                Scanner genderIn = new Scanner(System.in);
                String gender = genderIn.next();
                if (gender.equals("M") || gender.equals("F")) {
                    if(gender.equals("M")) {
                        person.put("isMale", new Boolean(true));
                    } else{
                        person.put("isMale",new Boolean(false));
                    }
                    counter++;
                }
            }


            StringWriter out = new StringWriter();
            person.writeJSONString(out);
            String jsonText = out.toString();
            System.out.print(jsonText);

            System.out.println("\nName: "+person.get("firstName")+" "+person.get("lastName"));
            System.out.println("Age: "+person.get("age"));
            if(person.get("isMale").equals(true)){
                System.out.println("Gender: male");
            } else{
                System.out.println("Gender: female");
            }


        }
}








