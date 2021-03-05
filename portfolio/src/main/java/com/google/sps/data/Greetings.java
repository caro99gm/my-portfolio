package com.google.sps.data;

import java.util.Random;

public final class Greetings {

  private final String english;
  private final String spanish;
  private final String german;
  private final String french;

  public Greetings(String english, String spanish, String german, String french) {
    this.english = english;
    this.spanish = spanish;
    this.german = german;
    this.french = french;
  }

  public String getRandom(){
      Random n = new Random();
      int i=n.nextInt(4);
      if(i==0) return english;
      else if(i==1) return spanish;
      else if (i==2) return german;
      else return french;
  }

  public String getEnglish() {
    return english;
  }

  public String getSpanish() {
    return spanish;
  }

  public String getGerman() {
    return german;
  }

  public String getFrench() {
    return french;
  }
}