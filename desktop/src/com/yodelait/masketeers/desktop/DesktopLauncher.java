package com.yodelait.masketeers.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.yodelait.masketeers.GraphicsDemo;
import com.yodelait.masketeers.HelloWorld;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		//new LwjglApplication(new HelloWorld(), config);
                new LwjglApplication(new GraphicsDemo(), config);
	}
}
