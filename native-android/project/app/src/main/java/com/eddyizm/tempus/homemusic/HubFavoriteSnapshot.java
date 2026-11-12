package com.eddyizm.tempus.homemusic;

import defpackage.ca1;
import defpackage.ka4;
import defpackage.m61;
import defpackage.q40;
import defpackage.qm4;
import defpackage.ti;
import defpackage.u01;
import defpackage.xa3;
import defpackage.xm4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubFavoriteSnapshot {
    public static final int $stable = 8;

    @ka4("album_ids")
    private List<String> albumIds;

    @ka4("artist_ids")
    private List<String> artistIds;
    private List<String> refs;

    @ka4("song_ids")
    private List<String> songIds;
    private List<HubFavoriteSubject> subjects;

    public HubFavoriteSnapshot() {
    }

    public final List<String> getAlbumIds() {
        return this.albumIds;
    }

    public final List<String> getArtistIds() {
        return this.artistIds;
    }

    public final List<String> getRefs() {
        return this.refs;
    }

    public final List<String> getSongIds() {
        return this.songIds;
    }

    public final List<HubFavoriteSubject> getSubjects() {
        return this.subjects;
    }

    public final void setAlbumIds(List<String> r1) {
        this.albumIds = r1;
    }

    public final void setArtistIds(List<String> r1) {
        this.artistIds = r1;
    }

    public final void setRefs(List<String> r1) {
        this.refs = r1;
    }

    public final void setSongIds(List<String> r1) {
        this.songIds = r1;
    }

    public final void setSubjects(List<HubFavoriteSubject> r1) {
        this.subjects = r1;
    }

    public final List<m61> states() {
        ArrayList r0 = new ArrayList();
        Iterable r1 = this.subjects;
        List<String> r2 = u01.n;
        if (r1 != null) goto L5;
        r1 = r2;
    L5:
        Iterator r3 = q40.K0(r1, new ca1(27)).iterator();
    L6:
        int r5 = 3;
        if (r3.hasNext() == false) goto L47;
        HubFavoriteSubject r4 = (HubFavoriteSubject) r3.next();
        String r8 = r4.getTargetType();
        if (r8 == null) goto L6;
        int r9 = r8.hashCode();
        if (r9 != (-1409097913)) goto L13;
        if (r8.equals("artist") == false) goto L6;
    L27:
        List<String> r6 = r4.getAliases();
        if (r6 != null) goto L30;
        r6 = r2;
    L30:
        String r7 = r4.getRef();
        String r10 = null;
        if (r7 == null) goto L33;
        String r11 = "ref:".concat(r7);
    L34:
        String r12 = r4.getNdId();
        if (r12 == null) goto L37;
        r10 = "nd:".concat(r12);
    L37:
        Iterator r13 = q40.t0(q40.G0(r6, ti.i0(new String[]{r11, r10}))).iterator();
    L39:
        if (r13.hasNext() == false) goto L6;
        String r14 = (String) r13.next();
        if (xm4.k0(r14, "ref:", false) == true) goto L42;
        if (xm4.k0(r14, "nd:", false) == false) goto L39;
        String r15 = qm4.z0(r14, "nd:");
    L46:
        r0.add(new m61(r5, r15, r4.getLiked()));
        goto L39
    L42:
        r15 = "hub:".concat(qm4.z0(r14, "ref:"));
        goto L46
    L33:
        r11 = null;
        goto L34
    L13:
        if (r9 != 92896879) goto L15;
        if (r8.equals("album") == false) goto L6;
        r5 = 2;
        goto L27
    L15:
        if (r9 != 110621003) goto L6;
        if (r8.equals("track") == false) goto L6;
        r5 = 1;
        goto L27
    L47:
        List<String> r16 = this.songIds;
        if (r16 != null) goto L50;
        r16 = r2;
    L50:
        Iterator<T> r17 = r16.iterator();
    L52:
        if (r17.hasNext() == false) goto L54;
        r0.add(new m61(1, (String) r17.next(), true));
        goto L52
    L54:
        List<String> r18 = this.albumIds;
        if (r18 != null) goto L57;
        r18 = r2;
    L57:
        Iterator<T> r19 = r18.iterator();
    L59:
        if (r19.hasNext() == false) goto L61;
        r0.add(new m61(2, (String) r19.next(), true));
        goto L59
    L61:
        List<String> r20 = this.artistIds;
        if (r20 != null) goto L64;
        r20 = r2;
    L64:
        Iterator<T> r21 = r20.iterator();
    L66:
        if (r21.hasNext() == false) goto L68;
        r0.add(new m61(3, (String) r21.next(), true));
        goto L66
    L68:
        List<String> r110 = this.refs;
        if (r110 == null) goto L72;
        r2 = r110;
    L72:
        Iterator<T> r111 = r2.iterator();
    L74:
        if (r111.hasNext() == false) goto L76;
        r0.add(new m61(1, xa3.g("hub:", (String) r111.next()), true));
        goto L74
    L76:
        return r0;
    }
}
