package com.eddyizm.tempus.model;

import defpackage.b11;
import defpackage.f34;
import defpackage.h12;
import defpackage.xj0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class LyricsCache {
    public static final int $stable = 8;
    private String artist;
    private String lyrics;
    private String songId;
    private String structuredLyrics;
    private String title;
    private long updatedAt;

    public /* synthetic */ LyricsCache(String r2, String r3, String r4, String r5, String r6, long r7, int r9, xj0 r10) {
        if ((r9 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r9 & 4) == 0) goto L9;
        r4 = null;
    L9:
        if ((r9 & 8) == 0) goto L12;
        r5 = null;
    L12:
        if ((r9 & 16) == 0) goto L15;
        r6 = null;
    L15:
        if ((r9 & 32) == 0) goto L17;
        r7 = System.currentTimeMillis();
    L17:
        this(r2, r3, r4, r5, r6, r7);
    }

    public static /* synthetic */ LyricsCache copy$default(LyricsCache r0, String r1, String r2, String r3, String r4, String r5, long r6, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.songId;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.artist;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.title;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.lyrics;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.structuredLyrics;
    L18:
        if ((r8 & 32) == 0) goto L20;
        r6 = r0.updatedAt;
    L20:
        long r10 = r6;
        String r7 = r4;
        String r11 = r5;
        String r12 = r3;
        String r13 = r1;
        return r0.copy(r13, r2, r12, r7, r11, r10);
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

    public final LyricsCache copy(String r1, String r2, String r3, String r4, String r5, long r6) {
        r1.getClass();
        return new LyricsCache(r1, r2, r3, r4, r5, r6);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof LyricsCache) == true) goto L8;
        return false;
    L8:
        LyricsCache r7 = (LyricsCache) r6;
        if (h12.c(this.songId, r7.songId) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.artist, r7.artist) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.title, r7.title) == true) goto L18;
        return false;
    L18:
        if (h12.c(this.lyrics, r7.lyrics) == true) goto L21;
        return false;
    L21:
        if (h12.c(this.structuredLyrics, r7.structuredLyrics) == true) goto L24;
        return false;
    L24:
        if (this.updatedAt == r7.updatedAt) goto L26;
        return false;
    L26:
        return true;
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
        int r0 = this.songId.hashCode() * 31;
        String r1 = this.artist;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r3 = 0;
    L6:
        int r4 = (r0 + r3) * 31;
        String r5 = this.title;
        if (r5 != null) goto L9;
        int r6 = 0;
    L10:
        int r7 = (r4 + r6) * 31;
        String r8 = this.lyrics;
        if (r8 != null) goto L13;
        int r9 = 0;
    L14:
        int r10 = (r7 + r9) * 31;
        String r11 = this.structuredLyrics;
        if (r11 == null) goto L19;
        r2 = r11.hashCode();
    L19:
        return Long.hashCode(this.updatedAt) + ((r10 + r2) * 31);
    L13:
        r9 = r8.hashCode();
        goto L14
    L9:
        r6 = r5.hashCode();
        goto L10
    L5:
        r3 = r1.hashCode();
        goto L6
    }

    public final void setArtist(String r1) {
        this.artist = r1;
    }

    public final void setLyrics(String r1) {
        this.lyrics = r1;
    }

    public final void setSongId(String r1) {
        r1.getClass();
        this.songId = r1;
    }

    public final void setStructuredLyrics(String r1) {
        this.structuredLyrics = r1;
    }

    public final void setTitle(String r1) {
        this.title = r1;
    }

    public final void setUpdatedAt(long r1) {
        this.updatedAt = r1;
    }

    public String toString() {
        String r0 = this.songId;
        String r1 = this.artist;
        String r2 = this.title;
        String r3 = this.lyrics;
        String r4 = this.structuredLyrics;
        long r5 = this.updatedAt;
        StringBuilder r9 = b11.u("LyricsCache(songId=", r0, ", artist=", r1, ", title=");
        f34.n(r9, r2, ", lyrics=", r3, ", structuredLyrics=");
        r9.append(r4);
        r9.append(", updatedAt=");
        r9.append(r5);
        r9.append(")");
        return r9.toString();
    }

    public LyricsCache(String r11, String r12) {
        r11.getClass();
        String r3 = null;
        String r4 = null;
        String r5 = null;
        long r6 = 0;
        this(r11, r12, r3, r4, r5, r6, 60, null);
    }

    public LyricsCache(String r11, String r12, String r13) {
        r11.getClass();
        String r4 = null;
        String r5 = null;
        long r6 = 0;
        this(r11, r12, r13, r4, r5, r6, 56, null);
    }

    public LyricsCache(String r11, String r12, String r13, String r14) {
        r11.getClass();
        String r5 = null;
        long r6 = 0;
        this(r11, r12, r13, r14, r5, r6, 48, null);
    }

    public LyricsCache(String r11, String r12, String r13, String r14, String r15) {
        r11.getClass();
        long r6 = 0;
        this(r11, r12, r13, r14, r15, r6, 32, null);
    }

    public LyricsCache(String r1, String r2, String r3, String r4, String r5, long r6) {
        r1.getClass();
        this.songId = r1;
        this.artist = r2;
        this.title = r3;
        this.lyrics = r4;
        this.structuredLyrics = r5;
        this.updatedAt = r6;
    }

    public LyricsCache(String r11) {
        r11.getClass();
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        long r6 = 0;
        this(r11, r2, r3, r4, r5, r6, 62, null);
    }
}
