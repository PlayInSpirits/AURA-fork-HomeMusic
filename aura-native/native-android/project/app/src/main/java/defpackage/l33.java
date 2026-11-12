package defpackage;

import android.content.Context;
import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l33 extends qu2 {
    public final int A;
    public final Class z;

    public l33(Context context, Class cls, int i) {
        super(context);
        this.z = cls;
        this.A = i;
    }

    @Override // defpackage.qu2
    public final tu2 a(int i, int i2, int i3, CharSequence charSequence) {
        int size = this.f.size() + 1;
        int i4 = this.A;
        if (size <= i4) {
            y();
            tu2 tu2VarA = super.a(i, i2, i3, charSequence);
            tu2VarA.f(true);
            x();
            return tu2VarA;
        }
        String simpleName = this.z.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i4);
        sb.append(". Limit can be checked with ");
        kf2.n(b11.q(sb, simpleName, "#getMaxItemCount()"));
        return null;
    }

    @Override // defpackage.qu2, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.z.getSimpleName().concat(" does not support submenus"));
    }
}
