package mysqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/* OPERAÇÕES COM CRUD */
public class UsuarioDAO {
	
	//CREATE
	 public void create(Usuario usuario) {
	        String sql = "INSERT INTO usuarios (nome, email, idade) VALUES (?, ?, ?)";
	        try (Connection conn = TesteConexao.getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql)) {
	        	 
	        	stmt.setString(1, usuario.getNome());
	        	stmt.setString(2, usuario.getEmail());
	        	stmt.setInt(3, usuario.getIdade());
	        	stmt.executeUpdate();	
	        	
	        }catch (SQLException e) {
	        	throw new RuntimeException ("Erro ao criar usuario", e);
	        }
	 	}
	 
	 //READ
	 public List<Usuario> read(){
		 String sql = "SELECT * FROM usuarios";
		 List<Usuario> usuarios = new ArrayList<>();
		 
		 try (Connection conn = TesteConexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery()) {
			 
			 while(rs.next()) {
				 Usuario usuario = new Usuario(
						 rs.getInt("id"),
						 rs.getString("nome"),
						 rs.getString("email"),
						 rs.getInt("idade")	 
					);
				 usuarios.add(usuario);
			 }
			 
		 }catch (SQLException e) {
			 throw new RuntimeException("Erro ao verificar dados", e);
		 }
		 return usuarios;
	 }
	 
	 //UPDATE
	 public void update(Usuario usuario) {
		 String sql = "UPDATE usuarios SET nome = ?, email = ?, idade = ? WHERE id = ?";
		 	try(Connection conn = TesteConexao.getConnection();
		 		PreparedStatement stmt = conn.prepareStatement(sql)) {
		 		
		 		stmt.setString(1, usuario.getNome());
		 		stmt.setString(2, usuario.getEmail());
		 		stmt.setInt(3, usuario.getIdade());
		 		stmt.setInt(4, usuario.getId());
		 		stmt.executeUpdate();
		 		
		 	}catch(SQLException e) {
		 		throw new RuntimeException("Não foi possível atualizar o usuario!", e);
		 	}
	}
		 	
	//DELETE
	public void delete(Integer id) {
		String sql = "DELETE FROM usuarios WHERE id = ?";
		try(Connection conn = TesteConexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setInt(1, id);
			stmt.executeUpdate();
			
		}catch(SQLException e) {
			throw new RuntimeException("Erro ao Deletar Usuário!", e);
		}
	}	
		 	
		 	
	 }
