package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k50 {
    public final m50 a;
    public final l50 b;
    public final o50 c;
    public final o50 d;
    public final gc e;

    public k50(l50 r7, List r8) {
        this.b = r7;
        int r1 = 0;
        this.c = new o50(new String[]{"?1", "?2", "?3", "?4", "?5", "color"}, false);
        String[] r9 = new String[r8.size()];
    L4:
        if (r1 >= r8.size()) goto L6;
        r9[r1] = ((j50) r8.get(r1)).d;
        r1 = r1 + 1;
        goto L4
    L6:
        this.d = new o50(r9, true);
        this.e = new gc(r8);
        this.a = new m50(a(), 512, 288);
    }

    public final int a() {
        int r0 = (this.c.l + 288) + this.d.l;
        gc r3 = this.e;
        int r1 = (r3.a * 4) + 16;
        ew4 r4 = (ew4) r3.d;
        int r2 = (((int[]) r4.r).length * 4) + 84;
        return (((((n50[]) r4.s).length * 16) + r2) + r1) + r0;
    }
}
