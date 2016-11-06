import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.project.Project;

public class asd extends AnAction {

    public void actionPerformed(AnActionEvent e) {
        Messages.showMessageDialog("Hello, I am glad to see you.", "Information", Messages.getInformationIcon());
    }
}
