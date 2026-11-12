package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xb0 {
    public final bq4 a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;

    public xb0(bq4 bq4Var, Context context) {
        this.a = bq4Var;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.e = obj;
                ((vc5) this.a.q).execute(new k6(16, q40.Q0(this.d), this));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
