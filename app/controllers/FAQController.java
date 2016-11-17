package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.faq;

/**
 * Created by ruben on 17/11/16.
 */
public class FAQController extends Controller {

    public Result faq(){
        return ok(faq.render(""));
    }

}
