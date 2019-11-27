package Modelo.Api

import Modelo.Dispachers.DispacherMenu
import com.google.firebase.auth.FirebaseAuth
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/Menu")
class ApiMenu(){
    @Autowired
    lateinit var menus: DispacherMenu

    @RequestMapping("/main", method = [RequestMethod.POST])
    fun main(@RequestHeader("X-Firebase-ID-Token") token: String):Boolean {
        var userId = FireBaseService().veryfiToken(token)
        return userId;
    }

}