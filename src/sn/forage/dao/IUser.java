package sn.forage.dao;

import java.util.List;
import java.sql.*;
import sn.forage.entities.User;

public interface IUser {
	public User checkLogin(String username, String password);
}
