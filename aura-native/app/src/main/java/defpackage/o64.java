package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class o64 {
    public final n64 a;

    public o64(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new m64(nestedScrollView);
        } else {
            this.a = new hh3(23);
        }
    }
}
