package com.amccloy.letsMod.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Alex on 19/12/14.
 */
public class ConfigurationHandler {

    public static void init(File configFile) {
        //Create the config object from a given file
        Configuration configuration = new Configuration(configFile);

        try {
            //attempt to load config file
            configuration.load();

            //Read in properties from config file
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
        } catch (Exception e) {
            //Log the exception

        } finally {
            //Save the config file
            configuration.save();
        }
    }
}
