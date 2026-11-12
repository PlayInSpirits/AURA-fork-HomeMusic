package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m22 {
    public static final Integer a = null;

    static {
        Integer r0 = null;
        Object r1 = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);     // Catch: Throwable -> L14
        if ((r1 instanceof Integer) == false) goto L7;
        Integer r2 = (Integer) r1;     // Catch: Throwable -> L14
    L8:
        if (r2 != null) goto L10;
    L12:
        a = r0;
        return;
    L10:
        if (r2.intValue() <= 0) goto L12;
        r0 = r2;
    L7:
        r2 = null;
        goto L8
    }
}
