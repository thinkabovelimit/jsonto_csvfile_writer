package pack

import java.io.File

import org.apache.commons.io.FileUtils
import org.json.{CDL, JSONObject}

object converter {
    def convert() {
      val jsonstring = "{\"infile\": [{\"Name\": 11,\"Roll No\": 12,\"Marks\": 13},\n" + "            {\"Name\": ls,\"Roll No\": 22,\"Marks\": 23},\n" + "            {\"Name\": dd,\"Roll No\": 32,\"Marks\": 33}]}";
      //create a json string-this string consists of values to be written into the file

      val output = new JSONObject(jsonstring)
      // convert the string into a json object
      val docs = output.getJSONArray("infile") //Create a json array
      val file = new File("/home/krishnaprasad/Downloads/Hello.csv")  //open the csv file into which the value to be written-Relative path is given as the file path

      val csv = CDL.toString(docs)
      FileUtils.writeStringToFile(file, csv)  //Write into the csvfile
    }

  }




