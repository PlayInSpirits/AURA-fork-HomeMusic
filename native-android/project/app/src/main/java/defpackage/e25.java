package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e25 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ e25(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r0 = this.n;
        j15 r1 = j15.a;
        Object r7 = this.o;
        switch(r0) {
            case 0: goto L33;
            case 1: goto L31;
            case 2: goto L29;
            case 3: goto L27;
            default: goto L4;
        };
    L4:
        sc5 r8 = (sc5) r7;
        WorkDatabase r2 = r8.c;
        Context r3 = r8.a;
        String r4 = dq4.s;
        if (Build.VERSION.SDK_INT < 34) goto L7;
        w22.a(r3).cancelAll();
    L7:
        JobScheduler r5 = (JobScheduler) r3.getSystemService("jobscheduler");
        ArrayList r6 = dq4.b(r3, r5);
        if (r6 != null) goto L10;
    L14:
        fd5 r9 = r2.A();
        WorkDatabase_Impl r10 = r9.a;
        r10.b();
        aq4 r11 = r9.m;
        df1 r12 = r11.a();
        r10.c();     // Catch: Throwable -> L20
        r12.b();     // Catch: Throwable -> L22
        r10.t();     // Catch: Throwable -> L22
        r10.o();     // Catch: Throwable -> L20
        r11.h(r12);
        c64.b(r8.b, r2, r8.e);
        return r1;
    L22:
        th = move-exception;
        r10.o();     // Catch: Throwable -> L20
        throw th;     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        r11.h(r12);
        throw th;
    L10:
        if (r6.isEmpty() == true) goto L14;
        int r13 = r6.size();
        int r14 = 0;
    L12:
        if (r14 >= r13) goto L14;
        Object r15 = r6.get(r14);
        r14 = r14 + 1;
        dq4.a(r5, ((JobInfo) r15).getId());
        goto L12
    L27:
        p11.a((mc5) r7);
        return r1;
    L29:
        ((gf1) ((jx3) r7).n).invoke();
        return r1;
    L31:
        ((e45) r7).h.setValue(r1);
        return r1;
    L33:
        n83 r16 = ((f25) r7).a.a();
        TimeUnit r17 = TimeUnit.SECONDS;
        r16.b(1, r17);
        r16.x = ze5.b(3, r17);
        return new o83(r16);
    }
}
