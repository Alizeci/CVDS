package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;


public class Registry {
	private ArrayList<Person> personasRegistradas;
	
	public RegisterResult registerVoter(Person p) {
		
		personasRegistradas = new ArrayList<Person>();
		RegisterResult result = RegisterResult.VALID;
		
        // TODO Validate person and return real result.
		if((p.getAge() >= 18 && p.getAge() < 150) && p.isAlive()== true) {
			
			for(Person n:personasRegistradas) {
				if(n.getId() == p.getId()) {
					result = RegisterResult.DUPLICATED;
				}
			}
		}
		return result;
    }
}
