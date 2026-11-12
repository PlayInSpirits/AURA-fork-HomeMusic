package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zo3 implements ro3 {
    public static final vo3 n;
    public static final /* synthetic */ zo3[] o;

    static {
        vo3 vo3Var = new vo3();
        n = vo3Var;
        o = new zo3[]{vo3Var, new zo3() { // from class: wo3
            @Override // defpackage.ro3
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new zo3() { // from class: xo3
            @Override // defpackage.ro3
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new zo3() { // from class: yo3
            @Override // defpackage.ro3
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static zo3 valueOf(String str) {
        return (zo3) Enum.valueOf(zo3.class, str);
    }

    public static zo3[] values() {
        return (zo3[]) o.clone();
    }
}
