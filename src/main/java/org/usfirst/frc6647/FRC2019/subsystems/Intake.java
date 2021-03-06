// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6647.FRC2019.subsystems;


import org.usfirst.frc6647.FRC2019.RobotMap;
import org.usfirst.frc6647.FRC2019.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class Intake extends Subsystem {

    private static WPI_VictorSPX leftIntakeWheel;
    private static WPI_VictorSPX rightIntakeWheel;
    private static WPI_TalonSRX pivoteIntake;
    private static DoubleSolenoid hPiston;

    public Intake() {
        leftIntakeWheel = RobotMap.intakeLeft; 
        rightIntakeWheel = RobotMap.intakeRight;
        pivoteIntake = RobotMap.intakePivote;
        hPiston= RobotMap.HPiston;
    }
    public void Up_Intake(){
        SmartDashboard.putNumber("Encoder Pivote", pivoteIntake.getSelectedSensorPosition(0));
       /*if(pivoteIntake.getSelectedSensorPosition()> PUT SENOSR VALUE){
            pivoteIntake.set(ControlMode.PercentOutput, 1);
       }*/
        pivoteIntake.set(ControlMode.PercentOutput, 1);
    }
    public void Down_Intake(){
        SmartDashboard.putNumber("Encoder Pivote", pivoteIntake.getSelectedSensorPosition(0));
        /*if(pivoteIntake.getSelectedSensorPosition()< PUT SENOSR VALUE){
            pivoteIntake.set(ControlMode.PercentOutput, 1);
       }*/
        pivoteIntake.set(ControlMode.PercentOutput, -0.6);
    }
    public void Ball_In_Intake(){
        leftIntakeWheel.set(ControlMode.PercentOutput, -1);
        rightIntakeWheel.set(ControlMode.PercentOutput, -1);
    }
    public void Ball_Out_Intake(){
        leftIntakeWheel.set(ControlMode.PercentOutput, 1);
        rightIntakeWheel.set(ControlMode.PercentOutput, 1);
    }
    public void Hatch_Push(){
    }
    public void Hatch_In(){

    }

    public void initDefaultState(){
        Stop_Intake();
    }
    public void Stop_Intake() {
	    leftIntakeWheel.set(ControlMode.PercentOutput, 0.0);
        rightIntakeWheel.set(ControlMode.PercentOutput, 0.0);
        pivoteIntake.set(ControlMode.PercentOutput, 0.0);
	}
	
    
    public void initDefaultCommand() {
        
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }
   
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

