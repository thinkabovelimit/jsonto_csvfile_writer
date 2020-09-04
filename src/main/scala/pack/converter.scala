package pack

import java.io.File

import org.apache.commons.io.FileUtils
import org.json.{CDL, JSONObject}

object converter {
    def convert() {
      val jsonstring = "{\"infile\": [{\"Name\": 11,\"Roll No\": 12,\"Marks\": 13},\n" + "            {\"Name\": ls,\"Roll No\": 22,\"Marks\": 23},\n" + "            {\"Name\": dd,\"Roll No\": 32,\"Marks\": 33}]}";


      val output = new JSONObject(jsonstring)
      val docs = output.getJSONArray("infile")
      val file = new File("/home/krishnaprasad/Downloads/Hello.csv")

      val csv = CDL.toString(docs)
      FileUtils.writeStringToFile(file, csv)
    }

  }




