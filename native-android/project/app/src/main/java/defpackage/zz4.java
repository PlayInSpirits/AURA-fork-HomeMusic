package defpackage;

import com.google.common.reflect.TypeToken;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zz4 implements ro3 {
    public static final xz4 n;
    public static final /* synthetic */ zz4[] o;

    static {
        xz4 xz4Var = new xz4();
        n = xz4Var;
        o = new zz4[]{xz4Var, new zz4() { // from class: yz4
            @Override // defpackage.ro3
            public final boolean apply(Object obj) {
                return ((TypeToken) obj).getRawType().isInterface();
            }
        }};
    }

    public static zz4 valueOf(String str) {
        return (zz4) Enum.valueOf(zz4.class, str);
    }

    public static zz4[] values() {
        return (zz4[]) o.clone();
    }
}
