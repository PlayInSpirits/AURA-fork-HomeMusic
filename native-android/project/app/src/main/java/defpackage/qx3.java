package defpackage;

import com.google.gson.JsonSyntaxException;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qx3 extends bz4 {
    public final LinkedHashMap a;

    public qx3(LinkedHashMap r1) {
        this.a = r1;
    }

    @Override // defpackage.bz4
    public final Object a(l32 r5) {
        if (r5.e0() != 9) goto L6;
        r5.a0();
        return null;
    L6:
        Object r0 = c();
        r5.f();     // Catch: IllegalAccessException -> L16 IllegalStateException -> L24
    L8:
        if (r5.J() == false) goto L20;
        String r1 = r5.Y();     // Catch: IllegalAccessException -> L16 IllegalStateException -> L24
        px3 r2 = (px3) this.a.get(r1);     // Catch: IllegalAccessException -> L16 IllegalStateException -> L24
        if (r2 == null) goto L18;
        if (r2.e == false) goto L18;
        e(r0, r5, r2);     // Catch: IllegalAccessException -> L16 IllegalStateException -> L24
    L18:
        r5.k0();     // Catch: IllegalAccessException -> L16 IllegalStateException -> L24
        goto L8
    L20:
        r5.s();
        return d(r0);
    L16:
        e = move-exception;
        hw r6 = ox3.a;
        nz2.s("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        return null;
    L24:
        e = move-exception;
        throw new JsonSyntaxException(e);
    }

    @Override // defpackage.bz4
    public final void b(q32 r2, Object r3) {
        if (r3 != null) goto L5;
        r2.F();
        return;
    L5:
        r2.j();
        Iterator r1 = this.a.values().iterator();     // Catch: IllegalAccessException -> L13
    L8:
        if (r1.hasNext() == false) goto L11;
        ((px3) r1.next()).a(r2, r3);     // Catch: IllegalAccessException -> L13
        goto L8
    L11:
        r2.s();
        return;
    L13:
        e = move-exception;
        hw r4 = ox3.a;
        nz2.s("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
    }

    public abstract Object c();

    public abstract Object d(Object r1);

    public abstract void e(Object r1, l32 r2, px3 r3);
}
