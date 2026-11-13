package com.eddyizm.tempus.model;

import defpackage.b11;
import defpackage.f34;
import defpackage.h12;
import defpackage.xj0;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class LyricsCache {
    public static final int $stable = 8;
    private String artist;
    private String lyrics;
    private String songId;
    private String structuredLyrics;
    private String title;
    private long updatedAt;

    public /* synthetic */ LyricsCache(String str, String str2, String str3, String str4, String str5, long j, int i, xj0 xj0Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? System.currentTimeMillis() : j);
    }

    public static /* synthetic */ LyricsCache copy$default(LyricsCache lyricsCache, String str, String str2, String str3, String str4, String str5, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lyricsCache.songId;
        }
        if ((i & 2) != 0) {
            str2 = lyricsCache.artist;
        }
        if ((i & 4) != 0) {
            str3 = lyricsCache.title;
        }
        if ((i & 8) != 0) {
            str4 = lyricsCache.lyrics;
        }
        if ((i & 16) != 0) {
            str5 = lyricsCache.structuredLyrics;
        }
        if ((i & 32) != 0) {
            j = lyricsCache.updatedAt;
        }
        long j2 = j;
        String str6 = str5;
        String str7 = str3;
        return lyricsCache.copy(str, str2, str7, str4, str6, j2);
    }

    public final String component1() {
        return this.songId;
    }

    public final String component2() {
        return this.artist;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.lyrics;
    }

    public final String component5() {
        return this.structuredLyrics;
    }

    public final long component6() {
        return this.updatedAt;
    }

    public final LyricsCache copy(String str, String str2, String str3, String str4, String str5, long j) {
        str.getClass();
        return new LyricsCache(str, str2, str3, str4, str5, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LyricsCache)) {
            return false;
        }
        LyricsCache lyricsCache = (LyricsCache) obj;
        return h12.c(this.songId, lyricsCache.songId) && h12.c(this.artist, lyricsCache.artist) && h12.c(this.title, lyricsCache.title) && h12.c(this.lyrics, lyricsCache.lyrics) && h12.c(this.structuredLyrics, lyricsCache.structuredLyrics) && this.updatedAt == lyricsCache.updatedAt;
    }

    public final String getArtist() {
        return this.artist;
    }

    public final String getLyrics() {
        return this.lyrics;
    }

    public final String getSongId() {
        return this.songId;
    }

    public final String getStructuredLyrics() {
        return this.structuredLyrics;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode = this.songId.hashCode() * 31;
        String str = this.artist;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lyrics;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.structuredLyrics;
        return Long.hashCode(this.updatedAt) + ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final void setArtist(String str) {
        this.artist = str;
    }

    public final void setLyrics(String str) {
        this.lyrics = str;
    }

    public final void setSongId(String str) {
        str.getClass();
        this.songId = str;
    }

    public final void setStructuredLyrics(String str) {
        this.structuredLyrics = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUpdatedAt(long j) {
        this.updatedAt = j;
    }

    public String toString() {
        String str = this.songId;
        String str2 = this.artist;
        String str3 = this.title;
        String str4 = this.lyrics;
        String str5 = this.structuredLyrics;
        long j = this.updatedAt;
        StringBuilder u = b11.u("LyricsCache(songId=", str, ", artist=", str2, ", title=");
        f34.n(u, str3, ", lyrics=", str4, ", structuredLyrics=");
        u.append(str5);
        u.append(", updatedAt=");
        u.append(j);
        u.append(")");
        return u.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LyricsCache(String str, String str2) {
        this(str, str2, null, null, null, 0L, 60, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LyricsCache(String str, String str2, String str3) {
        this(str, str2, str3, null, null, 0L, 56, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LyricsCache(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null, 0L, 48, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LyricsCache(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, 0L, 32, null);
        str.getClass();
    }

    public LyricsCache(String str, String str2, String str3, String str4, String str5, long j) {
        str.getClass();
        this.songId = str;
        this.artist = str2;
        this.title = str3;
        this.lyrics = str4;
        this.structuredLyrics = str5;
        this.updatedAt = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LyricsCache(String str) {
        this(str, null, null, null, null, 0L, 62, null);
        str.getClass();
    }
}
