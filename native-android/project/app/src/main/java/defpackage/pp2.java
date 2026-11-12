package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.OverlayListView;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pp2 extends ArrayAdapter {
    public final float n;
    public final /* synthetic */ qp2 o;

    public pp2(qp2 r1, Context r2, ArrayList r3) {
        this.o = r1;
        super(r2, 0, r3);
        this.n = fu.v(r2);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int r10, View r11, ViewGroup r12) {
        int r2 = 0;
        qp2 r3 = this.o;
        if (r11 != null) goto L5;
        r11 = b11.i(r12, R.layout.mr_controller_volume_item, r12, false);
    L6:
        wq2 r13 = (wq2) getItem(r10);
        if (r13 == null) goto L37;
        boolean r4 = r13.g;
        TextView r5 = (TextView) r11.findViewById(R.id.mr_name);
        r5.setEnabled(r4);
        r5.setText(r13.d);
        MediaRouteVolumeSlider r6 = (MediaRouteVolumeSlider) r11.findViewById(R.id.mr_volume_slider);
        Context r14 = r12.getContext();
        OverlayListView r7 = r3.R;
        int r15 = fu.u(r14, 0);
        int r8 = 255;
        if (Color.alpha(r15) == 255) goto L11;
        r15 = v50.g(r15, ((Integer) r7.getTag()).intValue());
    L11:
        r6.a(r15, r15);
        r6.setTag(r13);
        r3.e0.put(r13, r6);
        r6.b(!r4);
        r6.setEnabled(r4);
        if (r4 == true) goto L14;
    L25:
        ImageView r0 = (ImageView) r11.findViewById(R.id.mr_volume_item_icon);
        if (r4 == true) goto L29;
        r8 = (int) (this.n * 255.0f);
    L29:
        r0.setAlpha(r8);
        LinearLayout r9 = (LinearLayout) r11.findViewById(R.id.volume_item_container);
        if (r3.W.contains(r13) == false) goto L32;
        r2 = 4;
    L32:
        r9.setVisibility(r2);
        HashSet r16 = r3.U;
        if (r16 == null) goto L37;
        if (r16.contains(r13) == false) goto L37;
        AlphaAnimation r17 = new AlphaAnimation(0.0f, 0.0f);
        r17.setDuration(0);
        r17.setFillEnabled(true);
        r17.setFillAfter(true);
        r11.clearAnimation();
        r11.startAnimation(r17);
        goto L37
    L14:
        if (r3.L == true) goto L16;
    L24:
        r6.setMax(100);
        r6.setProgress(100);
        r6.setEnabled(false);
        goto L25
    L16:
        if (r13.e() == true) goto L18;
    L21:
        int r18 = r13.o;
    L22:
        if (r18 != 1) goto L24;
        r6.setMax(r13.q);
        r6.setProgress(r13.p);
        r6.setOnSeekBarChangeListener(r3.Y);
        goto L25
    L18:
        if (yq2.c != null) goto L20;
        r18 = 0;
        goto L22
    L20:
        yq2.c().getClass();
    L37:
        return r11;
    L5:
        qp2.r((LinearLayout) r11.findViewById(R.id.volume_item_container), r3.b0);
        View r19 = r11.findViewById(R.id.mr_volume_item_icon);
        ViewGroup.LayoutParams r20 = r19.getLayoutParams();
        int r21 = r3.a0;
        r20.width = r21;
        r20.height = r21;
        r19.setLayoutParams(r20);
        goto L6
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int r1) {
        return false;
    }
}
