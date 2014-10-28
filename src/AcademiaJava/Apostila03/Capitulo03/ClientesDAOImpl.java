/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package AcademiaJava.Apostila03.Capitulo03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClientesDAOImpl implements IClientesDAO {

	private final static String SALVAR_CLIENTE = "INSERT INTO clientes (nome,cpf,telefone) VALUES (?,?,?)";
	private final static String CREATE_TABLE = "CREATE TABLE  IF NOT EXISTS  clientes (id int(3) NOT NULL AUTO_INCREMENT   PRIMARY KEY, nome VARCHAR(20) NOT NULL, cpf varchar(20) NOT NULL, telefone varchar(20) NOT NULL)";
	private final static String DELETE_CLIENTE = "DELETE FROM clientes WHERE cpf = ";
	private final static String GET_ALL_CLIENTES = "SELECT * FROM clientes";
	private final static String GET_CLIENTE_BY_CPF = "SELECT * FROM clientes WHERE cpf = ?";

	public void createTable() throws GlobalcodeException {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = ConnectionManager.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(CREATE_TABLE);
		} catch (SQLException e) {
			throw new GlobalcodeException(
					"Erro ao criar a tabela de clientes : " + CREATE_TABLE, e);
		} finally {
			ConnectionManager.closeAll(conn, stmt);
		}
	}

	/*
	 * @see
	 * br.com.globalcode.aj3.dao.ClientesDAO#excluir(br.com.globalcode.beans.Cliente)
	 */
	public void excluir(String cpf) throws GlobalcodeException {
		/*
		 * Faca a exclusao de um cliente do banco de dados usando o seu cpf A
		 * instrucao SQL esta na constante DELETE_CLIENTE no inicio desta
		 * classe.
		 */
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = ConnectionManager.getConnection();
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(DELETE_CLIENTE + cpf);
			System.out.println("Linha Alteradas: " + result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.closeAll(conn, stmt);
		}

	}

		// Criar uma variavel para a Connection
		// Criar uma variavel para o Statement
		// Abrir a conexao
		// Criar o Statement
		// Executar a instrucao de delete recuperando o numero de linhas alteradas (executeUpdate)
		// Imprimir o numero de linhas alteradas
		// Fechar a Connection e o Statement

	/*
	 * @see
	 * br.com.globalcode.aj3.dao.ClientesDAO#salvar(br.com.globalcode.beans.
	 * Cliente)
	 */
	public void salvar(Cliente cliente) throws GlobalcodeException{
	}

	/*
	 * @see br.com.globalcode.aj3.dao.ClientesDAO#getAllClientes()
	 */
	public List getAllClientes() throws GlobalcodeException{
		List<Cliente> clientes = new ArrayList();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(GET_ALL_CLIENTES);
			while(rs.next()){
				String nome = rs.getString("nome");
				String tel = rs.getString("telefone");
				String cpf = rs.getString("cpf");
				int id = rs.getInt("id");
				clientes.add(new Cliente(nome, tel, cpf, id));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.closeAll(conn, stmt);
		}
		
		return clientes;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.globalcode.aj3.dao.ClientesDAO#getClienteByID(int)
	 */
	public Cliente getClienteByCPF(String cpf) throws GlobalcodeException{
		return null;
	}
}
