package ariehashimie.travellingback.dao;

import java.util.List;

import ariehashimie.travellingback.dto.Category;

public interface CategoryDAO {

List<Category> list();
Category get (int id);	
	
	
}
