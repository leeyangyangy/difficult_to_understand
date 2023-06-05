package xyz.leeyangy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录服务提供者
 */
@SpringBootApplication
@MapperScan("xyz.leeyangy.**.mapper")
@RestController
public class ZoneService9001 {
    public static void main(String[] args) {
        SpringApplication.run(
                ZoneService9001.class, args
        );
    }

}
