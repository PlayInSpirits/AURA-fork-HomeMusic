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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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

    public AppDatabase_Impl() {
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final rf2 A() {
        if (this.v != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this.v != null) goto L12;
        rf2 r0 = new rf2();     // Catch: Throwable -> L10
        r0.n = this;     // Catch: Throwable -> L10
        r0.o = new q20(5);     // Catch: Throwable -> L10
        this.v = r0;     // Catch: Throwable -> L10
    L12:
        rf2 r1 = this.v;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r1;
    L5:
        return this.v;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final hg3 B() {
        if (this.s != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this.s != null) goto L12;
        this.s = new hg3(0, this);     // Catch: Throwable -> L10
    L12:
        hg3 r0 = this.s;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this.s;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final ml3 C() {
        if (this.r != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this.r != null) goto L12;
        this.r = new ml3(this);     // Catch: Throwable -> L10
    L12:
        ml3 r0 = this.r;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this.r;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final rm3 D() {
        if (this.u != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this.u != null) goto L12;
        rm3 r0 = new rm3();     // Catch: Throwable -> L10
        r0.n = this;     // Catch: Throwable -> L10
        r0.o = new q20(6);     // Catch: Throwable -> L10
        this.u = r0;     // Catch: Throwable -> L10
    L12:
        rm3 r1 = this.u;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r1;
    L5:
        return this.u;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final ns3 E() {
        if (this.l != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this.l != null) goto L12;
        this.l = new ns3(this);     // Catch: Throwable -> L10
    L12:
        ns3 r0 = this.l;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this.l;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final jv3 F() {
        if (this.n != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this.n != null) goto L12;
        jv3 r0 = new jv3();     // Catch: Throwable -> L10
        r0.n = this;     // Catch: Throwable -> L10
        r0.o = new q20(8);     // Catch: Throwable -> L10
        r0.p = new h61(3);     // Catch: Throwable -> L10
        this.n = r0;     // Catch: Throwable -> L10
    L12:
        jv3 r1 = this.n;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r1;
    L5:
        return this.n;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final na4 G() {
        if (this.m != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this.m != null) goto L12;
        na4 r0 = new na4();     // Catch: Throwable -> L10
        r0.n = this;     // Catch: Throwable -> L10
        r0.o = new q20(9);     // Catch: Throwable -> L10
        r0.p = new h61(4);     // Catch: Throwable -> L10
        r0.q = new h61(5);     // Catch: Throwable -> L10
        this.m = r0;     // Catch: Throwable -> L10
    L12:
        na4 r1 = this.m;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r1;
    L5:
        return this.m;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final qp4 H() {
        if (this.t != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this.t != null) goto L12;
        this.t = new qp4(this);     // Catch: Throwable -> L10
    L12:
        qp4 r0 = this.t;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this.t;
    }

    @Override // defpackage.s24
    public final s12 d() {
        return new s12(this, new HashMap(0), new HashMap(0), new String[]{"queue", "server", "recent_search", "download", "chronology", "favorite", "session_media_item", "playlist", "pinned_playlist", "lyrics_cache", "internet_radio_station_cache", "playlist_song", "synced_playlist"});
    }

    @Override // defpackage.s24
    public final qz0 e() {
        return new uh(this);
    }

    @Override // defpackage.s24
    public final List g(LinkedHashMap r4) {
        ArrayList r3 = new ArrayList();
        int r1 = 10;
        int r2 = 11;
        r3.add(new kw2(r1, r2, 10));
        int r5 = 12;
        r3.add(new kw2(r2, r5, 11));
        int r6 = 13;
        r3.add(new kw2(r5, r6, 12));
        int r7 = 14;
        r3.add(new kw2(r6, r7, 13));
        int r8 = 15;
        r3.add(new kw2(r7, r8, 14));
        int r9 = 16;
        r3.add(new kw2(r8, r9, 15));
        int r10 = 17;
        r3.add(new kw2(r9, r10, 16));
        int r11 = 18;
        r3.add(new kw2(r10, r11, 17));
        int r12 = 19;
        r3.add(new kw2(r11, r12, 18));
        int r13 = 20;
        r3.add(new kw2(r12, r13, 19));
        int r14 = 21;
        r3.add(new kw2(r13, r14, 20));
        int r15 = 22;
        r3.add(new kw2(r14, r15, 21));
        r3.add(new kw2(r15, 23, 22));
        return r3;
    }

    @Override // defpackage.s24
    public final Set k() {
        return new HashSet();
    }

    @Override // defpackage.s24
    public final Map l() {
        HashMap r2 = new HashMap();
        List r0 = Collections.EMPTY_LIST;
        r2.put(ns3.class, r0);
        r2.put(na4.class, r0);
        r2.put(jv3.class, r0);
        r2.put(ss0.class, r0);
        r2.put(r20.class, r0);
        r2.put(i61.class, r0);
        r2.put(ya4.class, r0);
        r2.put(ml3.class, r0);
        r2.put(hg3.class, r0);
        r2.put(qp4.class, r0);
        r2.put(rm3.class, r0);
        r2.put(rf2.class, r0);
        r2.put(c12.class, r0);
        return r2;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final r20 v() {
        if (this.p != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this.p != null) goto L12;
        this.p = new r20(this);     // Catch: Throwable -> L10
    L12:
        r20 r0 = this.p;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this.p;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final ss0 w() {
        if (this.o != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this.o != null) goto L12;
        ss0 r0 = new ss0();     // Catch: Throwable -> L10
        r0.p = new i80(22);     // Catch: Throwable -> L10
        r0.n = this;     // Catch: Throwable -> L10
        r0.o = new q20(1, r0);     // Catch: Throwable -> L10
        r0.q = new q20(2, r0);     // Catch: Throwable -> L10
        this.o = r0;     // Catch: Throwable -> L10
    L12:
        ss0 r1 = this.o;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r1;
    L5:
        return this.o;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final i61 x() {
        if (this.q != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this.q != null) goto L12;
        this.q = new i61(this);     // Catch: Throwable -> L10
    L12:
        i61 r0 = this.q;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this.q;
    }

    @Override // com.eddyizm.tempus.database.AppDatabase
    public final c12 z() {
        if (this.w != null) goto L5;
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L8:
        if (this.w != null) goto L12;
        this.w = new c12(this);     // Catch: Throwable -> L10
    L12:
        c12 r0 = this.w;     // Catch: Throwable -> L10
        monitor-exit(this);     // Catch: Throwable -> L10
        return r0;
    L5:
        return this.w;
    }
}
