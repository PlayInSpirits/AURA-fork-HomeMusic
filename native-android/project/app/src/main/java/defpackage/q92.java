package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum q92 extends Enum {
    private static final /* synthetic */ t11 $ENTRIES = null;
    private static final /* synthetic */ q92[] $VALUES = null;
    public static final o92 Companion = null;
    public static final q92 ON_ANY = null;
    public static final q92 ON_CREATE = null;
    public static final q92 ON_DESTROY = null;
    public static final q92 ON_PAUSE = null;
    public static final q92 ON_RESUME = null;
    public static final q92 ON_START = null;
    public static final q92 ON_STOP = null;

    static {
        q92 r0 = new q92("ON_CREATE", 0);
        ON_CREATE = r0;
        q92 r1 = new q92("ON_START", 1);
        ON_START = r1;
        q92 r2 = new q92("ON_RESUME", 2);
        ON_RESUME = r2;
        q92 r3 = new q92("ON_PAUSE", 3);
        ON_PAUSE = r3;
        q92 r4 = new q92("ON_STOP", 4);
        ON_STOP = r4;
        q92 r5 = new q92("ON_DESTROY", 5);
        ON_DESTROY = r5;
        q92 r6 = new q92("ON_ANY", 6);
        ON_ANY = r6;
        q92[] r7 = {r0, r1, r2, r3, r4, r5, r6};
        $VALUES = r7;
        $ENTRIES = new u11(r7);
        Companion = new o92();
    }

    public static q92 valueOf(String r1) {
        return (q92) Enum.valueOf(q92.class, r1);
    }

    public static q92[] values() {
        return (q92[]) $VALUES.clone();
    }

    public final r92 a() {
        switch(p92.a[ordinal()]) {
            case 1: goto L15;
            case 2: goto L15;
            case 3: goto L13;
            case 4: goto L13;
            case 5: goto L11;
            case 6: goto L9;
            case 7: goto L7;
            default: goto L4;
        };
    L4:
        er1.n();
        return null;
    L7:
        throw new IllegalArgumentException(this + " has no target state");
    L9:
        return r92.n;
    L11:
        return r92.r;
    L13:
        return r92.q;
    L15:
        return r92.p;
    }
}
