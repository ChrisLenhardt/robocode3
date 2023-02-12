// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {  //constants used throughout entire program
  public static class OperatorConstants {
    public static final int DriverCont = 0;
    public static final int ShooterCont = 1;
          //Drive Train
    public static final int driveLeftFront = 0;
    public static final int driveLeftRear = 1; 
    public static final int driveRightFront = 2;
    public static final int driveRightRear = 3;
          //Shooter
    public static final int liftMotorRight = 4;
    public static final int liftMotorLeft = 5;
    public static final double liftSpeed = .5;
          //Pneumatics


  }
}
