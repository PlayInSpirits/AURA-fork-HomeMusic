package com.eddyizm.tempus.homemusic;

import defpackage.ka4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubFavoriteSubject {
    public static final int $stable = 8;
    private List<String> aliases;
    private boolean liked;

    @ka4("nd_id")
    private String ndId;
    private String provenance;
    private String ref;

    @ka4("target_type")
    private String targetType;

    public HubFavoriteSubject() {
    }

    public final List<String> getAliases() {
        return this.aliases;
    }

    public final boolean getLiked() {
        return this.liked;
    }

    public final String getNdId() {
        return this.ndId;
    }

    public final String getProvenance() {
        return this.provenance;
    }

    public final String getRef() {
        return this.ref;
    }

    public final String getTargetType() {
        return this.targetType;
    }

    public final void setAliases(List<String> r1) {
        this.aliases = r1;
    }

    public final void setLiked(boolean r1) {
        this.liked = r1;
    }

    public final void setNdId(String r1) {
        this.ndId = r1;
    }

    public final void setProvenance(String r1) {
        this.provenance = r1;
    }

    public final void setRef(String r1) {
        this.ref = r1;
    }

    public final void setTargetType(String r1) {
        this.targetType = r1;
    }
}
