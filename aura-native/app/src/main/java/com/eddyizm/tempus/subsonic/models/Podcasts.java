package com.eddyizm.tempus.subsonic.models;

import defpackage.ka4;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class Podcasts {
    public static final int $stable = 8;

    @ka4("channel")
    private List<PodcastChannel> channels;

    public final List<PodcastChannel> getChannels() {
        return this.channels;
    }

    public final void setChannels(List<PodcastChannel> list) {
        this.channels = list;
    }
}
