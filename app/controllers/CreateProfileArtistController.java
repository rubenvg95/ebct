package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.createProfileArtist;

/**
 * Created by ruben on 17/11/16.
 */
public class CreateProfileArtistController extends Controller {

    public Result createProfileArtist(){
        return ok(createProfileArtist.render(""));
    }

}
