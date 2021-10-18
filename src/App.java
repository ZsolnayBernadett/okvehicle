/*
 * File: MainController.java
 * Created Date: 2021-09-24 22:21:42
 * Author: Zsolnai Bernadett
 * Github: https://github.com/ZsolnayBernadett
 * -----
 * Last Modified: 2021-10-18
 * Modified By: Zsolnai Bernadett
 * -----
 * Copyright (c) 2021 Sallai Andras
 * 
 * GNU GPL v2
 */

import controllers.MainController;
import views.MainWindow;

public class App {
    public static void main(String[] args) throws Exception {
        MainWindow mainWindow = new MainWindow();
        new MainController(mainWindow);
        mainWindow.setVisible(true);
    }
}
