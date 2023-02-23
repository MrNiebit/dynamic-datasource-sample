package cn.lacknb.dynamicdatasourcesample.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <h2>  </h2>
 *
 * @description:
 * @menu
 * @author: nbh
 * @description:
 * @date: 2023/2/23 14:43
 **/
@Data
@TableName("test_person")
public class Person {

    @TableId
    private Integer id;

    private String name;

    private String provinceName;

}
