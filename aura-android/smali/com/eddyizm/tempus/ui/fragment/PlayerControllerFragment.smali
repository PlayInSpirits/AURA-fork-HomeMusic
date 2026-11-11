.class public Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public A0:Landroid/widget/ImageButton;

.field public B0:Landroid/widget/ImageButton;

.field public C0:Landroid/widget/ImageButton;

.field public D0:Landroid/widget/LinearLayout;

.field public E0:Landroid/widget/ImageButton;

.field public F0:Landroid/widget/TextView;

.field public G0:Lcom/google/android/material/chip/ChipGroup;

.field public H0:Lcom/google/android/material/chip/Chip;

.field public I0:Lcom/google/android/material/chip/Chip;

.field public J0:Lcom/google/android/material/chip/Chip;

.field public K0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public L0:Laj3;

.field public M0:Lbl2;

.field public N0:Z

.field public final O0:Ly11;

.field public l0:Li61;

.field public m0:La52;

.field public n0:Z

.field public o0:Landroidx/viewpager2/widget/ViewPager2;

.field public p0:Landroid/widget/ToggleButton;

.field public q0:Landroid/widget/ImageButton;

.field public r0:Lpu3;

.field public s0:Landroid/widget/RatingBar;

.field public t0:Landroid/widget/TextView;

.field public u0:Landroid/widget/TextView;

.field public v0:Landroid/widget/Button;

.field public w0:Landroid/widget/ToggleButton;

.field public x0:Lcom/google/android/material/chip/Chip;

.field public y0:Landroid/widget/TextView;

