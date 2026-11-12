package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.database.AppDatabase;
import com.google.android.material.materialswitch.MaterialSwitch;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ml3 implements a74 {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public ml3(int r4) {
        switch(r4) {
            case 12: goto L5;
            default: goto L3;
        };
    L3:
        this.a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
        return;
    L5:
        this.a = lk3.H.l(xs3.g);
        this.b = wa4.b;
        this.c = mi3.b;
        this.d = gy3.r;
        this.e = Bundle.EMPTY;
        this.f = null;
    }

    public static yj0 f(DataInputStream r11) {
        int r0 = r11.readInt();
        HashMap r1 = new HashMap();
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L13;
        String r4 = r11.readUTF();
        int r5 = r11.readInt();
        if (r5 < 0) goto L10;
        int r7 = Math.min(r5, 10485760);
        byte[] r8 = f35.b;
        int r9 = 0;
    L7:
        if (r9 == r5) goto L9;
        int r10 = r9 + r7;
        r8 = Arrays.copyOf(r8, r10);
        r11.readFully(r8, r9, r7);
        r7 = Math.min(r5 - r10, 10485760);
        r9 = r10;
        goto L7
    L9:
        r1.put(r4, r8);
        r3 = r3 + 1;
        goto L3
    L10:
        mj0.i(f34.f(r5, "Invalid value size: "));
        return null;
    L13:
        return new yj0(r1);
    }

    public static void g(yj0 r2, DataOutputStream r3) {
        Set r4 = r2.b.entrySet();
        r3.writeInt(r4.size());
        Iterator r5 = r4.iterator();
    L4:
        if (r5.hasNext() == false) goto L6;
        Map.Entry r0 = (Map.Entry) r5.next();
        r3.writeUTF((String) r0.getKey());
        byte[] r1 = (byte[]) r0.getValue();
        r3.writeInt(r1.length);
        r3.write(r1);
        goto L4
    }

    public static boolean i(int[] r4, int r5) {
        int r0 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L9;
        if (r4[r2] == r5) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public static ColorStateList j(Context r6, int r7) {
        int r0 = gt4.c(r6, R.attr.colorControlHighlight);
        int r8 = gt4.b(r6, R.attr.colorButtonNormal);
        int[] r1 = gt4.b;
        int[] r2 = gt4.d;
        int r3 = v50.g(r0, r7);
        int[] r4 = gt4.c;
        int r5 = v50.g(r0, r7);
        return new ColorStateList(new int[][]{r1, r2, r4, gt4.f}, new int[]{r8, r3, r5, r7});
    }

    public static mt2 k(qi3 r10, yw1 r11, mt2 r12, zt4 r13) {
        cu4 r0 = r10.x0();
        int r1 = r10.y();
        if (r0.p() == false) goto L5;
        Object r5 = null;
    L7:
        if (r10.k() == false) goto L9;
    L13:
        int r14 = -1;
    L12:
        int r9 = r14;
        int r15 = 0;
    L16:
        if (r15 >= r11.size()) goto L22;
        mt2 r4 = (mt2) r11.get(r15);
        if (r(r4, r5, r10.k(), r10.n0(), r10.K(), r9) == true) goto L19;
        r15 = r15 + 1;
        goto L16
    L19:
        return r4;
    L22:
        if (r11.isEmpty() == false) goto L27;
        if (r12 == null) goto L27;
        if (r(r12, r5, r10.k(), r10.n0(), r10.K(), r9) == false) goto L27;
        return r12;
    L27:
        return null;
    L9:
        if (r0.p() == true) goto L13;
        r14 = r0.f(r1, r13, false).b(f35.Q(r10.M0()) - r13.e);
        goto L12
    L5:
        r5 = r0.l(r1);
        goto L7
    }

    public static LayerDrawable n(c14 r4, Context r5, int r6) {
        int r7 = r5.getResources().getDimensionPixelSize(r6);
        Drawable r0 = r4.d(r5, R.drawable.abc_star_black_48dp);
        Drawable r8 = r4.d(r5, R.drawable.abc_star_half_black_48dp);
        if ((r0 instanceof BitmapDrawable) == true) goto L5;
    L9:
        Bitmap r9 = Bitmap.createBitmap(r7, r7, Bitmap.Config.ARGB_8888);
        Canvas r2 = new Canvas(r9);
        r0.setBounds(0, 0, r7, r7);
        r0.draw(r2);
        BitmapDrawable r1 = new BitmapDrawable(r9);
        BitmapDrawable r10 = new BitmapDrawable(r9);
    L10:
        r10.setTileModeX(Shader.TileMode.REPEAT);
        if ((r8 instanceof BitmapDrawable) == true) goto L13;
    L17:
        Bitmap r3 = Bitmap.createBitmap(r7, r7, Bitmap.Config.ARGB_8888);
        Canvas r11 = new Canvas(r3);
        r8.setBounds(0, 0, r7, r7);
        r8.draw(r11);
        BitmapDrawable r12 = new BitmapDrawable(r3);
    L18:
        LayerDrawable r13 = new LayerDrawable(new Drawable[]{r1, r12, r10});
        r13.setId(0, android.R.id.background);
        r13.setId(1, android.R.id.secondaryProgress);
        r13.setId(2, android.R.id.progress);
        return r13;
    L13:
        if (r8.getIntrinsicWidth() != r7) goto L17;
        if (r8.getIntrinsicHeight() != r7) goto L17;
        r12 = (BitmapDrawable) r8;
        goto L18
    L5:
        if (r0.getIntrinsicWidth() != r7) goto L9;
        if (r0.getIntrinsicHeight() != r7) goto L9;
        r1 = (BitmapDrawable) r0;
        r10 = new BitmapDrawable(r1.getBitmap());
        goto L10
    }

    public static ml3 p(LayoutInflater r10) {
        View r11 = r10.inflate(R.layout.dialog_playlist_chooser, null, false);
        int r0 = R.id.button_bar;
        if (((LinearLayout) uo.s(r11, R.id.button_bar)) == null) goto L18;
        r0 = R.id.no_playlists_created_text_view;
        TextView r5 = (TextView) uo.s(r11, R.id.no_playlists_created_text_view);
        if (r5 == null) goto L18;
        r0 = R.id.playlist_chooser_dialog_cancel_button;
        Button r6 = (Button) uo.s(r11, R.id.playlist_chooser_dialog_cancel_button);
        if (r6 == null) goto L18;
        r0 = R.id.playlist_chooser_dialog_create_button;
        Button r7 = (Button) uo.s(r11, R.id.playlist_chooser_dialog_create_button);
        if (r7 == null) goto L18;
        r0 = R.id.playlist_dialog_chooser_visibility_summary;
        if (((TextView) uo.s(r11, R.id.playlist_dialog_chooser_visibility_summary)) == null) goto L18;
        r0 = R.id.playlist_dialog_chooser_visibility_switch;
        MaterialSwitch r8 = (MaterialSwitch) uo.s(r11, R.id.playlist_dialog_chooser_visibility_switch);
        if (r8 == null) goto L18;
        r0 = R.id.playlist_dialog_recycler_view;
        RecyclerView r9 = (RecyclerView) uo.s(r11, R.id.playlist_dialog_recycler_view);
        if (r9 == null) goto L18;
        return new ml3((LinearLayout) r11, r5, r6, r7, r8, r9);
    L18:
        nz2.n("Missing required view with ID: ".concat(r11.getResources().getResourceName(r0)));
        return null;
    }

    public static boolean r(mt2 r2, Object r3, boolean r4, int r5, int r6, int r7) {
        Object r0 = r2.a;
        int r1 = r2.b;
        if (r0.equals(r3) == true) goto L5;
        return false;
    L5:
        if (r4 == false) goto L9;
        if (r1 != r5) goto L9;
        if (r2.c != r6) goto L9;
        return true;
    L9:
        if (r4 == false) goto L11;
    L16:
        return false;
    L11:
        if (r1 != (-1)) goto L16;
        if (r2.e != r7) goto L16;
        return true;
    }

    public static void t(Drawable r0, int r1, PorterDuff.Mode r2) {
        Drawable r3 = r0.mutate();
        if (r2 != null) goto L5;
        r2 = fg.b;
    L5:
        r3.setColorFilter(fg.c(r1, r2));
    }

    @Override // defpackage.a74
    public boolean a() {
        return ((Boolean) ((zd3) this.d).getValue()).booleanValue();
    }

    @Override // defpackage.a74
    public float d(float r1) {
        return ((Number) ((uc3) this.a).invoke(Float.valueOf(r1))).floatValue();
    }

    @Override // defpackage.a74
    public Object e(h13 r7, wf1 r8, wd0 r9) {
        Object r6 = te5.j(new r(this, r7, r8, null, 5), r9);
        if (r6 != xe0.n) goto L6;
        return r6;
    L6:
        return j15.a;
    }

    public void h(ue1 r3, mt2 r4, cu4 r5) {
        if (r4 != null) goto L5;
        return;
    L5:
        if (r5.b(r4.a) == (-1)) goto L8;
        r3.x(r4, r5);
        return;
    L8:
        cu4 r2 = (cu4) ((ly3) this.c).get(r4);
        if (r2 == null) goto L12;
        r3.x(r4, r2);
        return;
    }

    public wx l(String r1) {
        return (wx) ((HashMap) this.a).get(r1);
    }

    public wx m(String r7) {
        HashMap r0 = (HashMap) this.a;
        wx r1 = (wx) r0.get(r7);
        if (r1 != null) goto L17;
        SparseArray r2 = (SparseArray) this.b;
        int r3 = r2.size();
        int r4 = 0;
        if (r3 != 0) goto L7;
        int r5 = 0;
    L8:
        if (r5 >= 0) goto L15;
    L9:
        if (r4 >= r3) goto L14;
        if (r4 != r2.keyAt(r4)) goto L14;
        r4 = r4 + 1;
    L14:
        r5 = r4;
    L15:
        wx r6 = new wx(r5, r7, yj0.c);
        r0.put(r7, r6);
        r2.put(r5, r7);
        ((SparseBooleanArray) this.d).put(r5, true);
        ((xx) this.e).e(r6);
        return r6;
    L7:
        r5 = r2.keyAt(r3 - 1) + 1;
        goto L8
    L17:
        return r1;
    }

    public ColorStateList o(Context r8, int r9) {
        if (r9 != R.drawable.abc_edit_text_material) goto L7;
        return ud3.n(r8, R.color.abc_tint_edittext);
    L7:
        if (r9 != R.drawable.abc_switch_track_mtrl_alpha) goto L11;
        return ud3.n(r8, R.color.abc_tint_switch_track);
    L11:
        if (r9 != R.drawable.abc_switch_thumb_material) goto L21;
        int[][] r10 = new int[3][];
        int[] r7 = new int[3];
        ColorStateList r2 = gt4.d(r8, R.attr.colorSwitchThumbNormal);
        if (r2 != null) goto L15;
    L17:
        r10[0] = gt4.b;
        r7[0] = gt4.b(r8, R.attr.colorSwitchThumbNormal);
        r10[1] = gt4.e;
        r7[1] = gt4.c(r8, R.attr.colorControlActivated);
        r10[2] = gt4.f;
        r7[2] = gt4.c(r8, R.attr.colorSwitchThumbNormal);
    L19:
        return new ColorStateList(r10, r7);
    L15:
        if (r2.isStateful() == false) goto L17;
        int[] r0 = gt4.b;
        r10[0] = r0;
        r7[0] = r2.getColorForState(r0, 0);
        r10[1] = gt4.e;
        r7[1] = gt4.c(r8, R.attr.colorControlActivated);
        r10[2] = gt4.f;
        r7[2] = r2.getDefaultColor();
        goto L19
    L21:
        if (r9 != R.drawable.abc_btn_default_mtrl_shape) goto L25;
        return j(r8, gt4.c(r8, R.attr.colorButtonNormal));
    L25:
        if (r9 != R.drawable.abc_btn_borderless_material) goto L29;
        return j(r8, 0);
    L29:
        if (r9 != R.drawable.abc_btn_colored_material) goto L33;
        return j(r8, gt4.c(r8, R.attr.colorAccent));
    L33:
        if (r9 == R.drawable.abc_spinner_mtrl_am_alpha) goto L56;
        if (r9 == R.drawable.abc_spinner_textfield_background_material) goto L56;
        if (i((int[]) this.b, r9) == false) goto L42;
        return gt4.d(r8, R.attr.colorControlNormal);
    L42:
        if (i((int[]) this.e, r9) == false) goto L46;
        return ud3.n(r8, R.color.abc_tint_default);
    L46:
        if (i((int[]) this.f, r9) == false) goto L50;
        return ud3.n(r8, R.color.abc_tint_btn_checkable);
    L50:
        if (r9 == R.drawable.abc_seekbar_thumb_material) goto L52;
        return null;
    L52:
        return ud3.n(r8, R.color.abc_tint_seek_thumb);
    L56:
        return ud3.n(r8, R.color.abc_tint_spinner);
    }

    public void q(long r5) {
        SparseArray r0 = (SparseArray) this.b;
        HashMap r1 = (HashMap) this.a;
        xx r2 = (xx) this.e;
        r2.h(r5);
        xx r3 = (xx) this.f;
        if (r3 == null) goto L6;
        r3.h(r5);
    L6:
        if (r2.f() == true) goto L12;
        xx r6 = (xx) this.f;
        if (r6 == null) goto L12;
        if (r6.f() == false) goto L12;
        ((xx) this.f).i(r1, r0);
        r2.b(r1);
    L13:
        xx r7 = (xx) this.f;
        if (r7 == null) goto L17;
        r7.j();
        this.f = null;
        return;
    L17:
        return;
    L12:
        r2.i(r1, r0);
        goto L13
    }

    public void s(String r5) {
        SparseBooleanArray r0 = (SparseBooleanArray) this.d;
        HashMap r1 = (HashMap) this.a;
        wx r2 = (wx) r1.get(r5);
        if (r2 != null) goto L5;
        return;
    L5:
        if (r2.c.isEmpty() == true) goto L7;
        return;
    L7:
        if (r2.d.isEmpty() == false) goto L16;
        r1.remove(r5);
        int r6 = r2.a;
        boolean r3 = r0.get(r6);
        ((xx) this.e).c(r2, r3);
        SparseArray r4 = (SparseArray) this.b;
        if (r3 == false) goto L12;
        r4.remove(r6);
        r0.delete(r6);
        return;
    L12:
        r4.put(r6, null);
        ((SparseBooleanArray) this.c).put(r6, true);
        return;
    }

    public void u() {
        ((xx) this.e).g((HashMap) this.a);
        SparseBooleanArray r0 = (SparseBooleanArray) this.c;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        ((SparseArray) this.b).remove(r0.keyAt(r2));
        r2 = r2 + 1;
        goto L3
    L5:
        r0.clear();
        ((SparseBooleanArray) this.d).clear();
    }

    public void v(cu4 r5) {
        ue1 r0 = bx1.a();
        if (((yw1) this.b).isEmpty() == false) goto L12;
        h(r0, (mt2) this.e, r5);
        if (Objects.equals((mt2) this.f, (mt2) this.e) == true) goto L8;
        h(r0, (mt2) this.f, r5);
    L8:
        if (Objects.equals((mt2) this.d, (mt2) this.e) == false) goto L10;
    L19:
        this.c = r0.d(true);
        return;
    L10:
        if (Objects.equals((mt2) this.d, (mt2) this.f) == true) goto L19;
        h(r0, (mt2) this.d, r5);
        goto L19
    L12:
        int r1 = 0;
    L13:
        int r2 = ((yw1) this.b).size();
        yw1 r3 = (yw1) this.b;
        if (r1 >= r2) goto L17;
        h(r0, (mt2) r3.get(r1), r5);
        r1 = r1 + 1;
        goto L13
    L17:
        if (r3.contains((mt2) this.d) == true) goto L19;
        h(r0, (mt2) this.d, r5);
        goto L19
    }

    public /* synthetic */ ml3(Object r1, Object r2, Object r3, Object r4, Object r5, Object r6) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
    }

    public ml3(Set r2, String r3, String r4) {
        if (r2 != null) goto L5;
        Set r5 = Collections.EMPTY_SET;
    L6:
        this.a = r5;
        Map r0 = Collections.EMPTY_MAP;
        this.c = r3;
        this.d = r4;
        this.e = ud4.n;
        HashSet r6 = new HashSet(r5);
        Iterator r7 = r0.values().iterator();
        if (r7.hasNext() == true) goto L11;
        this.b = Collections.unmodifiableSet(r6);
        return;
    L11:
        throw xa3.d(r7);
    L5:
        r5 = Collections.unmodifiableSet(r2);
        goto L6
    }

    public ml3(AppDatabase r3) {
        this.c = new i80(22);
        this.d = new si1(25);
        this.a = r3;
        this.b = new ll3(this, 0);
        this.e = new ll3(this, 1);
        this.f = new h61(2);
    }

    public /* synthetic */ ml3(ViewGroup r1, View r2, View r3, View r4, View r5, View r6, View r7) {
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
        this.f = r7;
    }

    public ml3(tk4 r5, File r6) {
        this.a = new HashMap();
        this.b = new SparseArray();
        this.c = new SparseBooleanArray();
        this.d = new SparseBooleanArray();
        if (r5 == null) goto L5;
        ss0 r1 = new ss0();
        r1.n = r5;
        r1.o = new SparseArray();
    L6:
        File r2 = new File(r6, "cached_content_index.exi");
        jw r7 = new jw();
        r7.o = null;
        r7.p = null;
        r7.q = new gp3(r2);
        if (r1 == null) goto L10;
        this.e = r1;
        this.f = r7;
        return;
    L10:
        String r8 = f35.a;
        this.e = r7;
        this.f = r1;
        return;
    L5:
        r1 = null;
        goto L6
    }

    public ml3(uc3 r2) {
        this.a = r2;
        this.b = new sm0(this);
        this.c = new k13();
        Boolean r3 = Boolean.FALSE;
        this.d = uc5.B(r3);
        this.e = uc5.B(r3);
        this.f = uc5.B(r3);
    }

    public ml3(zt4 r1) {
        this.a = r1;
        vw1 r2 = yw1.o;
        this.b = gy3.r;
        this.c = ly3.t;
    }

    public ml3(lk3 r1, wa4 r2, mi3 r3, yw1 r4, Bundle r5, xa4 r6) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        if (r5 != null) goto L5;
        r5 = Bundle.EMPTY;
    L5:
        this.e = r5;
        this.f = r6;
    }
}
