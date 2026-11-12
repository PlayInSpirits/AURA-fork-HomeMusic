package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hq {
    public jd a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ hq(View view, int i) {
        this.b = i;
        this.c = view;
    }

    public final void a(Drawable drawable) {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                iq iqVar = (iq) view;
                iqVar.setIndeterminate(false);
                iqVar.b(iqVar.o, iqVar.p);
                break;
            case 1:
                iq iqVar2 = (iq) view;
                if (!iqVar2.t) {
                    iqVar2.setVisibility(iqVar2.u);
                }
                break;
            default:
                ColorStateList colorStateList = ((sh2) view).B;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
                break;
        }
    }

    public void b(Drawable drawable) {
        switch (this.b) {
            case 2:
                sh2 sh2Var = (sh2) this.c;
                ColorStateList colorStateList = sh2Var.B;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(sh2Var.F, colorStateList.getDefaultColor()));
                }
                break;
        }
    }

    public final void c(Drawable drawable) {
    }
}
