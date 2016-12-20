package kn.komir_nastya.usermanagement.db;

import java.util.Collection;

import kn.komir_nastya.usermanagement.User;

public interface UserDao {
User create(User user) throws DatabaseException;
User update(User user) throws DatabaseException;
User delete(User user) throws DatabaseException;
User find(Long id) throws DatabaseException;
Collection findAll() throws DatabaseException;
Collection find(String firstName, String lastName) throws DatabaseException;
void setConnectionFactory(ConnectionFactory connectionFactory);
}
