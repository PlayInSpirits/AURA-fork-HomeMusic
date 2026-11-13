.class public abstract Ldefpackage/ip3;
.super Ldefpackage/pp0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public B0:Landroidx/preference/DialogPreference;

.field public C0:Ljava/lang/CharSequence;

.field public D0:Ljava/lang/CharSequence;

.field public E0:Ljava/lang/CharSequence;

.field public F0:Ljava/lang/CharSequence;

.field public G0:I

.field public H0:Landroid/graphics/drawable/BitmapDrawable;

.field public I0:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldefpackage/pp0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public F(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Ldefpackage/pp0;->F(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Ldefpackage/kc1;->u(Z)Ldefpackage/kc1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Ldefpackage/kp3;

    .line 10
    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    check-cast v0, Ldefpackage/kp3;

    .line 14
    .line 15
    invoke-virtual {p0}, Ldefpackage/kc1;->Y()Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "key"

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v2, 0x0

    .line 26
    if-nez p1, :cond_2

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ldefpackage/kp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Landroidx/preference/DialogPreference;

    .line 33
    .line 34
    iput-object p1, p0, Ldefpackage/ip3;->B0:Landroidx/preference/DialogPreference;

    .line 35
    .line 36
    iget-object v0, p1, Landroidx/preference/DialogPreference;->b0:Ljava/lang/CharSequence;

    .line 37
    .line 38
    iput-object v0, p0, Ldefpackage/ip3;->C0:Ljava/lang/CharSequence;

    .line 39
    .line 40
    iget-object v0, p1, Landroidx/preference/DialogPreference;->e0:Ljava/lang/String;

    .line 41
    .line 42
    iput-object v0, p0, Ldefpackage/ip3;->D0:Ljava/lang/CharSequence;

    .line 43
    .line 44
    iget-object v0, p1, Landroidx/preference/DialogPreference;->f0:Ljava/lang/String;

    .line 45
    .line 46
    iput-object v0, p0, Ldefpackage/ip3;->E0:Ljava/lang/CharSequence;

    .line 47
    .line 48
    iget-object v0, p1, Landroidx/preference/DialogPreference;->c0:Ljava/lang/String;

    .line 49
    .line 50
    iput-object v0, p0, Ldefpackage/ip3;->F0:Ljava/lang/CharSequence;

    .line 51
    .line 52
    iget v0, p1, Landroidx/preference/DialogPreference;->g0:I

    .line 53
    .line 54
    iput v0, p0, Ldefpackage/ip3;->G0:I

    .line 55
    .line 56
    iget-object p1, p1, Landroidx/preference/DialogPreference;->d0:Landroid/graphics/drawable/Drawable;

    .line 57
    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 61
    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 74
    .line 75
    invoke-static {v0, v1, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    new-instance v1, Landroid/graphics/Canvas;

    .line 80
    .line 81
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    invoke-virtual {p1, v2, v2, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 96
    .line 97
    .line 98
    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 99
    .line 100
    invoke-virtual {p0}, Ldefpackage/kc1;->r()Landroid/content/res/Resources;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-direct {p1, v1, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 105
    .line 106
    .line 107
    iput-object p1, p0, Ldefpackage/ip3;->H0:Landroid/graphics/drawable/BitmapDrawable;

    .line 108
    .line 109
    return-void

    .line 110
    :cond_1
    :goto_0
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 111
    .line 112
    iput-object p1, p0, Ldefpackage/ip3;->H0:Landroid/graphics/drawable/BitmapDrawable;

    .line 113
    .line 114
    return-void

    .line 115
    :cond_2
    const-string v0, "PreferenceDialogFragment.title"

    .line 116
    .line 117
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iput-object v0, p0, Ldefpackage/ip3;->C0:Ljava/lang/CharSequence;

    .line 122
    .line 123
    const-string v0, "PreferenceDialogFragment.positiveText"

    .line 124
    .line 125
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iput-object v0, p0, Ldefpackage/ip3;->D0:Ljava/lang/CharSequence;

    .line 130
    .line 131
    const-string v0, "PreferenceDialogFragment.negativeText"

    .line 132
    .line 133
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iput-object v0, p0, Ldefpackage/ip3;->E0:Ljava/lang/CharSequence;

    .line 138
    .line 139
    const-string v0, "PreferenceDialogFragment.message"

    .line 140
    .line 141
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iput-object v0, p0, Ldefpackage/ip3;->F0:Ljava/lang/CharSequence;

    .line 146
    .line 147
    const-string v0, "PreferenceDialogFragment.layout"

    .line 148
    .line 149
    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    iput v0, p0, Ldefpackage/ip3;->G0:I

    .line 154
    .line 155
    const-string v0, "PreferenceDialogFragment.icon"

    .line 156
    .line 157
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    check-cast p1, Landroid/graphics/Bitmap;

    .line 162
    .line 163
    if-eqz p1, :cond_3

    .line 164
    .line 165
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 166
    .line 167
    invoke-virtual {p0}, Ldefpackage/kc1;->r()Landroid/content/res/Resources;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 172
    .line 173
    .line 174
    iput-object v0, p0, Ldefpackage/ip3;->H0:Landroid/graphics/drawable/BitmapDrawable;

    .line 175
    .line 176
    :cond_3
    return-void

    .line 177
    :cond_4
    const-string p0, "Target fragment must implement TargetFragment interface"

    .line 178
    .line 179
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    return-void
.end method

.method public Q(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Ldefpackage/pp0;->Q(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "PreferenceDialogFragment.title"

    .line 5
    .line 6
    iget-object v1, p0, Ldefpackage/ip3;->C0:Ljava/lang/CharSequence;

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "PreferenceDialogFragment.positiveText"

    .line 12
    .line 13
    iget-object v1, p0, Ldefpackage/ip3;->D0:Ljava/lang/CharSequence;

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "PreferenceDialogFragment.negativeText"

    .line 19
    .line 20
    iget-object v1, p0, Ldefpackage/ip3;->E0:Ljava/lang/CharSequence;

    .line 21
    .line 22
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    const-string v0, "PreferenceDialogFragment.message"

    .line 26
    .line 27
    iget-object v1, p0, Ldefpackage/ip3;->F0:Ljava/lang/CharSequence;

    .line 28
    .line 29
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    const-string v0, "PreferenceDialogFragment.layout"

    .line 33
    .line 34
    iget v1, p0, Ldefpackage/ip3;->G0:I

    .line 35
    .line 36
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, Ldefpackage/ip3;->H0:Landroid/graphics/drawable/BitmapDrawable;

    .line 40
    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    const-string v0, "PreferenceDialogFragment.icon"

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method

.method public final j0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .line 1
    const/4 p1, -0x2

    .line 2
    iput p1, p0, Ldefpackage/ip3;->I0:I

    .line 3
    .line 4
    new-instance p1, Ldefpackage/e9;

    .line 5
    .line 6
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p1, v0}, Ldefpackage/e9;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ldefpackage/ip3;->C0:Ljava/lang/CharSequence;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ldefpackage/e9;->setTitle(Ljava/lang/CharSequence;)Ldefpackage/e9;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p0, Ldefpackage/ip3;->H0:Landroid/graphics/drawable/BitmapDrawable;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ldefpackage/e9;->b(Landroid/graphics/drawable/Drawable;)Ldefpackage/e9;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, Ldefpackage/ip3;->D0:Ljava/lang/CharSequence;

    .line 26
    .line 27
    invoke-virtual {p1, v0, p0}, Ldefpackage/e9;->f(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Ldefpackage/e9;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, Ldefpackage/ip3;->E0:Ljava/lang/CharSequence;

    .line 32
    .line 33
    invoke-virtual {p1, v0, p0}, Ldefpackage/e9;->d(Ljava/lang/CharSequence;Ldefpackage/ip3;)Ldefpackage/e9;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    iget v0, p0, Ldefpackage/ip3;->G0:I

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p0}, Ldefpackage/kc1;->o()Landroid/view/LayoutInflater;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :goto_0
    if-eqz v1, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Ldefpackage/ip3;->o0(Landroid/view/View;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v1}, Ldefpackage/e9;->setView(Landroid/view/View;)Ldefpackage/e9;

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    iget-object v0, p0, Ldefpackage/ip3;->F0:Ljava/lang/CharSequence;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ldefpackage/e9;->c(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    :goto_1
    invoke-virtual {p0, p1}, Ldefpackage/ip3;->q0(Ldefpackage/e9;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Ldefpackage/e9;->create()Ldefpackage/f9;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    instance-of v0, p0, Ldefpackage/jz0;

    .line 76
    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 84
    .line 85
    const/16 v2, 0x1e

    .line 86
    .line 87
    if-lt v1, v2, :cond_2

    .line 88
    .line 89
    invoke-static {v0}, Ldefpackage/hp3;->a(Landroid/view/Window;)V

    .line 90
    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_2
    check-cast p0, Ldefpackage/jz0;

    .line 94
    .line 95
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 96
    .line 97
    .line 98
    move-result-wide v0

    .line 99
    iput-wide v0, p0, Ldefpackage/jz0;->M0:J

    .line 100
    .line 101
    invoke-virtual {p0}, Ldefpackage/jz0;->r0()V

    .line 102
    .line 103
    .line 104
    :cond_3
    return-object p1
.end method

.method public final n0()Landroidx/preference/DialogPreference;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ip3;->B0:Landroidx/preference/DialogPreference;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/kc1;->Y()Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "key"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {p0, v1}, Ldefpackage/kc1;->u(Z)Ldefpackage/kc1;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ldefpackage/kp3;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ldefpackage/kp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroidx/preference/DialogPreference;

    .line 27
    .line 28
    iput-object v0, p0, Ldefpackage/ip3;->B0:Landroidx/preference/DialogPreference;

    .line 29
    .line 30
    :cond_0
    iget-object p0, p0, Ldefpackage/ip3;->B0:Landroidx/preference/DialogPreference;

    .line 31
    .line 32
    return-object p0
.end method

.method public o0(Landroid/view/View;)V
    .locals 1

    .line 1
    const v0, 0x102000b

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_2

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/ip3;->F0:Ljava/lang/CharSequence;

    .line 11
    .line 12
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    instance-of v0, p1, Landroid/widget/TextView;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move-object v0, p1

    .line 23
    check-cast v0, Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/16 p0, 0x8

    .line 31
    .line 32
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eq v0, p0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1, p0}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    :cond_2
    return-void
.end method

.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/ip3;->I0:I

    .line 2
    .line 3
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Ldefpackage/pp0;->onDismiss(Landroid/content/DialogInterface;)V

    .line 2
    .line 3
    .line 4
    iget p1, p0, Ldefpackage/ip3;->I0:I

    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    invoke-virtual {p0, p1}, Ldefpackage/ip3;->p0(Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public abstract p0(Z)V
.end method

.method public q0(Ldefpackage/e9;)V
    .locals 0

    .line 1
    return-void
.end method
