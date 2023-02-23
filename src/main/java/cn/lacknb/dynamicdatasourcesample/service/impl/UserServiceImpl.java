package cn.lacknb.dynamicdatasourcesample.service.impl;

import cn.lacknb.dynamicdatasourcesample.entity.User;
import cn.lacknb.dynamicdatasourcesample.mapper.mysql.UserMapper;
import cn.lacknb.dynamicdatasourcesample.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <h2>  </h2>
 *
 * @description:
 * @menu
 * @author: nbh
 * @description:
 * @date: 2023/2/23 14:48
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
