package pers.qiyan.riderservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hello {
  @JsonProperty
  private String content;

  public Hello(String content) {
    this.content = "Hello,";
    this.content += content;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
