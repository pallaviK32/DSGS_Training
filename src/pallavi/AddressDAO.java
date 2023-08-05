package dao;


import java.util.List;

public interface AddressDAO {
    void addAddress(Address address);
    Address getAddressById(int addressId);
    List<Address> getAddressesByUserId(int userId);
    void updateAddress(Address address);
    void deleteAddress(int addressId);
}