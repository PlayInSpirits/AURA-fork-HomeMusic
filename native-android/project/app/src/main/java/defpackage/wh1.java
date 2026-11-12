package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wh1 implements q04, xy1 {
    public final Drawable n;
    public final /* synthetic */ int o;

    public wh1(Drawable drawable, int i) {
        this.o = i;
        h12.f(drawable, "Argument must not be null");
        this.n = drawable;
    }

    private final void c() {
    }

    @Override // defpackage.xy1
    public void a() {
        int i = this.o;
        Drawable drawable = this.n;
        switch (i) {
            case 0:
                ((bi1) ((vh1) drawable).n.b).l.prepareToDraw();
                break;
            default:
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof vh1) {
                    ((bi1) ((vh1) drawable).n.b).l.prepareToDraw();
                }
                break;
        }
    }

    @Override // defpackage.q04
    public final void b() {
        qj0 qj0Var;
        qj0 qj0Var2;
        qj0 qj0Var3;
        switch (this.o) {
            case 0:
                vh1 vh1Var = (vh1) this.n;
                vh1Var.stop();
                vh1Var.q = true;
                bi1 bi1Var = (bi1) vh1Var.n.b;
                c04 c04Var = bi1Var.d;
                bi1Var.c.clear();
                Bitmap bitmap = bi1Var.l;
                if (bitmap != null) {
                    bi1Var.e.d(bitmap);
                    bi1Var.l = null;
                }
                bi1Var.f = false;
                zh1 zh1Var = bi1Var.i;
                if (zh1Var != null) {
                    c04Var.q(zh1Var);
                    bi1Var.i = null;
                }
                zh1 zh1Var2 = bi1Var.k;
                if (zh1Var2 != null) {
                    c04Var.q(zh1Var2);
                    bi1Var.k = null;
                }
                zh1 zh1Var3 = bi1Var.m;
                if (zh1Var3 != null) {
                    c04Var.q(zh1Var3);
                    bi1Var.m = null;
                }
                vk4 vk4Var = bi1Var.a;
                rm3 rm3Var = vk4Var.c;
                vk4Var.l = null;
                byte[] bArr = vk4Var.i;
                if (bArr != null && (qj0Var3 = (qj0) rm3Var.o) != null) {
                    qj0Var3.h(bArr);
                }
                int[] iArr = vk4Var.j;
                if (iArr != null && (qj0Var2 = (qj0) rm3Var.o) != null) {
                    qj0Var2.h(iArr);
                }
                Bitmap bitmap2 = vk4Var.m;
                if (bitmap2 != null) {
                    ((zs) rm3Var.n).d(bitmap2);
                }
                vk4Var.m = null;
                vk4Var.d = null;
                vk4Var.s = null;
                byte[] bArr2 = vk4Var.e;
                if (bArr2 != null && (qj0Var = (qj0) rm3Var.o) != null) {
                    qj0Var.h(bArr2);
                }
                bi1Var.j = true;
                break;
        }
    }

    @Override // defpackage.q04
    public final int d() {
        int i = this.o;
        Drawable drawable = this.n;
        switch (i) {
            case 0:
                bi1 bi1Var = (bi1) ((vh1) drawable).n.b;
                vk4 vk4Var = bi1Var.a;
                return (vk4Var.j.length * 4) + vk4Var.d.limit() + vk4Var.i.length + bi1Var.n;
            default:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    @Override // defpackage.q04
    public final Class e() {
        switch (this.o) {
            case 0:
                return vh1.class;
            default:
                return this.n.getClass();
        }
    }

    @Override // defpackage.q04
    public final Object get() {
        Drawable drawable = this.n;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}
