package org.vanillacommunity.vanillaglobalchannel.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Tools {
    public static List<String> stringToList(String str)
    {
        if(str.length() < 3)return new ArrayList<>();
        return Arrays.asList(str.substring(1, str.length() - 1).split(", "));
    }
}
