package org.usfirst.frc4226.Huskies.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Auto_03_Peg_Right extends CommandGroup {

	private static double HEADINGTOPEG = -60;
    public Auto_03_Peg_Right() {
    	addSequential(new Reset_Gyro(),1);
    	addSequential(new Drive_For_Distance_WithHeading0(0.75,76.0,0.0));
    	addSequential(new Drive_Turn_To_Setpoint(HEADINGTOPEG),2);
    	addSequential(new Drive_For_Distance(0.5,12.0),2);
    	addSequential(new SolenoidOpen());
    	addSequential(new Drive_For_Distance(-0.75,10.0),5);
    	addSequential(new SolenoidClose());
    }
}
