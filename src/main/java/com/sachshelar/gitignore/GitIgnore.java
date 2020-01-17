package com.sachshelar.gitignore;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;


public class GitIgnore extends AnAction {

    private static final String FILE_NAME=".gitignore";

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Messages.showInfoMessage("File Added","GitIgnore");
    }
}
