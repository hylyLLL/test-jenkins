package com.oschina.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.oschina.entity.TUser;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oschina.mapper.TUserRoleMapper;
import com.oschina.entity.TUserRole;
import com.oschina.service.TUserRoleService;
@Service
public class TUserRoleServiceImpl extends ServiceImpl<TUserRoleMapper, TUserRole> implements TUserRoleService{


}
