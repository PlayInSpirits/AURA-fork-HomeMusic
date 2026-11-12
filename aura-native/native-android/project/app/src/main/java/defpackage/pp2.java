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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp2(qp2 qp2Var, Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.o = qp2Var;
        this.n = fu.v(context);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b4  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        qp2 qp2Var = this.o;
        if (view == null) {
            view = b11.i(viewGroup, R.layout.mr_controller_volume_item, viewGroup, false);
        } else {
            qp2.r((LinearLayout) view.findViewById(R.id.volume_item_container), qp2Var.b0);
            View viewFindViewById = view.findViewById(R.id.mr_volume_item_icon);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            int i3 = qp2Var.a0;
            layoutParams.width = i3;
            layoutParams.height = i3;
            viewFindViewById.setLayoutParams(layoutParams);
        }
        wq2 wq2Var = (wq2) getItem(i);
        if (wq2Var != null) {
            boolean z = wq2Var.g;
            TextView textView = (TextView) view.findViewById(R.id.mr_name);
            textView.setEnabled(z);
            textView.setText(wq2Var.d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
            Context context = viewGroup.getContext();
            OverlayListView overlayListView = qp2Var.R;
            int iU = fu.u(context, 0);
            if (Color.alpha(iU) != 255) {
                iU = v50.g(iU, ((Integer) overlayListView.getTag()).intValue());
            }
            mediaRouteVolumeSlider.a(iU, iU);
            mediaRouteVolumeSlider.setTag(wq2Var);
            qp2Var.e0.put(wq2Var, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.b(!z);
            mediaRouteVolumeSlider.setEnabled(z);
            if (z) {
                if (qp2Var.L) {
                    if (!wq2Var.e()) {
                        i2 = wq2Var.o;
                    } else if (yq2.c == null) {
                        i2 = 0;
                    } else {
                        yq2.c().getClass();
                        i2 = wq2Var.o;
                    }
                    if (i2 == 1) {
                        mediaRouteVolumeSlider.setMax(wq2Var.q);
                        mediaRouteVolumeSlider.setProgress(wq2Var.p);
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(qp2Var.Y);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                } else {
                    mediaRouteVolumeSlider.setMax(100);
                    mediaRouteVolumeSlider.setProgress(100);
                    mediaRouteVolumeSlider.setEnabled(false);
                }
            }
            ((ImageView) view.findViewById(R.id.mr_volume_item_icon)).setAlpha(z ? 255 : (int) (this.n * 255.0f));
            ((LinearLayout) view.findViewById(R.id.volume_item_container)).setVisibility(qp2Var.W.contains(wq2Var) ? 4 : 0);
            HashSet hashSet = qp2Var.U;
            if (hashSet != null && hashSet.contains(wq2Var)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(0L);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                view.clearAnimation();
                view.startAnimation(alphaAnimation);
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return false;
    }
}
