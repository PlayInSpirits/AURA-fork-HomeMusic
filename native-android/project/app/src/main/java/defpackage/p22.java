package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p22 implements InvocationHandler {
    public final ArrayList a;
    public boolean b;
    public String c;

    public p22(ArrayList r1) {
        this.a = r1;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object r7, Method r8, Object[] r9) {
        r7.getClass();
        r8.getClass();
        if (r9 != null) goto L5;
        r9 = new Object[0];
    L5:
        String r0 = r8.getName();
        Class<?> r1 = r8.getReturnType();
        if (h12.c(r0, "supports") == false) goto L12;
        if (h12.c(Boolean.TYPE, r1) == false) goto L12;
        return Boolean.TRUE;
    L12:
        if (h12.c(r0, "unsupported") == true) goto L14;
    L17:
        boolean r2 = h12.c(r0, "protocols");
        ArrayList r5 = this.a;
        if (r2 == false) goto L23;
        if (r9.length != 0) goto L23;
        return r5;
    L23:
        if (h12.c(r0, "selectProtocol") == true) goto L27;
        if (h12.c(r0, "select") == true) goto L27;
    L44:
        if (h12.c(r0, "protocolSelected") == true) goto L48;
        if (h12.c(r0, "selected") == true) goto L48;
    L52:
        return r8.invoke(this, Arrays.copyOf(r9, r9.length));
    L48:
        if (r9.length != 1) goto L52;
        Object r10 = r9[0];
        r10.getClass();
        this.c = (String) r10;
        return null;
    L27:
        if (String.class.equals(r1) == false) goto L44;
        if (r9.length != 1) goto L44;
        Object r3 = r9[0];
        if ((r3 instanceof List) == false) goto L44;
        List r4 = (List) r3;
        int r11 = r4.size();
        if (r11 < 0) goto L41;
        int r12 = 0;
    L35:
        Object r6 = r4.get(r12);
        r6.getClass();
        String r13 = (String) r6;
        if (r5.contains(r13) == true) goto L37;
        if (r12 == r11) goto L41;
        r12 = r12 + 1;
        goto L35
    L37:
        this.c = r13;
        return r13;
    L41:
        String r14 = (String) r5.get(0);
        this.c = r14;
        return r14;
    L14:
        if (h12.c(Void.TYPE, r1) == false) goto L17;
        this.b = true;
        return null;
    }
}
