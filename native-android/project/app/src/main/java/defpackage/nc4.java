package defpackage;

import android.graphics.RectF;
import android.view.View;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nc4 extends mc4 {
    public boolean f;
    public float g;

    public nc4(NavigationView r2) {
        this.f = false;
        this.g = 0.0f;
        c(r2);
    }

    private void c(View r3) {
        r3.setOutlineProvider(new i20(1, this));
    }

    @Override // defpackage.mc4
    public final void a(NavigationView r10) {
        bc4 r0 = this.c;
        if (r0 == null) goto L8;
        RectF r2 = this.d;
        if (r2 == null) goto L8;
        float r1 = r0.f.a(r2);
    L9:
        this.g = r1;
        boolean r3 = false;
        if (this.d.isEmpty() == true) goto L15;
        bc4 r4 = this.c;
        if (r4 == null) goto L15;
        boolean r5 = r4.f(this.d);
    L17:
        if (r5 == false) goto L19;
    L61:
        r3 = true;
    L62:
        this.f = r3;
        r10.setClipToOutline(!b());
        if (b() == false) goto L66;
        r10.invalidate();
        return;
    L66:
        r10.invalidateOutline();
        return;
    L19:
        if (this.d.isEmpty() == true) goto L62;
        bc4 r6 = this.c;
        if (r6 == null) goto L62;
        if (this.b == false) goto L62;
        if (r6.f(this.d) == true) goto L62;
        bc4 r7 = this.c;
        if ((r7.a instanceof m34) == false) goto L62;
        if ((r7.b instanceof m34) == false) goto L62;
        if ((r7.d instanceof m34) == false) goto L62;
        if ((r7.c instanceof m34) == false) goto L62;
        float r8 = r7.e.a(this.d);
        float r9 = this.c.f.a(this.d);
        float r11 = this.c.h.a(this.d);
        float r12 = this.c.g.a(this.d);
        if (r8 == 0.0f) goto L37;
    L41:
        if (r8 != 0.0f) goto L48;
        if (r9 != 0.0f) goto L48;
        if (r11 != r12) goto L48;
        RectF r13 = this.d;
        r13.set(r13.left, r13.top - r11, r13.right, r13.bottom);
        this.g = r11;
    L48:
        if (r9 != 0.0f) goto L55;
        if (r12 != 0.0f) goto L55;
        if (r8 != r11) goto L55;
        RectF r14 = this.d;
        r14.set(r14.left, r14.top, r14.right + r8, r14.bottom);
        this.g = r8;
    L55:
        if (r11 != 0.0f) goto L62;
        if (r12 != 0.0f) goto L62;
        if (r8 != r9) goto L62;
        RectF r15 = this.d;
        r15.set(r15.left, r15.top, r15.right, r15.bottom + r8);
        this.g = r8;
        goto L61
    L37:
        if (r11 != 0.0f) goto L41;
        if (r9 != r12) goto L41;
        RectF r16 = this.d;
        r16.set(r16.left - r9, r16.top, r16.right, r16.bottom);
        this.g = r9;
    L15:
        r5 = false;
    L8:
        r1 = 0.0f;
        goto L9
    }

    @Override // defpackage.mc4
    public final boolean b() {
        if (this.f == true) goto L5;
        return true;
    L5:
        if (this.a == true) goto L11;
        return false;
    L11:
        return true;
    }
}
