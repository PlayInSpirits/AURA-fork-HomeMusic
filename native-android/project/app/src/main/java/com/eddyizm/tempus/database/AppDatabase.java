package com.eddyizm.tempus.database;

import com.eddyizm.tempus.App;
import defpackage.c12;
import defpackage.hg3;
import defpackage.i61;
import defpackage.jv3;
import defpackage.ml3;
import defpackage.na4;
import defpackage.ns3;
import defpackage.q24;
import defpackage.qp4;
import defpackage.r20;
import defpackage.rf2;
import defpackage.rm3;
import defpackage.s24;
import defpackage.ss0;
import defpackage.vr1;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AppDatabase extends s24 {
    public static AppDatabase k;

    public AppDatabase() {
    }

    public static synchronized AppDatabase y() {
        monitor-enter(AppDatabase.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (k != null) goto L9;
        q24 r1 = vr1.i(App.a(), AppDatabase.class, "tempo_db");     // Catch: Throwable -> L7
        r1.p = false;     // Catch: Throwable -> L7
        r1.q = true;     // Catch: Throwable -> L7
        k = (AppDatabase) r1.b();     // Catch: Throwable -> L7
    L9:
        AppDatabase r2 = k;     // Catch: Throwable -> L7
        monitor-exit(AppDatabase.class);
        return r2;
    }

    public abstract rf2 A();

    public abstract hg3 B();

    public abstract ml3 C();

    public abstract rm3 D();

    public abstract ns3 E();

    public abstract jv3 F();

    public abstract na4 G();

    public abstract qp4 H();

    public abstract r20 v();

    public abstract ss0 w();

    public abstract i61 x();

    public abstract c12 z();
}
