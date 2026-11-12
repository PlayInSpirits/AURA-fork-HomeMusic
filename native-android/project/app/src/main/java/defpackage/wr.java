package defpackage;

import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wr implements DialogInterface.OnClickListener {
    public final /* synthetic */ int n;

    public /* synthetic */ wr(int r1) {
        this.n = r1;
    }

    private final void a(DialogInterface r1, int r2) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r1, int r2) {
        switch(this.n) {
            case 0: goto L32;
            case 1: goto L30;
            case 2: goto L28;
            case 3: goto L34;
            case 4: goto L26;
            case 5: goto L24;
            case 6: goto L22;
            case 7: goto L20;
            case 8: goto L18;
            case 9: goto L16;
            case 10: goto L14;
            case 11: goto L12;
            case 12: goto L10;
            case 13: goto L8;
            case 14: goto L6;
            default: goto L4;
        };
    L4:
        r1.cancel();
        return;
    L6:
        r1.cancel();
        return;
    L8:
        r1.cancel();
        return;
    L10:
        r1.cancel();
        return;
    L12:
        r1.cancel();
        return;
    L14:
        r1.cancel();
        return;
    L16:
        r1.cancel();
        return;
    L18:
        r1.cancel();
        return;
    L20:
        r1.cancel();
        return;
    L22:
        r1.cancel();
        return;
    L24:
        r1.cancel();
        return;
    L26:
        r1.cancel();
        return;
    L28:
        r1.cancel();
        return;
    L30:
        r1.cancel();
        return;
    L32:
        xa3.t("battery_optimization", false);
        return;
    }
}
