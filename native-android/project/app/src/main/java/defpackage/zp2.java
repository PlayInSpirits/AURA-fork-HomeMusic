package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import app.homemusic.R;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zp2 extends dw3 {
    public final ArrayList q;
    public final LayoutInflater r;
    public final Drawable s;
    public final Drawable t;
    public final Drawable u;
    public final Drawable v;
    public final /* synthetic */ aq2 w;

    public zp2(aq2 r2) {
        this.w = r2;
        this.q = new ArrayList();
        Context r3 = r2.v;
        this.r = LayoutInflater.from(r3);
        this.s = fu.y(r3, R.attr.mediaRouteDefaultIconDrawable);
        this.t = fu.y(r3, R.attr.mediaRouteTvIconDrawable);
        this.u = fu.y(r3, R.attr.mediaRouteSpeakerIconDrawable);
        this.v = fu.y(r3, R.attr.mediaRouteSpeakerGroupIconDrawable);
        p();
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.q.size();
    }

    @Override // defpackage.dw3
    public final int c(int r1) {
        return ((wp2) this.q.get(r1)).b;
    }

    @Override // defpackage.dw3
    public final void g(cx3 r8, int r9) {
        int r0 = c(r9);
        wp2 r7 = (wp2) this.q.get(r9);
        if (r0 != 1) goto L5;
        ((vp2) r8).u.setText(r7.a.toString());
        return;
    L5:
        if (r0 == 2) goto L8;
        Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
        return;
    L8:
        yp2 r10 = (yp2) r8;
        wq2 r11 = (wq2) r7.a;
        View r1 = r10.u;
        r1.setVisibility(0);
        r10.w.setVisibility(4);
        r1.setOnClickListener(new xp2(r10, r11));
        r10.x.setText(r11.d);
        ImageView r2 = r10.v;
        zp2 r12 = r10.y;
        Uri r3 = r11.f;
        if (r3 != null) goto L29;
    L15:
        int r4 = r11.n;
        if (r4 == 1) goto L24;
        if (r4 != 2) goto L19;
        Drawable r13 = r12.u;
    L21:
        Drawable r5 = r13;
    L25:
        r2.setImageDrawable(r5);
        return;
    L19:
        if (r11.e() == false) goto L22;
        r13 = r12.v;
        goto L21
    L22:
        r13 = r12.s;
        goto L21
    L24:
        r13 = r12.t;
        goto L21
    L29:
        r5 = Drawable.createFromStream(r12.w.v.getContentResolver().openInputStream(r3), null);     // Catch: IOException -> L13
        if (r5 == null) goto L15;
    L13:
        e = move-exception;
        Log.w("RecyclerAdapter", "Failed to load " + r3, e);
        goto L15
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r4, int r5) {
        LayoutInflater r2 = this.r;
        if (r5 != 1) goto L5;
        View r3 = r2.inflate(R.layout.mr_picker_header_item, r4, false);
        vp2 r6 = new vp2(r3);
        r6.u = (TextView) r3.findViewById(R.id.mr_picker_header_name);
        return r6;
    L5:
        if (r5 == 2) goto L7;
        tb4.a();
        return null;
    L7:
        return new yp2(this, r2.inflate(R.layout.mr_picker_route_item, r4, false));
    }

    public final void p() {
        ArrayList r0 = this.q;
        r0.clear();
        aq2 r2 = this.w;
        r0.add(new wp2(r2.v.getString(R.string.mr_chooser_title)));
        ArrayList r1 = r2.x;
        int r3 = r1.size();
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L5;
        Object r5 = r1.get(r4);
        r4 = r4 + 1;
        r0.add(new wp2((wq2) r5));
        goto L3
    L5:
        d();
    }
}
