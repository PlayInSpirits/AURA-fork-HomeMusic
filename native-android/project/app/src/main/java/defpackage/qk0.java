package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qk0 {
    public static final ao0 a = null;

    static {
        int r1 = eq4.a;
        String r0 = System.getProperty("kotlinx.coroutines.main.delay");     // Catch: SecurityException -> L5
    L6:
        if (r0 == null) goto L8;
        boolean r2 = Boolean.parseBoolean(r0);
    L9:
        if (r2 == true) goto L11;
        ao0 r3 = pk0.y;
    L14:
        a = r3;
        return;
    L11:
        rm0 r4 = rr0.a;
        fl1 r5 = uf2.a;
        fl1 r6 = r5.s;
        r3 = r5;
        if (r5 != null) goto L14;
        r3 = pk0.y;
        goto L14
    L8:
        r2 = false;
    L5:
        r0 = null;
        goto L6
    }
}
