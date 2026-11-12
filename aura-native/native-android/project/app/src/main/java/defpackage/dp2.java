package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import app.homemusic.R;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dp2 extends ArrayAdapter implements AdapterView.OnItemClickListener {
    public final LayoutInflater n;
    public final Drawable o;
    public final Drawable p;
    public final Drawable q;
    public final Drawable r;

    public dp2(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.n = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable});
        this.o = zz1.r(context, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        this.p = zz1.r(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        this.q = zz1.r(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.r = zz1.r(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0090  */
    /* JADX WARN: Code duplicated, block: B:23:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a6  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Drawable drawableCreateFromStream;
        int i2;
        Drawable drawable;
        if (view == null) {
            view = this.n.inflate(R.layout.mr_chooser_list_item, viewGroup, false);
        }
        wq2 wq2Var = (wq2) getItem(i);
        TextView textView = (TextView) view.findViewById(R.id.mr_chooser_route_name);
        TextView textView2 = (TextView) view.findViewById(R.id.mr_chooser_route_desc);
        textView.setText(wq2Var.d);
        String str = wq2Var.e;
        int i3 = wq2Var.i;
        if ((i3 == 2 || i3 == 1) && !TextUtils.isEmpty(str)) {
            textView.setGravity(80);
            textView2.setVisibility(0);
            textView2.setText(str);
        } else {
            textView.setGravity(16);
            textView2.setVisibility(8);
            textView2.setText("");
        }
        view.setEnabled(wq2Var.g);
        ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
        if (imageView != null) {
            Uri uri = wq2Var.f;
            if (uri != null) {
                try {
                    drawableCreateFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(uri), null);
                    if (drawableCreateFromStream == null) {
                        i2 = wq2Var.n;
                        if (i2 != 1) {
                            drawable = this.p;
                        } else if (i2 != 2) {
                            drawable = this.q;
                        } else if (wq2Var.e()) {
                            drawable = this.r;
                        } else {
                            drawable = this.o;
                        }
                        drawableCreateFromStream = drawable;
                    }
                } catch (IOException e) {
                    Log.w("MediaRouteChooserDialog", "Failed to load " + uri, e);
                }
            } else {
                i2 = wq2Var.n;
                if (i2 != 1) {
                    drawable = this.p;
                } else if (i2 != 2) {
                    drawable = this.q;
                } else if (wq2Var.e()) {
                    drawable = this.r;
                } else {
                    drawable = this.o;
                }
                drawableCreateFromStream = drawable;
            }
            imageView.setImageDrawable(drawableCreateFromStream);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return ((wq2) getItem(i)).g;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        wq2 wq2Var = (wq2) getItem(i);
        ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_chooser_route_progress_bar);
        if (imageView != null && progressBar != null) {
            imageView.setVisibility(8);
            progressBar.setVisibility(0);
        }
        wq2Var.k(true);
    }
}
