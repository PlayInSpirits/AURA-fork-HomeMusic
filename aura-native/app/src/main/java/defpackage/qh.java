package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class qh {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) rh.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
