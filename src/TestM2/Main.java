package TestM2;



import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException  {

        DirectorManage directorManage = new DirectorManage();

        Scanner scanner = new Scanner(System.in);
                        int choice1 = 1;

                        while (choice1!=10) {
                            System.out.println("--------------MENU-----------------");
                            System.out.println("Vui long nhap lua chon");
                            System.out.println("" +
                                    "0.  Hiển thị danh bạ\n"+
                                    "1.  Thêm\n" +
                                    "2.  Tìm kiếm\n" +
                                    "3.  Sửa\n"+
                                    "4.  Xóa\n"+
                                    "5. ghi file\n"+
                                    "6  đọc file\n"+
                                    "7. Thoát"
                            );
                            choice1= scanner.nextInt();

                            switch (choice1) {
                                case 0:
                                    directorManage.showDirectory();
                                    break;
                                case 1:
                                    Scanner sc = new Scanner(System.in);
                                    System.out.println("Nhập tên") ;
                                    String ten = sc.nextLine();

                                    sc = new Scanner(System.in);
                                    System.out.println("Nhập địa chỉ");
                                    String diaChi = sc.nextLine();

                                    sc= new Scanner(System.in);
                                    System.out.println("Nhập email ");
                                    String email = sc.nextLine();

                                    sc= new Scanner(System.in);
                                    System.out.println("Nhập facebook ");
                                    String facebook = sc.nextLine();

                                    sc= new Scanner(System.in);
                                    System.out.println("Nhập sex ");
                                    String gioiTinh = sc.nextLine();

                                    sc= new Scanner(System.in);
                                    System.out.println("Nhập group ");
                                    String nhom = sc.nextLine();

                                    sc= new Scanner(System.in);
                                    System.out.println("Nhập birth ");
                                    String sinhNhat = sc.nextLine();

                                    sc= new Scanner(System.in);
                                    System.out.println("Nhập sđt ");
                                    String sdt = sc.nextLine();


                                    Director dir = new Director(ten, diaChi, email,facebook,gioiTinh,nhom,sinhNhat,sdt);
                                    directorManage.add(dir);
                                    directorManage.showDirectory();
                                    break;
                                case 2:
                                    sc = new Scanner(System.in);
                                    System.out.println("Nhập sdt cần tìm");
                                    String timSDT = sc.nextLine();
                                    directorManage.seach(timSDT);
                                    break;

                                case 3:
                                    sc = new Scanner(System.in);
                                    System.out.println("Nhập tên cần sửa trong danh bạ");
                                    String nhanVien = sc.nextLine();

                                    sc = new Scanner(System.in);
                                    System.out.println("Nhập tên nhân viên");
                                    ten = sc.nextLine();

                                    sc = new Scanner(System.in);
                                    System.out.println("Nhập địa chỉ");
                                    diaChi = sc.nextLine();

                                    sc= new Scanner(System.in);
                                    System.out.println("Nhập email ");
                                    email = sc.nextLine();

                                    sc= new Scanner(System.in);
                                    System.out.println("Nhập facebook ");
                                    facebook = sc.nextLine();

                                    sc= new Scanner(System.in);
                                    System.out.println("Nhập sex ");
                                    gioiTinh = sc.nextLine();

                                    sc= new Scanner(System.in);
                                    System.out.println("Nhập group ");
                                    nhom = sc.nextLine();

                                    sc= new Scanner(System.in);
                                    System.out.println("Nhập birth ");
                                    sinhNhat = sc.nextLine();

                                    sc= new Scanner(System.in);
                                    System.out.println("Nhập sđt ");
                                    sdt = sc.nextLine();

                                    directorManage.edit(nhanVien, new Director(ten, diaChi, email,facebook,gioiTinh,nhom,sinhNhat,sdt));

                                    directorManage.showDirectory();
                                    break;


                                case 4:
                                    sc = new Scanner(System.in);
                                    System.out.println("Sđt cần xóa");
                                    String xoa = sc.nextLine();
                                    directorManage.remove(xoa);
                                    break;

                                case 5:
                                    FileDirector.writeToFile(directorManage.getDirectorList());
                                    break;
                                case 6:
                                    FileDirector.readFromFile();
                                    break;
                                case 7:
                                    break;
                            }
                        }
                    }

}