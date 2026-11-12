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

    public /* synthetic */ Reactions(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, int i, xj0 xj0Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : num5, (i & 64) != 0 ? null : num6, (i & 128) != 0 ? null : num7, (i & 256) != 0 ? null : num8, (i & 512) != 0 ? null : num9);
    }

    public static /* synthetic */ Reactions copy$default(Reactions reactions, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reactions.url;
        }
        if ((i & 2) != 0) {
            num = reactions.totalCount;
        }
        if ((i & 4) != 0) {
            num2 = reactions.like;
        }
        if ((i & 8) != 0) {
            num3 = reactions.dislike;
        }
        if ((i & 16) != 0) {
            num4 = reactions.laugh;
        }
        if ((i & 32) != 0) {
            num5 = reactions.hooray;
        }
        if ((i & 64) != 0) {
            num6 = reactions.confused;
        }
        if ((i & 128) != 0) {
            num7 = reactions.heart;
        }
        if ((i & 256) != 0) {
            num8 = reactions.rocket;
        }
        if ((i & 512) != 0) {
            num9 = reactions.eyes;
        }
        Integer num10 = num8;
        Integer num11 = num9;
        Integer num12 = num6;
        Integer num13 = num7;
        Integer num14 = num4;
        Integer num15 = num5;
        return reactions.copy(str, num, num2, num3, num14, num15, num12, num13, num10, num11);
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

    public final Reactions copy(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9) {
        return new Reactions(str, num, num2, num3, num4, num5, num6, num7, num8, num9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Reactions)) {
            return false;
        }
        Reactions reactions = (Reactions) obj;
        return h12.c(this.url, reactions.url) && h12.c(this.totalCount, reactions.totalCount) && h12.c(this.like, reactions.like) && h12.c(this.dislike, reactions.dislike) && h12.c(this.laugh, reactions.laugh) && h12.c(this.hooray, reactions.hooray) && h12.c(this.confused, reactions.confused) && h12.c(this.heart, reactions.heart) && h12.c(this.rocket, reactions.rocket) && h12.c(this.eyes, reactions.eyes);
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
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.totalCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.like;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.dislike;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.laugh;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.hooray;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.confused;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.heart;
        int iHashCode8 = (iHashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.rocket;
        int iHashCode9 = (iHashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.eyes;
        return iHashCode9 + (num9 != null ? num9.hashCode() : 0);
    }

    public final void setConfused(Integer num) {
        this.confused = num;
    }

    public final void setDislike(Integer num) {
        this.dislike = num;
    }

    public final void setEyes(Integer num) {
        this.eyes = num;
    }

    public final void setHeart(Integer num) {
        this.heart = num;
    }

    public final void setHooray(Integer num) {
        this.hooray = num;
    }

    public final void setLaugh(Integer num) {
        this.laugh = num;
    }

    public final void setLike(Integer num) {
        this.like = num;
    }

    public final void setRocket(Integer num) {
        this.rocket = num;
    }

    public final void setTotalCount(Integer num) {
        this.totalCount = num;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "Reactions(url=" + this.url + ", totalCount=" + this.totalCount + ", like=" + this.like + ", dislike=" + this.dislike + ", laugh=" + this.laugh + ", hooray=" + this.hooray + ", confused=" + this.confused + ", heart=" + this.heart + ", rocket=" + this.rocket + ", eyes=" + this.eyes + ")";
    }

    public Reactions(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9) {
        this.url = str;
        this.totalCount = num;
        this.like = num2;
        this.dislike = num3;
        this.laugh = num4;
        this.hooray = num5;
        this.confused = num6;
        this.heart = num7;
        this.rocket = num8;
        this.eyes = num9;
    }

    public Reactions() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
