class NameEncoderDecoder {
    
  public String encode (String name) {
    name.replace("e","1"); 
    name.replace("u","2");
    name.replace("i","3");
    name.replace("o","4");
    name.replace("a","5");
    
        return "YESNOTFORYOU" + name + "NOTFORYOU";
    }

   public String decode(String name) {
        name
                .replace("YESNOTFORYOU", "")
                .replace("NOTFORYOU", "")
                .replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5", "a");

        return name;
    }

}
