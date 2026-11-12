package defpackage;

import android.content.ContentResolver;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t25 implements vw2 {
    public final /* synthetic */ int a;
    public final ContentResolver b;

    public /* synthetic */ t25(ContentResolver r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.vw2
    public final uw2 a(na4 r1) {
        switch(this.a) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new u25(this);
    L7:
        return new u25(this);
    L9:
        return new u25(this);
    }
}
