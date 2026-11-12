package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dp extends kb0 {
    public int u;
    public int v;
    public ep w;

    public boolean getAllowsGoneWidget() {
        return this.w.s0;
    }

    public int getMargin() {
        return this.w.t0;
    }

    public int getType() {
        return this.u;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.w.s0 = z;
    }

    public void setDpMargin(int i) {
        this.w.t0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.w.t0 = i;
    }

    public void setType(int i) {
        this.u = i;
    }
}
