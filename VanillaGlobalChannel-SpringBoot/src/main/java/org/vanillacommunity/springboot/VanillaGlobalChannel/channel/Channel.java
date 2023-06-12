package org.vanillacommunity.springboot.VanillaGlobalChannel.channel;

import lombok.Data;

@Data
public class Channel {

    private int id;
    private String displayname;
    private String announcement;

    @Override
    public String toString()
    {
        return id+"/"+displayname+"/"+announcement;
    }
}
