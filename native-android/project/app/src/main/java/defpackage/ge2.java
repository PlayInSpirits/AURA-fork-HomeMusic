package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ge2 {
    public final String a;
    public final String b;
    public final int c;

    public ge2(String r8, String... r9) {
        int r0 = r9.length;
        boolean r1 = false;
        if (r0 != 0) goto L5;
        String r10 = "";
    L12:
        this.b = r10;
        this.a = r8;
        int r11 = r8.length();
        Object[] r12 = {r8, 23};
        if (r11 > 23) goto L15;
        r1 = true;
    L15:
        if (r1 == false) goto L25;
        int r13 = 2;
    L18:
        if (r13 > 7) goto L22;
        if (Log.isLoggable(this.a, r13) == true) goto L22;
        r13 = r13 + 1;
    L22:
        this.c = r13;
        return;
    L25:
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", r12));
    L5:
        StringBuilder r3 = new StringBuilder();
        r3.append('[');
        int r4 = 0;
    L6:
        if (r4 >= r0) goto L11;
        String r5 = r9[r4];
        if (r3.length() <= 1) goto L10;
        r3.append(",");
    L10:
        r3.append(r5);
        r4 = r4 + 1;
        goto L6
    L11:
        r3.append("] ");
        r10 = r3.toString();
        goto L12
    }

    public ge2(int r1, String r2, String r3) {
        this.a = r2;
        this.b = r3;
        this.c = r1;
    }
}
