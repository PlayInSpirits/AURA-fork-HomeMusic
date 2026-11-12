package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.eddyizm.tempus.model.HomeSector;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ro1 extends dw3 {
    public List q;

    @Override // defpackage.dw3
    public final int a() {
        return this.q.size();
    }

    @Override // defpackage.dw3
    public final void g(cx3 r2, int r3) {
        HomeSector r1 = (HomeSector) this.q.get(r3);
        rf2 r4 = ((qo1) r2).u;
        ((CheckBox) r4.o).setText(r1.getSectorTitle());
        ((CheckBox) r4.o).setChecked(r1.isVisible());
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r2, int r3) {
        View r4 = b11.i(r2, R.layout.item_horizontal_home_sector, r2, false);
        int r5 = R.id.home_sector_rearranger_image_view;
        if (((ImageView) uo.s(r4, R.id.home_sector_rearranger_image_view)) == null) goto L8;
        r5 = R.id.home_sector_title_check_box;
        CheckBox r0 = (CheckBox) uo.s(r4, R.id.home_sector_title_check_box);
        if (r0 == null) goto L8;
        return new qo1(this, new rf2((ConstraintLayout) r4, r0));
    L8:
        nz2.n("Missing required view with ID: ".concat(r4.getResources().getResourceName(r5)));
        return null;
    }
}
