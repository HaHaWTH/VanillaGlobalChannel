package org.vanillacommunity.solon.entity.provider;

import org.noear.solon.core.message.Session;
import org.vanillacommunity.solon.api.enums.PlatformType;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 在线的消息提供者对象
 */
public class OnlineProvider extends Provider{
    // 连接信息
    Session session;
    // 建立连接的时间
    Date onlineTime;
    // 当前在线的设备
    Set<PlatformType> onlinePlatforms;
    public OnlineProvider(String account, String token, Set<PlatformType> allowedPlatforms,Session session,Date onlineTime) {
        super(account, token, allowedPlatforms);
        this.session = session;
        this.onlineTime = onlineTime;
        this.onlinePlatforms = new HashSet<>();
    }
}