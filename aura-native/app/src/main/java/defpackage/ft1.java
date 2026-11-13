package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.SmartContexts;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.subsonic.models.Child;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class ft1 implements Runnable {
    public final /* synthetic */ ad2 n;
    public final /* synthetic */ View o;
    public final /* synthetic */ View p;
    public final /* synthetic */ TextView q;
    public final /* synthetic */ ImageButton r;
    public final /* synthetic */ TextView s;
    public final /* synthetic */ wj3 t;

    public /* synthetic */ ft1(k03 k03Var, View view, View view2, TextView textView, ImageButton imageButton, TextView textView2, wj3 wj3Var) {
        this.n = k03Var;
        this.o = view;
        this.p = view2;
        this.q = textView;
        this.r = imageButton;
        this.s = textView2;
        this.t = wj3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        String string2;
        Child child = (Child) this.n.d();
        View view = this.o;
        Context context = view.getContext();
        context.getClass();
        String id = child != null ? child.getId() : null;
        SmartSession smartSession = a.b;
        if (smartSession == null || !smartSession.isRec(id)) {
            string = null;
        } else if (h12.c(smartSession.getContext(), SmartContexts.LIKED)) {
            string = context.getString(R.string.homemusic_smart_label_liked);
        } else {
            String title = smartSession.getTitle();
            if (title == null) {
                title = (String) a.e.get(smartSession.getContext());
            }
            if (title == null || (string2 = context.getString(R.string.homemusic_smart_label_playlist, title)) == null) {
                string = context.getString(R.string.homemusic_smart_label_playlist_unnamed);
                string.getClass();
            } else {
                string = string2;
            }
        }
        View view2 = this.p;
        if (view2 != null) {
            view2.setVisibility(string != null ? 0 : 8);
        }
        if (string != null) {
            TextView textView = this.q;
            if (textView != null) {
                textView.setText("✨ ".concat(string));
            }
            ImageButton imageButton = this.r;
            if (imageButton != null) {
                Context context2 = view.getContext();
                SmartSession smartSession2 = a.b;
                imageButton.setContentDescription(context2.getString(h12.c(smartSession2 != null ? smartSession2.getContext() : null, SmartContexts.LIKED) ? R.string.homemusic_smart_add_liked : R.string.homemusic_smart_add_playlist));
            }
        }
        fu.p(this.s, child != null ? child.getId() : null);
        fu.K(view, (qi3) this.t.get());
    }
}
