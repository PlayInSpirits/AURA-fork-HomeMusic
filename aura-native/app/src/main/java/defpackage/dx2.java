package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public interface dx2 {
    boolean a(if1 if1Var);

    Object b(wf1 wf1Var, Object obj);

    default dx2 c(dx2 dx2Var) {
        return dx2Var == ax2.a ? this : new h60(this, dx2Var);
    }
}
