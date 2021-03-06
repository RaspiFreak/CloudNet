/*
 * Copyright (c) Tarek Hosni El Alaoui 2017
 */

package de.dytanic.cloudnet.lib.server.version;

import de.dytanic.cloudnet.lib.MultiValue;

/**
 * Created by Tareko on 27.08.2017.
 */
public enum ProxyVersion {

    TRAVERTINE,
    BUNGEECORD,
    WATERFALL,
    HEXACORD;

    public static MultiValue<String, String> url(ProxyVersion proxyVersion)
    {
        switch (proxyVersion)
        {
            case TRAVERTINE:
                return new MultiValue<>("https://yivesmirror.com/files/travertine/Travertine-b10.jar", "Travertine.jar");
            case HEXACORD:
                return new MultiValue<>("https://yivesmirror.com/files/hexacord/HexaCord-v162.jar", "HexaCord.jar");
            case WATERFALL:
                return new MultiValue<>("https://yivesmirror.com/files/waterfall/Waterfall-138.jar", "Waterfall.jar");
            default:
                return new MultiValue<>("https://ci.md-5.net/job/BungeeCord/lastSuccessfulBuild/artifact/bootstrap/target/BungeeCord.jar", "BungeeCord.jar");
        }
    }

}