package sample.Program;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class AddFileSubject {

    public void main() throws JSONException {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("subjects.json"));
            JSONObject jsonObject = new JSONObject();
            String nameSubject = (String) jsonObject.get("NameSubject");
            String idSubject = (String) jsonObject.get("IDSubject");
            String status = (String) jsonObject.get("Status");
            String toSubject = (String) jsonObject.get("toSubject");
            String toIDSubject = (String) jsonObject.get("toIDSubject");
            JSONArray beforeThisSubject = (JSONArray) jsonObject.get("BeforeThisSubject");
//            Subject subject = new Subject()


        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    File file = new File("Subject.txt");
//    private ArrayList<Subject> addSJ;
//
//    public AddFileSubject() throws IOException {
//        readFileSubjects(file);
//        addSJ = new ArrayList<>();
//    }
//
//    public void readFileSubjects(File file) throws IOException {
//        try {
//            FileReader fileReader = new FileReader(file);
//            BufferedReader reader = new BufferedReader(fileReader);
//
//            String line = "";
//            while ((line = reader.readLine()) != null) {
//                String[] checkSubject = line.split(" ");
//
//
//            }
//
//        } catch (IOException e) {
//
//        }
//    }

}
