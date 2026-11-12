package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dr0 {
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public ll g;
    public int h;
    public long i;
    public final /* synthetic */ jr0 j;

    public dr0(jr0 r6, String r7) {
        r7.getClass();
        this.j = r6;
        this.a = r7;
        r6.getClass();
        this.b = new long[2];
        this.c = new ArrayList();
        this.d = new ArrayList();
        StringBuilder r0 = new StringBuilder(r7);
        r0.append('.');
        int r8 = r0.length();
        int r1 = 0;
    L3:
        if (r1 >= 2) goto L5;
        r0.append(r1);
        this.c.add(this.j.n.d(r0.toString()));
        r0.append(".tmp");
        this.d.add(this.j.n.d(r0.toString()));
        r0.setLength(r8);
        r1 = r1 + 1;
        goto L3
    }

    public final fr0 a() {
        tl1 r0 = ze5.a;
        if (this.e == false) goto L37;
        jr0 r1 = this.j;
        if (r1.y == false) goto L8;
    L12:
        ArrayList r7 = new ArrayList();
        long[] r8 = (long[]) this.b.clone();
        int r2 = 0;
        int r3 = 0;
    L14:
        if (r3 >= 2) goto L20;
        ej4 r4 = r1.o.k((ge3) this.c.get(r3));     // Catch: FileNotFoundException -> L22
        if (r1.y == true) goto L19;
        this.h++;     // Catch: FileNotFoundException -> L22
        r4 = new cr0(r4, r1, this);     // Catch: FileNotFoundException -> L22
    L19:
        r7.add(r4);     // Catch: FileNotFoundException -> L22
        r3 = r3 + 1;     // Catch: FileNotFoundException -> L22
    L22:
        int r5 = r7.size();
    L23:
        if (r2 >= r5) goto L29;
        Object r6 = r7.get(r2);
        r2 = r2 + 1;
        xe5.b((ej4) r6);
        goto L23
    L29:
        r1.K(this);     // Catch: IOException -> L28
        return null;
    L39:
        return null;
    L20:
        return new fr0(this.j, this.a, this.i, r7, r8);
    L8:
        if (this.g == null) goto L10;
        return null;
    L10:
        if (this.f == false) goto L12;
        return null;
    L37:
        return null;
    }
}
