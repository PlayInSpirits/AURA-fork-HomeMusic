package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import androidx.preference.DropDownPreference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dx0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ dx0(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    private final void a(AdapterView r1) {
    }

    private final void b(AdapterView r1) {
    }

    private final void c(AdapterView r1) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView r1, View r2, int r3, long r4) {
        int r5 = this.n;
        Object r0 = this.o;
        switch(r5) {
            case 0: goto L12;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        ((SearchView) r0).o(r3);
        return;
    L12:
        DropDownPreference r6 = (DropDownPreference) r0;
        if (r3 < 0) goto L22;
        String r7 = r6.i0[r3].toString();
        if (r7.equals(r6.j0) == false) goto L17;
        return;
    L17:
        if (r6.a(r7) == false) goto L24;
        r6.H(r7);
        return;
    L24:
        return;
    L22:
        return;
    L7:
        if (r3 == (-1)) goto L20;
        cx0 r8 = ((bc2) r0).p;
        if (r8 == null) goto L21;
        r8.setListSelectionHidden(false);
        return;
    L21:
        return;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView r1) {
        int r0 = this.n;
    }
}
