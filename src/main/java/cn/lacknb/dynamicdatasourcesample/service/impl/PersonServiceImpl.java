package cn.lacknb.dynamicdatasourcesample.service.impl;

import cn.lacknb.dynamicdatasourcesample.entity.Person;
import cn.lacknb.dynamicdatasourcesample.mapper.clickhouse.PersonMapper;
import cn.lacknb.dynamicdatasourcesample.service.PersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <h2>  </h2>
 *
 * @description:
 * @menu
 * @author: nbh
 * @description:
 * @date: 2023/2/23 14:49
 **/
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements PersonService {
}
