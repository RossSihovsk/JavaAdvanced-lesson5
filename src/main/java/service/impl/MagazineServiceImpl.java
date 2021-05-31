package service.impl;

import dao.DAOException;
import dao.MagazineDAO;
import doMain.Magazine;
import service.IMagazineService;

import java.util.List;

public class MagazineServiceImpl implements IMagazineService {

    private MagazineDAO magazineDAO = new MagazineDAO();

    @Override
    public Magazine insert(Magazine magazine) throws Exception {
        return magazineDAO.insert(magazine);
    }

    @Override
    public List<Magazine> readAll() throws DAOException {
        return magazineDAO.readAll();
    }

    @Override
    public Magazine readByID(int id) throws Exception {
        return magazineDAO.readByID(id);
    }

    @Override
    public boolean updateByID(Magazine magazine) throws DAOException {
        return magazineDAO.updateByID(magazine);
    }

    @Override
    public boolean delete(int id) throws DAOException {
        return magazineDAO.delete(id);
    }
}
