package interview;

import com.themidnightcoders.interview.util.ReportsUtil;
import com.themidnightcoders.interview.util.ValidationUtils;

import java.net.MalformedURLException;

/**
 * Created by Platon Tsybulskyi on 28.02.2017.
 */
public class Start {

    public static void main(String[] args) throws MalformedURLException {
        if (args.length <= 0) {
            ReportsUtil.error("You should pass URL as parameter!");
        } else {
            String url = args[0];
            beforeTaskProcess(url);
        }
    }

    private static void beforeTaskProcess(String url) throws MalformedURLException {
        if (!ValidationUtils.isUrl(url)){
            ReportsUtil.error("You should pass correct URL as parameter!\nPlease, try again");
        }
    }

}
