package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.createProfileClient;

/**
 * Created by ruben on 17/11/16.
 */
public class CreateProfileClientController extends Controller {

    public Result createProfileClient(){
        return ok(createProfileClient.render(""));
    }

}
