package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.eddyizm.tempus.model.HomeSector;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ro1 extends dw3 {
    public ro1() {
        super();
    }

    public List q;

    @Override // defpackage.dw3
    public final int a() {
        return this.q.size();
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        HomeSector homeSector = (HomeSector) this.q.get(i);
        rf2 rf2Var = ((qo1) cx3Var).u;
        ((CheckBox) rf2Var.o).setText(homeSector.getSectorTitle());
        ((CheckBox) rf2Var.o).setChecked(homeSector.isVisible());
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        View i2 = b11.i(viewGroup, R.layout.item_horizontal_home_sector, viewGroup, false);
        int i3 = R.id.home_sector_rearranger_image_view;
        if (((ImageView) uo.s(i2, R.id.home_sector_rearranger_image_view)) != null) {
            i3 = R.id.home_sector_title_check_box;
            CheckBox checkBox = (CheckBox) uo.s(i2, R.id.home_sector_title_check_box);
            if (checkBox != null) {
                return new qo1(this, new rf2((ConstraintLayout) i2, checkBox));
            }
        }
        nz2.n("Missing required view with ID: ".concat(i2.getResources().getResourceName(i3)));
        return null;
    }
}
