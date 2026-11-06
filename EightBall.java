import java.io.FileReader;

public class EightBall {
	public static void main(String args[]) throws Exception {
		char[] buffer = new char[1024];
		String filename = args[0];


		/Modified

	try {
			System.out.println("sample");
			
			filename = "" + (Integer.parseInt(filename) % 3);
		} 
	catch (Exception e) 
		{
			System.out.println("Invalid input.");
		}
		new FileReader(filename).read(buffer);
		System.out.println(buffer);



		try(Connection conn = DriverManager.getConnection(DB_URL, USER, "PASSWORD");
 
				Statement stmt = conn.createStatement();

		         ResultSet rs = stmt.executeQuery(QUERY);) {

		         // Extract data from result set

		         while (rs.next()) {

		            // Retrieve by column name

		            System.out.print("ID: " + rs.getInt("id"));

		            System.out.print(", Age: " + rs.getInt("age"));

		            System.out.print(", First: " + rs.getString("first"));

		            System.out.println(", Last: " + rs.getString("last"));

		         }

		      } catch (SQLException e) {

		         e.printStackTrace();

		      } 
	}
}
