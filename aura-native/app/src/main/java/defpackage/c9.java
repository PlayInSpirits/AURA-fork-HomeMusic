package defpackage;

import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class c9 extends ArrayAdapter {
    public c9(android.content.Context a0, int a1, int a2, java.lang.Object[] a3) {
        super(a0, a1, a2, a3);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
