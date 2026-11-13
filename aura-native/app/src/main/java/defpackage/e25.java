package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class e25 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ e25(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int i = this.n;
        j15 j15Var = j15.a;
        Object obj = this.o;
        switch (i) {
            case 0:
                n83 a = ((f25) obj).a.a();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                a.b(1L, timeUnit);
                a.x = ze5.b(3L, timeUnit);
                return new o83(a);
            case 1:
                ((e45) obj).h.setValue(j15Var);
                return j15Var;
            case 2:
                ((gf1) ((jx3) obj).n).invoke();
                return j15Var;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                p11.a((mc5) obj);
                return j15Var;
            default:
                sc5 sc5Var = (sc5) obj;
                WorkDatabase workDatabase = sc5Var.c;
                Context context = sc5Var.a;
                String str = dq4.s;
                if (Build.VERSION.SDK_INT >= 34) {
                    w22.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList b = dq4.b(context, jobScheduler);
                if (b != null && !b.isEmpty()) {
                    int size = b.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = b.get(i2);
                        i2++;
                        dq4.a(jobScheduler, ((JobInfo) obj2).getId());
                    }
                }
                fd5 A = workDatabase.A();
                WorkDatabase_Impl workDatabase_Impl = A.a;
                workDatabase_Impl.b();
                aq4 aq4Var = A.m;
                df1 a2 = aq4Var.a();
                try {
                    workDatabase_Impl.c();
                    try {
                        a2.b();
                        workDatabase_Impl.t();
                        aq4Var.h(a2);
                        c64.b(sc5Var.b, workDatabase, sc5Var.e);
                        return j15Var;
                    } finally {
                        workDatabase_Impl.o();
                    }
                } catch (Throwable th) {
                    aq4Var.h(a2);
                    throw th;
                }
        }
    }
}
