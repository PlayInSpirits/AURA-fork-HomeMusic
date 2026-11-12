package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z91 {
    public static final z91 n;
    public static final z91 o;
    public static final z91 p;
    public static final /* synthetic */ z91[] q;

    static {
        z91 z91Var = new z91("Active", 0);
        n = z91Var;
        z91 z91Var2 = new z91("ActiveParent", 1);
        o = z91Var2;
        z91 z91Var3 = new z91("Captured", 2);
        z91 z91Var4 = new z91("Inactive", 3);
        p = z91Var4;
        q = new z91[]{z91Var, z91Var2, z91Var3, z91Var4};
    }

    public static z91 valueOf(String str) {
        return (z91) Enum.valueOf(z91.class, str);
    }

    public static z91[] values() {
        return (z91[]) q.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                er1.n();
                return false;
            }
        }
        return true;
    }
}
