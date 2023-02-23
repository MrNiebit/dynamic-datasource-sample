package cn.lacknb.dynamicdatasourcesample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author gitsilence
 */
@SpringBootApplication
@MapperScan("cn.lacknb.dynamicdatasourcesample.mapper")
public class DynamicDatasourceSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDatasourceSampleApplication.class, args);
    }

}
