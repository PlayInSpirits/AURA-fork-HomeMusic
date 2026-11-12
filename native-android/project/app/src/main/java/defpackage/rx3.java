package defpackage;

import com.google.gson.JsonIOException;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rx3 extends qx3 {
    public final o73 b;

    public rx3(o73 r1, LinkedHashMap r2) {
        super(r2);
        this.b = r1;
    }

    @Override // defpackage.qx3
    public final Object c() {
        return this.b.A();
    }

    @Override // defpackage.qx3
    public final Object d(Object r1) {
        return r1;
    }

    @Override // defpackage.qx3
    public final void e(Object r2, l32 r3, px3 r4) {
        Field r1 = r4.b;
        Object r5 = r4.h.a(r3);
        if (r5 != null) goto L9;
        if (r4.k == false) goto L9;
        return;
    L9:
        if (r4.l == true) goto L13;
        r1.set(r2, r5);
        return;
    L13:
        throw new JsonIOException("Cannot set value of 'static final' ".concat(ox3.d(r1, false)));
    }
}
