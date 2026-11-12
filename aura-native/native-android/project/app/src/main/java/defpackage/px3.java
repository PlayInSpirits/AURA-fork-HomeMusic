package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class px3 {
    public final String a;
    public final Field b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final /* synthetic */ Method f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ bz4 h;
    public final /* synthetic */ nk1 i;
    public final /* synthetic */ TypeToken j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ boolean l;

    public px3(String str, Field field, boolean z, boolean z2, Method method, boolean z3, bz4 bz4Var, nk1 nk1Var, TypeToken typeToken, boolean z4, boolean z5) {
        this.f = method;
        this.g = z3;
        this.h = bz4Var;
        this.i = nk1Var;
        this.j = typeToken;
        this.k = z4;
        this.l = z5;
        this.a = str;
        this.b = field;
        this.c = field.getName();
        this.d = z;
        this.e = z2;
    }

    public final void a(q32 q32Var, Object obj) throws IllegalAccessException {
        Object objInvoke;
        if (this.d) {
            Method method = this.f;
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, null);
                } catch (InvocationTargetException e) {
                    throw new JsonIOException(xa3.h("Accessor ", ox3.d(method, false), " threw exception"), e.getCause());
                }
            } else {
                objInvoke = this.b.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            q32Var.u(this.a);
            boolean z = this.g;
            bz4 eg2Var = this.h;
            if (!z) {
                eg2Var = new eg2(this.i, eg2Var, this.j.getType());
            }
            eg2Var.b(q32Var, objInvoke);
        }
    }
}
