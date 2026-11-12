package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.DialogClickCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class us0 extends pp0 {
    public final /* synthetic */ int B0;
    public final DialogClickCallback C0;

    public /* synthetic */ us0(DialogClickCallback dialogClickCallback, int i) {
        this.B0 = i;
        this.C0 = dialogClickCallback;
    }

    @Override // defpackage.kc1
    public final void P() {
        final int i = 0;
        final int i2 = 1;
        switch (this.B0) {
            case 0:
                this.R = true;
                final f9 f9Var = (f9) this.w0;
                if (f9Var != null) {
                    f9Var.i(-1).setOnClickListener(new View.OnClickListener(this) { // from class: ts0
                        public final /* synthetic */ us0 o;

                        {
                            this.o = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i3 = i;
                            f9 f9Var2 = f9Var;
                            us0 us0Var = this.o;
                            switch (i3) {
                                case 0:
                                    ((qq0) us0Var.C0).onPositiveClick();
                                    f9Var2.dismiss();
                                    break;
                                default:
                                    ((qq0) us0Var.C0).onNegativeClick();
                                    f9Var2.dismiss();
                                    break;
                            }
                        }
                    });
                    f9Var.i(-2).setOnClickListener(new View.OnClickListener(this) { // from class: ts0
                        public final /* synthetic */ us0 o;

                        {
                            this.o = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i3 = i2;
                            f9 f9Var2 = f9Var;
                            us0 us0Var = this.o;
                            switch (i3) {
                                case 0:
                                    ((qq0) us0Var.C0).onPositiveClick();
                                    f9Var2.dismiss();
                                    break;
                                default:
                                    ((qq0) us0Var.C0).onNegativeClick();
                                    f9Var2.dismiss();
                                    break;
                            }
                        }
                    });
                }
                break;
            case 1:
                this.R = true;
                final f9 f9Var2 = (f9) this.w0;
                if (f9Var2 != null) {
                    f9Var2.i(-1).setOnClickListener(new View.OnClickListener(this) { // from class: wt0
                        public final /* synthetic */ us0 o;

                        {
                            this.o = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i3 = i;
                            f9 f9Var3 = f9Var2;
                            us0 us0Var = this.o;
                            switch (i3) {
                                case 0:
                                    if (ud3.p() != 1) {
                                        ud3.j0(1);
                                        au0.w(us0Var.Z()).g();
                                        ((rm2) us0Var.C0).onPositiveClick();
                                    }
                                    f9Var3.dismiss();
                                    break;
                                case 1:
                                    if (ud3.p() != 0) {
                                        ud3.j0(0);
                                        au0.w(us0Var.Z()).g();
                                        ((rm2) us0Var.C0).onNegativeClick();
                                    }
                                    f9Var3.dismiss();
                                    break;
                                default:
                                    if (ud3.p() != 2) {
                                        ud3.j0(2);
                                        au0.w(us0Var.Z()).g();
                                        ((rm2) us0Var.C0).onNeutralClick();
                                    }
                                    f9Var3.dismiss();
                                    break;
                            }
                        }
                    });
                    f9Var2.i(-2).setOnClickListener(new View.OnClickListener(this) { // from class: wt0
                        public final /* synthetic */ us0 o;

                        {
                            this.o = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i3 = i2;
                            f9 f9Var3 = f9Var2;
                            us0 us0Var = this.o;
                            switch (i3) {
                                case 0:
                                    if (ud3.p() != 1) {
                                        ud3.j0(1);
                                        au0.w(us0Var.Z()).g();
                                        ((rm2) us0Var.C0).onPositiveClick();
                                    }
                                    f9Var3.dismiss();
                                    break;
                                case 1:
                                    if (ud3.p() != 0) {
                                        ud3.j0(0);
                                        au0.w(us0Var.Z()).g();
                                        ((rm2) us0Var.C0).onNegativeClick();
                                    }
                                    f9Var3.dismiss();
                                    break;
                                default:
                                    if (ud3.p() != 2) {
                                        ud3.j0(2);
                                        au0.w(us0Var.Z()).g();
                                        ((rm2) us0Var.C0).onNeutralClick();
                                    }
                                    f9Var3.dismiss();
                                    break;
                            }
                        }
                    });
                    final int i3 = 2;
                    f9Var2.i(-3).setOnClickListener(new View.OnClickListener(this) { // from class: wt0
                        public final /* synthetic */ us0 o;

                        {
                            this.o = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i4 = i3;
                            f9 f9Var3 = f9Var2;
                            us0 us0Var = this.o;
                            switch (i4) {
                                case 0:
                                    if (ud3.p() != 1) {
                                        ud3.j0(1);
                                        au0.w(us0Var.Z()).g();
                                        ((rm2) us0Var.C0).onPositiveClick();
                                    }
                                    f9Var3.dismiss();
                                    break;
                                case 1:
                                    if (ud3.p() != 0) {
                                        ud3.j0(0);
                                        au0.w(us0Var.Z()).g();
                                        ((rm2) us0Var.C0).onNegativeClick();
                                    }
                                    f9Var3.dismiss();
                                    break;
                                default:
                                    if (ud3.p() != 2) {
                                        ud3.j0(2);
                                        au0.w(us0Var.Z()).g();
                                        ((rm2) us0Var.C0).onNeutralClick();
                                    }
                                    f9Var3.dismiss();
                                    break;
                            }
                        }
                    });
                }
                break;
            default:
                this.R = true;
                final f9 f9Var3 = (f9) this.w0;
                if (f9Var3 != null) {
                    f9Var3.i(-1).setOnClickListener(new View.OnClickListener(this) { // from class: km4
                        public final /* synthetic */ us0 o;

                        {
                            this.o = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i4 = i;
                            f9 f9Var4 = f9Var3;
                            us0 us0Var = this.o;
                            switch (i4) {
                                case 0:
                                    if (ud3.G() != 1) {
                                        ud3.B0(1);
                                        ((ub4) us0Var.C0).onPositiveClick();
                                    }
                                    f9Var4.dismiss();
                                    break;
                                default:
                                    if (ud3.G() != 0) {
                                        ud3.B0(0);
                                        ((ub4) us0Var.C0).onNegativeClick();
                                    }
                                    f9Var4.dismiss();
                                    break;
                            }
                        }
                    });
                    f9Var3.i(-2).setOnClickListener(new View.OnClickListener(this) { // from class: km4
                        public final /* synthetic */ us0 o;

                        {
                            this.o = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i4 = i2;
                            f9 f9Var4 = f9Var3;
                            us0 us0Var = this.o;
                            switch (i4) {
                                case 0:
                                    if (ud3.G() != 1) {
                                        ud3.B0(1);
                                        ((ub4) us0Var.C0).onPositiveClick();
                                    }
                                    f9Var4.dismiss();
                                    break;
                                default:
                                    if (ud3.G() != 0) {
                                        ud3.B0(0);
                                        ((ub4) us0Var.C0).onNegativeClick();
                                    }
                                    f9Var4.dismiss();
                                    break;
                            }
                        }
                    });
                }
                break;
        }
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        switch (this.B0) {
            case 0:
                View viewInflate = o().inflate(R.layout.dialog_download_directory, (ViewGroup) null, false);
                if (viewInflate == null) {
                    nz2.n("rootView");
                    return null;
                }
                vg2 vg2VarQ = new vg2(Z(), 0).q((LinearLayout) viewInflate);
                vg2VarQ.p(R.string.download_directory_dialog_title);
                return vg2VarQ.l(R.string.download_directory_dialog_positive_button, null).j(R.string.download_directory_dialog_negative_button, null).create();
            case 1:
                View viewInflate2 = o().inflate(R.layout.dialog_download_storage, (ViewGroup) null, false);
                if (viewInflate2 == null) {
                    nz2.n("rootView");
                    return null;
                }
                vg2 vg2VarQ2 = new vg2(e(), 0).q((LinearLayout) viewInflate2);
                vg2VarQ2.p(R.string.download_storage_dialog_title);
                vg2 vg2VarJ = vg2VarQ2.l(R.string.download_storage_external_dialog_positive_button, null).j(R.string.download_storage_internal_dialog_negative_button, null);
                vg2VarJ.k(R.string.download_storage_directory_dialog_neutral_button, null);
                return vg2VarJ.create();
            default:
                View viewInflate3 = o().inflate(R.layout.dialog_streaming_cache_storage, (ViewGroup) null, false);
                if (viewInflate3 == null) {
                    nz2.n("rootView");
                    return null;
                }
                vg2 vg2VarQ3 = new vg2(e(), 0).q((LinearLayout) viewInflate3);
                vg2VarQ3.p(R.string.streaming_cache_storage_dialog_title);
                return vg2VarQ3.l(R.string.streaming_cache_storage_external_dialog_positive_button, null).j(R.string.streaming_cache_storage_internal_dialog_negative_button, null).create();
        }
    }
}
