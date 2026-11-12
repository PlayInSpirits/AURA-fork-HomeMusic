package com.eddyizm.tempus.homemusic;

import com.eddyizm.tempus.subsonic.models.Child;
import defpackage.gb;
import defpackage.u01;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubLikedSongs {
    public static final int $stable = 8;
    private List<HubLikedSong> songs;

    public HubLikedSongs() {
    }

    public final List<Child> children(String r10) {
        r10.getClass();
        List<HubLikedSong> r0 = this.songs;
        u01 r1 = u01.n;
        if (r0 != null) goto L5;
        r0 = r1;
    L5:
        ArrayList r2 = new ArrayList();
        Iterator<T> r3 = r0.iterator();
        int r4 = 0;
        int r5 = 0;
    L7:
        if (r3.hasNext() == false) goto L19;
        Object r6 = r3.next();
        int r7 = r5 + 1;
        if (r5 < 0) goto L17;
        HubLikedSong r8 = (HubLikedSong) r6;
        List<HubLikedSong> r9 = this.songs;
        if (r9 != null) goto L13;
        r9 = r1;
    L13:
        Child r11 = r8.child(r10, r9.size() - r5);
        if (r11 == null) goto L16;
        r2.add(r11);
    L16:
        r5 = r7;
        goto L7
    L17:
        gb.c0();
        throw null;
    L19:
        HashSet r12 = new HashSet();
        ArrayList r13 = new ArrayList();
        int r14 = r2.size();
    L20:
        if (r4 >= r14) goto L24;
        Object r15 = r2.get(r4);
        r4 = r4 + 1;
        if (r12.add(((Child) r15).getId()) == false) goto L20;
        r13.add(r15);
        goto L20
    L24:
        return r13;
    }

    public final List<HubLikedSong> getSongs() {
        return this.songs;
    }

    public final void setSongs(List<HubLikedSong> r1) {
        this.songs = r1;
    }
}
