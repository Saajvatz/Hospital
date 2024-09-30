import javax.swing.*;
import java.awt.*;

import controller.DoctorControler;
import controller.LoginController;
import controller.SecretariaController;
import model.*;
import resources.Banner;
import resources.Login;
import view.BackEnde;
import view.LoginnView;
import view.SalaView;
import view.SecretariaView;



public class Main {
    public static void main(String[] args) {

        Enfermera d3=new Enfermera();
        //CONTROLLER
        DoctorControler dc1 = new DoctorControler();
        LoginController dc2 = new LoginController();
        SecretariaController dc3 = new SecretariaController();

        //MODEL
        DoctorGeneral m1 = new DoctorGeneral();
        Enfermera m2 = new Enfermera();

        SalaDeCirujia n4 = new SalaDeCirujia();
        SalaDeEmergencia m5 = new SalaDeEmergencia();

        //RESOURCES
        Banner r1 = new Banner();
        Login r2 = new Login();

        //VIEW
        BackEnde v1 = new BackEnde();
        LoginnView v2 = new LoginnView();
        SalaView v3 = new SalaView();
        SecretariaView v4 = new SecretariaView();

    }
}