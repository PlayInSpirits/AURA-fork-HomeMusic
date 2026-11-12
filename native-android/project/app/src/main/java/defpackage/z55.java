package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z55 implements View.OnApplyWindowInsetsListener {
    public pb5 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ r83 c;

    public z55(View r1, r83 r2) {
        this.b = r1;
        this.c = r2;
        this.a = null;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View r6, WindowInsets r7) {
        pb5 r0 = pb5.g(r7, r6);
        int r1 = Build.VERSION.SDK_INT;
        r83 r2 = this.c;
        if (r1 >= 30) goto L8;
        a65.a(r7, this.b);
        if (r0.equals(this.a) == false) goto L8;
        return r2.x(r6, r0).f();
    L8:
        this.a = r0;
        pb5 r5 = r2.x(r6, r0);
        if (r1 >= 30) goto L11;
        WeakHashMap r8 = j65.a;
        r6.requestApplyInsets();
        return r5.f();
    L11:
        return r5.f();
    }
}
