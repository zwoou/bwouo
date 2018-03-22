package bid.woou.bwouo.system;

/**
 * @Author: zwoou
 * @Date: 2018/3/22
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
