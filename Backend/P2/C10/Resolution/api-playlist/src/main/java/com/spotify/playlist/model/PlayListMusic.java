package com.spotify.playlist.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PLAYLIST_MUSIC")
public class PlayListMusic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PLAYLIST_MUSIC_ID", unique = true, nullable = false)
    private Long playListId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PLAYLIST_ID", nullable = false, referencedColumnName = "PLAYLIST_ID"
            , foreignKey = @ForeignKey(name = "fk_PlayListMusic_Playlist"))
    @JsonIgnore
    private Playlist playlist;

    @Column(name = "MUSIC_ID", nullable = false)
    private Long musicId;
    @Column(name = "MUSIC_NAME", nullable = false)
    private String musicName;
}
