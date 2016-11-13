/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneralTree;

import java.util.Date;

/**
 *
 * @author testuser
 */
public class FileDescriptor {
    public String name;
    public Date created;
    public Date last_modified;
    public boolean isDirectory;
    String content; 
    
    FileDescriptor(){
        
    }
    
    FileDescriptor(String name, boolean isDirectory){
        this.name = name;
        this.isDirectory = isDirectory;
    }
    
    FileDescriptor(String name, Date created, boolean isDirectory){
        this.name = name;
        this.created = created;
        this.last_modified = (Date) created.clone();
        this.isDirectory = isDirectory;
    }
}