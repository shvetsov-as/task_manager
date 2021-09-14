/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll_user;

import dal.Users;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface ReadUserBeanLocal {
    
    List <Users> findAllusers ();
    
    Users findUser(String login);
    
    List<Users> findByRegex(String regex);
    
    //check user by login
    boolean userLoginMatches (String login);
        
    //get users passwd, salt, role by login
    //List<Users> getPassSaltRole (String login);
}