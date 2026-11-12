package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum z91 extends Enum {
    public static final z91 n = null;
    public static final z91 o = null;
    public static final z91 p = null;
    public static final /* synthetic */ z91[] q = null;

    static {
        z91 r0 = new z91("Active", 0);
        n = r0;
        z91 r1 = new z91("ActiveParent", 1);
        o = r1;
        z91 r2 = new z91("Captured", 2);
        z91 r3 = new z91("Inactive", 3);
        p = r3;
        q = new z91[]{r0, r1, r2, r3};
    }

    public static z91 valueOf(String r1) {
        return (z91) Enum.valueOf(z91.class, r1);
    }

    public static z91[] values() {
        return (z91[]) q.clone();
    }

    public final boolean a() {
        int r2 = ordinal();
        if (r2 == 0) goto L14;
        if (r2 != 1) goto L6;
        return false;
    L6:
        if (r2 == 2) goto L14;
        if (r2 == 3) goto L15;
        er1.n();
        return false;
    L15:
        return false;
    L14:
        return true;
    }
}
