class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  Language(String langName, int speakers, String regions, String order) {
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionsSpoken = regions;
    this.wordOrder = order;

  }

  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + regionsSpoken + ".");
    System.out.println("The language follows the word order: " + wordOrder);
  }

  public static void main(String[] args) {
    Language spanish = new Language("Spanish", 987416, "Spain and South America", "subject-verb-object");
    Mayan chontal = new Mayan("Chontal", 60563);
    SinoTibetan chinese = new SinoTibetan("Mandarin Chinese", 1655140555);
    SinoTibetan burmese = new SinoTibetan("Burmese", 15604538);

    spanish.getInfo();
    chontal.getInfo();
    chinese.getInfo();
    burmese.getInfo();
  }
}
