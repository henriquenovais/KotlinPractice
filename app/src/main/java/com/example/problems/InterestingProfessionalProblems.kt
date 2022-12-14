package com.example.problems

import java.io.BufferedReader
import java.io.FileReader

class InterestingProfessionalProblems {

    lateinit var bufferedReaderWithFilePath : BufferedReader

    fun readJsonFile(path: String): String {
        //this algorithm is still not ideal since it uses try catch
        //TODO: improve algorithm as an exercise with loops
        bufferedReaderWithFilePath = BufferedReader(FileReader(path))

        var jsonText = ""
        var line: String

        try {
            while (true) {
                line = bufferedReaderWithFilePath.readLine()
                if(line == null){
                    break
                } else {
                    jsonText += line + "\n"
                }
            }
            bufferedReaderWithFilePath.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return jsonText
    }
}