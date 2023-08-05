package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import entities.Address;







public class AddressDAOimplementation implements AddressDAO{
	
	
    Connection conn ; //GLOBAL 
	
	public AddressDAOimplementation() {
		try {
			//1. Load the Driver
			System.out.println("Trying to load the driver...");
				DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded....");
			
			//2. Acquire the connection
			System.out.println("Trying to connect....");
			conn = 	DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected : "+ conn);
			
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addAddress(Address address) {
	
		try {
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO Address VALUES (?,?,?,?,?,?)");
			
			pst.setInt(1, address.getAddressId());
			pst.setString(2, address.getAddressLoc());
			pst.setString(3,address.getState());
			pst.setString(4,address.getCity());
			pst.setInt(5, address.getPincode());
			
			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			int rows = pst.executeUpdate();
			
			System.out.println("Rows created : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
		
	}

	@Override
	public Address getAddressById(int addressId) {
		Address addressObj =null;
		try {
			
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM Address WHERE AddressId="+addressId);
			
			//5. process teh result if any
			if(result.next()) {
				addressObj = new Address(); //blank object
				
				addressObj.setAddressId(result.getInt(1));
				addressObj.setAddressLoc(result.getString(2));
				addressObj.setState(result.getString(3));
				addressObj.setCity(result.getString(4));
				addressObj.setPincode(result.getInt(5));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return addressObj;
	}

	@Override
	public List<Address> getAddressesByUserId(int userId) {
		List<Address> addressList = new ArrayList<Address>();
		try {
			
			 
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM DEPT10");
			
			//5. process teh result if any
			while(result.next()) {
				Address addressObj = new Address(); //blank object
				
				addressObj.setAddressId(result.getInt(1));
				addressObj.setAddressLoc(result.getString(2));
				addressObj.setState(result.getString(3));
				addressObj.setCity(result.getString(4));
				addressObj.setPincode(result.getInt(5));
				addressList.add(addressObj); // add this object to the LIST 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return addressList;
	}

	@Override
		
		public void updateAddress(Address address) {
			//3. make a desired statement (insert/update/delete/select)
			
					try {
						PreparedStatement pst = 
								conn.prepareStatement("UPDATE Address set Addresss=?, State=?, City=?, Pincode=? where AddressId=?");
						
						
						pst.setString(1, dept.getAddressId()); //SET dname=?
						pst.setString(2,dept.getAddressLoc()); //SET loc=?
						pst.setString(3, dept.getState());
						pst.setInt(3, dept.getCity());
						pst.setInt(3, dept.getPincode());
						//WHERE deptno=?

						
						System.out.println("PreparedStatement is created : "+ pst);
						
						//4. execute that statement //  UR TABLENAME IS MYDEPT120
						int rows = pst.executeUpdate();
						
						System.out.println("Row MODIFIED : "+rows);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		}

		
	}

	@Override
	public void deleteAddress(int addressId) {
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement pst = 
					conn.prepareStatement("DELETE FROM Address where deptno=?");
			
			pst.setInt(1, addressId); //WHERE deptno=?

			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			int rows = pst.executeUpdate();
			
			System.out.println("Row DELETED : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}
	
