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

    public /* synthetic */ w11(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                compoundButton.getClass();
                ((v11) ((wo0) obj2).n).setEnabled(z);
                App.b().getClass();
                App.c().edit().putBoolean("equalizer_enabled", z).apply();
                ((EqualizerFragment) obj).l0(z);
                break;
            default:
                Genre genre = (Genre) obj;
                f71 f71Var = ((FilterFragment) obj2).n0;
                if (!z) {
                    String genre2 = genre.getGenre();
                    String string = compoundButton.getText().toString();
                    f71Var.d.remove(genre2);
                    f71Var.e.remove(string);
                } else {
                    String genre3 = genre.getGenre();
                    String string2 = compoundButton.getText().toString();
                    f71Var.d.add(genre3);
                    f71Var.e.add(string2);
                }
                break;
        }
    }
}
