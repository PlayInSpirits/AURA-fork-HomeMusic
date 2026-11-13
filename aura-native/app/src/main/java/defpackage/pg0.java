package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import app.homemusic.R;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class pg0 extends BaseAdapter implements Filterable {
    public boolean n;
    public boolean o;
    public Cursor p;
    public int q;
    public ng0 r;
    public og0 s;
    public o7 t;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.p;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                ng0 ng0Var = this.r;
                if (ng0Var != null) {
                    cursor2.unregisterContentObserver(ng0Var);
                }
                og0 og0Var = this.s;
                if (og0Var != null) {
                    cursor2.unregisterDataSetObserver(og0Var);
                }
            }
            this.p = cursor;
            if (cursor != null) {
                ng0 ng0Var2 = this.r;
                if (ng0Var2 != null) {
                    cursor.registerContentObserver(ng0Var2);
                }
                og0 og0Var2 = this.s;
                if (og0Var2 != null) {
                    cursor.registerDataSetObserver(og0Var2);
                }
                this.q = cursor.getColumnIndexOrThrow("_id");
                this.n = true;
                notifyDataSetChanged();
            } else {
                this.q = -1;
                this.n = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.n || (cursor = this.p) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.n) {
            return null;
        }
        this.p.moveToPosition(i);
        if (view == null) {
            co4 co4Var = (co4) this;
            view = co4Var.w.inflate(co4Var.v, viewGroup, false);
        }
        a(view, this.p);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.t == null) {
            o7 o7Var = new o7();
            o7Var.b = this;
            this.t = o7Var;
        }
        return this.t;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.n || (cursor = this.p) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.p;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.n && (cursor = this.p) != null && cursor.moveToPosition(i)) {
            return this.p.getLong(this.q);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.n) {
            kf2.o("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.p.moveToPosition(i)) {
            kf2.o(f34.f(i, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            co4 co4Var = (co4) this;
            view = co4Var.w.inflate(co4Var.u, viewGroup, false);
            view.setTag(new bo4(view));
            ((ImageView) view.findViewById(R.id.edit_query)).setImageResource(co4Var.B);
        }
        a(view, this.p);
        return view;
    }
}
