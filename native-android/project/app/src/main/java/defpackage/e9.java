package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class e9 {
    public final a9 a;
    public final int b;

    public e9(Context r4, int r5) {
        this.a = new a9(new ContextThemeWrapper(r4, f9.j(r4, r5)));
        this.b = r5;
    }

    public e9 a() {
        this.a.m = false;
        return this;
    }

    public e9 b(Drawable r2) {
        this.a.c = r2;
        return this;
    }

    public void c(CharSequence r1) {
        this.a.f = r1;
    }

    public f9 create() {
        a9 r2 = this.a;
        ContextThemeWrapper r1 = r2.a;
        ContextThemeWrapper r3 = r2.a;
        f9 r0 = new f9(r1, this.b);
        View r11 = r2.e;
        d9 r7 = r0.t;
        int r8 = 0;
        if (r11 == null) goto L5;
        r7.w = r11;
    L15:
        CharSequence r12 = r2.f;
        if (r12 == null) goto L20;
        r7.e = r12;
        TextView r4 = r7.v;
        if (r4 == null) goto L20;
        r4.setText(r12);
    L20:
        CharSequence r13 = r2.g;
        if (r13 == null) goto L24;
        r7.c(-1, r13, r2.h);
    L24:
        CharSequence r14 = r2.i;
        if (r14 == null) goto L28;
        r7.c(-2, r14, r2.j);
    L28:
        CharSequence r15 = r2.k;
        if (r15 == null) goto L33;
        r7.c(-3, r15, r2.l);
    L33:
        if (r2.p == null) goto L35;
    L36:
        AlertController$RecycleListView r6 = (AlertController$RecycleListView) r2.b.inflate(r7.A, null);
        if (r2.u == false) goto L40;
        ListAdapter r5 = new x8(r2, r3, r7.B, r2.p, r6);
    L47:
        r7.x = r5;
        r7.y = r2.w;
        if (r2.r == null) goto L51;
        r6.setOnItemClickListener(new y8(r8, r2, r7));
    L54:
        if (r2.v == false) goto L57;
        r6.setChoiceMode(1);
    L59:
        r7.f = r6;
    L60:
        View r16 = r2.s;
        if (r16 == null) goto L63;
        r7.g = r16;
        r7.h = false;
    L63:
        r0.setCancelable(r2.m);
        if (r2.m == false) goto L66;
        r0.setCanceledOnTouchOutside(true);
    L66:
        r0.setOnCancelListener(null);
        r0.setOnDismissListener(r2.n);
        ru2 r17 = r2.o;
        if (r17 == null) goto L69;
        r0.setOnKeyListener(r17);
    L69:
        return r0;
    L57:
        if (r2.u == false) goto L59;
        r6.setChoiceMode(2);
        goto L59
    L51:
        if (r2.x == null) goto L54;
        r6.setOnItemClickListener(new z8(r2, r6, r7));
        goto L54
    L40:
        if (r2.v == false) goto L42;
        int r18 = r7.C;
    L43:
        r5 = r2.q;
        if (r5 != null) goto L47;
        r5 = new c9(r3, r18, R.id.text1, r2.p);
        goto L47
    L42:
        r18 = r7.D;
        goto L43
    L35:
        if (r2.q == null) goto L60;
    L5:
        CharSequence r19 = r2.d;
        if (r19 == null) goto L10;
        r7.d = r19;
        TextView r9 = r7.u;
        if (r9 == null) goto L10;
        r9.setText(r19);
    L10:
        Drawable r110 = r2.c;
        if (r110 == null) goto L15;
        r7.s = r110;
        ImageView r10 = r7.t;
        if (r10 == null) goto L15;
        r10.setVisibility(0);
        r7.t.setImageDrawable(r110);
        goto L15
    }

    public e9 d(CharSequence r2, ip3 r3) {
        a9 r0 = this.a;
        r0.i = r2;
        r0.j = r3;
        return this;
    }

    public e9 e(int r3, DialogInterface.OnClickListener r4) {
        a9 r0 = this.a;
        r0.k = r0.a.getText(r3);
        r0.l = r4;
        return this;
    }

    public e9 f(CharSequence r2, DialogInterface.OnClickListener r3) {
        a9 r0 = this.a;
        r0.g = r2;
        r0.h = r3;
        return this;
    }

    public void g(CharSequence[] r1, int r2, DialogInterface.OnClickListener r3) {
        a9 r0 = this.a;
        r0.p = r1;
        r0.r = r3;
        r0.w = r2;
        r0.v = true;
    }

    public Context getContext() {
        return this.a.a;
    }

    public final f9 h() {
        f9 r0 = create();
        r0.show();
        return r0;
    }

    public e9 setNegativeButton(int r3, DialogInterface.OnClickListener r4) {
        a9 r0 = this.a;
        r0.i = r0.a.getText(r3);
        r0.j = r4;
        return this;
    }

    public e9 setPositiveButton(int r3, DialogInterface.OnClickListener r4) {
        a9 r0 = this.a;
        r0.g = r0.a.getText(r3);
        r0.h = r4;
        return this;
    }

    public e9 setTitle(CharSequence r2) {
        this.a.d = r2;
        return this;
    }

    public e9 setView(View r2) {
        this.a.s = r2;
        return this;
    }

    public e9(Context r2) {
        this(r2, f9.j(r2, 0));
    }
}
