package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class rj2 extends qj2 {
    public final /* synthetic */ sj2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj2(sj2 sj2Var, Context context) {
        super(sj2Var, context);
        this.o = sj2Var;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        Bundle n = f35.n(bundle);
        sj2 sj2Var = this.o;
        pn2 pn2Var = sj2Var.s;
        oj2 oj2Var = pn2Var.p;
        pj2 pj2Var = new pj2(sj2Var, str, new om1(7, result), n);
        pn2Var.s = oj2Var;
        pn2Var.d(str, pj2Var, n);
        pn2Var.s = null;
        pn2Var.s = null;
    }
}
