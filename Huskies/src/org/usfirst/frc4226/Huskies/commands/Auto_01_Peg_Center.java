package org.usfirst.frc4226.Huskies.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Auto_01_Peg_Center extends CommandGroup {

    public Auto_01_Peg_Center() {
        
    	addSequential(new Reset_Gyro(),1);
    	addSequential(new Drive_For_Distance_WithHeading0(0.75,81.0,0.0));
    	addSequential(new SolenoidOpen());
    	addSequential(new Drive_For_Distance_WithHeading0(-0.75,10.0,0.0));
    	addSequential(new SolenoidClose());
    }
}
