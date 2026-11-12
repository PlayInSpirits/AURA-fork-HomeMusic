package defpackage;

import androidx.media3.common.PlaybackException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hj0 implements qc2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ PlaybackException o;

    public /* synthetic */ hj0(q9 r1, PlaybackException r2) {
        this.n = 0;
        this.o = r2;
    }

    @Override // defpackage.qc2
    public final void invoke(Object r2) {
        int r0 = this.n;
        PlaybackException r1 = this.o;
        switch(r0) {
            case 0: goto L12;
            case 1: goto L10;
            case 2: goto L8;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        ((oi3) r2).S(r1);
        return;
    L6:
        ((oi3) r2).P(r1);
        return;
    L8:
        ((oi3) r2).S(r1);
        return;
    L10:
        ((oi3) r2).P(r1);
        return;
    L12:
        ((ho2) r2).o = r1;
    }

    public /* synthetic */ hj0(int r1, PlaybackException r2) {
        this.n = r1;
        this.o = r2;
    }
}
