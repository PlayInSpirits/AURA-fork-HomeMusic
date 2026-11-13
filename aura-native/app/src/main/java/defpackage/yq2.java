package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class yq2 {
    public static ui1 c;
    public final Context a;
    public final ArrayList b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public yq2(Context context) {
        this.a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        kf2.o("The media router service must only be accessed on the application's main thread.");
    }

    public static ui1 c() {
        ui1 ui1Var = c;
        if (ui1Var != null) {
            return ui1Var;
        }
        kf2.o("getGlobalRouter cannot be called when sGlobal is null");
        return null;
    }

    public static yq2 d(Context context) {
        if (context == null) {
            kf2.n("context must not be null");
            return null;
        }
        b();
        if (c == null) {
            c = new ui1(context.getApplicationContext());
        }
        ArrayList arrayList = c.g;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                yq2 yq2Var = new yq2(context);
                arrayList.add(new WeakReference(yq2Var));
                return yq2Var;
            }
            yq2 yq2Var2 = (yq2) ((WeakReference) arrayList.get(size)).get();
            if (yq2Var2 == null) {
                arrayList.remove(size);
            } else if (yq2Var2.a == context) {
                return yq2Var2;
            }
        }
    }

    public static void f(int i) {
        if (i < 0 || i > 3) {
            kf2.n("Unsupported reason to unselect route");
            return;
        }
        b();
        ui1 c2 = c();
        wq2 c3 = c2.c();
        if (c2.g() != c3) {
            c2.i(c3, i, true);
        }
    }

    public final void a(rq2 rq2Var, uo uoVar, int i) {
        sq2 sq2Var;
        if (rq2Var == null) {
            kf2.n("selector must not be null");
            return;
        }
        if (uoVar == null) {
            kf2.n("callback must not be null");
            return;
        }
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((sq2) arrayList.get(i2)).b == uoVar) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            sq2Var = new sq2(this, uoVar);
            arrayList.add(sq2Var);
        } else {
            sq2Var = (sq2) arrayList.get(i2);
        }
        boolean z2 = true;
        if (i != sq2Var.d) {
            sq2Var.d = i;
            z = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((i & 1) != 0) {
            z = true;
        }
        sq2Var.e = elapsedRealtime;
        rq2 rq2Var2 = sq2Var.c;
        rq2Var2.a();
        rq2Var.a();
        if (rq2Var2.b.containsAll(rq2Var.b)) {
            z2 = z;
        } else {
            rq2 rq2Var3 = sq2Var.c;
            c52 c52Var = new c52();
            if (rq2Var3 == null) {
                kf2.n("selector must not be null");
                return;
            }
            rq2Var3.a();
            if (!rq2Var3.b.isEmpty()) {
                c52Var.a = new ArrayList(rq2Var3.b);
            }
            c52Var.a(rq2Var.b());
            sq2Var.c = c52Var.d();
        }
        if (z2) {
            c().k();
        }
    }

    public final void e(uo uoVar) {
        if (uoVar == null) {
            kf2.n("callback must not be null");
            return;
        }
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (((sq2) arrayList.get(i)).b == uoVar) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.remove(i);
            c().k();
        }
    }
}
