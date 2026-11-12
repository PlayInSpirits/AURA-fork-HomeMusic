package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pg0 extends BaseAdapter implements Filterable {
    public boolean n;
    public boolean o;
    public Cursor p;
    public int q;
    public ng0 r;
    public og0 s;
    public o7 t;

    public abstract void a(View r1, Cursor r2);

    public void b(Cursor r3) {
        Cursor r0 = this.p;
        if (r3 != r0) goto L5;
        r0 = null;
    L22:
        if (r0 == null) goto L25;
        r0.close();
        return;
    L25:
        return;
    L5:
        if (r0 == null) goto L12;
        ng0 r1 = this.r;
        if (r1 == null) goto L9;
        r0.unregisterContentObserver(r1);
    L9:
        og0 r2 = this.s;
        if (r2 == null) goto L12;
        r0.unregisterDataSetObserver(r2);
    L12:
        this.p = r3;
        if (r3 == null) goto L21;
        ng0 r4 = this.r;
        if (r4 == null) goto L17;
        r3.registerContentObserver(r4);
    L17:
        og0 r5 = this.s;
        if (r5 == null) goto L20;
        r3.registerDataSetObserver(r5);
    L20:
        this.q = r3.getColumnIndexOrThrow("_id");
        this.n = true;
        notifyDataSetChanged();
        goto L22
    L21:
        this.q = -1;
        this.n = false;
        notifyDataSetInvalidated();
        goto L22
    }

    public abstract String c(Cursor r1);

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.n == false) goto L8;
        Cursor r1 = this.p;
        if (r1 != null) goto L7;
        return 0;
    L7:
        return r1.getCount();
    L8:
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int r2, View r3, ViewGroup r4) {
        if (this.n == false) goto L9;
        this.p.moveToPosition(r2);
        if (r3 != null) goto L7;
        co4 r5 = (co4) this;
        int r6 = r5.v;
        r3 = r5.w.inflate(r6, r4, false);
    L7:
        a(r3, this.p);
        return r3;
    L9:
        return null;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.t != null) goto L6;
        o7 r0 = new o7();
        r0.b = this;
        this.t = r0;
    L6:
        return this.t;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int r2) {
        if (this.n == false) goto L8;
        Cursor r0 = this.p;
        if (r0 == null) goto L10;
        r0.moveToPosition(r2);
        return this.p;
    L10:
        return null;
    L8:
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r4) {
        if (this.n == false) goto L10;
        Cursor r0 = this.p;
        if (r0 == null) goto L10;
        if (r0.moveToPosition(r4) == false) goto L10;
        return this.p.getLong(this.q);
    L10:
        return 0;
    }

    @Override // android.widget.Adapter
    public View getView(int r3, View r4, ViewGroup r5) {
        if (this.n == true) goto L5;
        kf2.o("this should only be called when the cursor is valid");
        return null;
    L5:
        if (this.p.moveToPosition(r3) == false) goto L10;
        if (r4 != null) goto L8;
        co4 r6 = (co4) this;
        int r7 = r6.u;
        r4 = r6.w.inflate(r7, r5, false);
        r4.setTag(new bo4(r4));
        ((ImageView) r4.findViewById(R.id.edit_query)).setImageResource(r6.B);
    L8:
        a(r4, this.p);
        return r4;
    L10:
        kf2.o(f34.f(r3, "couldn't move cursor to position "));
        return null;
    }
}
