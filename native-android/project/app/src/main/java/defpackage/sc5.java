package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sc5 {
    public static sc5 k;
    public static sc5 l;
    public static final Object m;
    public final Context a;
    public final r90 b;
    public final WorkDatabase c;
    public final bq4 d;
    public final List e;
    public final pq3 f;
    public final rv1 g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final z40 j;

    static {
        cx.i("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Serializable, java.lang.Object, java.lang.String[]] */
    public sc5(Context context, final r90 r90Var, bq4 bq4Var, final WorkDatabase workDatabase, final List list, pq3 pq3Var, z40 z40Var) {
        int i = 0;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            kf2.o("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        cx cxVar = new cx(r90Var.h);
        synchronized (cx.c) {
            try {
                if (cx.d == null) {
                    cx.d = cxVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = applicationContext;
        this.d = bq4Var;
        this.c = workDatabase;
        this.f = pq3Var;
        this.j = z40Var;
        this.b = r90Var;
        this.e = list;
        pe0 pe0Var = (pe0) bq4Var.o;
        pe0Var.getClass();
        td0 td0VarA = te5.a(pe0Var);
        int i2 = 1;
        this.g = new rv1(workDatabase, 1);
        final ia4 ia4Var = (ia4) bq4Var.n;
        String str = c64.a;
        pq3Var.a(new w21() { // from class: b64
            @Override // defpackage.w21
            public final void b(rc5 rc5Var, boolean z) {
                ia4Var.execute(new t6(list, rc5Var, r90Var, workDatabase, 28));
            }
        });
        bq4Var.h(new lb1(applicationContext, this));
        String str2 = i15.a;
        if (nq3.a(applicationContext, r90Var)) {
            fd5 fd5VarA = workDatabase.A();
            fd5VarA.getClass();
            w24 w24VarB = w24.b(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl = fd5VarA.a;
            x xVar = new x(9, new ed5(fd5VarA, w24VarB));
            s12 s12VarI = workDatabase_Impl.i();
            String[] strArr = (String[]) Arrays.copyOf(new String[]{"workspec"}, 1);
            jy4 jy4Var = s12VarI.b;
            kd3 kd3VarG = jy4Var.g(strArr);
            ?? r4 = (String[]) kd3VarG.n;
            int[] iArr = (int[]) kd3VarG.o;
            r4.getClass();
            iArr.getClass();
            vd0 vd0Var = null;
            int i3 = 2;
            fu.G(td0VarA, null, null, new ac0(new x81(ya4.m(ya4.e(new x81(new j91(ya4.e(new gc0(i2, new x70(jy4Var, iArr, r4, vd0Var, 7)), -1), workDatabase_Impl, xVar), new g15(4, null), i), -1)), new h15(applicationContext, null), i3), vd0Var, i3), 3);
        }
    }

    public static sc5 b(Context context) {
        sc5 sc5Var;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        sc5Var = k;
                        if (sc5Var == null) {
                            sc5Var = l;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return sc5Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (sc5Var != null) {
            return sc5Var;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public final rv2 a(String str, kf3 kf3Var) {
        return new mc5(this, str, 2, Collections.singletonList(kf3Var), 0).a();
    }

    public final void c() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        i80 i80Var = this.b.m;
        e25 e25Var = new e25(4, this);
        i80Var.getClass();
        boolean zY = xl.y();
        if (zY) {
            try {
                Trace.beginSection(xl.N("ReschedulingWork"));
            } finally {
                if (zY) {
                    Trace.endSection();
                }
            }
        }
        e25Var.invoke();
    }
}
