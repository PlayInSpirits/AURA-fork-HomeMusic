package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kq4 {
    public CharSequence a;
    public int b;
    public View c;
    public TabLayout d;
    public mq4 e;

    public final void a(CharSequence r2) {
        if (TextUtils.isEmpty(null) == true) goto L5;
    L7:
        this.a = r2;
        mq4 r1 = this.e;
        if (r1 == null) goto L11;
        r1.d();
        return;
    L11:
        return;
    L5:
        if (TextUtils.isEmpty(r2) == true) goto L7;
        this.e.setContentDescription(r2);
        goto L7
    }
}
