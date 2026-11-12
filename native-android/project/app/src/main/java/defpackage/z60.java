package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z60 implements vd0 {
    public static final z60 o = null;
    public static final z60 p = null;
    public final /* synthetic */ int n;

    static {
        o = new z60(0);
        p = new z60(1);
    }

    public /* synthetic */ z60(int r1) {
        this.n = r1;
    }

    private final void a(Object r1) {
    }

    @Override // defpackage.vd0
    public final ne0 getContext() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return q01.n;
    L7:
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // defpackage.vd0
    public final void resumeWith(Object r1) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return;
    L6:
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return "This continuation is already complete";
    L5:
        return super.toString();
    }
}
