package com.yuming.boot.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 容器中的组件才能拥有spring的强大功能
 * @author wangyuming
 */
@Data   //get-set
@ToString  //tostring
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ConfigurationProperties(prefix = "datasource")
@Component
public class DBConfig {
    private String driver;
    private String url;
}
