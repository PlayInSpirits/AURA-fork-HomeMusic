package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import defpackage.hv2;
import defpackage.jv3;
import defpackage.qu2;
import defpackage.st3;
import defpackage.tu2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements hv2, AbsListView.SelectionBoundsAdjuster {
    public final Drawable A;
    public final boolean B;
    public LayoutInflater C;
    public boolean D;
    public tu2 n;
    public ImageView o;
    public RadioButton p;
    public TextView q;
    public CheckBox r;
    public TextView s;
    public ImageView t;
    public ImageView u;
    public LinearLayout v;
    public final Drawable w;
    public final int x;
    public final Context y;
    public boolean z;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        jv3 jv3VarF = jv3.f(getContext(), attributeSet, st3.s, i);
        this.w = jv3VarF.c(5);
        TypedArray typedArray = (TypedArray) jv3VarF.o;
        this.x = typedArray.getResourceId(1, -1);
        this.z = typedArray.getBoolean(7, false);
        this.y = context;
        this.A = jv3VarF.c(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, app.homemusic.R.attr.dropDownListViewStyle, 0);
        this.B = typedArrayObtainStyledAttributes.hasValue(0);
        jv3VarF.g();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.C == null) {
            this.C = LayoutInflater.from(getContext());
        }
        return this.C;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.t;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.u;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.u.getLayoutParams();
        rect.top = this.u.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    @Override // defpackage.hv2
    public final void c(tu2 tu2Var) {
        boolean z;
        int i;
        String string;
        this.n = tu2Var;
        boolean zIsVisible = tu2Var.isVisible();
        qu2 qu2Var = tu2Var.n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(tu2Var.e);
        setCheckable(tu2Var.isCheckable());
        if (qu2Var.o()) {
            if ((qu2Var.n() ? tu2Var.j : tu2Var.h) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        qu2Var.n();
        if (z) {
            tu2 tu2Var2 = this.n;
            qu2 qu2Var2 = tu2Var2.n;
            if (qu2Var2.o()) {
                i = (qu2Var2.n() ? tu2Var2.j : tu2Var2.h) == 0 ? 8 : 0;
            }
        }
        if (i == 0) {
            TextView textView = this.s;
            tu2 tu2Var3 = this.n;
            qu2 qu2Var3 = tu2Var3.n;
            Context context = qu2Var3.a;
            char c = qu2Var3.n() ? tu2Var3.j : tu2Var3.h;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(app.homemusic.R.string.abc_prepend_shortcut_label));
                }
                int i2 = qu2Var3.n() ? tu2Var3.k : tu2Var3.i;
                tu2.c(i2, 65536, resources.getString(app.homemusic.R.string.abc_menu_meta_shortcut_label), sb);
                tu2.c(i2, 4096, resources.getString(app.homemusic.R.string.abc_menu_ctrl_shortcut_label), sb);
                tu2.c(i2, 2, resources.getString(app.homemusic.R.string.abc_menu_alt_shortcut_label), sb);
                tu2.c(i2, 1, resources.getString(app.homemusic.R.string.abc_menu_shift_shortcut_label), sb);
                tu2.c(i2, 4, resources.getString(app.homemusic.R.string.abc_menu_sym_shortcut_label), sb);
                tu2.c(i2, 8, resources.getString(app.homemusic.R.string.abc_menu_function_shortcut_label), sb);
                if (c == '\b') {
                    sb.append(resources.getString(app.homemusic.R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(app.homemusic.R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(app.homemusic.R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.s.getVisibility() != i) {
            this.s.setVisibility(i);
        }
        setIcon(tu2Var.getIcon());
        setEnabled(tu2Var.isEnabled());
        setSubMenuArrowVisible(tu2Var.hasSubMenu());
        setContentDescription(tu2Var.q);
    }

    @Override // defpackage.hv2
    public tu2 getItemData() {
        return this.n;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.w);
        TextView textView = (TextView) findViewById(app.homemusic.R.id.title);
        this.q = textView;
        int i = this.x;
        if (i != -1) {
            textView.setTextAppearance(this.y, i);
        }
        this.s = (TextView) findViewById(app.homemusic.R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(app.homemusic.R.id.submenuarrow);
        this.t = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.A);
        }
        this.u = (ImageView) findViewById(app.homemusic.R.id.group_divider);
        this.v = (LinearLayout) findViewById(app.homemusic.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.o != null && this.z) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.o.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.p == null && this.r == null) {
            return;
        }
        if ((this.n.x & 4) != 0) {
            if (this.p == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(app.homemusic.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.p = radioButton;
                LinearLayout linearLayout = this.v;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.p;
            view = this.r;
        } else {
            if (this.r == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(app.homemusic.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.r = checkBox;
                LinearLayout linearLayout2 = this.v;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.r;
            view = this.p;
        }
        if (z) {
            compoundButton.setChecked(this.n.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.r;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.p;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.n.x & 4) != 0) {
            if (this.p == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(app.homemusic.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.p = radioButton;
                LinearLayout linearLayout = this.v;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.p;
        } else {
            if (this.r == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(app.homemusic.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.r = checkBox;
                LinearLayout linearLayout2 = this.v;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.r;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.D = z;
        this.z = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.u;
        if (imageView != null) {
            imageView.setVisibility((this.B || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        qu2 qu2Var = this.n.n;
        boolean z = this.D;
        if (z || this.z) {
            ImageView imageView = this.o;
            if (imageView == null && drawable == null && !this.z) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(app.homemusic.R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.o = imageView2;
                LinearLayout linearLayout = this.v;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.z) {
                this.o.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.o;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.o.getVisibility() != 0) {
                this.o.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.q;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.q.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.q.getVisibility() != 0) {
                this.q.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, app.homemusic.R.attr.listMenuViewStyle);
    }
}
