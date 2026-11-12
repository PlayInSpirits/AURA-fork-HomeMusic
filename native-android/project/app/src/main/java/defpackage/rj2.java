package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rj2 extends qj2 {
    public final /* synthetic */ sj2 o;

    public rj2(sj2 r1, Context r2) {
        this.o = r1;
        super(r1, r2);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String r5, MediaBrowserService.Result r6, Bundle r7) {
        Bundle r8 = f35.n(r7);
        sj2 r4 = this.o;
        pn2 r0 = r4.s;
        oj2 r1 = r0.p;
        pj2 r9 = new pj2(r4, r5, new om1(7, r6), r8);
        r0.s = r1;
        r0.d(r5, r9, r8);
        r0.s = null;
        r0.s = null;
    }
}
