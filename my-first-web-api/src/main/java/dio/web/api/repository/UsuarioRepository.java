package dio.web.api.repository;

import org.springframework.stereotype.Repository;

import dio.web.api.Model.Usuario;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    
    public void save(Usuario usuario) {
        if (usuario.getId() == null)
            System.out.println("UPDATE - Recebendo o usuário na camada de repositorio");
        else
            System.out.println("UPDATE - Recebendo o usuario na camada de repositorio");
        System.out.println(usuario);
    }

    public void deletedById(Integer id) {
        System.out.println(String.format("Delete/id - recebendo o id: %d para excluir um usuario", id));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando todos os usuários");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario( "Jefferson", "joao@example.com"));
        usuarios.add(new Usuario("frannk", "frank@example.com"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.println(String.format("Find/Id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario( "jefferson ","password");
    }

    public Usuario findByUsername(String username) {
        System.out.println(String.format("FindByUsername - Recebendo o username: %s para localizar um usuário", username));
        return new Usuario ("jefferson","password");
    }
}