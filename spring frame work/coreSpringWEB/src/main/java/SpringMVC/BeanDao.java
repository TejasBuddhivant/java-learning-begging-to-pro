package SpringMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class BeanDao {

	
	@Autowired
	private JdbcTemplate template;
	
	public int saveUser(Bean b) {
		return template.update("insert into user (name, email, password, mobile) "+"value('"+b.getName()+"','"+b.getemail()+"','"+b.getpassward()+"','"+b.getmobile()+");
	}
}
