package interview.util;

import java.net.MalformedURLException;

/**
 * Created by Platon Tsybulskyi on 28.02.2017.
 */
public class ReportsUtil {

    public static void error(String errorMessage) throws MalformedURLException {
        System.err.println(errorMessage);
        throw new MalformedURLException(errorMessage);
    }

}
