package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import com.eddyizm.tempus.ui.fragment.SearchFragment;
import com.google.android.material.search.SearchView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zn1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zn1(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView r2, int r3, KeyEvent r4) {
        int r5 = this.a;
        Object r1 = this.b;
        switch(r5) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        SearchFragment r6 = (SearchFragment) r1;
        String r7 = ((SearchView) r6.l0.m).getText().toString();
        if (r7.equals("") == false) goto L7;
        return false;
    L7:
        if (r7.trim().length() <= 1) goto L18;
        r6.h0(r7);
        return true;
    L18:
        return false;
    L10:
        gf1 r8 = (gf1) r1;
        if (r3 != 2) goto L13;
    L15:
        r8.invoke();
        return true;
    L13:
        if (r3 == 6) goto L15;
        return false;
    }
}
