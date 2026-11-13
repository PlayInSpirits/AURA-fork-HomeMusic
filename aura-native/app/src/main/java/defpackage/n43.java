package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import com.google.android.material.navigation.NavigationView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class n43 implements e23 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WeakReference b;
    public final /* synthetic */ v23 c;

    public /* synthetic */ n43(WeakReference weakReference, v23 v23Var, int i) {
        this.a = i;
        this.b = weakReference;
        this.c = v23Var;
    }

    @Override // defpackage.e23
    public final void a(v23 v23Var, r23 r23Var) {
        int i = this.a;
        int i2 = 0;
        v23 v23Var2 = this.c;
        WeakReference weakReference = this.b;
        r23Var.getClass();
        switch (i) {
            case 0:
                NavigationView navigationView = (NavigationView) weakReference.get();
                if (navigationView != null) {
                    if (!(r23Var instanceof rp0)) {
                        Menu menu = navigationView.getMenu();
                        menu.getClass();
                        int size = menu.size();
                        while (i2 < size) {
                            MenuItem item = menu.getItem(i2);
                            item.getClass();
                            item.setChecked(uo.y(item.getItemId(), r23Var));
                            i2++;
                        }
                        break;
                    }
                } else {
                    v23Var2.getClass();
                    v23Var2.p.remove(this);
                    break;
                }
                break;
            default:
                s33 s33Var = (s33) weakReference.get();
                if (s33Var != null) {
                    if (!(r23Var instanceof rp0)) {
                        Menu menu2 = s33Var.getMenu();
                        menu2.getClass();
                        int size2 = menu2.size();
                        while (i2 < size2) {
                            MenuItem item2 = menu2.getItem(i2);
                            item2.getClass();
                            if (uo.y(item2.getItemId(), r23Var)) {
                                item2.setChecked(true);
                            }
                            i2++;
                        }
                        break;
                    }
                } else {
                    v23Var2.getClass();
                    v23Var2.p.remove(this);
                    break;
                }
                break;
        }
    }
}
