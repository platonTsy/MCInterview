package interview.util;

import java.util.regex.Pattern;

/**
 * Created by Platon Tsybulskyi on 28.02.2017.
 */
public class ValidationUtils {

    public static final String URL_REGEX = "^((http?)://|(www)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?].*)?$";

    public static boolean isUrl(String url){
        Pattern p = Pattern.compile(URL_REGEX);
        return p.matcher(url).matches();
    }

}
