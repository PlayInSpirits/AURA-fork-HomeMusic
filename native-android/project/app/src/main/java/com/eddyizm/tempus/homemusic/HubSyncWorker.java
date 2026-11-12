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
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HubSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final nc2 d() {
        Object s14Var;
        try {
            Context context = this.a;
            context.getClass();
            gi1.j(context);
        } catch (Exception e) {
            Log.d("HubSyncWorker", "Hub check failed: " + e.getMessage());
        }
        try {
            rs1.d.submit(new u6(7)).get();
            s14Var = j15.a;
        } catch (Throwable th) {
            s14Var = new s14(th);
        }
        Throwable thA = bb3.a(s14Var);
        if (thA != null) {
            Log.d("HubSyncWorker", "Play events: " + thA.getMessage());
        }
        b00.a.e();
        return new mc2();
    }
}
