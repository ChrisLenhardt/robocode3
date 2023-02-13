// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Extender extends SubsystemBase {
  private double speed = Constants.OperatorConstants.arm_speed;
  private Talon motor = new Talon(Constants.OperatorConstants.arm_motor);
  /** Creates a new Extender. */
  public Extender() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void extend(){
    motor.set(speed);
  }
  public void retract(){
    motor.set(-1 * speed);
  }
  public void stop(){
    motor.stopMotor();
  }
}
