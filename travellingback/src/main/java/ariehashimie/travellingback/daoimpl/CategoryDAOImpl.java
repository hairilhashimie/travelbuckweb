package ariehashimie.travellingback.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ariehashimie.travellingback.dao.CategoryDAO;
import ariehashimie.travellingback.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();

		// First category
		category.setId(1);
		category.setName("Hotel");
		category.setDescription("List of hotel that are available");
		category.setImageURL("hotel_1.png");

		categories.add(category);

		// Second category
		category = new Category();
		category.setId(2);
		category.setName("Activities");
		category.setDescription("List of activities packages");
		category.setImageURL("hotel_2.png");

		categories.add(category);

		// Third category
		category = new Category();
		category.setId(3);
		category.setName("Acccommodation");
		category.setDescription("List of accommodities");
		category.setImageURL("hotel_3.png");

		categories.add(category);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// loop enhancement
		for (Category category : categories) {

			if (category.getId() == id)
				return category;
		}
		return null;
	}

}
