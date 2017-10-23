/**    
* @Title: IUserService.java  
* @Package com.cn.hnust.service  
* @Description:
* @author 蔡海峰
* @date 2017年10月23日 下午5:17:16  
* @version V1.0    
*/
package com.cn.hnust.service;

import com.cn.hnust.entity.User;

/**
 * 
 * @ClassName:     IUserService   
 * @Description:    
 * @author:        caihaifeng
 * @date:          2017年10月23日 下午5:17:16 
 *
 * 
 */
	public interface IUserService {  
	    public User getUserById(int userId);  
	}  
