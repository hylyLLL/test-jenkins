package com.oschina.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.oschina.entity.TUserRole;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oschina.entity.TUser;
import com.oschina.mapper.TUserMapper;
import com.oschina.service.TUserService;
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService{
    @Override
    public List<TUser> listByName(String userName) {
        LambdaQueryWrapper<TUser> query=new LambdaQueryWrapper<>();
        query.like(TUser::getName,userName);

        List<TUser> tUserRoles = this.baseMapper.selectList(query);
        tUserRoles.forEach(item->{
            System.out.println(item.getName());
            System.out.println(item.getId());
        });
        return tUserRoles;
    }
}
