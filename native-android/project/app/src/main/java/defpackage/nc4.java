package defpackage;

import android.graphics.RectF;
import android.view.View;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nc4 extends mc4 {
    public boolean f = false;
    public float g = 0.0f;

    public nc4(NavigationView navigationView) {
        c(navigationView);
    }

    private void c(View view) {
        view.setOutlineProvider(new i20(1, this));
    }

    @Override // defpackage.mc4
    public final void a(NavigationView navigationView) {
        bc4 bc4Var;
        bc4 bc4Var2;
        RectF rectF;
        bc4 bc4Var3 = this.c;
        this.g = (bc4Var3 == null || (rectF = this.d) == null) ? 0.0f : bc4Var3.f.a(rectF);
        boolean z = false;
        if ((this.d.isEmpty() || (bc4Var2 = this.c) == null) ? false : bc4Var2.f(this.d)) {
            z = true;
        } else if (!this.d.isEmpty() && (bc4Var = this.c) != null && this.b && !bc4Var.f(this.d)) {
            bc4 bc4Var4 = this.c;
            if ((bc4Var4.a instanceof m34) && (bc4Var4.b instanceof m34) && (bc4Var4.d instanceof m34) && (bc4Var4.c instanceof m34)) {
                float fA = bc4Var4.e.a(this.d);
                float fA2 = this.c.f.a(this.d);
                float fA3 = this.c.h.a(this.d);
                float fA4 = this.c.g.a(this.d);
                if (fA == 0.0f && fA3 == 0.0f && fA2 == fA4) {
                    RectF rectF2 = this.d;
                    rectF2.set(rectF2.left - fA2, rectF2.top, rectF2.right, rectF2.bottom);
                    this.g = fA2;
                } else if (fA == 0.0f && fA2 == 0.0f && fA3 == fA4) {
                    RectF rectF3 = this.d;
                    rectF3.set(rectF3.left, rectF3.top - fA3, rectF3.right, rectF3.bottom);
                    this.g = fA3;
                } else if (fA2 == 0.0f && fA4 == 0.0f && fA == fA3) {
                    RectF rectF4 = this.d;
                    rectF4.set(rectF4.left, rectF4.top, rectF4.right + fA, rectF4.bottom);
                    this.g = fA;
                } else if (fA3 == 0.0f && fA4 == 0.0f && fA == fA2) {
                    RectF rectF5 = this.d;
                    rectF5.set(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom + fA);
                    this.g = fA;
                }
                z = true;
            }
        }
        this.f = z;
        navigationView.setClipToOutline(!b());
        if (b()) {
            navigationView.invalidate();
        } else {
            navigationView.invalidateOutline();
        }
    }

    @Override // defpackage.mc4
    public final boolean b() {
        return !this.f || this.a;
    }
}
