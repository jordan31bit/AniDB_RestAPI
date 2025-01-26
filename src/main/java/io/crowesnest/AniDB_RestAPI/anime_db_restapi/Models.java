package io.crowesnest.AniDB_RestAPI.anime_db_restapi;

import jakarta.persistence.*;

@Entity
@Table(name = "ANIME")
public class Models {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String uploader;
    @Column
    private String title;
    @Column
    private String link;
    @Column
    private int seeds;
/***************** Getter and Setters ***************************/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getUploader() {
        return uploader;
    }
    public void setUploader(String uploader) {
        this.uploader = uploader;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public int getSeeds() {
        return seeds;
    }
    public void setSeeds(int seeds) {
        this.seeds = seeds;
    }
}

