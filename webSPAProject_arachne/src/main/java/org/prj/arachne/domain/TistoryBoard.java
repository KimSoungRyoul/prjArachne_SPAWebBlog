package org.prj.arachne.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TistoryBoard {

    private String title;

    private String category;

    private String boardUrl;

    private String contentsSub;

    private String contents;


    public TistoryBoard(String title, String category, String boardUrl, String contents) {
        this.title = title;
        this.category = category;
        this.boardUrl = boardUrl;
        this.contentsSub = contents.substring(0,100)+"......";
        this.contents = contents;
    }
}
