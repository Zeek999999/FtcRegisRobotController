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

        while (opModeIsActive()) {

        }
    }
}
