package yichunyen.unit.test.trial

import com.google.gson.GsonBuilder
import org.junit.Assert
import org.junit.Test
import java.io.BufferedReader
import java.io.FileInputStream
import java.io.InputStreamReader


class UserTest {
    private val ASSET_BASE_PATH = "../app/src/main/assets/"
    private fun readJsonFile(filename: String): String {
        val br = BufferedReader(InputStreamReader(FileInputStream(ASSET_BASE_PATH + filename)))
        val sb = StringBuilder()
        var line = br.readLine()
        while (line != null) {
            sb.append(line)
            line = br.readLine()
        }

        return sb.toString()
    }

    @Test
    fun userTest(){
        val gson = GsonBuilder().create()
        val user = gson.fromJson(readJsonFile("user.json"), User::class.java)
        Assert.assertEquals("Tester", user.name)
        println("id = ${user.id}")
        println("name = ${user.name}")
        println("gender = ${user.gender}")
    }
}