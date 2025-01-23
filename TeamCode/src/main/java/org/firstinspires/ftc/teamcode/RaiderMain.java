package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Raider Main")
public class RaiderMain extends LinearOpMode {
    RaiderBot bot = new RaiderBot();

    @Override
    public void runOpMode() throws InterruptedException {
        bot.init(hardwareMap);

        waitForStart();

        bot.leftFront.setPower(1);
        bot.rightFront.setPower(1);
        bot.leftBack.setPower(1);
        bot.rightBack.setPower(1);

        while (opModeIsActive()) {
            double forwardPower = gamepad1.left_stick_y;
            double rightPower = gamepad1.left_stick_x;
            double clockwisePower =  gamepad1.right_stick_x;

            bot.leftFront.setPower(forwardPower+rightPower+clockwisePower);
            bot.rightFront.setPower(forwardPower-rightPower-clockwisePower);
            bot.leftBack.setPower(forwardPower-rightPower+clockwisePower);
            bot.rightBack.setPower(forwardPower+rightPower-clockwisePower);

        }
    }
}
