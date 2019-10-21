package cn.edu.mju.hotel.controller;

import cn.edu.mju.hotel.model.User;
import cn.edu.mju.hotel.service.UserService;
import cn.edu.mju.hotel.utils.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;
	
	public void method(){
		System.out.print();
        System.out.println("Hello");
		return;
	}

    public void test(){
        System.out.println("test");
    }

    /**
     * 展示用户管理界面。
     *
     * @return
     */
    @GetMapping("/list.html")
    public String list() {
        System.out.print("==========" + userService.queryByPrimaryKey(1));
        return "user/list.html";
    }

    /**
     * 保存用户。
     *
     * @return
     */
    @ResponseBody
    @PostMapping("/add")
    public AjaxResult add(User user) {
        AjaxResult ret = new AjaxResult();
        return ret;
    }

    /**
     * 删除用户。
     *
     * @return
     */
    @ResponseBody
    @PostMapping("/delete")
    public AjaxResult delete(String ids) {
        AjaxResult ret = new AjaxResult();
        return ret;
    }

    /**
     * 更新用户。
     *
     * @return
     */
    @ResponseBody
    @PostMapping("/update")
    public AjaxResult update(User user) {
        AjaxResult ret = new AjaxResult();
        return ret;
    }

    /**
     * 查询用户。
     *
     * @return
     */
    @ResponseBody
    @PostMapping("/query")
    public AjaxResult query() {
        AjaxResult ret = new AjaxResult();
        return ret;
    }

}
