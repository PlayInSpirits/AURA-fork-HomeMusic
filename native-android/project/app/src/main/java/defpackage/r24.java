package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r24 {
    public static final r24 n;
    public static final r24 o;
    public static final r24 p;
    public static final /* synthetic */ r24[] q;

    static {
        r24 r24Var = new r24("AUTOMATIC", 0);
        n = r24Var;
        r24 r24Var2 = new r24("TRUNCATE", 1);
        o = r24Var2;
        r24 r24Var3 = new r24("WRITE_AHEAD_LOGGING", 2);
        p = r24Var3;
        q = new r24[]{r24Var, r24Var2, r24Var3};
    }

    public static r24 valueOf(String str) {
        return (r24) Enum.valueOf(r24.class, str);
    }

    public static r24[] values() {
        return (r24[]) q.clone();
    }
}
