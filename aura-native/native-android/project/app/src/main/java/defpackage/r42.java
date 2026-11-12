package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r42 {
    public static final r42 n;
    public static final r42 o;
    public static final r42 p;
    public static final r42 q;
    public static final r42 r;
    public static final /* synthetic */ r42[] s;

    static {
        r42 r42Var = new r42("IDENTITY", 0);
        n = r42Var;
        r42 r42Var2 = new r42("CONNECT", 1);
        o = r42Var2;
        r42 r42Var3 = new r42("TLS", 2);
        p = r42Var3;
        r42 r42Var4 = new r42("VERIFY", 3);
        q = r42Var4;
        r42 r42Var5 = new r42("RESPONSE", 4);
        r = r42Var5;
        s = new r42[]{r42Var, r42Var2, r42Var3, r42Var4, r42Var5};
    }

    public static r42 valueOf(String str) {
        return (r42) Enum.valueOf(r42.class, str);
    }

    public static r42[] values() {
        return (r42[]) s.clone();
    }
}
