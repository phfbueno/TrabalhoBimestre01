package Trabbim01;

import java.sql.SQLException;
import java.util.List;



public interface ContatoDAO {
	
	void insert(Cliente c) throws SQLException; // Create
	Cliente retrieve(int id) throws SQLException; // Read
	void update(Cliente c) throws SQLException; // Update
	void delete(int id) throws SQLException; // delete
	List<Cliente> listar() throws SQLException; // listar
	
}