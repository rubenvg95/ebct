package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.mainClient;

/**
 * Created by ruben on 17/11/16.
 */
public class MClientController extends Controller {

    public Result mainScreenClient(){
        return ok(mainClient.render(""));
    }

}
