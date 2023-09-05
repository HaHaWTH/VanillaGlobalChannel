package org.wolflink.minecraft.file;

import lombok.Getter;
import org.spongepowered.configurate.CommentedConfigurationNode;
import org.spongepowered.configurate.yaml.YamlConfigurationLoader;
import org.wolflink.common.ioc.IOC;
import org.wolflink.common.ioc.Singleton;
import org.wolflink.minecraft.interfaces.ILogger;

import java.io.IOException;
import java.nio.file.Path;

@Getter
@Singleton
public class Configuration extends YamlConfiguration {

    private String centralServerIp = "";
    private String centralServerPort = "";
    private String account = "";
    private String password = "";
    private int channelId = 1;

    public Configuration() {
        // TODO 改为 PlatformAdapter 提供的数据文件夹路径
        super("GlobalChannel/config.yml");
    }

    public void load() {
        loadRoot();
        if(root == null) return;
        centralServerIp = root.node("CentralServer").node("Ip").getString("");
        centralServerPort = root.node("CentralServer").node("Port").getString("");
        account = root.node("User").node("Account").getString("");
        password = root.node("User").node("Password").getString("");
        channelId = root.node("User").node("ChannelId").getInt(1);
    }
}