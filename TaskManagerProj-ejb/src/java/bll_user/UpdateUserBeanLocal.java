/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll_user;

import dal.Positions;
import dal.UserJoinThree;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface UpdateUserBeanLocal { 
    boolean updatePosition(Integer positionID, String positionName);// to update poition by id
    boolean updateUser(Integer userID, UserJoinThree userNewInfo);// to update user by id
    
}
