package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class od4 {
    public static final hh3 n;
    public static final od4 o;
    public static final od4 p;
    public static final od4 q;
    public static final /* synthetic */ od4[] r;

    static {
        od4 od4Var = new od4("OFF", 0);
        o = od4Var;
        od4 od4Var2 = new od4("SHUFFLE", 1);
        p = od4Var2;
        od4 od4Var3 = new od4("SMART", 2);
        q = od4Var3;
        r = new od4[]{od4Var, od4Var2, od4Var3};
        n = new hh3(28);
    }

    public static od4 valueOf(String str) {
        return (od4) Enum.valueOf(od4.class, str);
    }

    public static od4[] values() {
        return (od4[]) r.clone();
    }
}
