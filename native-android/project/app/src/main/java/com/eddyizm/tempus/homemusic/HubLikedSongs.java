package com.eddyizm.tempus.homemusic;

import com.eddyizm.tempus.subsonic.models.Child;
import defpackage.gb;
import defpackage.u01;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubLikedSongs {
    public static final int $stable = 8;
    private List<HubLikedSong> songs;

    public final List<Child> children(String str) {
        str.getClass();
        List<HubLikedSong> list = this.songs;
        u01 u01Var = u01.n;
        if (list == null) {
            list = u01Var;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                gb.c0();
                throw null;
            }
            HubLikedSong hubLikedSong = (HubLikedSong) obj;
            List<HubLikedSong> list2 = this.songs;
            if (list2 == null) {
                list2 = u01Var;
            }
            Child child = hubLikedSong.child(str, list2.size() - i2);
            if (child != null) {
                arrayList.add(child);
            }
            i2 = i3;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (hashSet.add(((Child) obj2).getId())) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public final List<HubLikedSong> getSongs() {
        return this.songs;
    }

    public final void setSongs(List<HubLikedSong> list) {
        this.songs = list;
    }
}
