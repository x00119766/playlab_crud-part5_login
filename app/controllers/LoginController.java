package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

// Import user models
import models.users.*;


public class LoginController extends Controller {

    // Declare a private FormFactory instance
    private FormFactory formFactory;

    private Environment env;

    //  Inject an instance of FormFactory it into the controller via its constructor
    @Inject
    public LoginController(Enviroment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    public Result login(){

        Form<login> loginForm = formFactory.form(Login.class);
        return ok(login.render(loginForm));
        
    }

   
}
