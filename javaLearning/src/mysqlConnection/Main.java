package mysqlConnection;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		//CREATE
		
		Usuario novoUsuario = new Usuario(0, "Ruan 3", "ruan.teste@outlook.com", 26);
		usuarioDAO.create(novoUsuario);
		
		
		//READ
		List<Usuario> usuarios = usuarioDAO.read();
		for(Usuario u : usuarios) {
			System.out.println(u.getId() + "-" + u.getNome());
		}
		
		//UPDATE
		Usuario usuarioAtualizado = new Usuario(1, "Ruan Gabriel Atualizado", "ruan.novo@gmail.com", 20);
		usuarioDAO.update(usuarioAtualizado);
		
		//DELETE
		usuarioDAO.delete(2);
	}
}
