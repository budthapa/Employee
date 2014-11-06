package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Employee extends Model{

	private static final long serialVersionUID = -4636208260366625594L;
	
	@Id
	public String id;
	
	public String name;
 
}
