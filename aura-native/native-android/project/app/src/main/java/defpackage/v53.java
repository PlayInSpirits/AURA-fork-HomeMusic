package defpackage;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v53 {
    public static v53 f;
    public final Executor a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public int d;
    public boolean e;

    public v53(Context context) {
        Executor executorT = uo.t();
        this.a = executorT;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        executorT.execute(new ur2(6, this, context));
    }

    public static synchronized v53 a(Context context) {
        try {
            if (f == null) {
                f = new v53(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList<u53> copyOnWriteArrayList = this.b;
        for (u53 u53Var : copyOnWriteArrayList) {
            if (u53Var.a.get() == null) {
                copyOnWriteArrayList.remove(u53Var);
            }
        }
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                for (u53 u53Var2 : this.b) {
                    u53Var2.b.execute(new qa1(24, u53Var2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
