package net.aooms.core.property;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * application.yml 配置文件映射
 * Created by 风象南(cheereebo) on 2018-02-06
 */
@Component
@ConfigurationProperties(prefix="spring.application")
public class PropertyApplication {

    private String name;

    private boolean aoomsUseRegistry;

    public String getName() {
        return name;
    }

    public String getServiceName() {
        if(StringUtils.isEmpty(name)){
            return "";
        }
        return name.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAoomsUseRegistry() {
        return aoomsUseRegistry;
    }

    public void setAoomsUseRegistry(boolean aoomsUseRegistry) {
        this.aoomsUseRegistry = aoomsUseRegistry;
    }
}