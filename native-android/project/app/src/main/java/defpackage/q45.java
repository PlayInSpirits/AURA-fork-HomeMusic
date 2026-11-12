package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q45 implements Comparable {
    public final String n;

    public q45() {
        if ("1.15.0".matches("\\d+(\\.\\d+)*") == false) goto L6;
        this.n = "1.15.0";
        return;
    L6:
        kf2.n("Invalid version format");
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r6) {
        q45 r7 = (q45) r6;
        if (r7 == null) goto L19;
        String[] r5 = this.n.split("\\.");
        String[] r8 = r7.n.split("\\.");
        int r0 = Math.max(r5.length, r8.length);
        int r2 = 0;
    L6:
        if (r2 >= r0) goto L22;
        if (r2 >= r5.length) goto L10;
        int r3 = Integer.parseInt(r5[r2]);
    L12:
        if (r2 >= r8.length) goto L14;
        int r4 = Integer.parseInt(r8[r2]);
    L15:
        if (r3 < r4) goto L16;
        if (r3 > r4) goto L26;
        r2 = r2 + 1;
        goto L6
    L26:
        return 1;
    L16:
        return -1;
    L14:
        r4 = 0;
        goto L15
    L10:
        r3 = 0;
        goto L12
    L22:
        return 0;
    L19:
        return 1;
    }

    public final String toString() {
        return this.n;
    }
}
