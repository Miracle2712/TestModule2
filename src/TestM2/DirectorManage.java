package TestM2;

import java.util.ArrayList;
import java.util.List;

public class DirectorManage implements Manage<Director> {
    FileDirector fileDirector = new FileDirector();
    List<Director> directorList = new ArrayList<>();

    public List<Director> getDirectorList() {
        return directorList;
    }

    public void setDirectorList(List<Director> directorList) {
        this.directorList = directorList;
    }

    public DirectorManage() {
    }

    @Override
    public void add(Director staff) {
        directorList.add(staff);
    }

    @Override
    public void showDirectory() {
        for (int i = 0; i < directorList.size(); i++) {
            System.out.println(directorList.get(i));
        }
    }


    @Override
    public int seach(String name) {
        for (int i = 0; i < directorList.size(); i++) {
            if (directorList.get(i).getName().equals(name)) {
                System.out.println(directorList.get(i));
                return i;
            }
        }
        System.out.println("không có trong danh bạ");
        return -1;
    }



    @Override
    public void edit(String name, Director staff) {
        for (int i = 0; i < directorList.size(); i++) {
            if (directorList.get(i).getName().equals(name)) {
                directorList.set(i, staff);
            }
        }
    }

    @Override
    public void remove(String name) {
        if (seach(name) != -1) {
            directorList.remove(seach(name));
        } else {
            System.out.println("Không tìm được trong danh sách");
        }
    }



}
