package dao;

import java.util.List;


import entity.User;

public class UserDaoController {
	private UserDao userFromDB ;
	
	
	
	public boolean isLoginExist(String login) {
		
		boolean isExist = false;
		//User user;
		
		List<User> users = userFromDB.findAll();
		
		for(int i=0; i<users.size();i++) {
			if(login == users.get(i).getLogin()) {
				isExist = true;
			}
		}
		
		return isExist;
		
	}
}
