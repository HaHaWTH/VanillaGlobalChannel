package org.vanillacommunity.solon.repository;

import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Singleton;
import org.vanillacommunity.solon.entity.channel.Channel;

@Singleton(true)
@Component
public class ChannelRepository extends Repository<Integer, Channel> {
    public ChannelRepository() {
        super(Channel::getId);
    }
}