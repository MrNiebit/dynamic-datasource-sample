package cn.lacknb.dynamicdatasourcesample.mapper.mysql;

import cn.lacknb.dynamicdatasourcesample.entity.User;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <h2>  </h2>
 *
 * @description:
 * @menu
 * @author: nbh
 * @description:
 * @date: 2023/2/23 14:44
 **/
@DS("mysql")
public interface UserMapper extends BaseMapper<User> {
}
