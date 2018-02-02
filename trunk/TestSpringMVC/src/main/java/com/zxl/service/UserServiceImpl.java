package com.zxl.service;

import java.util.ArrayList;  
import java.util.Arrays;  
import java.util.HashSet;  
import java.util.List;  
import java.util.Map;  
import java.util.Set;  
  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
  
import com.alibaba.fastjson.JSON;  
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.zxl.dao.UserMapper;
import com.zxl.model.User;  

@Service  
public class UserServiceImpl implements IUserService{
	@Autowired  
    private UserMapper userMapper;  
      
    public List<User> getUserList() {  
    	
        List<User> list=userMapper.selectAll();  
        
        return list;  
    }  
}
