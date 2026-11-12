package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

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

    public px3(String r1, Field r2, boolean r3, boolean r4, Method r5, boolean r6, bz4 r7, nk1 r8, TypeToken r9, boolean r10, boolean r11) {
        this.f = r5;
        this.g = r6;
        this.h = r7;
        this.i = r8;
        this.j = r9;
        this.k = r10;
        this.l = r11;
        this.a = r1;
        this.b = r2;
        this.c = r2.getName();
        this.d = r3;
        this.e = r4;
    }

    public final void a(q32 r4, Object r5) {
        if (this.d == false) goto L24;
        Method r0 = this.f;
        if (r0 != null) goto L22;
        Object r1 = this.b.get(r5);
    L14:
        if (r1 != r5) goto L16;
        return;
    L16:
        r4.u(this.a);
        boolean r6 = this.g;
        bz4 r2 = this.h;
        if (r6 == true) goto L20;
        Type r3 = this.j.getType();
        r2 = new eg2(this.i, r2, r3);
    L20:
        r2.b(r4, r1);
        return;
    L22:
        r1 = r0.invoke(r5, null);     // Catch: InvocationTargetException -> L10
    L10:
        e = move-exception;
        throw new JsonIOException(xa3.h("Accessor ", ox3.d(r0, false), " threw exception"), e.getCause());
    }
}
