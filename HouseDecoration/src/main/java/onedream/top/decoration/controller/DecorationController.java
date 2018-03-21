package onedream.top.decoration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yinan.zhang on 2018/3/19.
 */
@Controller
public class DecorationController {

    @RequestMapping("/")
    public String fitsRepoAttrController() {
        return "index";
    }
    @RequestMapping("index")
    public String indexController() {
        return "index";
    }
}
