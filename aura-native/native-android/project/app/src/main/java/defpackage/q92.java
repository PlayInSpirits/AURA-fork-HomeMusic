package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q92 {
    private static final /* synthetic */ t11 $ENTRIES;
    private static final /* synthetic */ q92[] $VALUES;
    public static final o92 Companion;
    public static final q92 ON_ANY;
    public static final q92 ON_CREATE;
    public static final q92 ON_DESTROY;
    public static final q92 ON_PAUSE;
    public static final q92 ON_RESUME;
    public static final q92 ON_START;
    public static final q92 ON_STOP;

    static {
        q92 q92Var = new q92("ON_CREATE", 0);
        ON_CREATE = q92Var;
        q92 q92Var2 = new q92("ON_START", 1);
        ON_START = q92Var2;
        q92 q92Var3 = new q92("ON_RESUME", 2);
        ON_RESUME = q92Var3;
        q92 q92Var4 = new q92("ON_PAUSE", 3);
        ON_PAUSE = q92Var4;
        q92 q92Var5 = new q92("ON_STOP", 4);
        ON_STOP = q92Var5;
        q92 q92Var6 = new q92("ON_DESTROY", 5);
        ON_DESTROY = q92Var6;
        q92 q92Var7 = new q92("ON_ANY", 6);
        ON_ANY = q92Var7;
        q92[] q92VarArr = {q92Var, q92Var2, q92Var3, q92Var4, q92Var5, q92Var6, q92Var7};
        $VALUES = q92VarArr;
        $ENTRIES = new u11(q92VarArr);
        Companion = new o92();
    }

    public static q92 valueOf(String str) {
        return (q92) Enum.valueOf(q92.class, str);
    }

    public static q92[] values() {
        return (q92[]) $VALUES.clone();
    }

    public final r92 a() {
        switch (p92.a[ordinal()]) {
            case 1:
            case 2:
                return r92.p;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
            case 4:
                return r92.q;
            case 5:
                return r92.r;
            case 6:
                return r92.n;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                er1.n();
                return null;
        }
    }
}
