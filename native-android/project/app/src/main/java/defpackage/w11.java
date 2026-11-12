package defpackage;

import android.widget.CompoundButton;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.Genre;
import com.eddyizm.tempus.ui.fragment.EqualizerFragment;
import com.eddyizm.tempus.ui.fragment.FilterFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w11 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w11(int r1, Object r2, Object r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton r3, boolean r4) {
        int r0 = this.a;
        Object r1 = this.c;
        Object r2 = this.b;
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        Genre r5 = (Genre) r1;
        f71 r6 = ((FilterFragment) r2).n0;
        if (r4 == false) goto L7;
        String r7 = r5.getGenre();
        String r8 = r3.getText().toString();
        r6.d.add(r7);
        r6.e.add(r8);
        return;
    L7:
        String r9 = r5.getGenre();
        String r10 = r3.getText().toString();
        r6.d.remove(r9);
        r6.e.remove(r10);
        return;
    L9:
        r3.getClass();
        ((v11) ((wo0) r2).n).setEnabled(r4);
        App.b().getClass();
        App.c().edit().putBoolean("equalizer_enabled", r4).apply();
        ((EqualizerFragment) r1).l0(r4);
    }
}
