package defpackage;

import android.widget.LinearLayout;
import android.widget.TextView;
import app.homemusic.R;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kx2 extends cx3 {
    public final TextView u;
    public final MaterialCalendarGridView v;

    public kx2(LinearLayout r9, boolean r10) {
        super(r9);
        TextView r0 = (TextView) r9.findViewById(R.id.month_title);
        this.u = r0;
        WeakHashMap r1 = j65.a;
        new w55(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(r0, Boolean.TRUE);
        this.v = (MaterialCalendarGridView) r9.findViewById(R.id.month_grid);
        if (r10 == true) goto L6;
        r0.setVisibility(8);
        return;
    }
}
