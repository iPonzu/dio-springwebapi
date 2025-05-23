package dio.web.api.repository;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;
import dio.web.api.model.Usuario;

@Repository
public class UsuarioRepository{
    public void save(Usuario usuario){
        if(usuario.getId() == null)
            System.out.println("SAVE - Recebendo usuário na camada repositório");
            
            else
            System.out.println("UPDATE - Recebendo usuário na camada repositório");
            System.out.println(usuario);
    }
        public void deleteById(Integer id){
            System.out.println(String.format("DELETE/id - Recebendo id %d na camada repositório", id));
            System.out.println(id);
        }
        public List<Usuario> findAll(){
            System.out.println("LIST - Listando usuarios do sistema");
            List<Usuario> usuarios = new ArrayList<>();
            usuarios.add(new Usuario("alexonthemood", "password1"));
            usuarios.add(new Usuario("ponzitos", "password2"));
            return usuarios;
        }
        public Usuario findById(Integer id){
            System.out.println(String.format("FIND/id - Recebendo id %d na camada repositório", id));
            return new Usuario("alexonthemood", "password1");
        }
        public Usuario findByUsername(String username){
            System.out.println(String.format("FIND/username - Recebendo o username %s na camada repositório", username));
            return new Usuario("alexonthemood", "password1");
            
        }
        
}
