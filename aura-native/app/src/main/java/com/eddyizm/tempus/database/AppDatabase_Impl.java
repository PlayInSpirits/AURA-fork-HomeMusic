package com.eddyizm.tempus.database;

import defpackage.c12;
import defpackage.h61;
import defpackage.hg3;
import defpackage.i61;
import defpackage.i80;
import defpackage.jv3;
import defpackage.kw2;
import defpackage.ml3;
import defpackage.na4;
import defpackage.ns3;
import defpackage.q20;
import defpackage.qp4;
import defpackage.qz0;
import defpackage.r20;
import defpackage.rf2;
import defpackage.rm3;
import defpackage.s12;
import defpackage.ss0;
import defpackage.uh;
import defpackage.ya4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {
    public volatile ns3 l;
    public volatile na4 m;
    public volatile jv3 n;
    public volatile ss0 o;
    public volatile r20 p;
    public volatile i61 q;
    public volatile ml3 r;
    public volatile hg3 s;
    public volatile qp4 t;
    public volatile rm3 u;
    public volatile rf2 v;
    public volatile c12 w;

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final rf2 A() {
        rf2 rf2Var;
        if (this.v != null) {
            return this.v;
        }
        synchronized (this) {
            try {
                if (this.v == null) {
                    rf2 rf2Var2 = new rf2();
                    rf2Var2.n = this;
                    rf2Var2.o = new q20(5);
                    this.v = rf2Var2;
                }
                rf2Var = this.v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rf2Var;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final hg3 B() {
        hg3 hg3Var;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    this.s = new hg3(0, this);
                }
                hg3Var = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hg3Var;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final ml3 C() {
        ml3 ml3Var;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new ml3(this);
                }
                ml3Var = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ml3Var;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final rm3 D() {
        rm3 rm3Var;
        if (this.u != null) {
            return this.u;
        }
        synchronized (this) {
            try {
                if (this.u == null) {
                    rm3 rm3Var2 = new rm3();
                    rm3Var2.n = this;
                    rm3Var2.o = new q20(6);
                    this.u = rm3Var2;
                }
                rm3Var = this.u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rm3Var;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final ns3 E() {
        ns3 ns3Var;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            try {
                if (this.l == null) {
                    this.l = new ns3(this);
                }
                ns3Var = this.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ns3Var;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final jv3 F() {
        jv3 jv3Var;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    jv3 jv3Var2 = new jv3();
                    jv3Var2.n = this;
                    jv3Var2.o = new q20(8);
                    jv3Var2.p = new h61(3);
                    this.n = jv3Var2;
                }
                jv3Var = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jv3Var;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final na4 G() {
        na4 na4Var;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    na4 na4Var2 = new na4();
                    na4Var2.n = this;
                    na4Var2.o = new q20(9);
                    na4Var2.p = new h61(4);
                    na4Var2.q = new h61(5);
                    this.m = na4Var2;
                }
                na4Var = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return na4Var;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final qp4 H() {
        qp4 qp4Var;
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            try {
                if (this.t == null) {
                    this.t = new qp4(this);
                }
                qp4Var = this.t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qp4Var;
    }

    @Override // defpackage.s24
    public final s12 d() {
        return new s12(this, new HashMap(0), new HashMap(0), "queue", "server", "recent_search", "download", "chronology", "favorite", "session_media_item", "playlist", "pinned_playlist", "lyrics_cache", "internet_radio_station_cache", "playlist_song", "synced_playlist");
    }

    @Override // defpackage.s24
    public final qz0 e() {
        return new uh(this);
    }

    @Override // defpackage.s24
    public final List g(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        int i = 11;
        arrayList.add(new kw2(10, i, 10));
        int i2 = 12;
        arrayList.add(new kw2(i, i2, 11));
        int i3 = 13;
        arrayList.add(new kw2(i2, i3, 12));
        int i4 = 14;
        arrayList.add(new kw2(i3, i4, 13));
        int i5 = 15;
        arrayList.add(new kw2(i4, i5, 14));
        int i6 = 16;
        arrayList.add(new kw2(i5, i6, 15));
        int i7 = 17;
        arrayList.add(new kw2(i6, i7, 16));
        int i8 = 18;
        arrayList.add(new kw2(i7, i8, 17));
        int i9 = 19;
        arrayList.add(new kw2(i8, i9, 18));
        int i10 = 20;
        arrayList.add(new kw2(i9, i10, 19));
        int i11 = 21;
        arrayList.add(new kw2(i10, i11, 20));
        int i12 = 22;
        arrayList.add(new kw2(i11, i12, 21));
        arrayList.add(new kw2(i12, 23, 22));
        return arrayList;
    }

    @Override // defpackage.s24
    public final Set k() {
        return new HashSet();
    }

    @Override // defpackage.s24
    public final Map l() {
        HashMap hashMap = new HashMap();
        List list = Collections.EMPTY_LIST;
        hashMap.put(ns3.class, list);
        hashMap.put(na4.class, list);
        hashMap.put(jv3.class, list);
        hashMap.put(ss0.class, list);
        hashMap.put(r20.class, list);
        hashMap.put(i61.class, list);
        hashMap.put(ya4.class, list);
        hashMap.put(ml3.class, list);
        hashMap.put(hg3.class, list);
        hashMap.put(qp4.class, list);
        hashMap.put(rm3.class, list);
        hashMap.put(rf2.class, list);
        hashMap.put(c12.class, list);
        return hashMap;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final r20 v() {
        r20 r20Var;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    this.p = new r20(this);
                }
                r20Var = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return r20Var;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final ss0 w() {
        ss0 ss0Var;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    ss0 ss0Var2 = new ss0();
                    ss0Var2.p = new i80(22);
                    ss0Var2.n = this;
                    ss0Var2.o = new q20(1, ss0Var2);
                    ss0Var2.q = new q20(2, ss0Var2);
                    this.o = ss0Var2;
                }
                ss0Var = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ss0Var;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final i61 x() {
        i61 i61Var;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new i61(this);
                }
                i61Var = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i61Var;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final c12 z() {
        c12 c12Var;
        if (this.w != null) {
            return this.w;
        }
        synchronized (this) {
            try {
                if (this.w == null) {
                    this.w = new c12(this);
                }
                c12Var = this.w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c12Var;
    }
}
