import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ManagerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ManagerDao m =new ManagerDao();
try {
	m.insert();
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (SQLException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}
	}

}
