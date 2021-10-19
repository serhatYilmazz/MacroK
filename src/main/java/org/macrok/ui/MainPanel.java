package org.macrok.ui;

import lombok.RequiredArgsConstructor;
import org.macrok.ThreadPool;
import org.macrok.action.Action;
import org.macrok.role.Role;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

@Component
@RequiredArgsConstructor
public class MainPanel {

    private final java.util.List<Role> roles;

    private final Map<String, Future<?>> inActionThreadsMap = new HashMap<>();

    @PostConstruct
    public void init() {
        JFrame jFrame = new JFrame();

        JTabbedPane jTabbedPane = new JTabbedPane();
        jTabbedPane.setBounds(10, 20, 100, 100);
        for (Role role : roles) {
            JPanel jPanelRA = new JPanel();
            createRole(role, jPanelRA);
            jTabbedPane.add(role.getRoleName(), jPanelRA);
        }

        jFrame.add(jTabbedPane);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setAlwaysOnTop(true);
        jFrame.setTitle("MacroK");
        jFrame.setSize(new Dimension(200, 200));
        jFrame.setVisible(true);
    }

    private void createRole(Role role, JPanel jPanelRA) {
        for (Action action : role.getActions()) {
            JButton jButtonAction = new JButton();
            JButton jButtonCancel = new JButton();
            createAction(action, jButtonAction, jButtonCancel);
            jPanelRA.add(jButtonAction);
            jPanelRA.add(jButtonCancel);
        }
    }

    private void createAction(Action action, JButton jButtonAction, JButton jButtonCancel) {
        jButtonAction.setBounds(new Rectangle(100, 100, 100, 100));
        jButtonAction.setText(action.getActionName());
        jButtonAction.addActionListener(e -> {
            Future<?> submit = ThreadPool.executorService().submit(() -> {
                try {
                    action.act(new Robot());
                } catch (AWTException awtException) {
                    awtException.printStackTrace();
                }
            });
            inActionThreadsMap.put(action.getActionName(), submit);
        });
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(e -> {
            try {
                inActionThreadsMap.get(action.getActionName()).cancel(true);
            } catch (Exception e1) {
                System.out.println(action.getActionName() + " is stopped");
            }
        });
    }
}
