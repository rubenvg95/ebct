package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.mainArtist;


/**
 * Created by ruben on 17/11/16.
 */
public class MArtistController extends Controller {

    public Result mainScreenArtist(){
        return ok(mainArtist.render(""));
    }

}
