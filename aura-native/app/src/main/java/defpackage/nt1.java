package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class nt1 extends ig1 implements wf1 {
    public nt1(int a0, java.lang.Class a1, java.lang.String a2, java.lang.String a3, int a4) {
        super(a0, a1, a2, a3, a4);
    }

    public static final nt1 n = new nt1(2, Integer.TYPE, "plus", "plus(I)I", 0);

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(((Number) obj2).intValue() + ((Number) obj).intValue());
    }
}
