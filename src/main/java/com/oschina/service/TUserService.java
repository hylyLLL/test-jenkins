package com.oschina.service;

import com.oschina.entity.TUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface TUserService extends IService<TUser>{
    List<TUser> listByName(String userName);

}
