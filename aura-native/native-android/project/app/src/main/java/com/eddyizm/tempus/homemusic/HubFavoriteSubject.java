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

    public final void setAliases(List<String> list) {
        this.aliases = list;
    }

    public final void setLiked(boolean z) {
        this.liked = z;
    }

    public final void setNdId(String str) {
        this.ndId = str;
    }

    public final void setProvenance(String str) {
        this.provenance = str;
    }

    public final void setRef(String str) {
        this.ref = str;
    }

    public final void setTargetType(String str) {
        this.targetType = str;
    }
}
