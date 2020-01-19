package yichunyen.unit.test.trial

import com.google.gson.GsonBuilder
import org.junit.Assert
import org.junit.Test
import java.io.BufferedReader
import java.io.FileInputStream
import java.io.InputStreamReader


class UserTest : BaseTest() {
    @Test
    fun userTest(){
        val gson = GsonBuilder().create()
        val user = gson.fromJson(readJsonFile("user"), User::class.java)
        Assert.assertEquals("Tester", user.name)
        println("id = ${user.id}")
        println("name = ${user.name}")
        println("gender = ${user.gender}")
    }
}