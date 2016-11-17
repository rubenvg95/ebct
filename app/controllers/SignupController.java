package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.signup;

/**
 * Created by ruben on 17/11/16.
 */
public class SignupController extends Controller {

public Result signUp(){
    return ok(signup.render(""));
}

}
