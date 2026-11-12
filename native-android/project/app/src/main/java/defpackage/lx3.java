package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lx3 {
    public static String a(gg1 r1) {
        String r2 = r1.getClass().getGenericInterfaces()[0].toString();
        if (r2.startsWith("kotlin.jvm.functions.") == true) goto L5;
        return r2;
    L5:
        return r2.substring(21);
    }
}
