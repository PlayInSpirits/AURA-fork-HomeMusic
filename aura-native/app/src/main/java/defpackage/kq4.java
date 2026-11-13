package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class kq4 {
    public kq4() {
        super();
    }

    public CharSequence a;
    public int b;
    public View c;
    public TabLayout d;
    public mq4 e;

    public final void a(CharSequence charSequence) {
        if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(charSequence)) {
            this.e.setContentDescription(charSequence);
        }
        this.a = charSequence;
        mq4 mq4Var = this.e;
        if (mq4Var != null) {
            mq4Var.d();
        }
    }
}
