package AbstractClasses;

import MainClasses.CheckPasswordUser;

public interface  Checker {

      float getPercentage();
      CheckPasswordUser checkForSpecialChars(String pass);
      CheckPasswordUser checkNumberPassword();
      CheckPasswordUser checkUperCaseAndDownCase(String pass);
      CheckPasswordUser checkPassworLenght(String pass);
      int languageInterface(String x);
}
