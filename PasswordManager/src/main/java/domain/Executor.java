package domain;

import java.sql.SQLException;

public class Executor extends DataBase{



    // Run Work

    @Override
    boolean createD(Query query) {
        return false;
    }

    @Override
    boolean createT(Query query) {
        return false;
    }

    @Override
    boolean dropD(Query query) {
        return false;
    }

    @Override
    boolean deleteT(Query query) {
        return false;
    }

    @Override
    boolean insertT(Query query) {
        return false;
    }







}
