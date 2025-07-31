package reuso.ApiRest;


import reuso.ServidorPublico;

import javax.swing.*;
import java.util.List;

public interface ApiRestServidor {
     public void adicionarServidorPublico(); //Não terá retorno (Será void, por isso ;)

     //Listar Servidores Públicos
     public void listarServidoresPublicos();
     public void listarServidorPublico(int matricula);
     //Alterar Servidor Público
     public void alterarServidorPublico(ServidorPublico servidorAlterado);

     //Excluir Servidor Público
     public void excluirServidorPublico(int matricula);

}
