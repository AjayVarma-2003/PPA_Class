
import java.sql.*;


class MarvellousJDBC
{
    public static void main(String A[])
    {
        try
        {
            // Step 1 :- Load the database driver.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2 :- Connect the driver with database
            Connection cObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/ppa53", "root", "");

            // Step 3 :- Create statement class object
            Statement sObj = cObj.createStatement();

            // Step 4 :- Execute the query
            ResultSet rObj = sObj.executeQuery("Select * from student");

            // Step 5 :- Display the result
            while(rObj.next())
            {
                System.out.println("Roll number : " + rObj.getInt("Rno"));
                System.out.println("Name : " + rObj.getString("Name"));
                System.out.println("City : " + rObj.getString("City"));
                System.out.println("Marks : " + rObj.getInt("Marks"));
            }

            rObj.close();
            sObj.close();
            cObj.close();
        }
        catch(Exception eObj)
        {
            System.out.println("Exception occured : " + eObj);
        }
    }
}