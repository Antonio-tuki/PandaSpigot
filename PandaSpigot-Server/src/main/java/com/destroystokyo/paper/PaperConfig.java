package com.destroystokyo.paper;

public class PaperConfig {
    // Dummy PacketLimit class as ViaVersion checks for the existence of this class
    // in order to know whether the server has a built-in packet limiter.
    // See: https://github.com/ViaVersion/ViaVersion/blob/823eb1f3927ae01b3d4ba05c8a83ce34eaf87daf/bukkit/src/main/java/com/viaversion/viaversion/bukkit/platform/PaperViaInjector.java#L71-L73
    public static final class PacketLimit {
    }
}
