package com.eddyizm.tempus.subsonic.models;

import defpackage.ka4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class NewestPodcasts {
    public static final int $stable = 8;

    @ka4("episode")
    private List<PodcastEpisode> episodes;

    public NewestPodcasts() {
    }

    public final List<PodcastEpisode> getEpisodes() {
        return this.episodes;
    }

    public final void setEpisodes(List<PodcastEpisode> r1) {
        this.episodes = r1;
    }
}
