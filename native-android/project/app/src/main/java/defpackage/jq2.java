package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import app.homemusic.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jq2 extends dw3 {
    public final ArrayList q = new ArrayList();
    public final LayoutInflater r;
    public final Drawable s;
    public final Drawable t;
    public final Drawable u;
    public final Drawable v;
    public hq2 w;
    public final int x;
    public final AccelerateDecelerateInterpolator y;
    public final /* synthetic */ lq2 z;

    public jq2(lq2 lq2Var) {
        this.z = lq2Var;
        Context context = lq2Var.B;
        this.r = LayoutInflater.from(context);
        this.s = fu.y(context, R.attr.mediaRouteDefaultIconDrawable);
        this.t = fu.y(context, R.attr.mediaRouteTvIconDrawable);
        this.u = fu.y(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.v = fu.y(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        this.x = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
        this.y = new AccelerateDecelerateInterpolator();
        s();
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.q.size() + 1;
    }

    @Override // defpackage.dw3
    public final int c(int i) {
        hq2 hq2Var;
        if (i == 0) {
            hq2Var = this.w;
        } else {
            hq2Var = (hq2) this.q.get(i - 1);
        }
        return hq2Var.b;
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        tq2 tq2VarA;
        mq2 mq2Var;
        ArrayList arrayList = this.q;
        int i2 = (i == 0 ? this.w : (hq2) arrayList.get(i - 1)).b;
        boolean z = true;
        hq2 hq2Var = i == 0 ? this.w : (hq2) arrayList.get(i - 1);
        lq2 lq2Var = this.z;
        int i3 = 0;
        if (i2 == 1) {
            lq2Var.J.put(((wq2) hq2Var.a).c, (dq2) cx3Var);
            fq2 fq2Var = (fq2) cx3Var;
            View view = fq2Var.a;
            lq2 lq2Var2 = fq2Var.A.z;
            if (lq2Var2.f0 && Collections.unmodifiableList(lq2Var2.w.v).size() > 1) {
                i3 = fq2Var.z;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i3;
            view.setLayoutParams(layoutParams);
            wq2 wq2Var = (wq2) hq2Var.a;
            fq2Var.s(wq2Var);
            fq2Var.y.setText(wq2Var.d);
            return;
        }
        if (i2 == 2) {
            ((gq2) cx3Var).u.setText(hq2Var.a.toString());
            return;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                tb4.a();
                return;
            }
            eq2 eq2Var = (eq2) cx3Var;
            View view2 = eq2Var.u;
            wq2 wq2Var2 = (wq2) hq2Var.a;
            eq2Var.z = wq2Var2;
            ImageView imageView = eq2Var.v;
            imageView.setVisibility(0);
            eq2Var.w.setVisibility(4);
            jq2 jq2Var = eq2Var.A;
            List listUnmodifiableList = Collections.unmodifiableList(jq2Var.z.w.v);
            view2.setAlpha((listUnmodifiableList.size() == 1 && listUnmodifiableList.get(0) == wq2Var2) ? eq2Var.y : 1.0f);
            view2.setOnClickListener(new i4(8, eq2Var));
            imageView.setImageDrawable(jq2Var.q(wq2Var2));
            eq2Var.x.setText(wq2Var2.d);
            return;
        }
        lq2Var.J.put(((wq2) hq2Var.a).c, (dq2) cx3Var);
        iq2 iq2Var = (iq2) cx3Var;
        float f = iq2Var.E;
        i4 i4Var = iq2Var.G;
        ImageView imageView2 = iq2Var.z;
        View view3 = iq2Var.y;
        CheckBox checkBox = iq2Var.D;
        wq2 wq2Var3 = (wq2) hq2Var.a;
        jq2 jq2Var2 = iq2Var.H;
        lq2 lq2Var3 = jq2Var2.z;
        if (wq2Var3 == lq2Var3.w && Collections.unmodifiableList(wq2Var3.v).size() > 0) {
            for (wq2 wq2Var4 : Collections.unmodifiableList(wq2Var3.v)) {
                if (!lq2Var3.y.contains(wq2Var4)) {
                    wq2Var3 = wq2Var4;
                    break;
                }
            }
        }
        iq2Var.s(wq2Var3);
        imageView2.setImageDrawable(jq2Var2.q(wq2Var3));
        iq2Var.B.setText(wq2Var3.d);
        checkBox.setVisibility(0);
        boolean zU = iq2Var.u(wq2Var3);
        boolean z2 = !lq2Var3.A.contains(wq2Var3) && (!iq2Var.u(wq2Var3) || Collections.unmodifiableList(lq2Var3.w.v).size() >= 2) && !(iq2Var.u(wq2Var3) && ((tq2VarA = lq2Var3.w.a()) == null || (mq2Var = (mq2) tq2VarA.x.get(wq2Var3.c)) == null || !mq2Var.c));
        checkBox.setChecked(zU);
        iq2Var.A.setVisibility(4);
        imageView2.setVisibility(0);
        view3.setEnabled(z2);
        checkBox.setEnabled(z2);
        iq2Var.v.setEnabled(z2 || zU);
        MediaRouteVolumeSlider mediaRouteVolumeSlider = iq2Var.w;
        if (!z2 && !zU) {
            z = false;
        }
        mediaRouteVolumeSlider.setEnabled(z);
        view3.setOnClickListener(i4Var);
        checkBox.setOnClickListener(i4Var);
        RelativeLayout relativeLayout = iq2Var.C;
        if (zU && !iq2Var.u.e()) {
            i3 = iq2Var.F;
        }
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = i3;
        relativeLayout.setLayoutParams(layoutParams2);
        view3.setAlpha((z2 || zU) ? 1.0f : f);
        checkBox.setAlpha((z2 || !zU) ? 1.0f : f);
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.r;
        if (i == 1) {
            return new fq2(this, layoutInflater.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i == 2) {
            return new gq2(layoutInflater.inflate(R.layout.mr_cast_header_item, viewGroup, false));
        }
        if (i == 3) {
            return new iq2(this, layoutInflater.inflate(R.layout.mr_cast_route_item, viewGroup, false));
        }
        if (i == 4) {
            return new eq2(this, layoutInflater.inflate(R.layout.mr_cast_group_item, viewGroup, false));
        }
        tb4.a();
        return null;
    }

    @Override // defpackage.dw3
    public final void n(cx3 cx3Var) {
        this.z.J.values().remove(cx3Var);
    }

    public final void p(View view, int i) {
        jp2 jp2Var = new jp2(i, view.getLayoutParams().height, 1, view);
        jp2Var.setAnimationListener(new gp2(2, this));
        jp2Var.setDuration(this.x);
        jp2Var.setInterpolator(this.y);
        view.startAnimation(jp2Var);
    }

    public final Drawable q(wq2 wq2Var) {
        Uri uri = wq2Var.f;
        if (uri != null) {
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(this.z.B.getContentResolver().openInputStream(uri), null);
                if (drawableCreateFromStream != null) {
                    return drawableCreateFromStream;
                }
            } catch (IOException e) {
                Log.w("MediaRouteCtrlDialog", "Failed to load " + uri, e);
            }
        }
        int i = wq2Var.n;
        if (i == 1) {
            return this.t;
        }
        if (i != 2) {
            return wq2Var.e() ? this.v : this.s;
        }
        return this.u;
    }

    public final void r() {
        lq2 lq2Var = this.z;
        ArrayList arrayList = lq2Var.A;
        arrayList.clear();
        ArrayList arrayList2 = lq2Var.y;
        ArrayList arrayList3 = new ArrayList();
        tq2 tq2VarA = lq2Var.w.a();
        if (tq2VarA != null) {
            vq2 vq2Var = lq2Var.w.a;
            vq2Var.getClass();
            yq2.b();
            for (wq2 wq2Var : Collections.unmodifiableList(vq2Var.b)) {
                if (tq2VarA.n(wq2Var)) {
                    arrayList3.add(wq2Var);
                }
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        d();
    }

    public final void s() {
        ArrayList arrayList = this.q;
        arrayList.clear();
        lq2 lq2Var = this.z;
        ArrayList arrayList2 = lq2Var.z;
        Context context = lq2Var.B;
        ArrayList arrayList3 = lq2Var.y;
        this.w = new hq2(1, lq2Var.w);
        ArrayList arrayList4 = lq2Var.x;
        boolean z = false;
        if (arrayList4.isEmpty()) {
            arrayList.add(new hq2(3, lq2Var.w));
        } else {
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                arrayList.add(new hq2(3, (wq2) obj));
            }
        }
        if (!arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            boolean z2 = false;
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                wq2 wq2Var = (wq2) obj2;
                if (!arrayList4.contains(wq2Var)) {
                    if (!z2) {
                        lq2Var.w.getClass();
                        nq2 nq2VarB = wq2.b();
                        String strJ = nq2VarB != null ? nq2VarB.j() : null;
                        if (TextUtils.isEmpty(strJ)) {
                            strJ = context.getString(R.string.mr_dialog_groupable_header);
                        }
                        arrayList.add(new hq2(2, strJ));
                        z2 = true;
                    }
                    arrayList.add(new hq2(3, wq2Var));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                wq2 wq2Var2 = (wq2) obj3;
                wq2 wq2Var3 = lq2Var.w;
                if (wq2Var3 != wq2Var2) {
                    if (!z) {
                        wq2Var3.getClass();
                        nq2 nq2VarB2 = wq2.b();
                        String strK = nq2VarB2 != null ? nq2VarB2.k() : null;
                        if (TextUtils.isEmpty(strK)) {
                            strK = context.getString(R.string.mr_dialog_transferable_header);
                        }
                        arrayList.add(new hq2(2, strK));
                        z = true;
                    }
                    arrayList.add(new hq2(4, wq2Var2));
                }
            }
        }
        r();
    }
}
