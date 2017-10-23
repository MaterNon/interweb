/**    
* @Title: UserController.java  
* @Package com.cn.hnust.controller  
* @Description:
* @author 蔡海峰
* @date 2017年10月23日 下午5:38:24  
* @version V1.0    
*/
package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.entity.User;
import com.cn.hnust.service.IUserService;

/**
 * 
 * @ClassName:     UserController   
 * @Description:    
 * @author:        caihaifeng
 * @date:          2017年10月23日 下午5:38:24 
 *
 * 
 */
@Controller  
@RequestMapping("/user")  
public class UserController {
	 @Resource  
	    private IUserService userService;  
	      
	    @RequestMapping("/showUser")  
	    public String toIndex(HttpServletRequest request,Model model){  
	        int userId = Integer.parseInt(request.getParameter("id"));  
	        User user = this.userService.getUserById(userId);  
	        model.addAttribute("user", user);  
	        return "showUser";  
	    }  
	}  
