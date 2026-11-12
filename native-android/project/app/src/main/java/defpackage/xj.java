package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xj implements dk {
    public final /* synthetic */ int n;
    public final /* synthetic */ k03 o;

    public /* synthetic */ xj(k03 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.dk
    public final void e(ArrayList r3) {
        int r0 = this.n;
        k03 r2 = this.o;
        switch(r0) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        r2.i(r3);
        return;
    L6:
        r2.i(r3);
        return;
    L8:
        Collections.shuffle(r3);
        r2.k((List) r3.stream().limit(50).collect(Collectors.toList()));
        return;
    L10:
        r2.i(r3);
    }
}
