package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cl0 implements ro3 {
    public final /* synthetic */ int n;

    public /* synthetic */ cl0(int r1) {
        this.n = r1;
    }

    @Override // defpackage.ro3
    public final boolean apply(Object r1) {
        switch(this.n) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (((String) r1) == null) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (((Map.Entry) r1).getKey() == null) goto L12;
        return true;
    L12:
        return false;
    }
}
