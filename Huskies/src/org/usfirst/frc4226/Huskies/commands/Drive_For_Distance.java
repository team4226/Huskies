package org.usfirst.frc4226.Huskies.commands;

import org.usfirst.frc4226.Huskies.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Drive_For_Distance extends Command {

	private double m_moveValue;
	private double m_distance;
	
    public Drive_For_Distance(double moveValue, double distance) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drive);
    	m_moveValue = moveValue;
    	m_distance = distance;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drive.zeroDistanceTraveled();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

    	Robot.drive.driveArcade(m_moveValue,0.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.drive.getDistanceTraveled() >= m_distance;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drive.driveArcade(0.0,0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
