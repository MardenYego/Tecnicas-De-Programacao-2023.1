package tecProg;
import java.awt.Color;
import robocode.AdvancedRobot;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;



public class Marden1 extends AdvancedRobot {

	public void run() { 
		setColors(Color.darkGray,Color.darkGray,Color.orange);

		while (true) {
			ahead(90);
			turnLeft(20);
			turnGunRight(360);
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(2);
		System.out.println(this.getName());
	}
	
	public void onHitRobot (HitRobotEvent iNI) {
		turnLeft(iNI.getBearing());
		fire(3);
	}
	
	public void onHitWall(HitWallEvent event) {
		back(100);
		turnLeft(90);
	}
}
