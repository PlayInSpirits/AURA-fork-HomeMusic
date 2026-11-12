package defpackage;

import com.google.gson.JsonIOException;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rx3 extends qx3 {
    public final o73 b;

    public rx3(o73 o73Var, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.b = o73Var;
    }

    @Override // defpackage.qx3
    public final Object c() {
        return this.b.A();
    }

    @Override // defpackage.qx3
    public final Object d(Object obj) {
        return obj;
    }

    @Override // defpackage.qx3
    public final void e(Object obj, l32 l32Var, px3 px3Var) throws IllegalAccessException {
        Field field = px3Var.b;
        Object objA = px3Var.h.a(l32Var);
        if (objA == null && px3Var.k) {
            return;
        }
        if (px3Var.l) {
            throw new JsonIOException("Cannot set value of 'static final' ".concat(ox3.d(field, false)));
        }
        field.set(obj, objA);
    }
}
