package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rp3 extends cx3 {
    public final Drawable u;
    public final ColorStateList v;
    public final SparseArray w;
    public boolean x;
    public boolean y;

    public rp3(View r5) {
        super(r5);
        SparseArray r0 = new SparseArray(4);
        this.w = r0;
        TextView r2 = (TextView) r5.findViewById(R.id.title);
        r0.put(R.id.title, r2);
        r0.put(R.id.summary, r5.findViewById(R.id.summary));
        r0.put(R.id.icon, r5.findViewById(R.id.icon));
        r0.put(app.homemusic.R.id.icon_frame, r5.findViewById(app.homemusic.R.id.icon_frame));
        r0.put(R.id.icon_frame, r5.findViewById(R.id.icon_frame));
        this.u = r5.getBackground();
        if (r2 == null) goto L6;
        this.v = r2.getTextColors();
        return;
    }

    public final View s(int r3) {
        SparseArray r0 = this.w;
        View r1 = (View) r0.get(r3);
        if (r1 == null) goto L5;
        return r1;
    L5:
        View r2 = this.a.findViewById(r3);
        if (r2 == null) goto L8;
        r0.put(r3, r2);
    L8:
        return r2;
    }
}
