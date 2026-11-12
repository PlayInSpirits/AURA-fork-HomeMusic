package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class te extends ue {
    public final /* synthetic */ int d;

    public /* synthetic */ te(int r1, String r2, String r3) {
        this.d = r1;
        super(r2, r3);
    }

    @Override // defpackage.ue
    public final boolean a() {
        switch(this.d) {
            case 0: goto L28;
            case 1: goto L26;
            case 2: goto L24;
            case 3: goto L20;
            case 4: goto L15;
            case 5: goto L10;
            default: goto L5;
        };
    L24:
        return false;
    L26:
        return true;
    L28:
        return true;
    L5:
        if (Build.VERSION.SDK_INT < 29) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (Build.VERSION.SDK_INT < 28) goto L12;
        return true;
    L12:
        return false;
    L15:
        if (Build.VERSION.SDK_INT < 27) goto L17;
        return true;
    L17:
        return false;
    L20:
        if (Build.VERSION.SDK_INT < 26) goto L22;
        return true;
    L22:
        return false;
    }
}
