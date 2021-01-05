package AbstractClasses;

import MainClasses.CheckPasswordUser;

public interface ProcessingData {

    String resultCheck(CheckPasswordUser cpu);
    String recomondedPassword();
}
