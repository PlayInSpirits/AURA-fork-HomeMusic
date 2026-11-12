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

    public final void setAlbumIds(List<String> list) {
        this.albumIds = list;
    }

    public final void setArtistIds(List<String> list) {
        this.artistIds = list;
    }

    public final void setRefs(List<String> list) {
        this.refs = list;
    }

    public final void setSongIds(List<String> list) {
        this.songIds = list;
    }

    public final void setSubjects(List<HubFavoriteSubject> list) {
        this.subjects = list;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:94:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x009a A[SYNTHETIC] */
    public final List<m61> states() {
        List<String> aliases;
        String ref;
        String strConcat;
        String strConcat2;
        ArrayList arrayList = new ArrayList();
        Iterable iterable = this.subjects;
        List<String> list = u01.n;
        if (iterable == null) {
            iterable = list;
        }
        Iterator it = q40.K0(iterable, new ca1(27)).iterator();
        while (true) {
            int i = 3;
            if (!it.hasNext()) {
                break;
            }
            HubFavoriteSubject hubFavoriteSubject = (HubFavoriteSubject) it.next();
            String targetType = hubFavoriteSubject.getTargetType();
            if (targetType != null) {
                int iHashCode = targetType.hashCode();
                if (iHashCode != -1409097913) {
                    if (iHashCode != 92896879) {
                        if (iHashCode == 110621003 && targetType.equals("track")) {
                            i = 1;
                            aliases = hubFavoriteSubject.getAliases();
                            if (aliases == null) {
                                aliases = list;
                            }
                            ref = hubFavoriteSubject.getRef();
                            if (ref != null) {
                                strConcat = "ref:".concat(ref);
                            } else {
                                strConcat = null;
                            }
                            String ndId = hubFavoriteSubject.getNdId();
                            for (String str : q40.t0(q40.G0(aliases, ti.i0(new String[]{strConcat, ndId != null ? "nd:".concat(ndId) : null})))) {
                                if (xm4.k0(str, "ref:", false)) {
                                    strConcat2 = "hub:".concat(qm4.z0(str, "ref:"));
                                } else if (xm4.k0(str, "nd:", false)) {
                                    strConcat2 = qm4.z0(str, "nd:");
                                }
                                arrayList.add(new m61(i, strConcat2, hubFavoriteSubject.getLiked()));
                            }
                        }
                    } else if (targetType.equals("album")) {
                        i = 2;
                        aliases = hubFavoriteSubject.getAliases();
                        if (aliases == null) {
                            aliases = list;
                        }
                        ref = hubFavoriteSubject.getRef();
                        if (ref != null) {
                            strConcat = "ref:".concat(ref);
                        } else {
                            strConcat = null;
                        }
                        String ndId2 = hubFavoriteSubject.getNdId();
                        while (r6.hasNext()) {
                            if (xm4.k0(str, "ref:", false)) {
                                strConcat2 = "hub:".concat(qm4.z0(str, "ref:"));
                            } else if (xm4.k0(str, "nd:", false)) {
                                strConcat2 = qm4.z0(str, "nd:");
                            }
                            arrayList.add(new m61(i, strConcat2, hubFavoriteSubject.getLiked()));
                        }
                    }
                } else if (targetType.equals("artist")) {
                    aliases = hubFavoriteSubject.getAliases();
                    if (aliases == null) {
                        aliases = list;
                    }
                    ref = hubFavoriteSubject.getRef();
                    if (ref != null) {
                        strConcat = "ref:".concat(ref);
                    } else {
                        strConcat = null;
                    }
                    String ndId3 = hubFavoriteSubject.getNdId();
                    while (r6.hasNext()) {
                        if (xm4.k0(str, "ref:", false)) {
                            strConcat2 = "hub:".concat(qm4.z0(str, "ref:"));
                        } else if (xm4.k0(str, "nd:", false)) {
                            strConcat2 = qm4.z0(str, "nd:");
                        }
                        arrayList.add(new m61(i, strConcat2, hubFavoriteSubject.getLiked()));
                    }
                }
            }
        }
        List<String> list2 = this.songIds;
        if (list2 == null) {
            list2 = list;
        }
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(new m61(1, (String) it2.next(), true));
        }
        List<String> list3 = this.albumIds;
        if (list3 == null) {
            list3 = list;
        }
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList.add(new m61(2, (String) it3.next(), true));
        }
        List<String> list4 = this.artistIds;
        if (list4 == null) {
            list4 = list;
        }
        Iterator<T> it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList.add(new m61(3, (String) it4.next(), true));
        }
        List<String> list5 = this.refs;
        if (list5 != null) {
            list = list5;
        }
        Iterator<T> it5 = list.iterator();
        while (it5.hasNext()) {
            arrayList.add(new m61(1, xa3.g("hub:", (String) it5.next()), true));
        }
        return arrayList;
    }
}
