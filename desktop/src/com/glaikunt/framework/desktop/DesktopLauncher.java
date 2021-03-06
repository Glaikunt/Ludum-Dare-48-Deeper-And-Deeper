package com.glaikunt.framework.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.glaikunt.framework.Display;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		//		config.width = (int) (1440 * .9f);
//		config.height = (int) (900 * .9f);
		config.width = 640;
		config.height = 480;
		config.title = "Virtually Deeper";
		config.resizable = false;
		new LwjglApplication(new Display(), config);
	}
}
