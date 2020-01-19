package yichunyen.unit.test.trial

import java.io.BufferedReader
import java.io.FileInputStream
import java.io.InputStreamReader
import java.lang.Exception

open class BaseTest {
    private val ASSET_BASE_PATH = "../app/src/main/assets/"
    /**
     * Read the JSON file
     */
    fun readJsonFile(jsonFileName: String): String {
        if(jsonFileName.endsWith("json")){
            throw Exception("Do not put the json file extension")
        }

        val br = BufferedReader(
            InputStreamReader(
                FileInputStream("$ASSET_BASE_PATH$jsonFileName.json")
            )
        )
        val sb = StringBuilder()
        var line = br.readLine()
        while (line != null) {
            sb.append(line)
            line = br.readLine()
        }

        return sb.toString()
    }
}