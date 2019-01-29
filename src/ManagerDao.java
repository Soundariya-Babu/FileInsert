
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import javax.imageio.ImageIO;

public class ManagerDao {
	public void insert() throws SQLException, IOException
	{
		Connection con=null;
		PreparedStatement ps=null;
		try
		{
			
			con=DbUtil.getConnection();
		
			ps=con.prepareStatement("insert into Manager values(?,?,?);");
			
	    	ps.setString(1,"xyz");
			ps.setInt(2,12345);
			File f=new File("C:\\Users\\Revature1\\Pictures\\newImage.jpg");
			FileInputStream in=new FileInputStream(f);
			ps.setBinaryStream(3, in, (int) f.length());
			int rows = ps.executeUpdate();
			if(rows>0)
			{
				System.out.println("Successfully inserted");
			}
			else
			{
				System.out.println("error in inserting");
			}
			
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DbUtil.closeConnection(con);
		}
	}
}
