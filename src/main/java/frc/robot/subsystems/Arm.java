// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Arm extends SubsystemBase {
  private final PWMTalonSRX motorL = new PWMTalonSRX(Constants.OperatorConstants.liftMotorLeft);
  private final PWMVictorSPX motorR = new PWMVictorSPX(Constants.OperatorConstants.liftMotorRight);

  private final MotorControllerGroup motors = new MotorControllerGroup(motorL, motorR);
  private final double speed = Constants.OperatorConstants.liftSpeed;
  /** Creates a new Arm. */
  public Arm() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void raise(){
    motors.set(speed);
  }
  public void drop(){
    motors.set(-1*speed);
  }

  public void stop(){
    motors.set(0);
  }
}
