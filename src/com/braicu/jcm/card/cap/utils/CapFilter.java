package com.braicu.jcm.card.cap.utils;

import java.io.File;
import javax.swing.filechooser.*;

public class CapFilter extends FileFilter {

    // Accept all directories and all cap files.
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

	if (f != null) {
            if (f.getName().toLowerCase().endsWith(".cap")) {
                    return true;
            } else {              
                return false;
            }
    	}

        return false;
    }

    // The description of this filter
    public String getDescription() {
        return "*.cap (CAP files)";
    }



}
