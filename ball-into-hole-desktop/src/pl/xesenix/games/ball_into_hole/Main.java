package pl.xesenix.games.ball_into_hole;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "ball-into-hole";
		cfg.useGL20 = false;
		cfg.width = 480;
		cfg.height = 320;
		
		new LwjglApplication(new BallIntoHole(), cfg);
	}
}
