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
 * @date: 2023/2/23 14:41
 **/
@Data
@TableName("users")
public class User {

    @TableId
    private String username;

    private String password;

    private Integer enabled;

}
