Android usa o SQLITE 
Room é um ORM
verticalScrool - remember 
room conceito de anotação
model - armazena nossa classe de objeto
database- armazena as classes do banco de dados
dao: guardar as interfaces
repository - classses usadas como fonte de dados


@Entity
data class Contato(
    var id: Long = 0,
    var nome: String = "",
    var telefone: String = "",
    var isAmigo: Boolean = false
)

Através da anotação @Entity estou dizendo para criar uma tabela chamada Contato

@Entity(tableName = "tbl_contato")
data class Contato(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    var nome: String = "",
    var telefone: String = "",
    @ColumnInfo(name = "is_amigo") var isAmigo: Boolean = false
)

Fizemos anotações do que é chave primária 

DAO 
@Dao
interface ContatoDao {

    @Insert
    fun salvar(contato: Contato): Long

    @Update
    fun atualizar(contato: Contato): Int

    @Delete
    fun excluir(contato: Contato): Int

    @Query("SELECT * FROM tbl_contato WHERE id= :id")
    fun buscarContatoPeloId(id: Long): Contato

    @Query("SELECT * FROM tbl_contato ORDER BY nome ASC")
    fun listarContatos(): List<Contato>
}


package br.com.fiap.meuscontatos.database.dao

import androidx.room.Database
import androidx.room.RoomDatabase

@Database
abstract class ContatoDb: RoomDatabase() {
     
}

preciso passar a versao do banco e preciso passar tambem quem são as entidades
Singleton - garantir que a intancia seja unica sempre, sempre apontar para o mesmo lugar