package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qg1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qg1(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    public final void a() {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((sh4) r1).k--;
        return;
    L6:
        ((rg1) r1).A--;
    }

    public final void b() {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((sh4) r1).k++;
        return;
    L6:
        ((rg1) r1).A++;
    }
}
