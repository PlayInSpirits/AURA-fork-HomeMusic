package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ra1 implements sz0 {
    public final Context n;
    public final pa1 o;
    public final y41 p;
    public final Object q = new Object();
    public Handler r;
    public ThreadPoolExecutor s;
    public ThreadPoolExecutor t;
    public bu u;

    public ra1(Context context, pa1 pa1Var) {
        l93.m(context, "Context cannot be null");
        this.n = context.getApplicationContext();
        this.o = pa1Var;
        this.p = sa1.d;
    }

    @Override // defpackage.sz0
    public final void a(bu buVar) {
        synchronized (this.q) {
            this.u = buVar;
        }
        synchronized (this.q) {
            try {
                if (this.u == null) {
                    return;
                }
                int i = 0;
                if (this.s == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new n90(0, "emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.t = threadPoolExecutor;
                    this.s = threadPoolExecutor;
                }
                this.s.execute(new qa1(i, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.q) {
            try {
                this.u = null;
                Handler handler = this.r;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.r = null;
                ThreadPoolExecutor threadPoolExecutor = this.t;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.s = null;
                this.t = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ib1 c() {
        try {
            y41 y41Var = this.p;
            Context context = this.n;
            pa1 pa1Var = this.o;
            y41Var.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{pa1Var}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            qn0 qn0VarA = oa1.a(context, Collections.unmodifiableList(arrayList));
            int i = qn0VarA.a;
            if (i != 0) {
                tb4.e(b11.j(i, "fetchFonts failed (", ")"));
                return null;
            }
            ib1[] ib1VarArr = (ib1[]) qn0VarA.b.get(0);
            if (ib1VarArr != null && ib1VarArr.length != 0) {
                return ib1VarArr[0];
            }
            tb4.e("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            nz2.s("provider not found", e);
            return null;
        }
    }
}
