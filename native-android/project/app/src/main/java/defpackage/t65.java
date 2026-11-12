package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t65 extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        v65 v65Var;
        Outline outline2;
        switch (this.a) {
            case 0:
                if (!(view instanceof v65) || (outline2 = (v65Var = (v65) view).r) == null) {
                    return;
                }
                outline.set(outline2);
                float f = v65Var.x;
                if (f == 0.0f && v65Var.y == 0.0f) {
                    return;
                }
                outline.offset((int) f, (int) v65Var.y);
                return;
            default:
                view.getClass();
                throw new ClassCastException();
        }
    }
}
