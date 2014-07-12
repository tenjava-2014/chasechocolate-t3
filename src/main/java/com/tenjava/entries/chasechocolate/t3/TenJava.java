package com.tenjava.entries.chasechocolate.t3;

import org.bukkit.plugin.java.JavaPlugin;

public class TenJava extends JavaPlugin {
    private static TenJava instance;

    @Override
    public void onEnable(){
        instance = this;

        //
    }

    @Override
    public void onDisable(){
        instance = null;

        //
    }

    public static TenJava getInstance(){
        return instance;
    }
}