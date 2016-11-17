package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.signin;


/**
 * Created by ruben on 17/11/16.
 */
public class SigninController extends Controller{

    public Result signin() {
        return ok(signin.render(""));
    }

}
