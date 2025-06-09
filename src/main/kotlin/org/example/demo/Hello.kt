package org.example.demo

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class Hello : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        println("Hello")  // Logs to IDEA's log console
        Messages.showMessageDialog("Hello", "Greeting", Messages.getInformationIcon())

    }
}
