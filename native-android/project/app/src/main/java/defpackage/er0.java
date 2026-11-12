package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class er0 {
    public final String a;
    public final long[] b;
    public final File[] c;
    public final File[] d;
    public boolean e;
    public ll f;
    public final /* synthetic */ kr0 g;

    public er0(kr0 r7, String r8) {
        this.g = r7;
        this.a = r8;
        int r0 = r7.t;
        File r9 = r7.n;
        this.b = new long[r0];
        this.c = new File[r0];
        this.d = new File[r0];
        StringBuilder r1 = new StringBuilder(r8);
        r1.append('.');
        int r10 = r1.length();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1.append(r2);
        this.c[r2] = new File(r9, r1.toString());
        r1.append(".tmp");
        this.d[r2] = new File(r9, r1.toString());
        r1.setLength(r10);
        r2 = r2 + 1;
        goto L3
    }

    public final String a() {
        StringBuilder r0 = new StringBuilder();
        long[] r6 = this.b;
        int r1 = r6.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        long r3 = r6[r2];
        r0.append(' ');
        r0.append(r3);
        r2 = r2 + 1;
        goto L3
    L6:
        return r0.toString();
    }
}
