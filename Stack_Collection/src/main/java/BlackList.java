import java.util.ArrayList;

public class BlackList {

    private ArrayList<Class> blackList = new ArrayList<Class>();

    public void add(Class classBlackList) {
        if (!checkClass(classBlackList)) {
            blackList.add(classBlackList);
        } else {
            System.out.println("Class is already in BlackList: " + classBlackList.getName());
        }
    }

    public boolean checkClass(Class elem) {
        for (Class elemBlackList : blackList) {
            if (elemBlackList.getName().equals(elem.getName())) {
                return true;
            }
        }
        return false;
    }

    public void viewBlackList() {
        System.out.println(" ----- BlackList -----");
        for (Class elem : blackList) {
            System.out.println(elem.getName());
        }
        System.out.println("----------------------");
    }

    public boolean checkIfInBlackList(Object object) {
        for (Class elem : blackList) {
            if (elem.equals(object.getClass())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Class elem : blackList) {
            builder.append(elem.getName()).append(" ");
        }
        return builder.toString();
    }
}
