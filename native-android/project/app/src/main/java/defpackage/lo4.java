package defpackage;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lo4 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] q = {MenuItem.class};
    public final /* synthetic */ int n = 0;
    public Object o;
    public Object p;

    public lo4(xu2 xu2Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p = xu2Var;
        this.o = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        boolean zBooleanValue;
        switch (this.n) {
            case 0:
                Object obj = this.o;
                Method method = (Method) this.p;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        zBooleanValue = ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    } else {
                        method.invoke(obj, menuItem);
                        zBooleanValue = true;
                    }
                    return zBooleanValue;
                } catch (Exception e) {
                    er1.m(e);
                    return false;
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.o).onMenuItemClick(((xu2) this.p).h(menuItem));
        }
    }

    public /* synthetic */ lo4() {
    }
}
