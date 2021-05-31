package service.impl;

import dao.DAOException;
import dao.UserDAO;
import doMain.User;
import service.IUserService;

import java.util.List;

public class UserServiceImpl implements IUserService {
    private UserDAO userDAO = new UserDAO();


    @Override
    public User readByEmail(String email) throws DAOException {
        return userDAO.readByEmail(email);
    }

    @Override
    public boolean updateByEmail(User t) throws DAOException {
        return userDAO.updateByEmail(t);
    }

    @Override
    public User insert(User user) throws Exception {
        return userDAO.insert(user);
    }

    @Override
    public List<User> readAll() throws DAOException {
        return userDAO.readAll();
    }

    @Override
    public User readByID(int id) throws Exception {
        return userDAO.readByID(id);
    }

    @Override
    public boolean updateByID(User user) throws DAOException {
        return userDAO.updateByID(user);
    }

    @Override
    public boolean delete(int id) throws DAOException {
        return userDAO.delete(id);
    }
}
