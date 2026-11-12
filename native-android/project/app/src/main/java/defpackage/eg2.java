package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eg2 extends bz4 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public eg2(Class r12) {
        this.a = 2;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        Field[] r13 = (Field[]) AccessController.doPrivileged(new gz4(r12));     // Catch: IllegalAccessException -> L13
        int r0 = r13.length;     // Catch: IllegalAccessException -> L13
        int r2 = 0;
    L4:
        if (r2 >= r0) goto L12;
        Field r3 = r13[r2];     // Catch: IllegalAccessException -> L13
        Enum r4 = (Enum) r3.get(null);     // Catch: IllegalAccessException -> L13
        String r5 = r4.name();     // Catch: IllegalAccessException -> L13
        String r6 = r4.toString();     // Catch: IllegalAccessException -> L13
        ka4 r7 = (ka4) r3.getAnnotation(ka4.class);     // Catch: IllegalAccessException -> L13
        if (r7 == null) goto L10;
        r5 = r7.value();     // Catch: IllegalAccessException -> L13
        String[] r8 = r7.alternate();     // Catch: IllegalAccessException -> L13
        int r9 = r8.length;     // Catch: IllegalAccessException -> L13
        int r10 = 0;
    L8:
        if (r10 >= r9) goto L10;
        ((HashMap) this.b).put(r8[r10], r4);     // Catch: IllegalAccessException -> L13
        r10 = r10 + 1;     // Catch: IllegalAccessException -> L13
    L10:
        ((HashMap) this.b).put(r5, r4);     // Catch: IllegalAccessException -> L13
        ((HashMap) this.c).put(r6, r4);     // Catch: IllegalAccessException -> L13
        ((HashMap) this.d).put(r4, r5);     // Catch: IllegalAccessException -> L13
        r2 = r2 + 1;
        goto L4
    L12:
        return;
    L13:
        e = move-exception;
        throw new AssertionError(e);
    }

    @Override // defpackage.bz4
    public final Object a(l32 r8) {
        int r0 = this.a;
        Object r1 = this.b;
        Map r2 = null;
        Object r3 = this.c;
        switch(r0) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L5;
        };
    L13:
        bz4 r4 = (bz4) ((eg2) r3).c;
        bz4 r5 = (bz4) ((eg2) r1).c;
        int r6 = r8.e0();
        if (r6 != 9) goto L16;
        r8.a0();
    L52:
        return r2;
    L16:
        r2 = (Map) ((o73) this.d).A();
        if (r6 != 1) goto L27;
        r8.b();
    L20:
        if (r8.J() == false) goto L26;
        r8.b();
        Object r7 = r5.a(r8);
        if (r2.put(r7, r4.a(r8)) != null) goto L25;
        r8.q();
        goto L20
    L25:
        throw new JsonSyntaxException("duplicate key: " + r7);
    L26:
        r8.q();
        goto L52
    L27:
        r8.f();
    L29:
        if (r8.J() == false) goto L51;
        fz0.i0.getClass();
        if ((r8 instanceof n32) == false) goto L33;
        n32 r9 = (n32) r8;
        r9.m0(5);
        Map.Entry r10 = (Map.Entry) ((Iterator) r9.q0()).next();
        r9.s0(r10.getValue());
        r9.s0(new k32((String) r10.getKey()));
    L46:
        Object r11 = r5.a(r8);
        if (r2.put(r11, r4.a(r8)) == null) goto L29;
        throw new JsonSyntaxException("duplicate key: " + r11);
    L33:
        int r12 = r8.u;
        if (r12 != 0) goto L37;
        r12 = r8.n();
    L37:
        if (r12 != 13) goto L40;
        r8.u = 9;
        goto L46
    L40:
        if (r12 != 12) goto L43;
        r8.u = 8;
        goto L46
    L43:
        if (r12 != 14) goto L45;
        r8.u = 10;
        goto L46
    L45:
        er1.j(b11.x(r8.e0()), r8.M(), "Expected a name but was ");
        goto L46
    L51:
        r8.s();
        goto L52
    L5:
        if (r8.e0() != 9) goto L7;
        r8.a0();
        return null;
    L7:
        String r13 = r8.c0();
        Enum r14 = (Enum) ((HashMap) r1).get(r13);
        if (r14 == null) goto L10;
        return r14;
    L10:
        return (Enum) ((HashMap) r3).get(r13);
    L12:
        return ((bz4) r3).a(r8);
    }

    @Override // defpackage.bz4
    public final void b(q32 r4, Object r5) {
        int r0 = this.a;
        Object r1 = this.c;
        Object r2 = this.d;
        switch(r0) {
            case 0: goto L35;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        Enum r6 = (Enum) r5;
        if (r6 != null) goto L7;
        String r3 = null;
    L8:
        r4.W(r3);
        return;
    L7:
        r3 = (String) ((HashMap) r2).get(r6);
        goto L8
    L10:
        bz4 r7 = (bz4) r1;
        Type r8 = (Type) r2;
        if (r5 != null) goto L13;
    L17:
        Type r9 = r8;
    L18:
        if (r9 == r8) goto L33;
        bz4 r10 = ((nk1) this.b).g(TypeToken.get(r9));
        if ((r10 instanceof qx3) == false) goto L32;
        bz4 r11 = r7;
    L24:
        if ((r11 instanceof ja4) == false) goto L30;
        bz4 r12 = ((ja4) r11).c();
        if (r12 == r11) goto L30;
        r11 = r12;
    L30:
        if ((r11 instanceof qx3) == false) goto L33;
    L32:
        r7 = r10;
    L33:
        r7.b(r4, r5);
        return;
    L13:
        if ((r8 instanceof Class) == false) goto L15;
    L16:
        r9 = r5.getClass();
        goto L18
    L15:
        if ((r8 instanceof TypeVariable) == false) goto L17;
    L35:
        Map r13 = (Map) r5;
        eg2 r14 = (eg2) r1;
        if (r13 != null) goto L38;
        r4.F();
        return;
    L38:
        r4.j();
        Iterator r15 = r13.entrySet().iterator();
    L40:
        if (r15.hasNext() == false) goto L42;
        Map.Entry r16 = (Map.Entry) r15.next();
        r4.u(String.valueOf(r16.getKey()));
        r14.b(r4, r16.getValue());
        goto L40
    L42:
        r4.s();
    }

    public eg2(nk1 r2, bz4 r3, Type r4) {
        this.a = 1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    public eg2(p40 r1, nk1 r2, Type r3, bz4 r4, Type r5, bz4 r6, o73 r7) {
        this.a = 0;
        this.b = new eg2(r2, r4, r3);
        this.c = new eg2(r2, r6, r5);
        this.d = r7;
    }
}
