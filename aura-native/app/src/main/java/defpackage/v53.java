package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class v53 {
    public static v53 f;
    public final Executor a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public int d;
    public boolean e;

    public v53(Context context) {
        Executor t = uo.t();
        this.a = t;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        t.execute(new ur2(6, this, context));
    }

    public static synchronized v53 a(Context context) {
        v53 v53Var;
        synchronized (v53.class) {
            try {
                if (f == null) {
                    f = new v53(context);
                }
                v53Var = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return v53Var;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            u53 u53Var = (u53) it.next();
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
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    u53 u53Var2 = (u53) it2.next();
                    u53Var2.b.execute(new qa1(24, u53Var2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
