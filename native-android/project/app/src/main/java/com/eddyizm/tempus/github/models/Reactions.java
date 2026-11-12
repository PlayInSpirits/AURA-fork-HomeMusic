package com.eddyizm.tempus.github.models;

import defpackage.h12;
import defpackage.ka4;
import defpackage.xj0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Reactions {
    public static final int $stable = 8;

    @ka4("confused")
    private Integer confused;

    @ka4("-1")
    private Integer dislike;

    @ka4("eyes")
    private Integer eyes;

    @ka4("heart")
    private Integer heart;

    @ka4("hooray")
    private Integer hooray;

    @ka4("laugh")
    private Integer laugh;

    @ka4("+1")
    private Integer like;

    @ka4("rocket")
    private Integer rocket;

    @ka4("total_count")
    private Integer totalCount;

    @ka4("url")
    private String url;

    public /* synthetic */ Reactions(String r2, Integer r3, Integer r4, Integer r5, Integer r6, Integer r7, Integer r8, Integer r9, Integer r10, Integer r11, int r12, xj0 r13) {
        if ((r12 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = null;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r10 = null;
    L30:
        if ((r12 & 512) == 0) goto L32;
        r11 = null;
    L32:
        this(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
    }

    public static /* synthetic */ Reactions copy$default(Reactions r0, String r1, Integer r2, Integer r3, Integer r4, Integer r5, Integer r6, Integer r7, Integer r8, Integer r9, Integer r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.url;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.totalCount;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.like;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.dislike;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.laugh;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.hooray;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r0.confused;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r0.heart;
    L27:
        if ((r11 & 256) == 0) goto L30;
        r9 = r0.rocket;
    L30:
        if ((r11 & 512) == 0) goto L32;
        r10 = r0.eyes;
    L32:
        Integer r13 = r9;
        Integer r14 = r10;
        Integer r15 = r7;
        Integer r16 = r8;
        Integer r17 = r5;
        Integer r18 = r6;
        Integer r19 = r3;
        Integer r20 = r4;
        return r0.copy(r1, r2, r19, r20, r17, r18, r15, r16, r13, r14);
    }

    public final String component1() {
        return this.url;
    }

    public final Integer component10() {
        return this.eyes;
    }

    public final Integer component2() {
        return this.totalCount;
    }

    public final Integer component3() {
        return this.like;
    }

    public final Integer component4() {
        return this.dislike;
    }

    public final Integer component5() {
        return this.laugh;
    }

    public final Integer component6() {
        return this.hooray;
    }

    public final Integer component7() {
        return this.confused;
    }

    public final Integer component8() {
        return this.heart;
    }

    public final Integer component9() {
        return this.rocket;
    }

    public final Reactions copy(String r1, Integer r2, Integer r3, Integer r4, Integer r5, Integer r6, Integer r7, Integer r8, Integer r9, Integer r10) {
        return new Reactions(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Reactions) == true) goto L8;
        return false;
    L8:
        Reactions r6 = (Reactions) r5;
        if (h12.c(this.url, r6.url) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.totalCount, r6.totalCount) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.like, r6.like) == true) goto L18;
        return false;
    L18:
        if (h12.c(this.dislike, r6.dislike) == true) goto L21;
        return false;
    L21:
        if (h12.c(this.laugh, r6.laugh) == true) goto L24;
        return false;
    L24:
        if (h12.c(this.hooray, r6.hooray) == true) goto L27;
        return false;
    L27:
        if (h12.c(this.confused, r6.confused) == true) goto L30;
        return false;
    L30:
        if (h12.c(this.heart, r6.heart) == true) goto L33;
        return false;
    L33:
        if (h12.c(this.rocket, r6.rocket) == true) goto L36;
        return false;
    L36:
        if (h12.c(this.eyes, r6.eyes) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final Integer getConfused() {
        return this.confused;
    }

    public final Integer getDislike() {
        return this.dislike;
    }

    public final Integer getEyes() {
        return this.eyes;
    }

    public final Integer getHeart() {
        return this.heart;
    }

    public final Integer getHooray() {
        return this.hooray;
    }

    public final Integer getLaugh() {
        return this.laugh;
    }

    public final Integer getLike() {
        return this.like;
    }

    public final Integer getRocket() {
        return this.rocket;
    }

    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String r0 = this.url;
        int r1 = 0;
        if (r0 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = r2 * 31;
        Integer r4 = this.totalCount;
        if (r4 != null) goto L9;
        int r5 = 0;
    L10:
        int r6 = (r3 + r5) * 31;
        Integer r7 = this.like;
        if (r7 != null) goto L13;
        int r8 = 0;
    L14:
        int r9 = (r6 + r8) * 31;
        Integer r10 = this.dislike;
        if (r10 != null) goto L17;
        int r11 = 0;
    L18:
        int r12 = (r9 + r11) * 31;
        Integer r13 = this.laugh;
        if (r13 != null) goto L21;
        int r14 = 0;
    L22:
        int r15 = (r12 + r14) * 31;
        Integer r16 = this.hooray;
        if (r16 != null) goto L25;
        int r17 = 0;
    L26:
        int r18 = (r15 + r17) * 31;
        Integer r19 = this.confused;
        if (r19 != null) goto L29;
        int r20 = 0;
    L30:
        int r21 = (r18 + r20) * 31;
        Integer r22 = this.heart;
        if (r22 != null) goto L33;
        int r23 = 0;
    L34:
        int r24 = (r21 + r23) * 31;
        Integer r25 = this.rocket;
        if (r25 != null) goto L37;
        int r26 = 0;
    L38:
        int r27 = (r24 + r26) * 31;
        Integer r28 = this.eyes;
        if (r28 == null) goto L43;
        r1 = r28.hashCode();
    L43:
        return r27 + r1;
    L37:
        r26 = r25.hashCode();
        goto L38
    L33:
        r23 = r22.hashCode();
        goto L34
    L29:
        r20 = r19.hashCode();
        goto L30
    L25:
        r17 = r16.hashCode();
        goto L26
    L21:
        r14 = r13.hashCode();
        goto L22
    L17:
        r11 = r10.hashCode();
        goto L18
    L13:
        r8 = r7.hashCode();
        goto L14
    L9:
        r5 = r4.hashCode();
        goto L10
    L5:
        r2 = r0.hashCode();
        goto L6
    }

    public final void setConfused(Integer r1) {
        this.confused = r1;
    }

    public final void setDislike(Integer r1) {
        this.dislike = r1;
    }

    public final void setEyes(Integer r1) {
        this.eyes = r1;
    }

    public final void setHeart(Integer r1) {
        this.heart = r1;
    }

    public final void setHooray(Integer r1) {
        this.hooray = r1;
    }

    public final void setLaugh(Integer r1) {
        this.laugh = r1;
    }

    public final void setLike(Integer r1) {
        this.like = r1;
    }

    public final void setRocket(Integer r1) {
        this.rocket = r1;
    }

    public final void setTotalCount(Integer r1) {
        this.totalCount = r1;
    }

    public final void setUrl(String r1) {
        this.url = r1;
    }

    public String toString() {
        return "Reactions(url=" + this.url + ", totalCount=" + this.totalCount + ", like=" + this.like + ", dislike=" + this.dislike + ", laugh=" + this.laugh + ", hooray=" + this.hooray + ", confused=" + this.confused + ", heart=" + this.heart + ", rocket=" + this.rocket + ", eyes=" + this.eyes + ")";
    }

    public Reactions(String r1, Integer r2, Integer r3, Integer r4, Integer r5, Integer r6, Integer r7, Integer r8, Integer r9, Integer r10) {
        this.url = r1;
        this.totalCount = r2;
        this.like = r3;
        this.dislike = r4;
        this.laugh = r5;
        this.hooray = r6;
        this.confused = r7;
        this.heart = r8;
        this.rocket = r9;
        this.eyes = r10;
    }

    public Reactions() {
        String r1 = null;
        Integer r2 = null;
        Integer r3 = null;
        Integer r4 = null;
        Integer r5 = null;
        Integer r6 = null;
        Integer r7 = null;
        Integer r8 = null;
        Integer r9 = null;
        Integer r10 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
    }
}
