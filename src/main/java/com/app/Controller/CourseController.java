package com.app.Controller;

import com.app.Model.Model;

public class CourseController {
    public void onDashboard() {
        Model.getInstance().getViewFactory().getSelectedMenuItem().set("dashboard");
    }
}
