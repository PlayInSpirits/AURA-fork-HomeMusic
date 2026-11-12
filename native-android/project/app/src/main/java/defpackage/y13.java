package defpackage;

import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y13 {
    public final int a;
    public y23 b;
    public Bundle c;

    public y13(int r1) {
        this.a = r1;
        this.b = null;
        this.c = null;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if (r8 != null) goto L8;
    L39:
        return false;
    L8:
        if ((r8 instanceof y13) == false) goto L39;
        y13 r9 = (y13) r8;
        if (this.a != r9.a) goto L39;
        if (h12.c(this.b, r9.b) == false) goto L39;
        if (h12.c(this.c, r9.c) == true) goto L38;
        Bundle r2 = this.c;
        if (r2 == null) goto L39;
        Set<String> r3 = r2.keySet();
        if (r3 == null) goto L39;
        Set<String> r4 = r3;
        if ((r4 instanceof Collection) == true) goto L23;
    L25:
        Iterator<T> r5 = r4.iterator();
    L27:
        if (r5.hasNext() == false) goto L38;
        String r6 = (String) r5.next();
        Bundle r7 = this.c;
        Object r10 = null;
        if (r7 == null) goto L31;
        Object r11 = r7.get(r6);
    L32:
        Bundle r12 = r9.c;
        if (r12 == null) goto L36;
        r10 = r12.get(r6);
    L36:
        if (h12.c(r11, r10) == true) goto L27;
    L31:
        r11 = null;
        goto L32
    L23:
        if (r4.isEmpty() == false) goto L25;
    L38:
        return true;
    }

    public final int hashCode() {
        int r0 = Integer.hashCode(this.a) * 31;
        y23 r1 = this.b;
        if (r1 == null) goto L5;
        int r2 = r1.hashCode();
    L6:
        int r3 = r0 + r2;
        Bundle r4 = this.c;
        if (r4 == null) goto L21;
        Set<String> r5 = r4.keySet();
        if (r5 == null) goto L21;
        Iterator<T> r6 = r5.iterator();
    L12:
        if (r6.hasNext() == false) goto L21;
        String r7 = (String) r6.next();
        int r8 = r3 * 31;
        Bundle r9 = this.c;
        if (r9 == null) goto L16;
        Object r10 = r9.get(r7);
    L17:
        if (r10 == null) goto L19;
        int r11 = r10.hashCode();
    L20:
        r3 = r8 + r11;
        goto L12
    L19:
        r11 = 0;
        goto L20
    L16:
        r10 = null;
    L21:
        return r3;
    L5:
        r2 = 0;
        goto L6
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(y13.class.getSimpleName());
        r0.append("(0x");
        r0.append(Integer.toHexString(this.a));
        r0.append(")");
        if (this.b == null) goto L6;
        r0.append(" navOptions=");
        r0.append(this.b);
    L6:
        return r0.toString();
    }
}
