package defpackage;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w55 extends zf2 {
    public final /* synthetic */ int r;

    public w55(int i, Class cls, int i2, int i3, int i4) {
        this.r = i4;
        this.n = i;
        this.q = cls;
        this.p = i2;
        this.o = i3;
    }

    @Override // defpackage.zf2
    public final Object c(View view) {
        switch (this.r) {
            case 0:
                return Boolean.valueOf(e65.c(view));
            case 1:
                return e65.a(view);
            case 2:
                return g65.b(view);
            default:
                return Boolean.valueOf(e65.b(view));
        }
    }

    @Override // defpackage.zf2
    public final void d(View view, Object obj) {
        switch (this.r) {
            case 0:
                e65.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                e65.e(view, (CharSequence) obj);
                break;
            case 2:
                g65.d(view, (CharSequence) obj);
                break;
            default:
                e65.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.zf2
    public final boolean g(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.r) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !zEquals;
    }
}
