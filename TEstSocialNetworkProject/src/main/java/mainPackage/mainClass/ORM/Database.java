package mainPackage.mainClass.ORM;

import mainPackage.mainClass.User;

public class Database extends Executor {




    public boolean createUser(User user){
        // code

    }


    @Override
    boolean createTable() {
        return false;
    }

    @Override
    boolean deleteTable() {
        return false;
    }

    @Override
    boolean insertTable() {
        return false;
    }

    @Override
    boolean deleteBlockTable() {
        return false;
    }

//    @Override
//    public boolean createDataBase(String name) {
//        return super.createDataBase(name);
//    }
}
