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

    public ml3(int i) {
        switch (i) {
            case 12:
                this.a = lk3.H.l(xs3.g);
                this.b = wa4.b;
                this.c = mi3.b;
                this.d = gy3.r;
                this.e = Bundle.EMPTY;
                this.f = null;
                break;
            default:
                this.a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                this.b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                this.d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }

    public static yj0 f(DataInputStream dataInputStream) {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                mj0.i(f34.f(i3, "Invalid value size: "));
                return null;
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = f35.b;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new yj0(map);
    }

    public static void g(yj0 yj0Var, DataOutputStream dataOutputStream) {
        Set<Map.Entry> setEntrySet = yj0Var.b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static boolean i(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList j(Context context, int i) {
        int iC = gt4.c(context, R.attr.colorControlHighlight);
        int iB = gt4.b(context, R.attr.colorButtonNormal);
        int[] iArr = gt4.b;
        int[] iArr2 = gt4.d;
        int iG = v50.g(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, gt4.c, gt4.f}, new int[]{iB, iG, v50.g(iC, i), i});
    }

    public static mt2 k(qi3 qi3Var, yw1 yw1Var, mt2 mt2Var, zt4 zt4Var) {
        cu4 cu4VarX0 = qi3Var.x0();
        int iY = qi3Var.y();
        Object objL = cu4VarX0.p() ? null : cu4VarX0.l(iY);
        int iB = (qi3Var.k() || cu4VarX0.p()) ? -1 : cu4VarX0.f(iY, zt4Var, false).b(f35.Q(qi3Var.M0()) - zt4Var.e);
        for (int i = 0; i < yw1Var.size(); i++) {
            mt2 mt2Var2 = (mt2) yw1Var.get(i);
            if (r(mt2Var2, objL, qi3Var.k(), qi3Var.n0(), qi3Var.K(), iB)) {
                return mt2Var2;
            }
        }
        if (yw1Var.isEmpty() && mt2Var != null && r(mt2Var, objL, qi3Var.k(), qi3Var.n0(), qi3Var.K(), iB)) {
            return mt2Var;
        }
        return null;
    }

    public static LayerDrawable n(c14 c14Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableD = c14Var.d(context, R.drawable.abc_star_black_48dp);
        Drawable drawableD2 = c14Var.d(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableD instanceof BitmapDrawable) && drawableD.getIntrinsicWidth() == dimensionPixelSize && drawableD.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableD;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableD.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableD2 instanceof BitmapDrawable) && drawableD2.getIntrinsicWidth() == dimensionPixelSize && drawableD2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableD2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableD2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static ml3 p(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_playlist_chooser, (ViewGroup) null, false);
        int i = R.id.button_bar;
        if (((LinearLayout) uo.s(viewInflate, R.id.button_bar)) != null) {
            i = R.id.no_playlists_created_text_view;
            TextView textView = (TextView) uo.s(viewInflate, R.id.no_playlists_created_text_view);
            if (textView != null) {
                i = R.id.playlist_chooser_dialog_cancel_button;
                Button button = (Button) uo.s(viewInflate, R.id.playlist_chooser_dialog_cancel_button);
                if (button != null) {
                    i = R.id.playlist_chooser_dialog_create_button;
                    Button button2 = (Button) uo.s(viewInflate, R.id.playlist_chooser_dialog_create_button);
                    if (button2 != null) {
                        i = R.id.playlist_dialog_chooser_visibility_summary;
                        if (((TextView) uo.s(viewInflate, R.id.playlist_dialog_chooser_visibility_summary)) != null) {
                            i = R.id.playlist_dialog_chooser_visibility_switch;
                            MaterialSwitch materialSwitch = (MaterialSwitch) uo.s(viewInflate, R.id.playlist_dialog_chooser_visibility_switch);
                            if (materialSwitch != null) {
                                i = R.id.playlist_dialog_recycler_view;
                                RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.playlist_dialog_recycler_view);
                                if (recyclerView != null) {
                                    return new ml3((LinearLayout) viewInflate, textView, button, button2, materialSwitch, recyclerView);
                                }
                            }
                        }
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static boolean r(mt2 mt2Var, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = mt2Var.a;
        int i4 = mt2Var.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && mt2Var.c == i2) {
            return true;
        }
        return !z && i4 == -1 && mt2Var.e == i3;
    }

    public static void t(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = fg.b;
        }
        drawableMutate.setColorFilter(fg.c(i, mode));
    }

    @Override // defpackage.a74
    public boolean a() {
        return ((Boolean) ((zd3) this.d).getValue()).booleanValue();
    }

    @Override // defpackage.a74
    public float d(float f) {
        return ((Number) ((uc3) this.a).invoke(Float.valueOf(f))).floatValue();
    }

    @Override // defpackage.a74
    public Object e(h13 h13Var, wf1 wf1Var, wd0 wd0Var) {
        Object objJ = te5.j(new r(this, h13Var, wf1Var, null, 5), wd0Var);
        return objJ == xe0.n ? objJ : j15.a;
    }

    public void h(ue1 ue1Var, mt2 mt2Var, cu4 cu4Var) {
        if (mt2Var == null) {
            return;
        }
        if (cu4Var.b(mt2Var.a) != -1) {
            ue1Var.x(mt2Var, cu4Var);
            return;
        }
        cu4 cu4Var2 = (cu4) ((ly3) this.c).get(mt2Var);
        if (cu4Var2 != null) {
            ue1Var.x(mt2Var, cu4Var2);
        }
    }

    public wx l(String str) {
        return (wx) ((HashMap) this.a).get(str);
    }

    public wx m(String str) {
        HashMap map = (HashMap) this.a;
        wx wxVar = (wx) map.get(str);
        if (wxVar != null) {
            return wxVar;
        }
        SparseArray sparseArray = (SparseArray) this.b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        wx wxVar2 = new wx(iKeyAt, str, yj0.c);
        map.put(str, wxVar2);
        sparseArray.put(iKeyAt, str);
        ((SparseBooleanArray) this.d).put(iKeyAt, true);
        ((xx) this.e).e(wxVar2);
        return wxVar2;
    }

    public ColorStateList o(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return ud3.n(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return ud3.n(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return j(context, gt4.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return j(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return j(context, gt4.c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return ud3.n(context, R.color.abc_tint_spinner);
            }
            if (i((int[]) this.b, i)) {
                return gt4.d(context, R.attr.colorControlNormal);
            }
            if (i((int[]) this.e, i)) {
                return ud3.n(context, R.color.abc_tint_default);
            }
            if (i((int[]) this.f, i)) {
                return ud3.n(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return ud3.n(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = gt4.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = gt4.b;
            iArr2[0] = gt4.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = gt4.e;
            iArr2[1] = gt4.c(context, R.attr.colorControlActivated);
            iArr[2] = gt4.f;
            iArr2[2] = gt4.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = gt4.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = gt4.e;
            iArr2[1] = gt4.c(context, R.attr.colorControlActivated);
            iArr[2] = gt4.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void q(long j) {
        xx xxVar;
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap map = (HashMap) this.a;
        xx xxVar2 = (xx) this.e;
        xxVar2.h(j);
        xx xxVar3 = (xx) this.f;
        if (xxVar3 != null) {
            xxVar3.h(j);
        }
        if (xxVar2.f() || (xxVar = (xx) this.f) == null || !xxVar.f()) {
            xxVar2.i(map, sparseArray);
        } else {
            ((xx) this.f).i(map, sparseArray);
            xxVar2.b(map);
        }
        xx xxVar4 = (xx) this.f;
        if (xxVar4 != null) {
            xxVar4.j();
            this.f = null;
        }
    }

    public void s(String str) {
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
        HashMap map = (HashMap) this.a;
        wx wxVar = (wx) map.get(str);
        if (wxVar != null && wxVar.c.isEmpty() && wxVar.d.isEmpty()) {
            map.remove(str);
            int i = wxVar.a;
            boolean z = sparseBooleanArray.get(i);
            ((xx) this.e).c(wxVar, z);
            SparseArray sparseArray = (SparseArray) this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                ((SparseBooleanArray) this.c).put(i, true);
            }
        }
    }

    public void u() {
        ((xx) this.e).g((HashMap) this.a);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.b).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.d).clear();
    }

    public void v(cu4 cu4Var) {
        yw1 yw1Var;
        ue1 ue1VarA = bx1.a();
        if (((yw1) this.b).isEmpty()) {
            h(ue1VarA, (mt2) this.e, cu4Var);
            if (!Objects.equals((mt2) this.f, (mt2) this.e)) {
                h(ue1VarA, (mt2) this.f, cu4Var);
            }
            if (!Objects.equals((mt2) this.d, (mt2) this.e) && !Objects.equals((mt2) this.d, (mt2) this.f)) {
                h(ue1VarA, (mt2) this.d, cu4Var);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((yw1) this.b).size();
                yw1Var = (yw1) this.b;
                if (i >= size) {
                    break;
                }
                h(ue1VarA, (mt2) yw1Var.get(i), cu4Var);
                i++;
            }
            if (!yw1Var.contains((mt2) this.d)) {
                h(ue1VarA, (mt2) this.d, cu4Var);
            }
        }
        this.c = ue1VarA.d(true);
    }

    public /* synthetic */ ml3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public ml3(Set set, String str, String str2) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.a = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.c = str;
        this.d = str2;
        this.e = ud4.n;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.b = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw xa3.d(it);
    }

    public ml3(AppDatabase appDatabase) {
        this.c = new i80(22);
        this.d = new si1(25);
        this.a = appDatabase;
        this.b = new ll3(this, 0);
        this.e = new ll3(this, 1);
        this.f = new h61(2);
    }

    public /* synthetic */ ml3(ViewGroup viewGroup, View view, View view2, View view3, View view4, View view5, View view6) {
        this.a = view;
        this.b = view2;
        this.c = view3;
        this.d = view4;
        this.e = view5;
        this.f = view6;
    }

    public ml3(tk4 tk4Var, File file) {
        ss0 ss0Var;
        this.a = new HashMap();
        this.b = new SparseArray();
        this.c = new SparseBooleanArray();
        this.d = new SparseBooleanArray();
        if (tk4Var != null) {
            ss0Var = new ss0();
            ss0Var.n = tk4Var;
            ss0Var.o = new SparseArray();
        } else {
            ss0Var = null;
        }
        File file2 = new File(file, "cached_content_index.exi");
        jw jwVar = new jw();
        jwVar.o = null;
        jwVar.p = null;
        jwVar.q = new gp3(file2);
        if (ss0Var != null) {
            this.e = ss0Var;
            this.f = jwVar;
        } else {
            String str = f35.a;
            this.e = jwVar;
            this.f = ss0Var;
        }
    }

    public ml3(uc3 uc3Var) {
        this.a = uc3Var;
        this.b = new sm0(this);
        this.c = new k13();
        Boolean bool = Boolean.FALSE;
        this.d = uc5.B(bool);
        this.e = uc5.B(bool);
        this.f = uc5.B(bool);
    }

    public ml3(zt4 zt4Var) {
        this.a = zt4Var;
        vw1 vw1Var = yw1.o;
        this.b = gy3.r;
        this.c = ly3.t;
    }

    public ml3(lk3 lk3Var, wa4 wa4Var, mi3 mi3Var, yw1 yw1Var, Bundle bundle, xa4 xa4Var) {
        this.a = lk3Var;
        this.b = wa4Var;
        this.c = mi3Var;
        this.d = yw1Var;
        this.e = bundle == null ? Bundle.EMPTY : bundle;
        this.f = xa4Var;
    }
}
