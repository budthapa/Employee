package controllers;

import java.util.List;

import models.Employee;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import static play.libs.Json.toJson;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result addEmployee(){
    	//get everything from the form request
    	Employee employee=Form.form(Employee.class).bindFromRequest().get();
    	employee.save();
    	return redirect(routes.Application.index());
    }
    
    public static Result getEmployee(){
    	List<Employee> listEmployee=new Model.Finder(String.class, Employee.class).all();
    	return ok(toJson(listEmployee));
    }

}
