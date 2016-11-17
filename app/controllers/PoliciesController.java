package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.policies;

/**
 * Created by ruben on 17/11/16.
 */
public class PoliciesController extends Controller {

    public Result policies(){
        return ok(policies.render(""));
    }
}
