package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gv4 implements fj0 {
    public final Toolbar a;
    public int b;
    public final View c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public boolean g;
    public CharSequence h;
    public final CharSequence i;
    public CharSequence j;
    public Window.Callback k;
    public boolean l;
    public y4 m;
    public final int n;
    public final Drawable o;

    public gv4(Toolbar r8, boolean r9) {
        this.n = 0;
        this.a = r8;
        this.h = r8.getTitle();
        this.i = r8.getSubtitle();
        if (this.h == null) goto L5;
        boolean r1 = true;
    L6:
        this.g = r1;
        this.f = r8.getNavigationIcon();
        jv3 r2 = jv3.f(r8.getContext(), null, st3.a, R.attr.actionBarStyle);
        TypedArray r3 = (TypedArray) r2.o;
        int r4 = 15;
        this.o = r2.c(15);
        if (r9 == false) goto L68;
        CharSequence r10 = r3.getText(27);
        if (TextUtils.isEmpty(r10) == true) goto L15;
        this.g = true;
        this.h = r10;
        if ((this.b & 8) == 0) goto L15;
        r8.setTitle(r10);
        if (this.g == false) goto L15;
        j65.p(r8.getRootView(), r10);
    L15:
        CharSequence r11 = r3.getText(25);
        if (TextUtils.isEmpty(r11) == true) goto L20;
        this.i = r11;
        if ((this.b & 8) == 0) goto L20;
        r8.setSubtitle(r11);
    L20:
        Drawable r12 = r2.c(20);
        if (r12 == null) goto L23;
        this.e = r12;
        d();
    L23:
        Drawable r13 = r2.c(17);
        if (r13 == null) goto L27;
        this.d = r13;
        d();
    L27:
        if (this.f != null) goto L34;
        Drawable r14 = this.o;
        if (r14 == null) goto L34;
        this.f = r14;
        if ((this.b & 4) == 0) goto L33;
        r8.setNavigationIcon(r14);
        goto L34
    L33:
        r8.setNavigationIcon(null);
    L34:
        a(r3.getInt(10, 0));
        int r15 = r3.getResourceId(9, 0);
        if (r15 == 0) goto L47;
        View r16 = LayoutInflater.from(r8.getContext()).inflate(r15, r8, false);
        View r5 = this.c;
        if (r5 != null) goto L39;
    L41:
        this.c = r16;
        if (r16 != null) goto L44;
    L46:
        a(this.b | 16);
        goto L47
    L44:
        if ((this.b & 16) == 0) goto L46;
        r8.addView(r16);
        goto L46
    L39:
        if ((this.b & 16) == 0) goto L41;
        r8.removeView(r5);
    L47:
        int r17 = r3.getLayoutDimension(13, 0);
        if (r17 <= 0) goto L50;
        ViewGroup.LayoutParams r6 = r8.getLayoutParams();
        r6.height = r17;
        r8.setLayoutParams(r6);
    L50:
        int r18 = r3.getDimensionPixelOffset(7, -1);
        int r7 = r3.getDimensionPixelOffset(3, -1);
        if (r18 >= 0) goto L53;
        if (r7 >= 0) goto L53;
    L54:
        int r19 = r3.getResourceId(28, 0);
        if (r19 == 0) goto L59;
        Context r20 = r8.getContext();
        r8.y = r19;
        mh r21 = r8.o;
        if (r21 == null) goto L59;
        r21.setTextAppearance(r20, r19);
    L59:
        int r22 = r3.getResourceId(26, 0);
        if (r22 == 0) goto L64;
        Context r23 = r8.getContext();
        r8.z = r22;
        mh r24 = r8.p;
        if (r24 == null) goto L64;
        r24.setTextAppearance(r23, r22);
    L64:
        int r25 = r3.getResourceId(22, 0);
        if (r25 == 0) goto L72;
        r8.setPopupTheme(r25);
    L72:
        r2.g();
        if (R.string.abc_action_bar_up_description == this.n) goto L78;
        this.n = R.string.abc_action_bar_up_description;
        if (TextUtils.isEmpty(r8.getNavigationContentDescription()) == false) goto L78;
        b(this.n);
    L78:
        this.j = r8.getNavigationContentDescription();
        r8.setNavigationOnClickListener(new xp2(this));
        return;
    L53:
        int r26 = Math.max(r18, 0);
        int r27 = Math.max(r7, 0);
        r8.d();
        r8.G.a(r26, r27);
        goto L54
    L68:
        if (r8.getNavigationIcon() == null) goto L70;
        this.o = r8.getNavigationIcon();
    L71:
        this.b = r4;
        goto L72
    L70:
        r4 = 11;
        goto L71
    L5:
        r1 = false;
        goto L6
    }

    public final void a(int r5) {
        int r0 = this.b ^ r5;
        this.b = r5;
        if (r0 == 0) goto L36;
        int r1 = r0 & 4;
        Toolbar r3 = this.a;
        if (r1 == 0) goto L18;
        if ((r5 & 4) == 0) goto L10;
        c();
    L10:
        if ((this.b & 4) == 0) goto L16;
        Drawable r2 = this.f;
        if (r2 != null) goto L15;
        r2 = this.o;
    L15:
        r3.setNavigationIcon(r2);
        goto L18
    L16:
        r3.setNavigationIcon(null);
    L18:
        if ((r0 & 3) == 0) goto L21;
        d();
    L21:
        if ((r0 & 8) == 0) goto L27;
        if ((r5 & 8) == 0) goto L25;
        r3.setTitle(this.h);
        r3.setSubtitle(this.i);
        goto L27
    L25:
        r3.setTitle(null);
        r3.setSubtitle(null);
    L27:
        if ((r0 & 16) == 0) goto L37;
        View r4 = this.c;
        if (r4 != null) goto L31;
        return;
    L31:
        if ((r5 & 16) == 0) goto L34;
        r3.addView(r4);
        return;
    L34:
        r3.removeView(r4);
        return;
    L37:
        return;
    }

    public final void b(int r2) {
        if (r2 != 0) goto L4;
        String r3 = null;
    L5:
        this.j = r3;
        c();
        return;
    L4:
        r3 = this.a.getContext().getString(r2);
        goto L5
    }

    public final void c() {
        if ((this.b & 4) == 0) goto L10;
        boolean r0 = TextUtils.isEmpty(this.j);
        Toolbar r1 = this.a;
        if (r0 == false) goto L8;
        r1.setNavigationContentDescription(this.n);
        return;
    L8:
        r1.setNavigationContentDescription(this.j);
        return;
    }

    public final void d() {
        int r0 = this.b;
        if ((r0 & 2) != 0) goto L5;
        Drawable r1 = null;
    L12:
        this.a.setLogo(r1);
        return;
    L5:
        if ((r0 & 1) == 0) goto L10;
        r1 = this.e;
        if (r1 != null) goto L12;
        r1 = this.d;
        goto L12
    L10:
        r1 = this.d;
        goto L12
    }
}
