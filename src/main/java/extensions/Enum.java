package extensions;

import utilities.CommonOps;

public class Enum extends CommonOps {

    public enum myPageState {
        pageType
    }
    public static myPageState yourPage(String value) {

        if (value.equals("mainPage")) {
            return myPageState.pageType;
        } else {
            return null;
        }
    }
}
