package sample;

import java.io.*;
import java.util.ArrayList;

public class Subject {
    private ArrayList<AddSubject> subjectList = new ArrayList<>();

    public static String subjID;
    private static String status;
    private static String toSubjID;

    public Subject() throws IOException {
        readSubjectFile();
    }

    public void readSubjectFile() throws IOException {
        BufferedReader readfile = new BufferedReader(new FileReader("SubjectP.txt"));

        String tmp = readfile.readLine();
        while (tmp != null) {
            String[] arr = tmp.split(" ");
            subjID = arr[0];
            status = arr[1];
            toSubjID = arr[2];

            if (status.equals("N")){

            }
        }
//
//        static class AddSubject {
//            public String subjID;
//            public String status;
//            public String preSubID;
//
//            public AddSubject(String subjID, String status, String preSubID) {
//                this.subjID = subjID;
//                this.status = status;
//                this.preSubID = preSubID;
//            }
//        }
    }
}
