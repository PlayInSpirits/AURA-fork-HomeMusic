package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mh3 {
    public static final mh3 n;
    public static final mh3 o;
    public static final mh3 p;
    public static final mh3 q;
    public static final mh3 r;
    public static final mh3 s;
    public static final /* synthetic */ mh3[] t;

    static {
        mh3 mh3Var = new mh3("SENT", 0);
        n = mh3Var;
        mh3 mh3Var2 = new mh3("PARTIAL", 1);
        o = mh3Var2;
        mh3 mh3Var3 = new mh3("REFUSED", 2);
        p = mh3Var3;
        mh3 mh3Var4 = new mh3("TOO_LARGE", 3);
        q = mh3Var4;
        mh3 mh3Var5 = new mh3("RETRY", 4);
        r = mh3Var5;
        mh3 mh3Var6 = new mh3("NO_ENDPOINT", 5);
        s = mh3Var6;
        t = new mh3[]{mh3Var, mh3Var2, mh3Var3, mh3Var4, mh3Var5, mh3Var6};
    }

    public static mh3 valueOf(String str) {
        return (mh3) Enum.valueOf(mh3.class, str);
    }

    public static mh3[] values() {
        return (mh3[]) t.clone();
    }
}
