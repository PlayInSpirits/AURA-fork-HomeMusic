package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import app.homemusic.R;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zp2 extends dw3 {
    public final ArrayList q = new ArrayList();
    public final LayoutInflater r;
    public final Drawable s;
    public final Drawable t;
    public final Drawable u;
    public final Drawable v;
    public final /* synthetic */ aq2 w;

    public zp2(aq2 aq2Var) {
        this.w = aq2Var;
        Context context = aq2Var.v;
        this.r = LayoutInflater.from(context);
        this.s = fu.y(context, R.attr.mediaRouteDefaultIconDrawable);
        this.t = fu.y(context, R.attr.mediaRouteTvIconDrawable);
        this.u = fu.y(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.v = fu.y(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        p();
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.q.size();
    }

    @Override // defpackage.dw3
    public final int c(int i) {
        return ((wp2) this.q.get(i)).b;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0069  */
    /* JADX WARN: Code duplicated, block: B:17:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        Drawable drawableCreateFromStream;
        int i2;
        Drawable drawable;
        int iC = c(i);
        wp2 wp2Var = (wp2) this.q.get(i);
        if (iC == 1) {
            ((vp2) cx3Var).u.setText(wp2Var.a.toString());
            return;
        }
        if (iC != 2) {
            Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            return;
        }
        yp2 yp2Var = (yp2) cx3Var;
        wq2 wq2Var = (wq2) wp2Var.a;
        View view = yp2Var.u;
        view.setVisibility(0);
        yp2Var.w.setVisibility(4);
        view.setOnClickListener(new xp2(yp2Var, wq2Var));
        yp2Var.x.setText(wq2Var.d);
        ImageView imageView = yp2Var.v;
        zp2 zp2Var = yp2Var.y;
        Uri uri = wq2Var.f;
        if (uri != null) {
            try {
                drawableCreateFromStream = Drawable.createFromStream(zp2Var.w.v.getContentResolver().openInputStream(uri), null);
                if (drawableCreateFromStream == null) {
                    i2 = wq2Var.n;
                    if (i2 != 1) {
                        drawable = zp2Var.t;
                    } else if (i2 != 2) {
                        drawable = zp2Var.u;
                    } else if (wq2Var.e()) {
                        drawable = zp2Var.v;
                    } else {
                        drawable = zp2Var.s;
                    }
                    drawableCreateFromStream = drawable;
                }
            } catch (IOException e) {
                Log.w("RecyclerAdapter", "Failed to load " + uri, e);
            }
        } else {
            i2 = wq2Var.n;
            if (i2 != 1) {
                drawable = zp2Var.t;
            } else if (i2 != 2) {
                drawable = zp2Var.u;
            } else if (wq2Var.e()) {
                drawable = zp2Var.v;
            } else {
                drawable = zp2Var.s;
            }
            drawableCreateFromStream = drawable;
        }
        imageView.setImageDrawable(drawableCreateFromStream);
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.r;
        if (i != 1) {
            if (i == 2) {
                return new yp2(this, layoutInflater.inflate(R.layout.mr_picker_route_item, viewGroup, false));
            }
            tb4.a();
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.mr_picker_header_item, viewGroup, false);
        vp2 vp2Var = new vp2(viewInflate);
        vp2Var.u = (TextView) viewInflate.findViewById(R.id.mr_picker_header_name);
        return vp2Var;
    }

    public final void p() {
        ArrayList arrayList = this.q;
        arrayList.clear();
        aq2 aq2Var = this.w;
        arrayList.add(new wp2(aq2Var.v.getString(R.string.mr_chooser_title)));
        ArrayList arrayList2 = aq2Var.x;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(new wp2((wq2) obj));
        }
        d();
    }
}
