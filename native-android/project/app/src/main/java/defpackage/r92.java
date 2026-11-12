package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r92 {
    public static final r92 n;
    public static final r92 o;
    public static final r92 p;
    public static final r92 q;
    public static final r92 r;
    public static final /* synthetic */ r92[] s;

    static {
        r92 r92Var = new r92("DESTROYED", 0);
        n = r92Var;
        r92 r92Var2 = new r92("INITIALIZED", 1);
        o = r92Var2;
        r92 r92Var3 = new r92("CREATED", 2);
        p = r92Var3;
        r92 r92Var4 = new r92("STARTED", 3);
        q = r92Var4;
        r92 r92Var5 = new r92("RESUMED", 4);
        r = r92Var5;
        s = new r92[]{r92Var, r92Var2, r92Var3, r92Var4, r92Var5};
    }

    public static r92 valueOf(String str) {
        return (r92) Enum.valueOf(r92.class, str);
    }

    public static r92[] values() {
        return (r92[]) s.clone();
    }
}
