package Modelo.Daos

import Modelo.ClientUser
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface DaoUser: CrudRepository< ClientUser, Long> {

    fun findByid(id: Long): MutableList <ClientUser>

    fun findByMail(mail: String): ClientUser

    fun existsClientUserByMail(mail: String): Boolean

}