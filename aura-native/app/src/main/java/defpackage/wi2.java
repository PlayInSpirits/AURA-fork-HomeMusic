package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public interface wi2 extends oo0 {
    boolean K();

    vi2 T(int i, int i2, Map map, if1 if1Var, if1 if1Var2);

    r62 getLayoutDirection();

    default vi2 v(int i, int i2, Map map, if1 if1Var) {
        return T(i, i2, map, null, if1Var);
    }
}
