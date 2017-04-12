package org.usfirst.frc4226.Huskies.commands;

import org.usfirst.frc4226.Huskies.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Drive_With_JoySticks extends Command {

    public Drive_With_JoySticks() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//RobotMap.driveRobotDrive41.tankDrive();
    	Robot.drive.tankDrive(Robot.oi.joystick1.getRawAxis(1)*-1,Robot.oi.joystick1.getRawAxis(5)*-1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drive.tankDrive(0.0,0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
