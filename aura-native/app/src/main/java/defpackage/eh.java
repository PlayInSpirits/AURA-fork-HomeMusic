package defpackage;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class eh implements Runnable {
    public final /* synthetic */ int n;
    public final int o;
    public final Object p;
    public final Object q;

    public eh(v14 v14Var, int i, Bundle bundle) {
        this.n = 2;
        this.q = v14Var;
        this.o = i;
        this.p = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        int i2 = this.o;
        Object obj = this.q;
        Object obj2 = this.p;
        switch (i) {
            case 0:
                ((TextView) obj2).setTypeface((Typeface) obj, i2);
                break;
            case 1:
                ((BottomSheetBehavior) obj).M((View) obj2, i2, false);
                break;
            case 2:
                ((v14) obj).a(i2, (Bundle) obj2);
                break;
            default:
                ((tp4) obj2).a((Intent) obj, i2);
                break;
        }
    }

    public /* synthetic */ eh(Object obj, Object obj2, int i, int i2) {
        this.n = i2;
        this.p = obj;
        this.q = obj2;
        this.o = i;
    }

    public eh(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.n = 1;
        this.q = bottomSheetBehavior;
        this.p = view;
        this.o = i;
    }
}
