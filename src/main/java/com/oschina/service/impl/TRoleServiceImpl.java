package com.oschina.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oschina.entity.TRole;
import com.oschina.mapper.TRoleMapper;
import com.oschina.service.TRoleService;
@Service
public class TRoleServiceImpl extends ServiceImpl<TRoleMapper, TRole> implements TRoleService{


}
