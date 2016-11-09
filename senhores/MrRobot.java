package senhores;
import robocode.*;


public class MrRobot extends JuniorRobot
{

	public void run() {
	
		setColors(green, yellow, blue, white, black);

	
		while(true) {
			
			
			ahead(100);
			turnLeft(45);
						
			turnGunRight(360);
			
			
		}
	}


	public void onScannedRobot() {
	
		turnGunTo(scannedAngle);
		if(scannedDistance < 50){
			fire (3);
		}
		else{
			fire(1);
		}
		
	}


	public void onHitByBullet() {
	
		turnGunTo(hitByBulletAngle);	
		fire(0.5);	
		turnRight(90);
		ahead(100);

		
	}
	

	public void onHitWall() {
	
		turnTo(hitWallAngle + 180);
		ahead(100);
	}	
	public void onHitRobot(){
		turnGunTo(hitRobotAngle);
		fire(1);
		turnTo(hitRobotAngle);
		back(100);
	}
}