.field public z0:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lkc1;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->N0:Z

    .line 6
    .line 7
    new-instance v0, Ly11;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, v1, p0}, Ly11;-><init>(ILkc1;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->O0:Ly11;

    .line 14
    .line 15
    return-void
.end method

.method public static j0(Lcom/google/android/material/chip/Chip;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/16 v0, 0x8

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 7
    .line 8
    .line 9
    const-string v0, ""

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static l0(F)Lqh3;
    .locals 3

    .line 1
    const-string v0, "playback_speed_pitch"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/high16 v2, 0x3f800000    # 1.0f

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const-string v0, "playback_speed_manual_pitch"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "playback_speed_manual_pitch_value"

    .line 32
    .line 33
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    move v2, v0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v2, p0

    .line 40
    :cond_1
    :goto_0
    new-instance v0, Lqh3;

    .line 41
    .line 42
    invoke-direct {v0, p0, v2}, Lqh3;-><init>(FF)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method public static s0(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lkc1;->l()Lnc1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->K0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 10
    .line 11
    const v1, 0x7f0d008d

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    move-object/from16 v3, p1

    .line 16
    .line 17
    move-object/from16 v4, p2

    .line 18
    .line 19
    invoke-virtual {v3, v1, v4, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const v3, 0x7f0a042a

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    move-object v7, v4

    .line 31
    check-cast v7, Landroidx/media3/ui/PlayerControlView;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz v7, :cond_9

    .line 35
    .line 36
    const v3, 0x7f0a0494

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    move-object v8, v5

    .line 44
    check-cast v8, Lcom/google/android/material/button/MaterialButton;

    .line 45
    .line 46
    if-eqz v8, :cond_9

    .line 47
    .line 48
    new-instance v5, Li61;

    .line 49
    .line 50
    move-object v6, v1

    .line 51
    check-cast v6, Landroid/widget/LinearLayout;

    .line 52
    .line 53
    const/4 v10, 0x6

    .line 54
    const/4 v9, 0x0

    .line 55
    invoke-direct/range {v5 .. v10}, Li61;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 56
    .line 57
    .line 58
    iput-object v5, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 59
    .line 60
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Ll70;->d()Le75;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v1}, Lgh0;->r(Lf75;)Lb75;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-static {v1, v5}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    new-instance v7, Lbq4;

    .line 77
    .line 78
    invoke-direct {v7, v3, v5, v1}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 79
    .line 80
    .line 81
    const-class v1, Laj3;

    .line 82
    .line 83
    invoke-static {v1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1}, Li30;->b()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    const-string v5, "Local and anonymous classes can not be ViewModels"

    .line 92
    .line 93
    if-eqz v3, :cond_8

    .line 94
    .line 95
    const-string v8, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 96
    .line 97
    invoke-virtual {v8, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v7, v1, v3}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Laj3;

    .line 106
    .line 107
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->L0:Laj3;

    .line 108
    .line 109
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v1}, Ll70;->d()Le75;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-static {v1}, Lgh0;->r(Lf75;)Lb75;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    invoke-static {v1, v7}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    new-instance v9, Lbq4;

    .line 126
    .line 127
    invoke-direct {v9, v3, v7, v1}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 128
    .line 129
    .line 130
    const-class v1, Lpu3;

    .line 131
    .line 132
    invoke-static {v1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v1}, Li30;->b()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    if-eqz v3, :cond_7

    .line 141
    .line 142
    invoke-virtual {v8, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v9, v1, v3}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    check-cast v1, Lpu3;

    .line 151
    .line 152
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->r0:Lpu3;

    .line 153
    .line 154
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 155
    .line 156
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v1, Landroid/widget/LinearLayout;

    .line 159
    .line 160
    const v3, 0x7f0a0488

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    check-cast v1, Landroidx/viewpager2/widget/ViewPager2;

    .line 168
    .line 169
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->o0:Landroidx/viewpager2/widget/ViewPager2;

    .line 170
    .line 171
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 172
    .line 173
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v1, Landroid/widget/LinearLayout;

    .line 176
    .line 177
    const v3, 0x7f0a0135

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    check-cast v1, Landroid/widget/ToggleButton;

    .line 185
    .line 186
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->p0:Landroid/widget/ToggleButton;

    .line 187
    .line 188
    new-instance v3, Lwj3;

    .line 189
    .line 190
    invoke-direct {v3, v0, v2}, Lwj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V

    .line 191
    .line 192
    .line 193
    invoke-static {v1, v3}, Lot1;->f(Landroid/widget/ToggleButton;Ljava/util/function/Supplier;)V

    .line 194
    .line 195
    .line 196
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 197
    .line 198
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v1, Landroid/widget/LinearLayout;

    .line 201
    .line 202
    const v3, 0x7f0a048f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    check-cast v1, Landroid/widget/ImageButton;

    .line 210
    .line 211
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->q0:Landroid/widget/ImageButton;

    .line 212
    .line 213
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 214
    .line 215
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v1, Landroid/widget/LinearLayout;

    .line 218
    .line 219
    const v3, 0x7f0a048c

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    check-cast v1, Landroid/widget/TextView;

    .line 227
    .line 228
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->t0:Landroid/widget/TextView;

    .line 229
    .line 230
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 231
    .line 232
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v1, Landroid/widget/LinearLayout;

    .line 235
    .line 236
    const v3, 0x7f0a0476

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    check-cast v1, Landroid/widget/TextView;

    .line 244
    .line 245
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->u0:Landroid/widget/TextView;

    .line 246
    .line 247
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 248
    .line 249
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v1, Landroid/widget/LinearLayout;

    .line 252
    .line 253
    const v3, 0x7f0a0491

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    check-cast v1, Landroid/widget/Button;

    .line 261
    .line 262
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->v0:Landroid/widget/Button;

    .line 263
    .line 264
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 265
    .line 266
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v1, Landroid/widget/LinearLayout;

    .line 269
    .line 270
    const v3, 0x7f0a0495

    .line 271
    .line 272
    .line 273
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    check-cast v1, Landroid/widget/ToggleButton;

    .line 278
    .line 279
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->w0:Landroid/widget/ToggleButton;

    .line 280
    .line 281
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 282
    .line 283
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v1, Landroid/widget/LinearLayout;

    .line 286
    .line 287
    const v3, 0x7f0a0489

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    check-cast v1, Lcom/google/android/material/chip/Chip;

    .line 295
    .line 296
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->x0:Lcom/google/android/material/chip/Chip;

    .line 297
    .line 298
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 299
    .line 300
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v1, Landroid/widget/LinearLayout;

    .line 303
    .line 304
    const v3, 0x7f0a0487

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    check-cast v1, Landroid/widget/TextView;

    .line 312
    .line 313
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->y0:Landroid/widget/TextView;

    .line 314
    .line 315
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 316
    .line 317
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v1, Landroid/widget/LinearLayout;

    .line 320
    .line 321
    const v3, 0x7f0a0493

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 329
    .line 330
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->z0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 331
    .line 332
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 333
    .line 334
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v1, Landroid/widget/LinearLayout;

    .line 337
    .line 338
    const v3, 0x7f0a048e

    .line 339
    .line 340
    .line 341
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    check-cast v1, Landroid/widget/ImageButton;

    .line 346
    .line 347
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->A0:Landroid/widget/ImageButton;

    .line 348
    .line 349
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 350
    .line 351
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v1, Landroid/widget/LinearLayout;

    .line 354
    .line 355
    const v3, 0x7f0a048d

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    check-cast v1, Landroid/widget/ImageButton;

    .line 363
    .line 364
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->B0:Landroid/widget/ImageButton;

    .line 365
    .line 366
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 367
    .line 368
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v1, Landroid/widget/LinearLayout;

    .line 371
    .line 372
    const v3, 0x7f0a0486

    .line 373
    .line 374
    .line 375
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    check-cast v1, Landroid/widget/ImageButton;

    .line 380
    .line 381
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->C0:Landroid/widget/ImageButton;

    .line 382
    .line 383
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 384
    .line 385
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v1, Landroid/widget/LinearLayout;

    .line 388
    .line 389
    const v3, 0x7f0a059d

    .line 390
    .line 391
    .line 392
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    check-cast v1, Landroid/widget/RatingBar;

    .line 397
    .line 398
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->s0:Landroid/widget/RatingBar;

    .line 399
    .line 400
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 401
    .line 402
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v1, Landroid/widget/LinearLayout;

    .line 405
    .line 406
    const v3, 0x7f0a050c

    .line 407
    .line 408
    .line 409
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    check-cast v1, Landroid/widget/LinearLayout;

    .line 414
    .line 415
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->D0:Landroid/widget/LinearLayout;

    .line 416
    .line 417
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 418
    .line 419
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v1, Landroid/widget/LinearLayout;

    .line 422
    .line 423
    const v3, 0x7f0a00fe

    .line 424
    .line 425
    .line 426
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    check-cast v1, Lcom/google/android/material/chip/ChipGroup;

    .line 431
    .line 432
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->G0:Lcom/google/android/material/chip/ChipGroup;

    .line 433
    .line 434
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 435
    .line 436
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v1, Landroid/widget/LinearLayout;

    .line 439
    .line 440
    const v3, 0x7f0a00ff

    .line 441
    .line 442
    .line 443
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    check-cast v1, Lcom/google/android/material/chip/Chip;

    .line 448
    .line 449
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->H0:Lcom/google/android/material/chip/Chip;

    .line 450
    .line 451
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 452
    .line 453
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v1, Landroid/widget/LinearLayout;

    .line 456
    .line 457
    const v3, 0x7f0a00fc

    .line 458
    .line 459
    .line 460
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    check-cast v1, Lcom/google/android/material/chip/Chip;

    .line 465
    .line 466
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->I0:Lcom/google/android/material/chip/Chip;

    .line 467
    .line 468
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 469
    .line 470
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v1, Landroid/widget/LinearLayout;

    .line 473
    .line 474
    const v3, 0x7f0a00fd

    .line 475
    .line 476
    .line 477
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    check-cast v1, Lcom/google/android/material/chip/Chip;

    .line 482
    .line 483
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->J0:Lcom/google/android/material/chip/Chip;

    .line 484
    .line 485
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 486
    .line 487
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast v1, Landroid/widget/LinearLayout;

    .line 490
    .line 491
    const v3, 0x7f0a0497

    .line 492
    .line 493
    .line 494
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    check-cast v1, Landroid/widget/LinearLayout;

    .line 499
    .line 500
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 501
    .line 502
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v1, Landroid/widget/LinearLayout;

    .line 505
    .line 506
    const v3, 0x7f0a0496

    .line 507
    .line 508
    .line 509
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    check-cast v1, Landroid/widget/ImageButton;

    .line 514
    .line 515
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->E0:Landroid/widget/ImageButton;

    .line 516
    .line 517
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 518
    .line 519
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 520
    .line 521
    check-cast v1, Landroid/widget/LinearLayout;

    .line 522
    .line 523
    const v3, 0x7f0a0498

    .line 524
    .line 525
    .line 526
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    check-cast v1, Landroid/widget/TextView;

    .line 531
    .line 532
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->F0:Landroid/widget/TextView;

    .line 533
    .line 534
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 535
    .line 536
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 537
    .line 538
    check-cast v1, Landroid/widget/LinearLayout;

    .line 539
    .line 540
    const v3, 0x7f0a0227

    .line 541
    .line 542
    .line 543
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    check-cast v1, Landroidx/media3/ui/DefaultTimeBar;

    .line 548
    .line 549
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    const v3, 0x7f04011c

    .line 553
    .line 554
    .line 555
    invoke-static {v1, v3}, Lg12;->t(Landroid/view/View;I)I

    .line 556
    .line 557
    .line 558
    move-result v3

    .line 559
    const v4, 0x7f04012e

    .line 560
    .line 561
    .line 562
    invoke-static {v1, v4}, Lg12;->t(Landroid/view/View;I)I

    .line 563
    .line 564
    .line 565
    move-result v4

    .line 566
    const/16 v5, 0x10

    .line 567
    .line 568
    invoke-static {v4, v3, v5}, Lj51;->k(III)I

    .line 569
    .line 570
    .line 571
    move-result v5

    .line 572
    const/high16 v7, -0x1000000

    .line 573
    .line 574
    or-int/2addr v5, v7

    .line 575
    const/16 v7, 0x8

    .line 576
    .line 577
    invoke-static {v4, v3, v7}, Lj51;->k(III)I

    .line 578
    .line 579
    .line 580
    move-result v8

    .line 581
    or-int/2addr v5, v8

    .line 582
    invoke-static {v4, v3, v2}, Lj51;->k(III)I

    .line 583
    .line 584
    .line 585
    move-result v3

    .line 586
    or-int/2addr v3, v5

    .line 587
    invoke-virtual {v1, v3}, Landroidx/media3/ui/DefaultTimeBar;->setBufferedColor(I)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    iget-object v3, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 595
    .line 596
    iget-object v3, v3, Li61;->o:Ljava/lang/Object;

    .line 597
    .line 598
    move-object v10, v3

    .line 599
    check-cast v10, Landroid/widget/LinearLayout;

    .line 600
    .line 601
    iget-object v3, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->L0:Laj3;

    .line 602
    .line 603
    iget-object v9, v3, Laj3;->n:Lk03;

    .line 604
    .line 605
    new-instance v3, Ld7;

    .line 606
    .line 607
    const/4 v4, 0x5

    .line 608
    invoke-direct {v3, v4, v0}, Ld7;-><init>(ILjava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    new-instance v15, Lwj3;

    .line 612
    .line 613
    const/4 v5, 0x1

    .line 614
    invoke-direct {v15, v0, v5}, Lwj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V

    .line 615
    .line 616
    .line 617
    iget-object v14, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->u0:Landroid/widget/TextView;

    .line 618
    .line 619
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    const v8, 0x7f0a049c

    .line 626
    .line 627
    .line 628
    invoke-virtual {v10, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 629
    .line 630
    .line 631
    move-result-object v11

    .line 632
    const v8, 0x7f0a049b

    .line 633
    .line 634
    .line 635
    invoke-virtual {v10, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 636
    .line 637
    .line 638
    move-result-object v8

    .line 639
    move-object v12, v8

    .line 640
    check-cast v12, Landroid/widget/TextView;

    .line 641
    .line 642
    const v8, 0x7f0a0499

    .line 643
    .line 644
    .line 645
    invoke-virtual {v10, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 646
    .line 647
    .line 648
    move-result-object v8

    .line 649
    move-object v13, v8

    .line 650
    check-cast v13, Landroid/widget/ImageButton;

    .line 651
    .line 652
    const v8, 0x7f0a049a

    .line 653
    .line 654
    .line 655
    invoke-virtual {v10, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 656
    .line 657
    .line 658
    move-result-object v8

    .line 659
    check-cast v8, Landroid/widget/ImageButton;

    .line 660
    .line 661
    const v4, 0x7f0a022e

    .line 662
    .line 663
    .line 664
    invoke-virtual {v10, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 665
    .line 666
    .line 667
    move-result-object v4

    .line 668
    check-cast v4, Landroid/widget/ImageButton;

    .line 669
    .line 670
    if-eqz v4, :cond_0

    .line 671
    .line 672
    new-instance v7, Lj8;

    .line 673
    .line 674
    const/16 v5, 0xd

    .line 675
    .line 676
    invoke-direct {v7, v5, v10, v15}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v4, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 680
    .line 681
    .line 682
    :cond_0
    if-eqz v13, :cond_1

    .line 683
    .line 684
    new-instance v4, Let1;

    .line 685
    .line 686
    invoke-direct {v4, v9, v3, v10, v2}, Let1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 687
    .line 688
    .line 689
    invoke-virtual {v13, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 690
    .line 691
    .line 692
    :cond_1
    if-eqz v8, :cond_2

    .line 693
    .line 694
    new-instance v3, Lj8;

    .line 695
    .line 696
    const/16 v4, 0xe

    .line 697
    .line 698
    invoke-direct {v3, v4, v9, v10}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v8, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 702
    .line 703
    .line 704
    :cond_2
    new-instance v8, Lft1;

    .line 705
    .line 706
    invoke-direct/range {v8 .. v15}, Lft1;-><init>(Lk03;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/ImageButton;Landroid/widget/TextView;Lwj3;)V

    .line 707
    .line 708
    .line 709
    new-instance v3, Lgt1;

    .line 710
    .line 711
    invoke-direct {v3, v8, v2}, Lgt1;-><init>(Lft1;I)V

    .line 712
    .line 713
    .line 714
    new-instance v4, Lht1;

    .line 715
    .line 716
    invoke-direct {v4, v3, v2}, Lht1;-><init>(Lif1;I)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v9, v1, v4}, Lad2;->e(Lba2;La83;)V

    .line 720
    .line 721
    .line 722
    sget-object v3, Lcom/eddyizm/tempus/homemusic/a;->f:Lk03;

    .line 723
    .line 724
    new-instance v4, Lgt1;

    .line 725
    .line 726
    const/4 v5, 0x1

    .line 727
    invoke-direct {v4, v8, v5}, Lgt1;-><init>(Lft1;I)V

    .line 728
    .line 729
    .line 730
    new-instance v5, Lht1;

    .line 731
    .line 732
    invoke-direct {v5, v4, v2}, Lht1;-><init>(Lif1;I)V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v3, v1, v5}, Lad2;->e(Lba2;La83;)V

    .line 736
    .line 737
    .line 738
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->D0:Landroid/widget/LinearLayout;

    .line 739
    .line 740
    if-nez v1, :cond_3

    .line 741
    .line 742
    :goto_0
    const/16 v1, 0x8

    .line 743
    .line 744
    goto :goto_1

    .line 745
    :cond_3
    const-string v1, "song_rating_per_item"

    .line 746
    .line 747
    invoke-static {v1, v2}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 748
    .line 749
    .line 750
    move-result v1

    .line 751
    iget-object v3, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->D0:Landroid/widget/LinearLayout;

    .line 752
    .line 753
    if-eqz v1, :cond_4

    .line 754
    .line 755
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 756
    .line 757
    .line 758
    goto :goto_0

    .line 759
    :cond_4
    const/16 v1, 0x8

    .line 760
    .line 761
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 762
    .line 763
    .line 764
    :goto_1
    new-instance v3, La52;

    .line 765
    .line 766
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 767
    .line 768
    .line 769
    move-result-object v4

    .line 770
    invoke-direct {v3, v4}, Lqe4;-><init>(Landroid/os/Looper;)V

    .line 771
    .line 772
    .line 773
    iput-object v3, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->m0:La52;

    .line 774
    .line 775
    sget-object v3, Lu52;->b:Lk03;

    .line 776
    .line 777
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 778
    .line 779
    .line 780
    move-result-object v4

    .line 781
    new-instance v5, Luj3;

    .line 782
    .line 783
    const/4 v7, 0x3

    .line 784
    invoke-direct {v5, v0, v7}, Luj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V

    .line 785
    .line 786
    .line 787
    invoke-virtual {v3, v4, v5}, Lad2;->e(Lba2;La83;)V

    .line 788
    .line 789
    .line 790
    sget-object v3, Lu52;->c:Lk03;

    .line 791
    .line 792
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 793
    .line 794
    .line 795
    move-result-object v4

    .line 796
    new-instance v5, Luj3;

    .line 797
    .line 798
    const/4 v8, 0x4

    .line 799
    invoke-direct {v5, v0, v8}, Luj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v3, v4, v5}, Lad2;->e(Lba2;La83;)V

    .line 803
    .line 804
    .line 805
    iget-object v3, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 806
    .line 807
    iget-object v3, v3, Li61;->q:Ljava/lang/Object;

    .line 808
    .line 809
    check-cast v3, Lcom/google/android/material/button/MaterialButton;

    .line 810
    .line 811
    new-instance v4, Lrj3;

    .line 812
    .line 813
    const/4 v5, 0x5

    .line 814
    invoke-direct {v4, v0, v5}, Lrj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 818
    .line 819
    .line 820
    iget-object v3, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->q0:Landroid/widget/ImageButton;

    .line 821
    .line 822
    if-eqz v3, :cond_5

    .line 823
    .line 824
    new-instance v4, Lrj3;

    .line 825
    .line 826
    invoke-direct {v4, v0, v8}, Lrj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 830
    .line 831
    .line 832
    :cond_5
    iget-object v3, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->z0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 833
    .line 834
    const-string v4, "quick_action_visible"

    .line 835
    .line 836
    const/4 v5, 0x1

    .line 837
    invoke-static {v4, v5}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 838
    .line 839
    .line 840
    move-result v4

    .line 841
    if-eqz v4, :cond_6

    .line 842
    .line 843
    move v1, v2

    .line 844
    :cond_6
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 845
    .line 846
    .line 847
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->A0:Landroid/widget/ImageButton;

    .line 848
    .line 849
    new-instance v3, Lrj3;

    .line 850
    .line 851
    const/4 v4, 0x2

    .line 852
    invoke-direct {v3, v0, v4}, Lrj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V

    .line 853
    .line 854
    .line 855
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 856
    .line 857
    .line 858
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->B0:Landroid/widget/ImageButton;

    .line 859
    .line 860
    new-instance v3, Lrj3;

    .line 861
    .line 862
    invoke-direct {v3, v0, v7}, Lrj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V

    .line 863
    .line 864
    .line 865
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 866
    .line 867
    .line 868
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->o0:Landroidx/viewpager2/widget/ViewPager2;

    .line 869
    .line 870
    invoke-virtual {v1, v2}, Landroidx/viewpager2/widget/ViewPager2;->setOrientation(I)V

    .line 871
    .line 872
    .line 873
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->o0:Landroidx/viewpager2/widget/ViewPager2;

    .line 874
    .line 875
    new-instance v3, Lbk3;

    .line 876
    .line 877
    invoke-virtual {v0}, Lkc1;->m()Lld1;

    .line 878
    .line 879
    .line 880
    move-result-object v5

    .line 881
    iget-object v8, v0, Lkc1;->c0:Lea2;

    .line 882
    .line 883
    invoke-direct {v3, v5, v8}, Lee1;-><init>(Lld1;Lea2;)V

    .line 884
    .line 885
    .line 886
    invoke-virtual {v1, v3}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Ldw3;)V

    .line 887
    .line 888
    .line 889
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->o0:Landroidx/viewpager2/widget/ViewPager2;

    .line 890
    .line 891
    invoke-virtual {v1, v2}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 892
    .line 893
    .line 894
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->o0:Landroidx/viewpager2/widget/ViewPager2;

    .line 895
    .line 896
    new-instance v3, Lq80;

    .line 897
    .line 898
    invoke-direct {v3, v7, v0}, Lq80;-><init>(ILjava/lang/Object;)V

    .line 899
    .line 900
    .line 901
    iget-object v1, v1, Landroidx/viewpager2/widget/ViewPager2;->p:Lq80;

    .line 902
    .line 903
    iget-object v1, v1, Lq80;->b:Ljava/lang/Object;

    .line 904
    .line 905
    check-cast v1, Ljava/util/ArrayList;

    .line 906
    .line 907
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 908
    .line 909
    .line 910
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->L0:Laj3;

    .line 911
    .line 912
    iget-object v1, v1, Laj3;->n:Lk03;

    .line 913
    .line 914
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 915
    .line 916
    .line 917
    move-result-object v3

    .line 918
    new-instance v5, Luj3;

    .line 919
    .line 920
    const/4 v7, 0x1

    .line 921
    invoke-direct {v5, v0, v7}, Luj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V

    .line 922
    .line 923
    .line 924
    invoke-virtual {v1, v3, v5}, Lad2;->e(Lba2;La83;)V

    .line 925
    .line 926
    .line 927
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->L0:Laj3;

    .line 928
    .line 929
    iget-object v1, v1, Laj3;->o:Lk03;

    .line 930
    .line 931
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 932
    .line 933
    .line 934
    move-result-object v3

    .line 935
    new-instance v5, Luj3;

    .line 936
    .line 937
    invoke-direct {v5, v0, v2}, Luj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V

    .line 938
    .line 939
    .line 940
    invoke-virtual {v1, v3, v5}, Lad2;->e(Lba2;La83;)V

    .line 941
    .line 942
    .line 943
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->L0:Laj3;

    .line 944
    .line 945
    iget-object v1, v1, Laj3;->p:Lk03;

    .line 946
    .line 947
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 948
    .line 949
    .line 950
    move-result-object v2

    .line 951
    new-instance v3, Luj3;

    .line 952
    .line 953
    invoke-direct {v3, v0, v4}, Luj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v1, v2, v3}, Lad2;->e(Lba2;La83;)V

    .line 957
    .line 958
    .line 959
    invoke-virtual {v0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->x0()V

    .line 960
    .line 961
    .line 962
    return-object v6

    .line 963
    :cond_7
    invoke-static {v5}, Lkf2;->n(Ljava/lang/String;)V

    .line 964
    .line 965
    .line 966
    return-object v4

    .line 967
    :cond_8
    invoke-static {v5}, Lkf2;->n(Ljava/lang/String;)V

    .line 968
    .line 969
    .line 970
    return-object v4

    .line 971
    :cond_9
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 972
    .line 973
    .line 974
    move-result-object v0

    .line 975
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 976
    .line 977
    .line 978
    move-result-object v0

    .line 979
    const-string v1, "Missing required view with ID: "

    .line 980
    .line 981
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 982
    .line 983
    .line 984
    move-result-object v0

    .line 985
    invoke-static {v0}, Lnz2;->n(Ljava/lang/String;)V

    .line 986
    .line 987
    .line 988
    return-object v4
.end method

.method public final J()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroidx/media3/ui/PlayerControlView;->setPlayer(Lqi3;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->m0:La52;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Lqe4;->A1()V

    .line 21
    .line 22
    .line 23
    :cond_1
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->m0:La52;

    .line 24
    .line 25
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 26
    .line 27
    return-void
.end method

.method public final O()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->N0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->O0:Ly11;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->N0:Z

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final P()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    new-instance v1, Landroid/content/Intent;

    .line 5
    .line 6
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const-class v3, Lcom/eddyizm/tempus/service/MediaService;

    .line 11
    .line 12
    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 13
    .line 14
    .line 15
    const-string v2, "com.eddyizm.tempus.service.BIND_EQUALIZER"

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->O0:Ly11;

    .line 25
    .line 26
    invoke-virtual {v2, v1, v3, v0}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 27
    .line 28
    .line 29
    iput-boolean v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->N0:Z

    .line 30
    .line 31
    return-void
.end method

.method public final R()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    new-instance v3, Lcb4;

    .line 9
    .line 10
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Landroid/content/ComponentName;

    .line 15
    .line 16
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    const-class v5, Lcom/eddyizm/tempus/service/MediaService;

    .line 21
    .line 22
    invoke-direct {v1, v4, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v3, v0, v1}, Lcb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    .line 26
    .line 27
    .line 28
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 29
    .line 30
    new-instance v5, Laj2;

    .line 31
    .line 32
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lf35;->x()Landroid/os/Looper;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    new-instance v7, Lbl2;

    .line 40
    .line 41
    invoke-direct {v7, v6}, Lbl2;-><init>(Landroid/os/Looper;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, v3, Lcb4;->a:Lbb4;

    .line 45
    .line 46
    invoke-interface {v0}, Lbb4;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    new-instance v0, Lxc5;

    .line 53
    .line 54
    new-instance v1, Lx7;

    .line 55
    .line 56
    invoke-direct {v1, v2}, Lx7;-><init>(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    new-instance v8, Lfi0;

    .line 60
    .line 61
    invoke-direct {v8, v1}, Lfi0;-><init>(Lx7;)V

    .line 62
    .line 63
    .line 64
    const/4 v1, 0x4

    .line 65
    invoke-direct {v0, v1, v8}, Lxc5;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    move-object v8, v0

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    const/4 v0, 0x0

    .line 71
    goto :goto_0

    .line 72
    :goto_1
    new-instance v1, Lbj2;

    .line 73
    .line 74
    invoke-direct/range {v1 .. v8}, Lsk2;-><init>(Landroid/content/Context;Lcb4;Landroid/os/Bundle;Lqk2;Landroid/os/Looper;Lbl2;Lxc5;)V

    .line 75
    .line 76
    .line 77
    new-instance v0, Landroid/os/Handler;

    .line 78
    .line 79
    invoke-direct {v0, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v7, v1, v0}, Lb11;->w(Lbl2;Lbj2;Landroid/os/Handler;)V

    .line 83
    .line 84
    .line 85
    iput-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->M0:Lbl2;

    .line 86
    .line 87
    new-instance v0, Lqa1;

    .line 88
    .line 89
    const/16 v1, 0x1b

    .line 90
    .line 91
    invoke-direct {v0, v1, p0}, Lqa1;-><init>(ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    sget-object p0, Lgq0;->n:Lgq0;

    .line 95
    .line 96
    invoke-virtual {v7, v0, p0}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final S()V
    .locals 2

    .line 1
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, v0, Lyf4;->h:Lvj3;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->M0:Lbl2;

    .line 9
    .line 10
    invoke-static {v0}, Lsk2;->Z0(Ljava/util/concurrent/Future;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 15
    .line 16
    return-void
.end method

.method public final h0(Lcom/google/android/material/chip/Chip;Ljava/lang/String;Ljava/lang/String;)Lik;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-static {p1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->j0(Lcom/google/android/material/chip/Chip;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x1

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, -0x1

    .line 22
    sparse-switch v1, :sswitch_data_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :sswitch_0
    const-string v1, "playlist"

    .line 27
    .line 28
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    const/4 v4, 0x5

    .line 36
    goto :goto_0

    .line 37
    :sswitch_1
    const-string v1, "genre"

    .line 38
    .line 39
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_3

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    const/4 v4, 0x4

    .line 47
    goto :goto_0

    .line 48
    :sswitch_2
    const-string v1, "album"

    .line 49
    .line 50
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_4

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_4
    const/4 v4, 0x3

    .line 58
    goto :goto_0

    .line 59
    :sswitch_3
    const-string v1, "year"

    .line 60
    .line 61
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_5

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_5
    const/4 v4, 0x2

    .line 69
    goto :goto_0

    .line 70
    :sswitch_4
    const-string v1, "song"

    .line 71
    .line 72
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_6

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_6
    move v4, v2

    .line 80
    goto :goto_0

    .line 81
    :sswitch_5
    const-string v1, "artist"

    .line 82
    .line 83
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_7

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_7
    move v4, v3

    .line 91
    :goto_0
    packed-switch v4, :pswitch_data_0

    .line 92
    .line 93
    .line 94
    const v1, 0x7f130086

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :pswitch_0
    const v1, 0x7f130084

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :pswitch_1
    const v1, 0x7f130083

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :pswitch_2
    const v1, 0x7f130081

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :pswitch_3
    const v1, 0x7f130087

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :pswitch_4
    const v1, 0x7f130085

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :pswitch_5
    const v1, 0x7f130082

    .line 119
    .line 120
    .line 121
    :goto_1
    invoke-virtual {p0, v1}, Lkc1;->s(I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-static {p2, p3}, Ll93;->h(Ljava/lang/String;Ljava/lang/String;)Lik;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    if-nez p2, :cond_8

    .line 130
    .line 131
    invoke-static {p1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->j0(Lcom/google/android/material/chip/Chip;)V

    .line 132
    .line 133
    .line 134
    return-object v0

    .line 135
    :cond_8
    iget-object v0, p2, Lik;->d:Ljava/lang/String;

    .line 136
    .line 137
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const v1, 0x7f130078

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v1, v0}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 152
    .line 153
    .line 154
    new-instance v0, Ltj3;

    .line 155
    .line 156
    invoke-direct {v0, p0, p2, v2}, Ltj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;Lik;I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    .line 161
    .line 162
    new-instance v0, Lyj3;

    .line 163
    .line 164
    invoke-direct {v0, p0, p2, p3, v3}, Lyj3;-><init>(Lkc1;Lik;Ljava/lang/String;I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 168
    .line 169
    .line 170
    return-object p2

    .line 171
    :sswitch_data_0
    .sparse-switch
        -0x53fd20b9 -> :sswitch_5
        0x35f515 -> :sswitch_4
        0x38883d -> :sswitch_3
        0x5897e6f -> :sswitch_2
        0x5db0983 -> :sswitch_1
        0x700681d2 -> :sswitch_0
    .end sparse-switch

    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i0(Landroid/view/View;Lik;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    if-nez p2, :cond_1

    .line 6
    .line 7
    invoke-static {p1}, Ll93;->p(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->setLongClickable(Z)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const/4 v1, 0x1

    .line 25
    invoke-virtual {p1, v1}, Landroid/view/View;->setClickable(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v1}, Landroid/view/View;->setLongClickable(Z)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Ll93;->g(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Ltj3;

    .line 35
    .line 36
    invoke-direct {v1, p0, p2, v0}, Ltj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;Lik;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Li8;

    .line 43
    .line 44
    const/4 v1, 0x3

    .line 45
    invoke-direct {v0, v1, p0, p2}, Li8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final k0()Lbj2;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->M0:Lbl2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Lu0;->isDone()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    :try_start_0
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->M0:Lbl2;

    .line 14
    .line 15
    invoke-virtual {p0}, Lu0;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lbj2;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    const-string v0, "PlayerCoverFragment"

    .line 24
    .line 25
    const-string v2, "Unable to resolve media browser"

    .line 26
    .line 27
    invoke-static {v0, v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    return-object v1
.end method

.method public final m0()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->m0:La52;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    invoke-static {}, Lu52;->c()Lv52;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-boolean v0, v0, Lv52;->a:Z

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->m0:La52;

    .line 22
    .line 23
    invoke-virtual {v0}, Lqe4;->F1()V

    .line 24
    .line 25
    .line 26
    iget-object v3, v0, Lqe4;->f:Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/util/HashSet;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    iget-boolean v3, v0, Lqe4;->i:Z

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {v0}, La52;->i1()Lpe4;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v0, v3, v2, v2}, Lqe4;->D1(Lpe4;ZZ)V

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 47
    .line 48
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 51
    .line 52
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->m0:La52;

    .line 53
    .line 54
    invoke-virtual {v0, v3}, Landroidx/media3/ui/PlayerControlView;->setPlayer(Lqi3;)V

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lu52;->c()Lv52;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v3, v0, Lv52;->c:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 64
    .line 65
    iget-object v4, v4, Li61;->q:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v4, Lcom/google/android/material/button/MaterialButton;

    .line 68
    .line 69
    const v5, 0x7f1302c5

    .line 70
    .line 71
    .line 72
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {p0, v5, v6}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 84
    .line 85
    iget-object v4, v4, Li61;->q:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v4, Lcom/google/android/material/button/MaterialButton;

    .line 88
    .line 89
    const v5, 0x7f1302b5

    .line 90
    .line 91
    .line 92
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {p0, v5, v3}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v4, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 101
    .line 102
    .line 103
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 104
    .line 105
    iget-object v3, v3, Li61;->q:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v3, Lcom/google/android/material/button/MaterialButton;

    .line 108
    .line 109
    invoke-virtual {v3, v1}, Landroid/view/View;->setSelected(Z)V

    .line 110
    .line 111
    .line 112
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 113
    .line 114
    iget-object v3, v3, Li61;->p:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v3, Landroidx/media3/ui/PlayerControlView;

    .line 117
    .line 118
    invoke-virtual {v3, v1}, Landroidx/media3/ui/PlayerControlView;->setShowShuffleButton(Z)V

    .line 119
    .line 120
    .line 121
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 122
    .line 123
    iget-object v3, v3, Li61;->p:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v3, Landroidx/media3/ui/PlayerControlView;

    .line 126
    .line 127
    const/4 v4, 0x3

    .line 128
    invoke-virtual {v3, v4}, Landroidx/media3/ui/PlayerControlView;->setRepeatToggleModes(I)V

    .line 129
    .line 130
    .line 131
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 132
    .line 133
    iget-object v3, v3, Li61;->p:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v3, Landroidx/media3/ui/PlayerControlView;

    .line 136
    .line 137
    invoke-virtual {v3, v2}, Landroidx/media3/ui/PlayerControlView;->setShowRewindButton(Z)V

    .line 138
    .line 139
    .line 140
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 141
    .line 142
    iget-object v3, v3, Li61;->p:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v3, Landroidx/media3/ui/PlayerControlView;

    .line 145
    .line 146
    invoke-virtual {v3, v2}, Landroidx/media3/ui/PlayerControlView;->setShowFastForwardButton(Z)V

    .line 147
    .line 148
    .line 149
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 150
    .line 151
    iget-object v3, v3, Li61;->p:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v3, Landroidx/media3/ui/PlayerControlView;

    .line 154
    .line 155
    invoke-virtual {v3, v1}, Landroidx/media3/ui/PlayerControlView;->setShowPreviousButton(Z)V

    .line 156
    .line 157
    .line 158
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 159
    .line 160
    iget-object v3, v3, Li61;->p:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v3, Landroidx/media3/ui/PlayerControlView;

    .line 163
    .line 164
    invoke-virtual {v3, v1}, Landroidx/media3/ui/PlayerControlView;->setShowNextButton(Z)V

    .line 165
    .line 166
    .line 167
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->v0:Landroid/widget/Button;

    .line 168
    .line 169
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 170
    .line 171
    .line 172
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->w0:Landroid/widget/ToggleButton;

    .line 173
    .line 174
    const/16 v4, 0x8

    .line 175
    .line 176
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 177
    .line 178
    .line 179
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->p0:Landroid/widget/ToggleButton;

    .line 180
    .line 181
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 182
    .line 183
    .line 184
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->L0:Laj3;

    .line 185
    .line 186
    iget-object v3, v3, Laj3;->n:Lk03;

    .line 187
    .line 188
    invoke-virtual {v3}, Lad2;->d()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    check-cast v3, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 193
    .line 194
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->p0:Landroid/widget/ToggleButton;

    .line 195
    .line 196
    if-eqz v3, :cond_3

    .line 197
    .line 198
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    iget-object v5, v0, Lv52;->x:Ljava/lang/String;

    .line 203
    .line 204
    invoke-static {v3, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-eqz v3, :cond_3

    .line 209
    .line 210
    move v3, v1

    .line 211
    goto :goto_1

    .line 212
    :cond_3
    move v3, v2

    .line 213
    :goto_1
    invoke-virtual {v4, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 214
    .line 215
    .line 216
    iput-boolean v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->n0:Z

    .line 217
    .line 218
    :try_start_0
    invoke-static {}, Lu52;->d()Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-static {v1}, Lsi0;->E(Lcom/eddyizm/tempus/subsonic/models/Child;)Ldo2;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {p0, v1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->q0(Ldo2;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0, v1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->p0(Ldo2;)V

    .line 230
    .line 231
    .line 232
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->v0:Landroid/widget/Button;

    .line 233
    .line 234
    iget v0, v0, Lv52;->y:F

    .line 235
    .line 236
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    const v3, 0x7f1303d6

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0, v3, v0}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->x0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 255
    .line 256
    .line 257
    iput-boolean v2, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->n0:Z

    .line 258
    .line 259
    return-void

    .line 260
    :catchall_0
    move-exception v0

    .line 261
    iput-boolean v2, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->n0:Z

    .line 262
    .line 263
    throw v0

    .line 264
    :cond_4
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 265
    .line 266
    iget-object v0, v0, Li61;->q:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 269
    .line 270
    const v3, 0x7f1302d2

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    .line 274
    .line 275
    .line 276
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 277
    .line 278
    iget-object v0, v0, Li61;->q:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 281
    .line 282
    invoke-virtual {p0, v3}, Lkc1;->s(I)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    invoke-virtual {v0, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 287
    .line 288
    .line 289
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 290
    .line 291
    iget-object v0, v0, Li61;->q:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 294
    .line 295
    invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V

    .line 296
    .line 297
    .line 298
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->p0:Landroid/widget/ToggleButton;

    .line 299
    .line 300
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->k0()Lbj2;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    if-eqz v0, :cond_5

    .line 308
    .line 309
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 310
    .line 311
    iget-object v1, v1, Li61;->p:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v1, Landroidx/media3/ui/PlayerControlView;

    .line 314
    .line 315
    invoke-virtual {v1, v0}, Landroidx/media3/ui/PlayerControlView;->setPlayer(Lqi3;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {p0, v0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->n0(Lbj2;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0}, Lsk2;->K0()Ldo2;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-virtual {p0, v1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->q0(Ldo2;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0}, Lsk2;->K0()Ldo2;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {p0, v0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->p0(Ldo2;)V

    .line 333
    .line 334
    .line 335
    :cond_5
    :goto_2
    return-void
.end method

.method public final n0(Lbj2;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    invoke-static {}, Lu52;->c()Lv52;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-boolean v0, v0, Lv52;->a:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_1

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->v0:Landroid/widget/Button;

    .line 16
    .line 17
    new-instance v1, Lrj3;

    .line 18
    .line 19
    const/4 v2, 0x6

    .line 20
    invoke-direct {v1, p0, v2}, Lrj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->w0:Landroid/widget/ToggleButton;

    .line 27
    .line 28
    new-instance v1, Lrj3;

    .line 29
    .line 30
    const/4 v2, 0x7

    .line 31
    invoke-direct {v1, p0, v2}, Lrj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lsk2;->K0()Ldo2;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v0, v0, Ldo2;->I:Landroid/os/Bundle;

    .line 42
    .line 43
    if-eqz v0, :cond_5

    .line 44
    .line 45
    invoke-virtual {p1}, Lsk2;->K0()Ldo2;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v0, v0, Ldo2;->I:Landroid/os/Bundle;

    .line 50
    .line 51
    const-string v1, "type"

    .line 52
    .line 53
    const-string v2, "music"

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    const v3, -0x182c7cfc

    .line 64
    .line 65
    .line 66
    const v4, 0x7f0a0135

    .line 67
    .line 68
    .line 69
    const v5, 0x7f0a0495

    .line 70
    .line 71
    .line 72
    const v6, 0x7f0a0491

    .line 73
    .line 74
    .line 75
    const/4 v7, 0x1

    .line 76
    const/16 v8, 0x8

    .line 77
    .line 78
    const/4 v9, 0x0

    .line 79
    if-eq v1, v3, :cond_3

    .line 80
    .line 81
    const v3, 0x636ee25

    .line 82
    .line 83
    .line 84
    if-eq v1, v3, :cond_2

    .line 85
    .line 86
    const v2, 0x67413fb

    .line 87
    .line 88
    .line 89
    if-eq v1, v2, :cond_1

    .line 90
    .line 91
    goto/16 :goto_0

    .line 92
    .line 93
    :cond_1
    const-string v1, "radio"

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_4

    .line 100
    .line 101
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 102
    .line 103
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 106
    .line 107
    invoke-virtual {v0, v9}, Landroidx/media3/ui/PlayerControlView;->setShowShuffleButton(Z)V

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 111
    .line 112
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 115
    .line 116
    invoke-virtual {v0, v9}, Landroidx/media3/ui/PlayerControlView;->setShowRewindButton(Z)V

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 120
    .line 121
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 124
    .line 125
    invoke-virtual {v0, v9}, Landroidx/media3/ui/PlayerControlView;->setShowPreviousButton(Z)V

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 129
    .line 130
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 133
    .line 134
    invoke-virtual {v0, v9}, Landroidx/media3/ui/PlayerControlView;->setShowNextButton(Z)V

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 138
    .line 139
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 142
    .line 143
    invoke-virtual {v0, v9}, Landroidx/media3/ui/PlayerControlView;->setShowFastForwardButton(Z)V

    .line 144
    .line 145
    .line 146
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 147
    .line 148
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 151
    .line 152
    invoke-virtual {v0, v9}, Landroidx/media3/ui/PlayerControlView;->setRepeatToggleModes(I)V

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 156
    .line 157
    iget-object v0, v0, Li61;->o:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, Landroid/widget/LinearLayout;

    .line 160
    .line 161
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 166
    .line 167
    .line 168
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 169
    .line 170
    iget-object v0, v0, Li61;->o:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, Landroid/widget/LinearLayout;

    .line 173
    .line 174
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 179
    .line 180
    .line 181
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 182
    .line 183
    iget-object v0, v0, Li61;->o:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Landroid/widget/LinearLayout;

    .line 186
    .line 187
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->r0(Lbj2;)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_2
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    goto :goto_0

    .line 203
    :cond_3
    const-string v1, "podcast"

    .line 204
    .line 205
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_4

    .line 210
    .line 211
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 212
    .line 213
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 216
    .line 217
    invoke-virtual {v0, v9}, Landroidx/media3/ui/PlayerControlView;->setShowShuffleButton(Z)V

    .line 218
    .line 219
    .line 220
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 221
    .line 222
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 225
    .line 226
    invoke-virtual {v0, v7}, Landroidx/media3/ui/PlayerControlView;->setShowRewindButton(Z)V

    .line 227
    .line 228
    .line 229
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 230
    .line 231
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 234
    .line 235
    invoke-virtual {v0, v9}, Landroidx/media3/ui/PlayerControlView;->setShowPreviousButton(Z)V

    .line 236
    .line 237
    .line 238
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 239
    .line 240
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 243
    .line 244
    invoke-virtual {v0, v9}, Landroidx/media3/ui/PlayerControlView;->setShowNextButton(Z)V

    .line 245
    .line 246
    .line 247
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 248
    .line 249
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 252
    .line 253
    invoke-virtual {v0, v7}, Landroidx/media3/ui/PlayerControlView;->setShowFastForwardButton(Z)V

    .line 254
    .line 255
    .line 256
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 257
    .line 258
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 261
    .line 262
    invoke-virtual {v0, v9}, Landroidx/media3/ui/PlayerControlView;->setRepeatToggleModes(I)V

    .line 263
    .line 264
    .line 265
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 266
    .line 267
    iget-object v0, v0, Li61;->o:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v0, Landroid/widget/LinearLayout;

    .line 270
    .line 271
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    .line 276
    .line 277
    .line 278
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 279
    .line 280
    iget-object v0, v0, Li61;->o:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v0, Landroid/widget/LinearLayout;

    .line 283
    .line 284
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    .line 289
    .line 290
    .line 291
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 292
    .line 293
    iget-object v0, v0, Li61;->o:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v0, Landroid/widget/LinearLayout;

    .line 296
    .line 297
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->r0(Lbj2;)V

    .line 305
    .line 306
    .line 307
    return-void

    .line 308
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 309
    .line 310
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 313
    .line 314
    invoke-virtual {v0, v7}, Landroidx/media3/ui/PlayerControlView;->setShowShuffleButton(Z)V

    .line 315
    .line 316
    .line 317
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 318
    .line 319
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 322
    .line 323
    invoke-virtual {v0, v9}, Landroidx/media3/ui/PlayerControlView;->setShowRewindButton(Z)V

    .line 324
    .line 325
    .line 326
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 327
    .line 328
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 331
    .line 332
    invoke-virtual {v0, v7}, Landroidx/media3/ui/PlayerControlView;->setShowPreviousButton(Z)V

    .line 333
    .line 334
    .line 335
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 336
    .line 337
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 340
    .line 341
    invoke-virtual {v0, v7}, Landroidx/media3/ui/PlayerControlView;->setShowNextButton(Z)V

    .line 342
    .line 343
    .line 344
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 345
    .line 346
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 349
    .line 350
    invoke-virtual {v0, v9}, Landroidx/media3/ui/PlayerControlView;->setShowFastForwardButton(Z)V

    .line 351
    .line 352
    .line 353
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 354
    .line 355
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 358
    .line 359
    const/4 v1, 0x3

    .line 360
    invoke-virtual {v0, v1}, Landroidx/media3/ui/PlayerControlView;->setRepeatToggleModes(I)V

    .line 361
    .line 362
    .line 363
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 364
    .line 365
    iget-object v0, v0, Li61;->o:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v0, Landroid/widget/LinearLayout;

    .line 368
    .line 369
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    .line 374
    .line 375
    .line 376
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 377
    .line 378
    iget-object v0, v0, Li61;->o:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v0, Landroid/widget/LinearLayout;

    .line 381
    .line 382
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 387
    .line 388
    .line 389
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 390
    .line 391
    iget-object v0, v0, Li61;->o:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v0, Landroid/widget/LinearLayout;

    .line 394
    .line 395
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->r0(Lbj2;)V

    .line 403
    .line 404
    .line 405
    :cond_5
    :goto_1
    return-void
.end method

.method public final o0()V
    .locals 15

    .line 1
    invoke-static {}, Lu52;->c()Lv52;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lv52;->a:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_f

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->x0:Lcom/google/android/material/chip/Chip;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto/16 :goto_f

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->k0()Lbj2;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Le03;->m(Lbj2;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    goto/16 :goto_f

    .line 28
    .line 29
    :cond_2
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x1

    .line 31
    const/4 v3, 0x0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    move-object v5, v1

    .line 35
    goto :goto_2

    .line 36
    :cond_3
    invoke-virtual {v0}, Lsk2;->e0()Ljw4;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    iget-object v4, v4, Ljw4;->a:Lyw1;

    .line 41
    .line 42
    invoke-virtual {v4, v3}, Lyw1;->m(I)Lvw1;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    move-object v5, v1

    .line 47
    :cond_4
    :goto_0
    invoke-virtual {v4}, Lv0;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_8

    .line 52
    .line 53
    invoke-virtual {v4}, Lv0;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, Liw4;

    .line 58
    .line 59
    iget-object v7, v6, Liw4;->b:Lsv4;

    .line 60
    .line 61
    iget v7, v7, Lsv4;->c:I

    .line 62
    .line 63
    if-eq v7, v2, :cond_5

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_5
    move v7, v3

    .line 67
    :goto_1
    iget v8, v6, Liw4;->a:I

    .line 68
    .line 69
    if-ge v7, v8, :cond_4

    .line 70
    .line 71
    iget-object v8, v6, Liw4;->e:[Z

    .line 72
    .line 73
    aget-boolean v8, v8, v7

    .line 74
    .line 75
    if-eqz v8, :cond_6

    .line 76
    .line 77
    invoke-virtual {v6, v7}, Liw4;->a(I)Ltb1;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    goto :goto_2

    .line 82
    :cond_6
    if-nez v5, :cond_7

    .line 83
    .line 84
    invoke-virtual {v6, v7}, Liw4;->a(I)Ltb1;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    :cond_7
    add-int/lit8 v7, v7, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_8
    :goto_2
    if-nez v5, :cond_9

    .line 92
    .line 93
    goto/16 :goto_f

    .line 94
    .line 95
    :cond_9
    iget-object v4, v5, Ltb1;->n:Ljava/lang/String;

    .line 96
    .line 97
    iget v6, v5, Ltb1;->j:I

    .line 98
    .line 99
    const-string v7, "upnp"

    .line 100
    .line 101
    iget-object v5, v5, Ltb1;->a:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-eqz v5, :cond_a

    .line 108
    .line 109
    const-string v7, "audio/x-unknown"

    .line 110
    .line 111
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-eqz v7, :cond_a

    .line 116
    .line 117
    goto/16 :goto_f

    .line 118
    .line 119
    :cond_a
    const-string v7, "ogg"

    .line 120
    .line 121
    const-string v8, "flac"

    .line 122
    .line 123
    const-string v9, "opus"

    .line 124
    .line 125
    const-string v10, "vorbis"

    .line 126
    .line 127
    const-string v11, "aac"

    .line 128
    .line 129
    const-string v12, "alac"

    .line 130
    .line 131
    if-nez v4, :cond_b

    .line 132
    .line 133
    move-object v4, v1

    .line 134
    goto/16 :goto_6

    .line 135
    .line 136
    :cond_b
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-virtual {v4, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result v13

    .line 144
    if-eqz v13, :cond_c

    .line 145
    .line 146
    move-object v4, v8

    .line 147
    goto/16 :goto_6

    .line 148
    .line 149
    :cond_c
    invoke-virtual {v4, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 150
    .line 151
    .line 152
    move-result v13

    .line 153
    if-eqz v13, :cond_d

    .line 154
    .line 155
    move-object v4, v9

    .line 156
    goto/16 :goto_6

    .line 157
    .line 158
    :cond_d
    invoke-virtual {v4, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 159
    .line 160
    .line 161
    move-result v13

    .line 162
    if-eqz v13, :cond_e

    .line 163
    .line 164
    move-object v4, v10

    .line 165
    goto/16 :goto_6

    .line 166
    .line 167
    :cond_e
    const-string v13, "mp4a"

    .line 168
    .line 169
    invoke-virtual {v4, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 170
    .line 171
    .line 172
    move-result v13

    .line 173
    if-nez v13, :cond_17

    .line 174
    .line 175
    invoke-virtual {v4, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 176
    .line 177
    .line 178
    move-result v13

    .line 179
    if-eqz v13, :cond_f

    .line 180
    .line 181
    goto/16 :goto_5

    .line 182
    .line 183
    :cond_f
    const-string v13, "mpeg"

    .line 184
    .line 185
    invoke-virtual {v4, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 186
    .line 187
    .line 188
    move-result v13

    .line 189
    const-string v14, "mp3"

    .line 190
    .line 191
    if-nez v13, :cond_16

    .line 192
    .line 193
    invoke-virtual {v4, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 194
    .line 195
    .line 196
    move-result v13

    .line 197
    if-eqz v13, :cond_10

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_10
    invoke-virtual {v4, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 201
    .line 202
    .line 203
    move-result v13

    .line 204
    if-eqz v13, :cond_11

    .line 205
    .line 206
    move-object v4, v12

    .line 207
    goto :goto_6

    .line 208
    :cond_11
    const-string v13, "eac3"

    .line 209
    .line 210
    invoke-virtual {v4, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 211
    .line 212
    .line 213
    move-result v14

    .line 214
    if-eqz v14, :cond_12

    .line 215
    .line 216
    :goto_3
    move-object v4, v13

    .line 217
    goto :goto_6

    .line 218
    :cond_12
    const-string v13, "ac3"

    .line 219
    .line 220
    invoke-virtual {v4, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 221
    .line 222
    .line 223
    move-result v14

    .line 224
    if-eqz v14, :cond_13

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_13
    const-string v13, "pcm"

    .line 228
    .line 229
    invoke-virtual {v4, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 230
    .line 231
    .line 232
    move-result v13

    .line 233
    const-string v14, "wav"

    .line 234
    .line 235
    if-nez v13, :cond_16

    .line 236
    .line 237
    const-string v13, "raw"

    .line 238
    .line 239
    invoke-virtual {v4, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 240
    .line 241
    .line 242
    move-result v13

    .line 243
    if-nez v13, :cond_16

    .line 244
    .line 245
    invoke-virtual {v4, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 246
    .line 247
    .line 248
    move-result v13

    .line 249
    if-eqz v13, :cond_14

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_14
    invoke-virtual {v4, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 253
    .line 254
    .line 255
    move-result v13

    .line 256
    if-eqz v13, :cond_15

    .line 257
    .line 258
    move-object v4, v7

    .line 259
    goto :goto_6

    .line 260
    :cond_15
    const/16 v13, 0x2f

    .line 261
    .line 262
    invoke-virtual {v4, v13}, Ljava/lang/String;->indexOf(I)I

    .line 263
    .line 264
    .line 265
    move-result v13

    .line 266
    if-ltz v13, :cond_18

    .line 267
    .line 268
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 269
    .line 270
    .line 271
    move-result v14

    .line 272
    sub-int/2addr v14, v2

    .line 273
    if-ge v13, v14, :cond_18

    .line 274
    .line 275
    add-int/2addr v13, v2

    .line 276
    invoke-virtual {v4, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    goto :goto_6

    .line 281
    :cond_16
    :goto_4
    move-object v4, v14

    .line 282
    goto :goto_6

    .line 283
    :cond_17
    :goto_5
    move-object v4, v11

    .line 284
    :cond_18
    :goto_6
    if-eqz v5, :cond_19

    .line 285
    .line 286
    invoke-virtual {v0}, Lsk2;->K0()Ldo2;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    iget-object v1, v1, Ldo2;->I:Landroid/os/Bundle;

    .line 291
    .line 292
    invoke-static {v1}, Le03;->p(Landroid/os/Bundle;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    goto :goto_7

    .line 297
    :cond_19
    if-eqz v0, :cond_1b

    .line 298
    .line 299
    invoke-virtual {v0}, Lsk2;->K0()Ldo2;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    iget-object v5, v5, Ldo2;->I:Landroid/os/Bundle;

    .line 304
    .line 305
    if-nez v5, :cond_1a

    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_1a
    invoke-virtual {v0}, Lsk2;->K0()Ldo2;

    .line 309
    .line 310
    .line 311
    move-result-object v5

    .line 312
    iget-object v5, v5, Ldo2;->I:Landroid/os/Bundle;

    .line 313
    .line 314
    const-string v13, "suffix"

    .line 315
    .line 316
    invoke-virtual {v5, v13, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    :cond_1b
    :goto_7
    const/4 v5, -0x1

    .line 321
    if-eqz v4, :cond_1e

    .line 322
    .line 323
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 324
    .line 325
    .line 326
    move-result v13

    .line 327
    if-eqz v13, :cond_1c

    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_1c
    if-eqz v1, :cond_1e

    .line 331
    .line 332
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 333
    .line 334
    .line 335
    move-result v13

    .line 336
    if-eqz v13, :cond_1d

    .line 337
    .line 338
    goto :goto_8

    .line 339
    :cond_1d
    invoke-virtual {v4, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 340
    .line 341
    .line 342
    move-result v13

    .line 343
    if-eqz v13, :cond_1f

    .line 344
    .line 345
    :cond_1e
    :goto_8
    move v2, v3

    .line 346
    goto/16 :goto_b

    .line 347
    .line 348
    :cond_1f
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 356
    .line 357
    .line 358
    move-result v13

    .line 359
    sparse-switch v13, :sswitch_data_0

    .line 360
    .line 361
    .line 362
    :goto_9
    move v1, v5

    .line 363
    goto :goto_a

    .line 364
    :sswitch_0
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    if-nez v1, :cond_20

    .line 369
    .line 370
    goto :goto_9

    .line 371
    :cond_20
    const/4 v1, 0x4

    .line 372
    goto :goto_a

    .line 373
    :sswitch_1
    const-string v7, "oga"

    .line 374
    .line 375
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    if-nez v1, :cond_21

    .line 380
    .line 381
    goto :goto_9

    .line 382
    :cond_21
    const/4 v1, 0x3

    .line 383
    goto :goto_a

    .line 384
    :sswitch_2
    const-string v7, "mp4"

    .line 385
    .line 386
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    if-nez v1, :cond_22

    .line 391
    .line 392
    goto :goto_9

    .line 393
    :cond_22
    const/4 v1, 0x2

    .line 394
    goto :goto_a

    .line 395
    :sswitch_3
    const-string v7, "m4b"

    .line 396
    .line 397
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    if-nez v1, :cond_23

    .line 402
    .line 403
    goto :goto_9

    .line 404
    :cond_23
    move v1, v2

    .line 405
    goto :goto_a

    .line 406
    :sswitch_4
    const-string v7, "m4a"

    .line 407
    .line 408
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    if-nez v1, :cond_24

    .line 413
    .line 414
    goto :goto_9

    .line 415
    :cond_24
    move v1, v3

    .line 416
    :goto_a
    packed-switch v1, :pswitch_data_0

    .line 417
    .line 418
    .line 419
    goto :goto_b

    .line 420
    :pswitch_0
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    if-nez v1, :cond_1e

    .line 425
    .line 426
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    if-nez v1, :cond_1e

    .line 431
    .line 432
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v1

    .line 436
    if-nez v1, :cond_1e

    .line 437
    .line 438
    goto :goto_b

    .line 439
    :pswitch_1
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    move-result v1

    .line 443
    if-nez v1, :cond_1e

    .line 444
    .line 445
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v1

    .line 449
    if-nez v1, :cond_1e

    .line 450
    .line 451
    :goto_b
    if-eqz v4, :cond_26

    .line 452
    .line 453
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 454
    .line 455
    .line 456
    move-result v1

    .line 457
    if-nez v1, :cond_26

    .line 458
    .line 459
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->x0:Lcom/google/android/material/chip/Chip;

    .line 460
    .line 461
    if-eqz v2, :cond_25

    .line 462
    .line 463
    const-string v7, " ("

    .line 464
    .line 465
    invoke-static {v4, v7}, Lb11;->s(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 466
    .line 467
    .line 468
    move-result-object v4

    .line 469
    const v7, 0x7f1303dc

    .line 470
    .line 471
    .line 472
    invoke-virtual {p0, v7}, Lkc1;->s(I)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v7

    .line 476
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    const-string v7, ")"

    .line 480
    .line 481
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v4

    .line 488
    :cond_25
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 489
    .line 490
    .line 491
    :cond_26
    invoke-virtual {v0}, Lsk2;->K0()Ldo2;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    iget-object v0, v0, Ldo2;->I:Landroid/os/Bundle;

    .line 496
    .line 497
    const-string v1, "type"

    .line 498
    .line 499
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    const-string v1, "radio"

    .line 504
    .line 505
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v0

    .line 509
    const-string v1, "kbps"

    .line 510
    .line 511
    const/16 v4, 0x8

    .line 512
    .line 513
    if-eqz v0, :cond_28

    .line 514
    .line 515
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->y0:Landroid/widget/TextView;

    .line 516
    .line 517
    new-instance v2, Ljava/lang/StringBuilder;

    .line 518
    .line 519
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 520
    .line 521
    .line 522
    div-int/lit16 v6, v6, 0x3e8

    .line 523
    .line 524
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 535
    .line 536
    .line 537
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->y0:Landroid/widget/TextView;

    .line 538
    .line 539
    invoke-static {}, Lud3;->l()Z

    .line 540
    .line 541
    .line 542
    move-result v0

    .line 543
    if-eqz v0, :cond_27

    .line 544
    .line 545
    goto :goto_c

    .line 546
    :cond_27
    move v3, v4

    .line 547
    :goto_c
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 548
    .line 549
    .line 550
    return-void

    .line 551
    :cond_28
    if-eq v6, v5, :cond_2a

    .line 552
    .line 553
    if-lez v6, :cond_2a

    .line 554
    .line 555
    if-eqz v2, :cond_2d

    .line 556
    .line 557
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->y0:Landroid/widget/TextView;

    .line 558
    .line 559
    new-instance v2, Ljava/lang/StringBuilder;

    .line 560
    .line 561
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 562
    .line 563
    .line 564
    div-int/lit16 v6, v6, 0x3e8

    .line 565
    .line 566
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 577
    .line 578
    .line 579
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->y0:Landroid/widget/TextView;

    .line 580
    .line 581
    invoke-static {}, Lud3;->l()Z

    .line 582
    .line 583
    .line 584
    move-result v0

    .line 585
    if-eqz v0, :cond_29

    .line 586
    .line 587
    goto :goto_d

    .line 588
    :cond_29
    move v3, v4

    .line 589
    :goto_d
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 590
    .line 591
    .line 592
    return-void

    .line 593
    :cond_2a
    if-eqz v2, :cond_2d

    .line 594
    .line 595
    invoke-static {}, Le03;->d()I

    .line 596
    .line 597
    .line 598
    move-result v0

    .line 599
    invoke-static {v0}, Le03;->q(I)Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    invoke-static {v0, v2}, Le03;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    const-string v2, "0"

    .line 608
    .line 609
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    move-result v2

    .line 613
    iget-object v5, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->y0:Landroid/widget/TextView;

    .line 614
    .line 615
    if-nez v2, :cond_2c

    .line 616
    .line 617
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 622
    .line 623
    .line 624
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->y0:Landroid/widget/TextView;

    .line 625
    .line 626
    invoke-static {}, Lud3;->l()Z

    .line 627
    .line 628
    .line 629
    move-result v0

    .line 630
    if-eqz v0, :cond_2b

    .line 631
    .line 632
    goto :goto_e

    .line 633
    :cond_2b
    move v3, v4

    .line 634
    :goto_e
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 635
    .line 636
    .line 637
    return-void

    .line 638
    :cond_2c
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 639
    .line 640
    .line 641
    :cond_2d
    :goto_f
    return-void

    .line 642
    nop

    .line 643
    :sswitch_data_0
    .sparse-switch
        0x19fda -> :sswitch_4
        0x19fdb -> :sswitch_3
        0x1a6f1 -> :sswitch_2
        0x1ad89 -> :sswitch_1
        0x1ad8f -> :sswitch_0
    .end sparse-switch

    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final p0(Ldo2;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 6
    .line 7
    if-eqz v2, :cond_c

    .line 8
    .line 9
    invoke-static {}, Lu52;->c()Lv52;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-boolean v2, v2, Lv52;->a:Z

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-boolean v2, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->n0:Z

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    invoke-static {}, Lu52;->c()Lv52;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-boolean v2, v2, Lv52;->a:Z

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    const/4 v4, 0x0

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->k0()Lbj2;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v2}, Le03;->m(Lbj2;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    move v2, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move v2, v4

    .line 46
    :goto_0
    iget-object v5, v1, Ldo2;->I:Landroid/os/Bundle;

    .line 47
    .line 48
    if-eqz v5, :cond_a

    .line 49
    .line 50
    const v6, 0x7f1303de

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v6}, Lkc1;->s(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    const-string v7, "suffix"

    .line 58
    .line 59
    invoke-virtual {v5, v7, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    const-string v7, "bitrate"

    .line 64
    .line 65
    invoke-virtual {v5, v7, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    const-string v8, "Original"

    .line 70
    .line 71
    if-eqz v7, :cond_2

    .line 72
    .line 73
    new-instance v9, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v7, "kbps"

    .line 82
    .line 83
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    goto :goto_1

    .line 91
    :cond_2
    move-object v7, v8

    .line 92
    :goto_1
    const-string v9, "samplingRate"

    .line 93
    .line 94
    invoke-virtual {v5, v9, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    const-string v11, ""

    .line 99
    .line 100
    if-eqz v10, :cond_3

    .line 101
    .line 102
    new-instance v10, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    new-instance v12, Ljava/text/DecimalFormat;

    .line 108
    .line 109
    const-string v13, "0.#"

    .line 110
    .line 111
    invoke-direct {v12, v13}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5, v9, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    int-to-double v13, v9

    .line 119
    const-wide v15, 0x408f400000000000L    # 1000.0

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    div-double/2addr v13, v15

    .line 125
    invoke-virtual {v12, v13, v14}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v9, "kHz"

    .line 133
    .line 134
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    goto :goto_2

    .line 142
    :cond_3
    move-object v9, v11

    .line 143
    :goto_2
    const-string v10, "bitDepth"

    .line 144
    .line 145
    invoke-virtual {v5, v10, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 146
    .line 147
    .line 148
    move-result v12

    .line 149
    if-eqz v12, :cond_4

    .line 150
    .line 151
    new-instance v11, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5, v10, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v5, "b"

    .line 164
    .line 165
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v11

    .line 172
    :cond_4
    iget-object v5, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->x0:Lcom/google/android/material/chip/Chip;

    .line 173
    .line 174
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    const/16 v6, 0x8

    .line 182
    .line 183
    if-eqz v5, :cond_5

    .line 184
    .line 185
    if-nez v2, :cond_5

    .line 186
    .line 187
    iget-object v5, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->y0:Landroid/widget/TextView;

    .line 188
    .line 189
    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 190
    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_5
    new-instance v5, Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    if-nez v8, :cond_6

    .line 207
    .line 208
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    :cond_6
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    if-nez v7, :cond_7

    .line 220
    .line 221
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    :cond_7
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    if-nez v7, :cond_8

    .line 233
    .line 234
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    :cond_8
    const-string v7, " \u2022 "

    .line 238
    .line 239
    invoke-static {v7, v5}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    iget-object v7, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->y0:Landroid/widget/TextView;

    .line 244
    .line 245
    invoke-static {}, Lud3;->l()Z

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    if-eqz v8, :cond_9

    .line 250
    .line 251
    move v6, v4

    .line 252
    :cond_9
    invoke-virtual {v7, v6}, Landroid/view/View;->setVisibility(I)V

    .line 253
    .line 254
    .line 255
    iget-object v6, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->y0:Landroid/widget/TextView;

    .line 256
    .line 257
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 258
    .line 259
    .line 260
    :cond_a
    :goto_3
    if-nez v2, :cond_b

    .line 261
    .line 262
    invoke-virtual {v0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->o0()V

    .line 263
    .line 264
    .line 265
    :cond_b
    iget-object v2, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->C0:Landroid/widget/ImageButton;

    .line 266
    .line 267
    new-instance v5, Lj8;

    .line 268
    .line 269
    const/16 v6, 0x13

    .line 270
    .line 271
    invoke-direct {v5, v6, v0, v1}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 275
    .line 276
    .line 277
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->x0:Lcom/google/android/material/chip/Chip;

    .line 278
    .line 279
    new-instance v2, Lrj3;

    .line 280
    .line 281
    invoke-direct {v2, v0, v4}, Lrj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 285
    .line 286
    .line 287
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->x0:Lcom/google/android/material/chip/Chip;

    .line 288
    .line 289
    new-instance v2, Lsj3;

    .line 290
    .line 291
    invoke-direct {v2, v0, v4}, Lsj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 295
    .line 296
    .line 297
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->y0:Landroid/widget/TextView;

    .line 298
    .line 299
    new-instance v2, Lrj3;

    .line 300
    .line 301
    invoke-direct {v2, v0, v3}, Lrj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 305
    .line 306
    .line 307
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->y0:Landroid/widget/TextView;

    .line 308
    .line 309
    new-instance v2, Lsj3;

    .line 310
    .line 311
    invoke-direct {v2, v0, v3}, Lsj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 315
    .line 316
    .line 317
    :cond_c
    :goto_4
    return-void
.end method

.method public final q0(Ldo2;)V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 2
    .line 3
    if-eqz v0, :cond_14

    .line 4
    .line 5
    invoke-static {}, Lu52;->c()Lv52;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-boolean v0, v0, Lv52;->a:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->n0:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_9

    .line 18
    .line 19
    :cond_0
    iget-object v0, p1, Ldo2;->I:Landroid/os/Bundle;

    .line 20
    .line 21
    iget-object v1, p1, Ldo2;->n:Ljava/lang/Integer;

    .line 22
    .line 23
    iget-object v2, p1, Ldo2;->a:Ljava/lang/CharSequence;

    .line 24
    .line 25
    iget-object v3, p1, Ldo2;->b:Ljava/lang/CharSequence;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    const-string v5, "type"

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move-object v6, v4

    .line 38
    :goto_0
    const-string v7, "radio"

    .line 39
    .line 40
    invoke-static {v6, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    const/16 v8, 0x8

    .line 45
    .line 46
    const/4 v9, 0x1

    .line 47
    const/4 v10, 0x0

    .line 48
    const-string v11, ""

    .line 49
    .line 50
    if-eqz v6, :cond_c

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move-object v1, v11

    .line 62
    :goto_1
    const-string v2, "stationName"

    .line 63
    .line 64
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    goto :goto_2

    .line 69
    :cond_3
    if-eqz v3, :cond_4

    .line 70
    .line 71
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    goto :goto_2

    .line 76
    :cond_4
    move-object v1, v11

    .line 77
    :goto_2
    if-eqz v0, :cond_5

    .line 78
    .line 79
    const-string v2, "radioArtist"

    .line 80
    .line 81
    invoke-virtual {v0, v2, v11}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    goto :goto_3

    .line 86
    :cond_5
    move-object v2, v11

    .line 87
    :goto_3
    if-eqz v0, :cond_6

    .line 88
    .line 89
    const-string v3, "radioTitle"

    .line 90
    .line 91
    invoke-virtual {v0, v3, v11}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    :cond_6
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_7

    .line 100
    .line 101
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_7

    .line 106
    .line 107
    const-string v0, " - "

    .line 108
    .line 109
    invoke-static {v2, v0, v11}, Lb11;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    goto :goto_4

    .line 114
    :cond_7
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_8

    .line 119
    .line 120
    move-object v2, v11

    .line 121
    goto :goto_4

    .line 122
    :cond_8
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_9

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_9
    move-object v2, v1

    .line 130
    :goto_4
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->t0:Landroid/widget/TextView;

    .line 131
    .line 132
    invoke-static {v0, v2}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->s0(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->u0:Landroid/widget/TextView;

    .line 136
    .line 137
    invoke-static {v0, v1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->s0(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->t0:Landroid/widget/TextView;

    .line 141
    .line 142
    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setSelected(Z)V

    .line 143
    .line 144
    .line 145
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->u0:Landroid/widget/TextView;

    .line 146
    .line 147
    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setSelected(Z)V

    .line 148
    .line 149
    .line 150
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->t0:Landroid/widget/TextView;

    .line 151
    .line 152
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-nez v2, :cond_a

    .line 157
    .line 158
    move v2, v10

    .line 159
    goto :goto_5

    .line 160
    :cond_a
    move v2, v8

    .line 161
    :goto_5
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 162
    .line 163
    .line 164
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->u0:Landroid/widget/TextView;

    .line 165
    .line 166
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-nez v1, :cond_b

    .line 171
    .line 172
    move v8, v10

    .line 173
    :cond_b
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->w0(Ldo2;)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_c
    iget-object v6, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->t0:Landroid/widget/TextView;

    .line 181
    .line 182
    const-string v12, "track_number_visible"

    .line 183
    .line 184
    invoke-static {v12, v10}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 185
    .line 186
    .line 187
    move-result v12

    .line 188
    if-eqz v12, :cond_d

    .line 189
    .line 190
    if-eqz v1, :cond_d

    .line 191
    .line 192
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v12

    .line 196
    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    if-nez v12, :cond_d

    .line 201
    .line 202
    new-instance v12, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 205
    .line 206
    .line 207
    const-string v13, "%02d"

    .line 208
    .line 209
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-static {v13, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    const-string v1, ". "

    .line 221
    .line 222
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    goto :goto_6

    .line 237
    :cond_d
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    :goto_6
    invoke-static {v6, v1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->s0(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->u0:Landroid/widget/TextView;

    .line 245
    .line 246
    if-eqz v3, :cond_e

    .line 247
    .line 248
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    goto :goto_7

    .line 253
    :cond_e
    move-object v6, v11

    .line 254
    :goto_7
    invoke-static {v1, v6}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->s0(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->t0:Landroid/widget/TextView;

    .line 258
    .line 259
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setSelected(Z)V

    .line 260
    .line 261
    .line 262
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->u0:Landroid/widget/TextView;

    .line 263
    .line 264
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setSelected(Z)V

    .line 265
    .line 266
    .line 267
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->u0:Landroid/widget/TextView;

    .line 268
    .line 269
    if-eqz v0, :cond_f

    .line 270
    .line 271
    const-string v4, "id"

    .line 272
    .line 273
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    :cond_f
    invoke-static {v1, v4}, Lfu;->p(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->t0:Landroid/widget/TextView;

    .line 281
    .line 282
    if-eqz v2, :cond_10

    .line 283
    .line 284
    invoke-virtual {v2, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    if-nez v2, :cond_10

    .line 289
    .line 290
    move v2, v10

    .line 291
    goto :goto_8

    .line 292
    :cond_10
    move v2, v8

    .line 293
    :goto_8
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 294
    .line 295
    .line 296
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->u0:Landroid/widget/TextView;

    .line 297
    .line 298
    if-eqz v3, :cond_11

    .line 299
    .line 300
    invoke-virtual {v3, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    if-eqz v2, :cond_12

    .line 305
    .line 306
    :cond_11
    if-eqz v0, :cond_13

    .line 307
    .line 308
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    invoke-static {v2, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    if-eqz v2, :cond_13

    .line 317
    .line 318
    const-string v2, "uri"

    .line 319
    .line 320
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    if-eqz v0, :cond_13

    .line 325
    .line 326
    :cond_12
    move v8, v10

    .line 327
    :cond_13
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->w0(Ldo2;)V

    .line 331
    .line 332
    .line 333
    :cond_14
    :goto_9
    return-void
.end method

.method public final r0(Lbj2;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 2
    .line 3
    iget-object v0, v0, Li61;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/widget/LinearLayout;

    .line 6
    .line 7
    const v1, 0x7f0a0491

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/widget/Button;

    .line 15
    .line 16
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "playback_speed"

    .line 28
    .line 29
    const/high16 v3, 0x3f800000    # 1.0f

    .line 30
    .line 31
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const-string v2, "skip_silence"

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-static {v2, v3}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-static {v1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0(F)Lqh3;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {p1, v3}, Lsk2;->d(Lqh3;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const v1, 0x7f1303d6

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v1, p1}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->w0:Landroid/widget/ToggleButton;

    .line 68
    .line 69
    invoke-virtual {p0, v2}, Landroid/widget/ToggleButton;->setChecked(Z)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final t0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->G0:Lcom/google/android/material/chip/ChipGroup;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    move v1, v0

    .line 8
    :goto_0
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->G0:Lcom/google/android/material/chip/ChipGroup;

    .line 9
    .line 10
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-ge v1, v2, :cond_2

    .line 15
    .line 16
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->G0:Lcom/google/android/material/chip/ChipGroup;

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    move v1, v0

    .line 34
    :goto_1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->G0:Lcom/google/android/material/chip/ChipGroup;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_3
    const/16 v0, 0x8

    .line 40
    .line 41
    :goto_2
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final u0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->y0:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/ViewGroup;

    .line 8
    .line 9
    new-instance v1, Lkx4;

    .line 10
    .line 11
    invoke-direct {v1}, Lkx4;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lcg4;

    .line 15
    .line 16
    const v3, 0x800003

    .line 17
    .line 18
    .line 19
    invoke-direct {v2, v3}, Lcg4;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Lkx4;->F(Ldx4;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lv00;

    .line 26
    .line 27
    invoke-direct {v2}, Ldx4;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lkx4;->F(Ldx4;)V

    .line 31
    .line 32
    .line 33
    const-wide/16 v2, 0x1f4

    .line 34
    .line 35
    invoke-virtual {v1, v2, v3}, Lkx4;->G(J)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 39
    .line 40
    invoke-direct {v2}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Lkx4;->H(Landroid/animation/TimeInterpolator;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Lix4;->a(Landroid/view/ViewGroup;Ldx4;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->y0:Landroid/widget/TextView;

    .line 50
    .line 51
    invoke-static {}, Lud3;->l()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    const/16 v0, 0x8

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const/4 v0, 0x0

    .line 61
    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lud3;->l()Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    xor-int/lit8 p0, p0, 0x1

    .line 69
    .line 70
    const-string v0, "bitrate_visible"

    .line 71
    .line 72
    invoke-static {v0, p0}, Lxa3;->t(Ljava/lang/String;Z)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final v0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->z0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/ViewGroup;

    .line 8
    .line 9
    new-instance v1, Lkx4;

    .line 10
    .line 11
    invoke-direct {v1}, Lkx4;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lcg4;

    .line 15
    .line 16
    const/16 v3, 0x50

    .line 17
    .line 18
    invoke-direct {v2, v3}, Lcg4;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lkx4;->F(Ldx4;)V

    .line 22
    .line 23
    .line 24
    new-instance v2, Lv00;

    .line 25
    .line 26
    invoke-direct {v2}, Ldx4;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Lkx4;->F(Ldx4;)V

    .line 30
    .line 31
    .line 32
    const-wide/16 v2, 0x1f4

    .line 33
    .line 34
    invoke-virtual {v1, v2, v3}, Lkx4;->G(J)V

    .line 35
    .line 36
    .line 37
    new-instance v2, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 38
    .line 39
    invoke-direct {v2}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Lkx4;->H(Landroid/animation/TimeInterpolator;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1}, Lix4;->a(Landroid/view/ViewGroup;Ldx4;)V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->z0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 49
    .line 50
    const-string v0, "quick_action_visible"

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-static {v0, v1}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    const/16 v2, 0x8

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/4 v2, 0x0

    .line 63
    :goto_0
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    xor-int/2addr p0, v1

    .line 82
    invoke-static {v0, p0}, Lxa3;->t(Ljava/lang/String;Z)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final w0(Ldo2;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->G0:Lcom/google/android/material/chip/ChipGroup;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p1, p1, Ldo2;->I:Landroid/os/Bundle;

    .line 7
    .line 8
    const-string v0, "music"

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    const-string v1, "type"

    .line 13
    .line 14
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move-object v1, v0

    .line 20
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->H0:Lcom/google/android/material/chip/Chip;

    .line 27
    .line 28
    invoke-static {p1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->j0(Lcom/google/android/material/chip/Chip;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->I0:Lcom/google/android/material/chip/Chip;

    .line 32
    .line 33
    invoke-static {p1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->j0(Lcom/google/android/material/chip/Chip;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->J0:Lcom/google/android/material/chip/Chip;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->j0(Lcom/google/android/material/chip/Chip;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->t0()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    const/4 v0, 0x0

    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    const-string v1, "id"

    .line 49
    .line 50
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    goto :goto_1

    .line 55
    :cond_3
    move-object v1, v0

    .line 56
    :goto_1
    if-eqz p1, :cond_4

    .line 57
    .line 58
    const-string v2, "albumId"

    .line 59
    .line 60
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    goto :goto_2

    .line 65
    :cond_4
    move-object v2, v0

    .line 66
    :goto_2
    if-eqz p1, :cond_5

    .line 67
    .line 68
    const-string v0, "artistId"

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :cond_5
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->H0:Lcom/google/android/material/chip/Chip;

    .line 75
    .line 76
    const-string v3, "song"

    .line 77
    .line 78
    invoke-virtual {p0, p1, v3, v1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->h0(Lcom/google/android/material/chip/Chip;Ljava/lang/String;Ljava/lang/String;)Lik;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->I0:Lcom/google/android/material/chip/Chip;

    .line 83
    .line 84
    const-string v3, "album"

    .line 85
    .line 86
    invoke-virtual {p0, v1, v3, v2}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->h0(Lcom/google/android/material/chip/Chip;Ljava/lang/String;Ljava/lang/String;)Lik;

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->J0:Lcom/google/android/material/chip/Chip;

    .line 90
    .line 91
    const-string v2, "artist"

    .line 92
    .line 93
    invoke-virtual {p0, v1, v2, v0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->h0(Lcom/google/android/material/chip/Chip;Ljava/lang/String;Ljava/lang/String;)Lik;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->t0:Landroid/widget/TextView;

    .line 98
    .line 99
    invoke-virtual {p0, v1, p1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->i0(Landroid/view/View;Lik;)V

    .line 100
    .line 101
    .line 102
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->u0:Landroid/widget/TextView;

    .line 103
    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_6
    move-object v0, p1

    .line 108
    :goto_3
    invoke-virtual {p0, v1, v0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->i0(Landroid/view/View;Lik;)V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->o0:Landroidx/viewpager2/widget/ViewPager2;

    .line 112
    .line 113
    invoke-virtual {p0, v0, p1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->i0(Landroid/view/View;Lik;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->t0()V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public final x0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->E0:Landroid/widget/ImageButton;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->F0:Landroid/widget/TextView;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    invoke-static {}, Lu52;->c()Lv52;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-boolean v0, v0, Lv52;->a:Z

    .line 16
    .line 17
    invoke-static {}, Lu52;->c()Lv52;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-boolean v2, v1, Lv52;->A:Z

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget-boolean v2, v2, Lyf4;->f:Z

    .line 31
    .line 32
    :goto_0
    if-eqz v2, :cond_5

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget-boolean v2, v1, Lv52;->B:Z

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-boolean v2, v2, Lyf4;->g:Z

    .line 44
    .line 45
    :goto_1
    if-eqz v2, :cond_3

    .line 46
    .line 47
    const v0, 0x7f130535

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lkc1;->s(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    goto :goto_2

    .line 55
    :cond_3
    if-eqz v0, :cond_4

    .line 56
    .line 57
    iget-object v0, v1, Lv52;->C:Ljava/lang/String;

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Lyf4;->d()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :goto_2
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->F0:Landroid/widget/TextView;

    .line 69
    .line 70
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->F0:Landroid/widget/TextView;

    .line 74
    .line 75
    const/4 v1, 0x0

    .line 76
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->E0:Landroid/widget/ImageButton;

    .line 80
    .line 81
    const v1, 0x7f04012d

    .line 82
    .line 83
    .line 84
    invoke-static {v0, v1}, Lg12;->t(Landroid/view/View;I)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->E0:Landroid/widget/ImageButton;

    .line 89
    .line 90
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_5
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->F0:Landroid/widget/TextView;

    .line 99
    .line 100
    const/16 v1, 0x8

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->F0:Landroid/widget/TextView;

    .line 106
    .line 107
    const-string v1, ""

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->E0:Landroid/widget/ImageButton;

    .line 113
    .line 114
    const v1, 0x7f040124

    .line 115
    .line 116
    .line 117
    invoke-static {v0, v1}, Lg12;->t(Landroid/view/View;I)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->E0:Landroid/widget/ImageButton;

    .line 122
    .line 123
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 128
    .line 129
    .line 130
    :cond_6
    :goto_3
    return-void
.end method
