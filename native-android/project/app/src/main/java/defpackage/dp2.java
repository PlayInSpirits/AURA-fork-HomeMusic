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

    public dp2(Context r6, ArrayList r7) {
        super(r6, 0, r7);
        this.n = LayoutInflater.from(r6);
        TypedArray r8 = getContext().obtainStyledAttributes(new int[]{R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable});
        this.o = zz1.r(r6, r8.getResourceId(0, 0));
        this.p = zz1.r(r6, r8.getResourceId(1, 0));
        this.q = zz1.r(r6, r8.getResourceId(2, 0));
        this.r = zz1.r(r6, r8.getResourceId(3, 0));
        r8.recycle();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int r7, View r8, ViewGroup r9) {
        if (r8 != null) goto L5;
        r8 = this.n.inflate(R.layout.mr_chooser_list_item, r9, false);
    L5:
        wq2 r10 = (wq2) getItem(r7);
        TextView r11 = (TextView) r8.findViewById(R.id.mr_chooser_route_name);
        TextView r1 = (TextView) r8.findViewById(R.id.mr_chooser_route_desc);
        r11.setText(r10.d);
        String r2 = r10.e;
        int r3 = r10.i;
        if (r3 == 2) goto L9;
        if (r3 == 1) goto L9;
    L11:
        r11.setGravity(16);
        r1.setVisibility(8);
        r1.setText("");
    L12:
        r8.setEnabled(r10.g);
        ImageView r12 = (ImageView) r8.findViewById(R.id.mr_chooser_route_icon);
        if (r12 == null) goto L32;
        Uri r0 = r10.f;
        if (r0 != null) goto L33;
    L21:
        int r4 = r10.n;
        if (r4 == 1) goto L30;
        if (r4 != 2) goto L25;
        Drawable r6 = this.q;
    L27:
        Drawable r5 = r6;
    L31:
        r12.setImageDrawable(r5);
        goto L32
    L25:
        if (r10.e() == false) goto L28;
        r6 = this.r;
        goto L27
    L28:
        r6 = this.o;
        goto L27
    L30:
        r6 = this.p;
        goto L27
    L33:
        r5 = Drawable.createFromStream(getContext().getContentResolver().openInputStream(r0), null);     // Catch: IOException -> L19
        if (r5 == null) goto L21;
    L19:
        e = move-exception;
        Log.w("MediaRouteChooserDialog", "Failed to load " + r0, e);
    L32:
        return r8;
    L9:
        if (TextUtils.isEmpty(r2) == true) goto L11;
        r11.setGravity(80);
        r1.setVisibility(0);
        r1.setText(r2);
        goto L12
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int r1) {
        return ((wq2) getItem(r1)).g;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView r1, View r2, int r3, long r4) {
        wq2 r0 = (wq2) getItem(r3);
        ImageView r5 = (ImageView) r2.findViewById(R.id.mr_chooser_route_icon);
        ProgressBar r6 = (ProgressBar) r2.findViewById(R.id.mr_chooser_route_progress_bar);
        if (r5 == null) goto L6;
        if (r6 == null) goto L6;
        r5.setVisibility(8);
        r6.setVisibility(0);
    L6:
        r0.k(true);
    }
}
