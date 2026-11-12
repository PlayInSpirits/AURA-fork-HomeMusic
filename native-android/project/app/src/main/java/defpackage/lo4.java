package defpackage;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lo4 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] q = null;
    public final /* synthetic */ int n;
    public Object o;
    public Object p;

    static {
        q = new Class[]{MenuItem.class};
    }

    public lo4(xu2 r2, MenuItem.OnMenuItemClickListener r3) {
        this.n = 1;
        this.p = r2;
        this.o = r3;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem r4) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        Object r0 = this.o;
        Method r3 = (Method) this.p;
    L12:
        e = move-exception;
        er1.m(e);
        return false;
    L8:
        if (r3.getReturnType() != Boolean.TYPE) goto L10;
        boolean r5 = ((Boolean) r3.invoke(r0, new Object[]{r4})).booleanValue();     // Catch: Exception -> L12
    L15:
        return r5;
    L10:
        r3.invoke(r0, new Object[]{r4});     // Catch: Exception -> L12
        r5 = true;
        goto L15
    L5:
        return ((MenuItem.OnMenuItemClickListener) this.o).onMenuItemClick(((xu2) this.p).h(r4));
    }

    public /* synthetic */ lo4() {
        this.n = 0;
    }
}
