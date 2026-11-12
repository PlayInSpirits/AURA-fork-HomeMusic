package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import app.homemusic.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jq2 extends dw3 {
    public final ArrayList q;
    public final LayoutInflater r;
    public final Drawable s;
    public final Drawable t;
    public final Drawable u;
    public final Drawable v;
    public hq2 w;
    public final int x;
    public final AccelerateDecelerateInterpolator y;
    public final /* synthetic */ lq2 z;

    public jq2(lq2 r2) {
        this.z = r2;
        this.q = new ArrayList();
        Context r3 = r2.B;
        this.r = LayoutInflater.from(r3);
        this.s = fu.y(r3, R.attr.mediaRouteDefaultIconDrawable);
        this.t = fu.y(r3, R.attr.mediaRouteTvIconDrawable);
        this.u = fu.y(r3, R.attr.mediaRouteSpeakerIconDrawable);
        this.v = fu.y(r3, R.attr.mediaRouteSpeakerGroupIconDrawable);
        this.x = r3.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
        this.y = new AccelerateDecelerateInterpolator();
        s();
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.q.size() + 1;
    }

    @Override // defpackage.dw3
    public final int c(int r1) {
        if (r1 != 0) goto L4;
        hq2 r0 = this.w;
    L6:
        return r0.b;
    L4:
        r0 = (hq2) this.q.get(r1 - 1);
        goto L6
    }

    @Override // defpackage.dw3
    public final void g(cx3 r17, int r18) {
        ArrayList r1 = this.q;
        if (r18 != 0) goto L5;
        hq2 r2 = this.w;
    L6:
        int r3 = r2.b;
        boolean r4 = true;
        if (r18 != 0) goto L9;
        hq2 r5 = this.w;
    L10:
        lq2 r0 = this.z;
        int r6 = 0;
        if (r3 != 1) goto L13;
        r0.J.put(((wq2) r5.a).c, (dq2) r17);
        fq2 r7 = (fq2) r17;
        View r8 = r7.a;
        lq2 r9 = r7.A.z;
        if (r9.f0 == true) goto L89;
    L91:
        ViewGroup.LayoutParams r10 = r8.getLayoutParams();
        r10.height = r6;
        r8.setLayoutParams(r10);
        wq2 r11 = (wq2) r5.a;
        r7.s(r11);
        r7.y.setText(r11.d);
        return;
    L89:
        if (Collections.unmodifiableList(r9.w.v).size() <= 1) goto L91;
        r6 = r7.z;
        goto L91
    L13:
        if (r3 != 2) goto L15;
        ((gq2) r17).u.setText(r5.a.toString());
        return;
    L15:
        if (r3 == 3) goto L27;
        if (r3 != 4) goto L25;
        eq2 r12 = (eq2) r17;
        View r13 = r12.u;
        wq2 r14 = (wq2) r5.a;
        r12.z = r14;
        ImageView r15 = r12.v;
        r15.setVisibility(0);
        r12.w.setVisibility(4);
        jq2 r16 = r12.A;
        List r19 = Collections.unmodifiableList(r16.z.w.v);
        if (r19.size() == 1) goto L20;
    L22:
        float r20 = 1.0f;
    L23:
        r13.setAlpha(r20);
        r13.setOnClickListener(new i4(8, r12));
        r15.setImageDrawable(r16.q(r14));
        r12.x.setText(r14.d);
        return;
    L20:
        if (r19.get(0) != r14) goto L22;
        r20 = r12.y;
        goto L23
    L25:
        tb4.a();
        return;
    L27:
        r0.J.put(((wq2) r5.a).c, (dq2) r17);
        iq2 r21 = (iq2) r17;
        float r22 = r21.E;
        i4 r23 = r21.G;
        ImageView r24 = r21.z;
        View r110 = r21.y;
        CheckBox r111 = r21.D;
        wq2 r25 = (wq2) r5.a;
        jq2 r112 = r21.H;
        lq2 r113 = r112.z;
        if (r25 == r113.w) goto L30;
    L37:
        r21.s(r25);
        r24.setImageDrawable(r112.q(r25));
        r21.B.setText(r25.d);
        r111.setVisibility(0);
        boolean r26 = r21.u(r25);
        if (r113.A.contains(r25) == false) goto L41;
    L39:
        boolean r27 = false;
    L54:
        r111.setChecked(r26);
        r21.A.setVisibility(4);
        r24.setVisibility(0);
        r110.setEnabled(r27);
        r111.setEnabled(r27);
        ImageButton r28 = r21.v;
        if (r27 == true) goto L59;
        if (r26 == true) goto L59;
        boolean r29 = false;
    L60:
        r28.setEnabled(r29);
        MediaRouteVolumeSlider r30 = r21.w;
        if (r27 == true) goto L65;
        if (r26 == true) goto L65;
        r4 = false;
    L65:
        r30.setEnabled(r4);
        r110.setOnClickListener(r23);
        r111.setOnClickListener(r23);
        RelativeLayout r31 = r21.C;
        if (r26 == true) goto L68;
    L70:
        ViewGroup.LayoutParams r32 = r31.getLayoutParams();
        r32.height = r6;
        r31.setLayoutParams(r32);
        if (r27 == true) goto L75;
        if (r26 == true) goto L75;
        float r33 = r22;
    L76:
        r110.setAlpha(r33);
        if (r27 == true) goto L81;
        if (r26 == false) goto L81;
        float r34 = r22;
    L82:
        r111.setAlpha(r34);
        return;
    L81:
        r34 = 1.0f;
    L75:
        r33 = 1.0f;
        goto L76
    L68:
        if (r21.u.e() == true) goto L70;
        r6 = r21.F;
    L59:
        r29 = true;
        goto L60
    L41:
        if (r21.u(r25) == false) goto L46;
        if (Collections.unmodifiableList(r113.w.v).size() < 2) goto L39;
    L46:
        if (r21.u(r25) == false) goto L53;
        tq2 r35 = r113.w.a();
        if (r35 == null) goto L39;
        mq2 r36 = (mq2) r35.x.get(r25.c);
        if (r36 == null) goto L39;
        if (r36.c == false) goto L39;
    L53:
        r27 = true;
        goto L54
    L30:
        if (Collections.unmodifiableList(r25.v).size() <= 0) goto L37;
        Iterator r114 = Collections.unmodifiableList(r25.v).iterator();
    L33:
        if (r114.hasNext() == false) goto L37;
        wq2 r115 = (wq2) r114.next();
        if (r113.y.contains(r115) == true) goto L33;
        r25 = r115;
        goto L37
    L9:
        r5 = (hq2) r1.get(r18 - 1);
        goto L10
    L5:
        r2 = (hq2) r1.get(r18 - 1);
        goto L6
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r4, int r5) {
        LayoutInflater r2 = this.r;
        if (r5 == 1) goto L19;
        if (r5 == 2) goto L17;
        if (r5 == 3) goto L15;
        if (r5 == 4) goto L11;
        tb4.a();
        return null;
    L11:
        return new eq2(this, r2.inflate(R.layout.mr_cast_group_item, r4, false));
    L15:
        return new iq2(this, r2.inflate(R.layout.mr_cast_route_item, r4, false));
    L17:
        return new gq2(r2.inflate(R.layout.mr_cast_header_item, r4, false));
    L19:
        return new fq2(this, r2.inflate(R.layout.mr_cast_group_volume_item, r4, false));
    }

    @Override // defpackage.dw3
    public final void n(cx3 r1) {
        this.z.J.values().remove(r1);
    }

    public final void p(View r5, int r6) {
        jp2 r1 = new jp2(r6, r5.getLayoutParams().height, 1, r5);
        r1.setAnimationListener(new gp2(2, this));
        r1.setDuration(this.x);
        r1.setInterpolator(this.y);
        r5.startAnimation(r1);
    }

    public final Drawable q(wq2 r5) {
        Uri r0 = r5.f;
        if (r0 != null) goto L20;
    L9:
        int r1 = r5.n;
        if (r1 == 1) goto L19;
        if (r1 == 2) goto L24;
        if (r5.e() == false) goto L23;
        return this.v;
    L23:
        return this.s;
    L24:
        return this.u;
    L19:
        return this.t;
    L20:
        Drawable r2 = Drawable.createFromStream(this.z.B.getContentResolver().openInputStream(r0), null);     // Catch: IOException -> L7
        if (r2 == null) goto L9;
        return r2;
    L7:
        e = move-exception;
        Log.w("MediaRouteCtrlDialog", "Failed to load " + r0, e);
        goto L9
    }

    public final void r() {
        lq2 r0 = this.z;
        ArrayList r1 = r0.A;
        r1.clear();
        ArrayList r2 = r0.y;
        ArrayList r3 = new ArrayList();
        tq2 r4 = r0.w.a();
        if (r4 == null) goto L10;
        vq2 r5 = r0.w.a;
        r5.getClass();
        yq2.b();
        Iterator r6 = Collections.unmodifiableList(r5.b).iterator();
    L6:
        if (r6.hasNext() == false) goto L10;
        wq2 r7 = (wq2) r6.next();
        if (r4.n(r7) == false) goto L6;
        r3.add(r7);
    L10:
        HashSet r8 = new HashSet(r2);
        r8.removeAll(r3);
        r1.addAll(r8);
        d();
    }

    public final void s() {
        ArrayList r1 = this.q;
        r1.clear();
        lq2 r3 = this.z;
        ArrayList r4 = r3.z;
        Context r5 = r3.B;
        ArrayList r6 = r3.y;
        this.w = new hq2(1, r3.w);
        ArrayList r2 = r3.x;
        boolean r10 = false;
        if (r2.isEmpty() == true) goto L7;
        int r7 = r2.size();
        int r11 = 0;
    L5:
        if (r11 >= r7) goto L9;
        Object r12 = r2.get(r11);
        r11 = r11 + 1;
        r1.add(new hq2(3, (wq2) r12));
    L9:
        if (r6.isEmpty() == true) goto L26;
        int r8 = r6.size();
        boolean r13 = false;
        int r14 = 0;
    L11:
        if (r14 >= r8) goto L26;
        Object r15 = r6.get(r14);
        r14 = r14 + 1;
        wq2 r16 = (wq2) r15;
        if (r2.contains(r16) == true) goto L11;
        if (r13 == true) goto L23;
        r3.w.getClass();
        nq2 r17 = wq2.b();
        if (r17 == null) goto L18;
        String r18 = r17.j();
    L20:
        if (TextUtils.isEmpty(r18) == false) goto L22;
        r18 = r5.getString(R.string.mr_dialog_groupable_header);
    L22:
        r1.add(new hq2(2, r18));
        r13 = true;
        goto L23
    L18:
        r18 = null;
    L23:
        r1.add(new hq2(3, r16));
    L26:
        if (r4.isEmpty() == true) goto L41;
        int r9 = r4.size();
        int r19 = 0;
    L28:
        if (r19 >= r9) goto L41;
        Object r20 = r4.get(r19);
        r19 = r19 + 1;
        wq2 r21 = (wq2) r20;
        wq2 r22 = r3.w;
        if (r22 == r21) goto L28;
        if (r10 == true) goto L40;
        r22.getClass();
        nq2 r23 = wq2.b();
        if (r23 == null) goto L35;
        String r24 = r23.k();
    L37:
        if (TextUtils.isEmpty(r24) == false) goto L39;
        r24 = r5.getString(R.string.mr_dialog_transferable_header);
    L39:
        r1.add(new hq2(2, r24));
        r10 = true;
        goto L40
    L35:
        r24 = null;
    L40:
        r1.add(new hq2(4, r21));
    L41:
        r();
        return;
    L7:
        r1.add(new hq2(3, r3.w));
        goto L9
    }
}
