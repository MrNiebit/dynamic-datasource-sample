package cn.lacknb.dynamicdatasourcesample.mapper.clickhouse;

import cn.lacknb.dynamicdatasourcesample.entity.Person;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <h2>  </h2>
 *
 * @description:
 * @menu
 * @author: nbh
 * @description:
 * @date: 2023/2/23 14:45
 **/
@DS("clickhouse")
public interface PersonMapper extends BaseMapper<Person> {
}
