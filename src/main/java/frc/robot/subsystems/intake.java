// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: Subsystem.

package frc.robot.subsystems;


import frc.robot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
 import com.ctre.phoenix.motorcontrol.FeedbackDevice;
 import com.ctre.phoenix.motorcontrol.NeutralMode;
 import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class intake extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private WPI_TalonSRX talonSRXEnhanced1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    /**
    *
    */
    public intake() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
talonSRXEnhanced1 = new WPI_TalonSRX(4);
 
    /* Factory default hardware to prevent unexpected behavior */
talonSRXEnhanced1.configFactoryDefault();

        /* Invert Motor? and set Break Mode */
talonSRXEnhanced1.setInverted(true);
talonSRXEnhanced1.setNeutralMode(NeutralMode.Coast);

        /* Set the peak and nominal outputs */
talonSRXEnhanced1.configNominalOutputForward(0, 30);
talonSRXEnhanced1.configNominalOutputReverse(0, 30);
talonSRXEnhanced1.configPeakOutputForward(1, 30);
talonSRXEnhanced1.configPeakOutputReverse(-1, 30);
        











        


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    public void my_SetSpeed(double m_speed) {
        talonSRXEnhanced1.set(m_speed);
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

