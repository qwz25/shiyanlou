package com.imooc.pay.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "wx")
@Data
public class WxAccountConfig {
    private String appId;
    private String mchId;
    private String mchkey;
    private String notifyUrl;
    private String returnUrl;
}
