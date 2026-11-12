package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mt1 extends ig1 implements wf1 {
    public static final mt1 n = null;

    static {
        n = new mt1(2, Integer.TYPE, "plus", "plus(I)I", 0);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        int r0 = ((Number) r1).intValue();
        return Integer.valueOf(((Number) r2).intValue() + r0);
    }
}
