package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class np3 extends dw3 {
    public final PreferenceGroup q;
    public ArrayList r;
    public ArrayList s;
    public final ArrayList t;
    public final Handler u;
    public final g5 v;

    public np3(PreferenceGroup r3) {
        this.v = new g5(25, this);
        this.q = r3;
        this.u = new Handler(Looper.getMainLooper());
        r3.U = this;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        if ((r3 instanceof PreferenceScreen) == false) goto L5;
        o(((PreferenceScreen) r3).j0);
    L6:
        s();
        return;
    L5:
        o(true);
        goto L6
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.s.size();
    }

    @Override // defpackage.dw3
    public final long b(int r2) {
        if (this.o == true) goto L7;
        return -1;
    L7:
        return r(r2).d();
    }

    @Override // defpackage.dw3
    public final int c(int r3) {
        mp3 r0 = new mp3(r(r3));
        ArrayList r2 = this.t;
        int r4 = r2.indexOf(r0);
        if (r4 == (-1)) goto L5;
        return r4;
    L5:
        int r5 = r2.size();
        r2.add(r0);
        return r5;
    }

    @Override // defpackage.dw3
    public final void g(cx3 r4, int r5) {
        rp3 r6 = (rp3) r4;
        Preference r3 = r(r5);
        ColorStateList r7 = r6.v;
        View r0 = r6.a;
        Drawable r1 = r0.getBackground();
        Drawable r2 = r6.u;
        if (r1 == r2) goto L5;
        WeakHashMap r8 = j65.a;
        r0.setBackground(r2);
    L5:
        TextView r9 = (TextView) r6.s(R.id.title);
        if (r9 == null) goto L11;
        if (r7 == null) goto L11;
        if (r9.getTextColors().equals(r7) == true) goto L11;
        r9.setTextColor(r7);
    L11:
        r3.l(r6);
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r5, int r6) {
        mp3 r4 = (mp3) this.t.get(r6);
        LayoutInflater r7 = LayoutInflater.from(r5.getContext());
        TypedArray r0 = r5.getContext().obtainStyledAttributes(null, bt3.a);
        Drawable r2 = r0.getDrawable(0);
        if (r2 != null) goto L5;
        r2 = zz1.r(r5.getContext(), R.drawable.list_selector_background);
    L5:
        r0.recycle();
        View r8 = r7.inflate(r4.a, r5, false);
        if (r8.getBackground() != null) goto L8;
        WeakHashMap r1 = j65.a;
        r8.setBackground(r2);
    L8:
        ViewGroup r3 = (ViewGroup) r8.findViewById(R.id.widget_frame);
        if (r3 == null) goto L15;
        int r9 = r4.b;
        if (r9 == 0) goto L13;
        r7.inflate(r9, r3);
        goto L15
    L13:
        r3.setVisibility(8);
    L15:
        return new rp3(r8);
    }

    public final ArrayList p(PreferenceGroup r15) {
        ArrayList r0 = new ArrayList();
        ArrayList r1 = new ArrayList();
        int r2 = r15.d0.size();
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
    L3:
        CharSequence r6 = null;
        if (r4 >= r2) goto L37;
        Preference r8 = r15.G(r4);
        if (r8.K == false) goto L36;
        int r9 = r15.h0;
        if (r9 == Integer.MAX_VALUE) goto L13;
        if (r5 < r9) goto L13;
        r1.add(r8);
    L15:
        if ((r8 instanceof PreferenceGroup) == true) goto L17;
        r5 = r5 + 1;
        goto L36
    L17:
        PreferenceGroup r10 = (PreferenceGroup) r8;
        if ((r10 instanceof PreferenceScreen) == true) goto L36;
        if (r15.h0 != Integer.MAX_VALUE) goto L23;
    L27:
        ArrayList r7 = p(r10);
        int r11 = r7.size();
        int r12 = 0;
    L28:
        if (r12 >= r11) goto L36;
        Object r13 = r7.get(r12);
        r12 = r12 + 1;
        Preference r14 = (Preference) r13;
        int r16 = r15.h0;
        if (r16 == Integer.MAX_VALUE) goto L34;
        if (r5 < r16) goto L34;
        r1.add(r14);
    L35:
        r5 = r5 + 1;
    L34:
        r0.add(r14);
        goto L35
    L23:
        if (r10.h0 == Integer.MAX_VALUE) goto L27;
        kf2.o("Nesting an expandable group inside of another expandable group is not supported!");
        return null;
    L13:
        r0.add(r8);
    L36:
        r4 = r4 + 1;
        goto L3
    L37:
        int r17 = r15.h0;
        if (r17 == Integer.MAX_VALUE) goto L62;
        if (r5 <= r17) goto L62;
        Context r18 = r15.n;
        long r19 = r15.p;
        u41 r20 = new u41(r18, null);
        r20.S = app.homemusic.R.layout.expand_button;
        r20.v(app.homemusic.R.drawable.ic_arrow_down_24dp);
        Context r21 = r20.n;
        r20.z(r21.getString(app.homemusic.R.string.expand_button_title));
        if (999 == r20.t) goto L45;
        r20.t = 999;
        np3 r22 = r20.U;
        if (r22 == null) goto L45;
        Handler r23 = r22.u;
        g5 r24 = r22.v;
        r23.removeCallbacks(r24);
        r23.post(r24);
    L45:
        ArrayList r25 = new ArrayList();
        int r26 = r1.size();
    L46:
        if (r3 >= r26) goto L61;
        Object r110 = r1.get(r3);
        r3 = r3 + 1;
        Preference r111 = (Preference) r110;
        CharSequence r112 = r111.u;
        boolean r113 = r111 instanceof PreferenceGroup;
        if (r113 == false) goto L53;
        if (TextUtils.isEmpty(r112) == true) goto L53;
        r25.add((PreferenceGroup) r111);
    L53:
        if (r25.contains(r111.W) == true) goto L54;
        if (TextUtils.isEmpty(r112) == true) goto L46;
        if (r6 == null) goto L59;
        r6 = r21.getString(app.homemusic.R.string.summary_collapsed_preference_list, new Object[]{r6, r112});
        goto L46
    L59:
        r6 = r112;
        goto L46
    L54:
        if (r113 == false) goto L46;
        r25.add((PreferenceGroup) r111);
        goto L46
    L61:
        r20.x(r6);
        r20.b0 = r19 + 1000000;
        r20.s = new qr2(16, this, r15);
        r0.add(r20);
    L62:
        return r0;
    }

    public final void q(ArrayList r6, PreferenceGroup r7) {
        monitor-enter(r7);
        Collections.sort(r7.d0);     // Catch: Throwable -> L17
        monitor-exit(r7);     // Catch: Throwable -> L17
        int r0 = r7.d0.size();
        int r1 = 0;
    L6:
        if (r1 >= r0) goto L16;
        Preference r2 = r7.G(r1);
        r6.add(r2);
        mp3 r3 = new mp3(r2);
        if (this.t.contains(r3) == true) goto L11;
        this.t.add(r3);
    L11:
        if ((r2 instanceof PreferenceGroup) == false) goto L15;
        PreferenceGroup r4 = (PreferenceGroup) r2;
        if ((r4 instanceof PreferenceScreen) == true) goto L15;
        q(r6, r4);
    L15:
        r2.U = this;
        r1 = r1 + 1;
        goto L6
    L16:
        return;
    L17:
        th = move-exception;
        throw th;
    }

    public final Preference r(int r2) {
        if (r2 >= 0) goto L4;
        return null;
    L4:
        if (r2 < this.s.size()) goto L7;
        return null;
    L7:
        return (Preference) this.s.get(r2);
    }

    public final void s() {
        ArrayList r0 = this.r;
        int r1 = r0.size();
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        Object r4 = r0.get(r3);
        r3 = r3 + 1;
        ((Preference) r4).U = null;
        goto L3
    L5:
        ArrayList r5 = new ArrayList(this.r.size());
        this.r = r5;
        PreferenceGroup r6 = this.q;
        q(r5, r6);
        this.s = p(r6);
        d();
        ArrayList r7 = this.r;
        int r8 = r7.size();
    L6:
        if (r2 >= r8) goto L8;
        Object r9 = r7.get(r2);
        r2 = r2 + 1;
        ((Preference) r9).getClass();
        goto L6
    }
}
