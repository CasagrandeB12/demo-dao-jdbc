package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
		//desta forma podemos instanciar somente o DaoFactory no programa principal 
	}
	
	
}
