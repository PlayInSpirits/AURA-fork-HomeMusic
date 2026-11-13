package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class lx3 {
    public lx3() {
        super();
    }

    public static String a(gg1 gg1Var) {
        String obj = gg1Var.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
