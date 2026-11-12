package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xt extends ut {
    public final Boolean a;
    public final pb5 b;
    public Window c;
    public boolean d;

    public xt(View r1, pb5 r2) {
        this.b = r2;
        fi2 r3 = BottomSheetBehavior.C(r1).v;
        if (r3 == null) goto L5;
        ColorStateList r4 = r3.n.c;
    L6:
        if (r4 == null) goto L10;
        this.a = Boolean.valueOf(g12.B(r4.getDefaultColor()));
        return;
    L10:
        if ((r1.getBackground() instanceof ColorDrawable) == false) goto L13;
        this.a = Boolean.valueOf(g12.B(((ColorDrawable) r1.getBackground()).getColor()));
        return;
    L13:
        this.a = null;
        return;
    L5:
        WeakHashMap r5 = j65.a;
        r4 = r1.getBackgroundTintList();
        goto L6
    }

    @Override // defpackage.ut
    public final void a(View r1) {
        d(r1);
    }

    @Override // defpackage.ut
    public final void b(View r1, float r2) {
        d(r1);
    }

    @Override // defpackage.ut
    public final void c(View r1, int r2) {
        d(r1);
    }

    public final void d(View r8) {
        int r0 = r8.getTop();
        pb5 r1 = this.b;
        if (r0 >= r1.d()) goto L22;
        Window r2 = this.c;
        if (r2 == null) goto L19;
        Boolean r3 = this.a;
        if (r3 != null) goto L9;
        boolean r7 = this.d;
    L10:
        om1 r6 = new om1(r2.getDecorView());
        int r4 = Build.VERSION.SDK_INT;
        if (r4 < 35) goto L13;
        su3 r5 = new tb5(r2, r6);
    L18:
        r5.D(r7);
        goto L19
    L13:
        if (r4 < 30) goto L15;
        r5 = new sb5(r2, r6);
        goto L18
    L15:
        if (r4 < 26) goto L17;
        r5 = new rb5(r2, r6);
        goto L18
    L17:
        r5 = new qb5(r2, r6);
        goto L18
    L9:
        r7 = r3.booleanValue();
    L19:
        r8.setPadding(r8.getPaddingLeft(), r1.d() - r8.getTop(), r8.getPaddingRight(), r8.getPaddingBottom());
        return;
    L22:
        if (r8.getTop() == 0) goto L36;
        Window r9 = this.c;
        if (r9 == null) goto L34;
        boolean r10 = this.d;
        om1 r11 = new om1(r9.getDecorView());
        int r12 = Build.VERSION.SDK_INT;
        if (r12 < 35) goto L28;
        su3 r13 = new tb5(r9, r11);
    L33:
        r13.D(r10);
        goto L34
    L28:
        if (r12 < 30) goto L30;
        r13 = new sb5(r9, r11);
        goto L33
    L30:
        if (r12 < 26) goto L32;
        r13 = new rb5(r9, r11);
        goto L33
    L32:
        r13 = new qb5(r9, r11);
    L34:
        r8.setPadding(r8.getPaddingLeft(), 0, r8.getPaddingRight(), r8.getPaddingBottom());
        return;
    }

    public final void e(Window r4) {
        if (this.c == r4) goto L20;
        this.c = r4;
        if (r4 == null) goto L19;
        om1 r1 = new om1(r4.getDecorView());
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 35) goto L11;
        su3 r2 = new tb5(r4, r1);
    L17:
        this.d = r2.y();
        return;
    L11:
        if (r0 < 30) goto L14;
        r2 = new sb5(r4, r1);
        goto L17
    L14:
        if (r0 < 26) goto L16;
        r2 = new rb5(r4, r1);
        goto L17
    L16:
        r2 = new qb5(r4, r1);
        goto L17
    L19:
        return;
    }
}
