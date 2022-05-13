package TestM2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileDirector {
    public static void writeToFile (List<Director> staffList) throws IOException {
        // Chuyên để đọc File
        File file = new File("C:\\Users\\PC\\Desktop\\TestM2\\src\\TestM2\\staffout.csv");
        file.createNewFile();
        PrintWriter pw = new PrintWriter(file);
        String str = "tên,địa chỉ,email,facebook,giới tính,nhóm,sinh nhật,sđt" +"\n";
        for (Director i: staffList) {
            str += i.getName()  +","+ i.getAddress() +","+ i.getEmail() +","+ i.getFacebook() +","+ i.getSex() +","+ i.getGroup() +","+ i.getBirth() +","+ i.getPhoneNumber() +"\n";
        }
        pw.write(str);
        pw.close();
    }

    // Chuyên ghi file
    public static List<Director>  readFromFile() throws IOException {
        List<Director> directorList = new ArrayList<>();
        File file = new File("C:\\Users\\PC\\Desktop\\TestM2\\src\\TestM2\\staffout.csv");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String a = sc.nextLine();
            if(a.equals("")){
                break;
            }
            System.out.println(a);
        }
        sc.close();
        return directorList;
    }
}

