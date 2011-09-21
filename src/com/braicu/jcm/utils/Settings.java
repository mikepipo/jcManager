package com.braicu.jcm.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Properties;

public class Settings {
	
    public static SortedProperties props;
    private static String PROPERTIES_FILE = "jcManager.config"; 

    private static int selectedReader = -1;
    
    public static int getSelectedReader() {
		return selectedReader;
	}

	public static void setSelectedReader(int selectedReader) {
		Settings.selectedReader = selectedReader;
	}

	public static void initContext(){
        try {
            props = new SortedProperties();
            File f = new File(PROPERTIES_FILE);
            FileInputStream fos;
            fos = new FileInputStream(f);
            props.load(fos);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }      
    }
 
    public static void saveContext() {
        File f = new File(PROPERTIES_FILE);
        try {
        FileWriter fw = new FileWriter(f);
        props.store(fw,"");
        }
        catch(Exception e){
        	e.printStackTrace();
        }
    }
    
    public static boolean isDebugMode(){
    	if (props.getProperty("DebugMode").equalsIgnoreCase("1"))
    		return true;
    	return false;
    }
}
