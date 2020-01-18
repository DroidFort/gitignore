package com.sachshelar.gitignore;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.util.Objects;


public class GitIgnore extends AnAction {

    private static final String FILE_NAME=".gitignore";
    String filePath;
    Application application;

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {

        //Messages.showInfoMessage("File Added","GitIgnore");
        filePath = Objects.requireNonNull(e.getProject()).getBasePath()+ File.separator+FILE_NAME;

        if (!new File(filePath).exists()){

            application = ApplicationManager.getApplication();
            application.executeOnPooledThread(new Runnable() {
                @Override
                public void run() {
                    try {
                        e.getProject().getBaseDir().createChildData(this,FILE_NAME);

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            });

        }else{
            //Show notification
        }


    }
}
