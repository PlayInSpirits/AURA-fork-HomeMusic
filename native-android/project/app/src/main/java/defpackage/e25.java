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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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
                n83 n83VarA = ((f25) obj).a.a();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                n83VarA.b(1L, timeUnit);
                n83VarA.x = ze5.b(3L, timeUnit);
                return new o83(n83VarA);
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
                ArrayList arrayListB = dq4.b(context, jobScheduler);
                if (arrayListB != null && !arrayListB.isEmpty()) {
                    int size = arrayListB.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayListB.get(i2);
                        i2++;
                        dq4.a(jobScheduler, ((JobInfo) obj2).getId());
                    }
                }
                fd5 fd5VarA = workDatabase.A();
                WorkDatabase_Impl workDatabase_Impl = fd5VarA.a;
                workDatabase_Impl.b();
                aq4 aq4Var = fd5VarA.m;
                df1 df1VarA = aq4Var.a();
                try {
                    workDatabase_Impl.c();
                    try {
                        df1VarA.b();
                        workDatabase_Impl.t();
                        workDatabase_Impl.o();
                        aq4Var.h(df1VarA);
                        c64.b(sc5Var.b, workDatabase, sc5Var.e);
                        return j15Var;
                    } catch (Throwable th) {
                        workDatabase_Impl.o();
                        throw th;
                    }
                } catch (Throwable th2) {
                    aq4Var.h(df1VarA);
                    throw th2;
                }
        }
    }
}
