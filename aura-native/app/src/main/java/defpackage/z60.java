package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class z60 implements vd0 {
    public static final z60 o = new z60(0);
    public static final z60 p = new z60(1);
    public final /* synthetic */ int n;

    public /* synthetic */ z60(int i) {
        this.n = i;
    }

    @Override // defpackage.vd0
    public final ne0 getContext() {
        switch (this.n) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return q01.n;
        }
    }

    @Override // defpackage.vd0
    public final void resumeWith(Object obj) {
        switch (this.n) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.n) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}
