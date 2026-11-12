package com.eddyizm.tempus.homemusic;

import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.b00;
import defpackage.bb3;
import defpackage.gi1;
import defpackage.j15;
import defpackage.mc2;
import defpackage.nc2;
import defpackage.rs1;
import defpackage.s14;
import defpackage.u6;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubSyncWorker extends Worker {
    public HubSyncWorker(Context r1, WorkerParameters r2) {
        r1.getClass();
        r2.getClass();
        super(r1, r2);
    }

    @Override // androidx.work.Worker
    public final nc2 d() {
        Context r3 = this.a;     // Catch: Exception -> L5
        r3.getClass();     // Catch: Exception -> L5
        gi1.j(r3);     // Catch: Exception -> L5
    L16:
        rs1.d.submit(new u6(7)).get();     // Catch: Throwable -> L9
        Object r4 = j15.a;     // Catch: Throwable -> L9
    L11:
        Throwable r5 = bb3.a(r4);
        if (r5 == null) goto L14;
        Log.d("HubSyncWorker", "Play events: " + r5.getMessage());
    L14:
        b00.a.e();
        return new mc2();
    L9:
        th = move-exception;
        r4 = new s14(th);
    L5:
        e = move-exception;
        Log.d("HubSyncWorker", "Hub check failed: " + e.getMessage());
        goto L16
    }
}
