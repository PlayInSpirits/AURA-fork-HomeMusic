package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gc2 {
    public static String a(List r6, String r7, k52 r8, int r9) {
        if ((r9 & 1) == 0) goto L6;
        r7 = ", ";
    L6:
        if ((r9 & 32) == 0) goto L8;
        r8 = null;
    L8:
        StringBuilder r10 = new StringBuilder();
        r10.append("");
        int r1 = r6.size();
        int r2 = 0;
        int r3 = 0;
    L9:
        if (r2 >= r1) goto L25;
        Object r4 = r6.get(r2);
        boolean r5 = true;
        r3 = r3 + 1;
        if (r3 <= 1) goto L13;
        r10.append(r7);
    L13:
        if (r8 == null) goto L15;
        r10.append((CharSequence) r8.invoke(r4));
    L24:
        r2 = r2 + 1;
        goto L9
    L15:
        if (r4 == null) goto L18;
        r5 = r4 instanceof CharSequence;
    L18:
        if (r5 == false) goto L21;
        r10.append((CharSequence) r4);
        goto L24
    L21:
        if ((r4 instanceof Character) == false) goto L23;
        r10.append(((Character) r4).charValue());
        goto L24
    L23:
        r10.append(r4.toString());
        goto L24
    L25:
        r10.append("");
        return r10.toString();
    }

    public static final void b(String r1) {
        throw new UnsupportedOperationException(r1);
    }
}
