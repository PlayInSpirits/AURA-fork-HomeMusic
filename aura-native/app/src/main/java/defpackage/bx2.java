package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public interface bx2 extends dx2 {
    @Override // defpackage.dx2
    default boolean a(if1 if1Var) {
        return ((Boolean) if1Var.invoke(this)).booleanValue();
    }

    @Override // defpackage.dx2
    default Object b(wf1 wf1Var, Object obj) {
        return wf1Var.invoke(obj, this);
    }
}
