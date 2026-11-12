.class public Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public l0:Lsc1;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Lwj;

.field public o0:Lli3;

.field public p0:Lni4;

.field public q0:Lv8;

.field public r0:Ll7;

.field public s0:Ls6;

.field public t0:Lbl2;

.field public u0:I

.field public v0:I

.field public final w0:Landroid/os/Handler;

.field public final x0:La0;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lkc1;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    iput v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->u0:I

    .line 6
    .line 7
    const/16 v0, 0x14

    .line 8
    .line 9
    iput v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->v0:I

    .line 10
    .line 11
    new-instance v0, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->w0:Landroid/os/Handler;

    .line 21
    .line 22
    new-instance v0, La0;

    .line 23
    .line 24
    const/4 v1, 0x6

    .line 25
    invoke-direct {v0, v1, p0}, La0;-><init>(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->x0:La0;

    .line 29
    .line 30
    return-void
.end method

.method public static h0(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;Landroid/widget/Button;I)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz v0, :cond_5

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_1
    invoke-virtual {p1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    sub-int/2addr v1, v2

    .line 43
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    sub-int/2addr v1, v2

    .line 48
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 61
    .line 62
    const/high16 v3, 0x42400000    # 48.0f

    .line 63
    .line 64
    mul-float/2addr v3, v2

    .line 65
    const/high16 v2, 0x3f000000    # 0.5f

    .line 66
    .line 67
    add-float/2addr v3, v2

    .line 68
    float-to-int v2, v3

    .line 69
    sub-int/2addr v1, v2

    .line 70
    if-lez v1, :cond_4

    .line 71
    .line 72
    int-to-float v1, v1

    .line 73
    cmpl-float v0, v0, v1

    .line 74
    .line 75
    if-lez v0, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_5

    .line 93
    .line 94
    :cond_3
    :try_start_0
    invoke-virtual {p0, p2}, Lkc1;->s(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p1, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_4
    :goto_1
    const-string v0, ""

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    .line 106
    .line 107
    :try_start_1
    invoke-virtual {p0, p2}, Lkc1;->s(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p1, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 112
    .line 113
    .line 114
    :catch_0
    :cond_5
    :goto_2
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 31

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    invoke-virtual {v2}, Lkc1;->l()Lnc1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    iput-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 10
    .line 11
    const v0, 0x7f0d0066

    .line 12
    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    move-object/from16 v3, p2

    .line 18
    .line 19
    invoke-virtual {v1, v0, v3, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const v1, 0x7f0a00b7

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Landroid/widget/LinearLayout;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v3, :cond_11

    .line 34
    .line 35
    const v1, 0x7f0a00c6

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    move-object v9, v3

    .line 43
    check-cast v9, Landroidx/recyclerview/widget/RecyclerView;

    .line 44
    .line 45
    if-eqz v9, :cond_11

    .line 46
    .line 47
    const v1, 0x7f0a00d1

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    move-object v10, v3

    .line 55
    check-cast v10, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 56
    .line 57
    if-eqz v10, :cond_11

    .line 58
    .line 59
    const v1, 0x7f0a00db

    .line 60
    .line 61
    .line 62
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Lcom/google/android/material/appbar/AppBarLayout;

    .line 67
    .line 68
    if-eqz v3, :cond_11

    .line 69
    .line 70
    const v1, 0x7f0a00dc

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    move-object v11, v3

    .line 78
    check-cast v11, Landroidx/recyclerview/widget/RecyclerView;

    .line 79
    .line 80
    if-eqz v11, :cond_11

    .line 81
    .line 82
    const v1, 0x7f0a00dd

    .line 83
    .line 84
    .line 85
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    move-object v12, v3

    .line 90
    check-cast v12, Landroid/widget/TextView;

    .line 91
    .line 92
    if-eqz v12, :cond_11

    .line 93
    .line 94
    const v1, 0x7f0a00e3

    .line 95
    .line 96
    .line 97
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    move-object v13, v3

    .line 102
    check-cast v13, Landroid/widget/ImageView;

    .line 103
    .line 104
    if-eqz v13, :cond_11

    .line 105
    .line 106
    const v1, 0x7f0a00f2

    .line 107
    .line 108
    .line 109
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Landroid/widget/LinearLayout;

    .line 114
    .line 115
    if-eqz v3, :cond_11

    .line 116
    .line 117
    const v1, 0x7f0a00f3

    .line 118
    .line 119
    .line 120
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    move-object v14, v3

    .line 125
    check-cast v14, Landroid/widget/LinearLayout;

    .line 126
    .line 127
    if-eqz v14, :cond_11

    .line 128
    .line 129
    const v1, 0x7f0a00f4

    .line 130
    .line 131
    .line 132
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    move-object v15, v3

    .line 137
    check-cast v15, Landroid/widget/LinearLayout;

    .line 138
    .line 139
    if-eqz v15, :cond_11

    .line 140
    .line 141
    const v1, 0x7f0a00f5

    .line 142
    .line 143
    .line 144
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    move-object/from16 v16, v3

    .line 149
    .line 150
    check-cast v16, Landroid/widget/Button;

    .line 151
    .line 152
    if-eqz v16, :cond_11

    .line 153
    .line 154
    const v3, 0x7f0a00f6

    .line 155
    .line 156
    .line 157
    invoke-static {v0, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    move-object/from16 v17, v5

    .line 162
    .line 163
    check-cast v17, Landroid/widget/Button;

    .line 164
    .line 165
    if-eqz v17, :cond_10

    .line 166
    .line 167
    const v5, 0x7f0a00f7

    .line 168
    .line 169
    .line 170
    invoke-static {v0, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    move-object/from16 v18, v7

    .line 175
    .line 176
    check-cast v18, Landroid/widget/LinearLayout;

    .line 177
    .line 178
    if-eqz v18, :cond_f

    .line 179
    .line 180
    const v5, 0x7f0a00f8

    .line 181
    .line 182
    .line 183
    invoke-static {v0, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    check-cast v7, Landroid/widget/Button;

    .line 188
    .line 189
    if-eqz v7, :cond_f

    .line 190
    .line 191
    const v7, 0x7f0a0111

    .line 192
    .line 193
    .line 194
    invoke-static {v0, v7}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    move-object/from16 v19, v8

    .line 199
    .line 200
    check-cast v19, Landroid/widget/TextView;

    .line 201
    .line 202
    if-eqz v19, :cond_b

    .line 203
    .line 204
    const v7, 0x7f0a0112

    .line 205
    .line 206
    .line 207
    invoke-static {v0, v7}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    move-object/from16 v20, v8

    .line 212
    .line 213
    check-cast v20, Landroid/widget/TextView;

    .line 214
    .line 215
    if-eqz v20, :cond_b

    .line 216
    .line 217
    const v7, 0x7f0a011c

    .line 218
    .line 219
    .line 220
    invoke-static {v0, v7}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 221
    .line 222
    .line 223
    move-result-object v21

    .line 224
    if-eqz v21, :cond_b

    .line 225
    .line 226
    const v7, 0x7f0a0135

    .line 227
    .line 228
    .line 229
    invoke-static {v0, v7}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 230
    .line 231
    .line 232
    move-result-object v8

    .line 233
    check-cast v8, Landroid/widget/ToggleButton;

    .line 234
    .line 235
    if-eqz v8, :cond_e

    .line 236
    .line 237
    const v8, 0x7f0a0136

    .line 238
    .line 239
    .line 240
    invoke-static {v0, v8}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 241
    .line 242
    .line 243
    move-result-object v22

    .line 244
    check-cast v22, Landroid/widget/Button;

    .line 245
    .line 246
    if-eqz v22, :cond_d

    .line 247
    .line 248
    const v6, 0x7f0a0137

    .line 249
    .line 250
    .line 251
    invoke-static {v0, v6}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 252
    .line 253
    .line 254
    move-result-object v22

    .line 255
    check-cast v22, Landroid/widget/Button;

    .line 256
    .line 257
    if-eqz v22, :cond_c

    .line 258
    .line 259
    const v7, 0x7f0a015e

    .line 260
    .line 261
    .line 262
    invoke-static {v0, v7}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 263
    .line 264
    .line 265
    move-result-object v22

    .line 266
    check-cast v22, Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    .line 267
    .line 268
    if-eqz v22, :cond_b

    .line 269
    .line 270
    const v7, 0x7f0a0261

    .line 271
    .line 272
    .line 273
    invoke-static {v0, v7}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 274
    .line 275
    .line 276
    move-result-object v23

    .line 277
    check-cast v23, Landroidx/core/widget/NestedScrollView;

    .line 278
    .line 279
    if-eqz v23, :cond_b

    .line 280
    .line 281
    const v7, 0x7f0a0326

    .line 282
    .line 283
    .line 284
    invoke-static {v0, v7}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 285
    .line 286
    .line 287
    move-result-object v23

    .line 288
    if-eqz v23, :cond_b

    .line 289
    .line 290
    invoke-static/range {v23 .. v23}, Lc12;->f(Landroid/view/View;)Lc12;

    .line 291
    .line 292
    .line 293
    const v7, 0x7f0a0327

    .line 294
    .line 295
    .line 296
    invoke-static {v0, v7}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 297
    .line 298
    .line 299
    move-result-object v23

    .line 300
    if-eqz v23, :cond_b

    .line 301
    .line 302
    invoke-static/range {v23 .. v23}, Lc12;->f(Landroid/view/View;)Lc12;

    .line 303
    .line 304
    .line 305
    const v7, 0x7f0a0328

    .line 306
    .line 307
    .line 308
    invoke-static {v0, v7}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 309
    .line 310
    .line 311
    move-result-object v23

    .line 312
    if-eqz v23, :cond_b

    .line 313
    .line 314
    invoke-static/range {v23 .. v23}, Lc12;->f(Landroid/view/View;)Lc12;

    .line 315
    .line 316
    .line 317
    move v7, v8

    .line 318
    move-object v8, v0

    .line 319
    check-cast v8, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 320
    .line 321
    const v7, 0x7f0a03a4

    .line 322
    .line 323
    .line 324
    invoke-static {v0, v7}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 325
    .line 326
    .line 327
    move-result-object v23

    .line 328
    check-cast v23, Landroid/widget/LinearLayout;

    .line 329
    .line 330
    if-eqz v23, :cond_b

    .line 331
    .line 332
    const v7, 0x7f0a03a5

    .line 333
    .line 334
    .line 335
    invoke-static {v0, v7}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 336
    .line 337
    .line 338
    move-result-object v24

    .line 339
    check-cast v24, Landroid/widget/TextView;

    .line 340
    .line 341
    if-eqz v24, :cond_b

    .line 342
    .line 343
    const v7, 0x7f0a03a6

    .line 344
    .line 345
    .line 346
    invoke-static {v0, v7}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 347
    .line 348
    .line 349
    move-result-object v25

    .line 350
    check-cast v25, Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 351
    .line 352
    if-eqz v25, :cond_b

    .line 353
    .line 354
    const v7, 0x7f0a03a7

    .line 355
    .line 356
    .line 357
    invoke-static {v0, v7}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 358
    .line 359
    .line 360
    move-result-object v26

    .line 361
    check-cast v26, Landroidx/recyclerview/widget/RecyclerView;

    .line 362
    .line 363
    if-eqz v26, :cond_b

    .line 364
    .line 365
    const v7, 0x7f0a03a8

    .line 366
    .line 367
    .line 368
    invoke-static {v0, v7}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 369
    .line 370
    .line 371
    move-result-object v27

    .line 372
    check-cast v27, Landroid/widget/TextView;

    .line 373
    .line 374
    if-eqz v27, :cond_b

    .line 375
    .line 376
    const v7, 0x7f0a0583

    .line 377
    .line 378
    .line 379
    invoke-static {v0, v7}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 380
    .line 381
    .line 382
    move-result-object v28

    .line 383
    check-cast v28, Landroid/widget/LinearLayout;

    .line 384
    .line 385
    if-eqz v28, :cond_b

    .line 386
    .line 387
    const v7, 0x7f0a0584

    .line 388
    .line 389
    .line 390
    invoke-static {v0, v7}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 391
    .line 392
    .line 393
    move-result-object v29

    .line 394
    check-cast v29, Landroidx/recyclerview/widget/RecyclerView;

    .line 395
    .line 396
    if-eqz v29, :cond_b

    .line 397
    .line 398
    const v7, 0x7f0a064b

    .line 399
    .line 400
    .line 401
    invoke-static {v0, v7}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 402
    .line 403
    .line 404
    move-result-object v30

    .line 405
    if-eqz v30, :cond_b

    .line 406
    .line 407
    new-instance v7, Lsc1;

    .line 408
    .line 409
    const v0, 0x7f0a0136

    .line 410
    .line 411
    .line 412
    const v5, 0x7f0a0135

    .line 413
    .line 414
    .line 415
    invoke-direct/range {v7 .. v30}, Lsc1;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroidx/recyclerview/widget/RecyclerView;Lcom/google/android/material/appbar/MaterialToolbar;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Lcom/google/android/material/appbar/CollapsingToolbarLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Lcom/facebook/shimmer/ShimmerFrameLayout;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)V

    .line 416
    .line 417
    .line 418
    iput-object v7, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 419
    .line 420
    invoke-virtual {v2}, Lkc1;->X()Lnc1;

    .line 421
    .line 422
    .line 423
    move-result-object v7

    .line 424
    invoke-virtual {v7}, Ll70;->d()Le75;

    .line 425
    .line 426
    .line 427
    move-result-object v9

    .line 428
    invoke-static {v7}, Lgh0;->r(Lf75;)Lb75;

    .line 429
    .line 430
    .line 431
    move-result-object v10

    .line 432
    invoke-static {v7, v10}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 433
    .line 434
    .line 435
    move-result-object v7

    .line 436
    new-instance v11, Lbq4;

    .line 437
    .line 438
    invoke-direct {v11, v9, v10, v7}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 439
    .line 440
    .line 441
    const-class v7, Lwj;

    .line 442
    .line 443
    invoke-static {v7}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 444
    .line 445
    .line 446
    move-result-object v7

    .line 447
    invoke-virtual {v7}, Li30;->b()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v9

    .line 451
    const-string v10, "Local and anonymous classes can not be ViewModels"

    .line 452
    .line 453
    if-eqz v9, :cond_a

    .line 454
    .line 455
    const-string v12, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 456
    .line 457
    invoke-virtual {v12, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v9

    .line 461
    invoke-virtual {v11, v7, v9}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 462
    .line 463
    .line 464
    move-result-object v7

    .line 465
    check-cast v7, Lwj;

    .line 466
    .line 467
    iput-object v7, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->n0:Lwj;

    .line 468
    .line 469
    invoke-virtual {v2}, Lkc1;->X()Lnc1;

    .line 470
    .line 471
    .line 472
    move-result-object v7

    .line 473
    invoke-virtual {v7}, Ll70;->d()Le75;

    .line 474
    .line 475
    .line 476
    move-result-object v9

    .line 477
    invoke-static {v7}, Lgh0;->r(Lf75;)Lb75;

    .line 478
    .line 479
    .line 480
    move-result-object v11

    .line 481
    invoke-static {v7, v11}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 482
    .line 483
    .line 484
    move-result-object v7

    .line 485
    new-instance v13, Lbq4;

    .line 486
    .line 487
    invoke-direct {v13, v9, v11, v7}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 488
    .line 489
    .line 490
    const-class v7, Lli3;

    .line 491
    .line 492
    invoke-static {v7}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 493
    .line 494
    .line 495
    move-result-object v7

    .line 496
    invoke-virtual {v7}, Li30;->b()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v9

    .line 500
    if-eqz v9, :cond_9

    .line 501
    .line 502
    invoke-virtual {v12, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v9

    .line 506
    invoke-virtual {v13, v7, v9}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 507
    .line 508
    .line 509
    move-result-object v7

    .line 510
    check-cast v7, Lli3;

    .line 511
    .line 512
    iput-object v7, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->o0:Lli3;

    .line 513
    .line 514
    iget-object v7, v2, Lkc1;->s:Landroid/os/Bundle;

    .line 515
    .line 516
    if-eqz v7, :cond_0

    .line 517
    .line 518
    const-string v9, "ARTIST_OBJECT"

    .line 519
    .line 520
    invoke-virtual {v7, v9}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 521
    .line 522
    .line 523
    move-result-object v7

    .line 524
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 525
    .line 526
    goto :goto_0

    .line 527
    :cond_0
    move-object v7, v4

    .line 528
    :goto_0
    if-nez v7, :cond_2

    .line 529
    .line 530
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 531
    .line 532
    if-eqz v0, :cond_1

    .line 533
    .line 534
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 535
    .line 536
    if-eqz v0, :cond_1

    .line 537
    .line 538
    invoke-virtual {v0}, Lv23;->o()V

    .line 539
    .line 540
    .line 541
    :cond_1
    return-object v8

    .line 542
    :cond_2
    invoke-static {}, Lut4;->c()Lut4;

    .line 543
    .line 544
    .line 545
    move-result-object v9

    .line 546
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 547
    .line 548
    .line 549
    move-result-object v10

    .line 550
    invoke-virtual {v9, v10}, Lut4;->b(Landroid/content/Context;)V

    .line 551
    .line 552
    .line 553
    invoke-static {}, Lut4;->c()Lut4;

    .line 554
    .line 555
    .line 556
    move-result-object v9

    .line 557
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 558
    .line 559
    .line 560
    move-result-object v10

    .line 561
    iget-boolean v11, v9, Lut4;->h:Z

    .line 562
    .line 563
    if-nez v11, :cond_3

    .line 564
    .line 565
    invoke-virtual {v9, v10}, Lut4;->b(Landroid/content/Context;)V

    .line 566
    .line 567
    .line 568
    :cond_3
    iget v9, v9, Lut4;->b:I

    .line 569
    .line 570
    iput v9, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->u0:I

    .line 571
    .line 572
    invoke-static {}, Lut4;->c()Lut4;

    .line 573
    .line 574
    .line 575
    move-result-object v9

    .line 576
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 577
    .line 578
    .line 579
    move-result-object v10

    .line 580
    iget-boolean v11, v9, Lut4;->h:Z

    .line 581
    .line 582
    if-nez v11, :cond_4

    .line 583
    .line 584
    invoke-virtual {v9, v10}, Lut4;->b(Landroid/content/Context;)V

    .line 585
    .line 586
    .line 587
    :cond_4
    iget v9, v9, Lut4;->c:I

    .line 588
    .line 589
    iput v9, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->v0:I

    .line 590
    .line 591
    iget-object v9, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->n0:Lwj;

    .line 592
    .line 593
    iput-object v7, v9, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 594
    .line 595
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 596
    .line 597
    .line 598
    move-result-object v7

    .line 599
    iget-object v10, v9, Lwj;->c:Lpa;

    .line 600
    .line 601
    iget-object v11, v9, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 602
    .line 603
    invoke-virtual {v11}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v11

    .line 607
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 608
    .line 609
    .line 610
    invoke-static {v11}, Lpa;->v(Ljava/lang/String;)Lk03;

    .line 611
    .line 612
    .line 613
    move-result-object v10

    .line 614
    new-instance v11, Ld8;

    .line 615
    .line 616
    const/4 v12, 0x6

    .line 617
    invoke-direct {v11, v12, v9}, Ld8;-><init>(ILjava/lang/Object;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v10, v7, v11}, Lad2;->e(Lba2;La83;)V

    .line 621
    .line 622
    .line 623
    iget-object v7, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 624
    .line 625
    iget-object v7, v7, Lsc1;->t:Landroid/widget/TextView;

    .line 626
    .line 627
    new-instance v9, Lpj;

    .line 628
    .line 629
    const/4 v10, 0x1

    .line 630
    invoke-direct {v9, v2, v10}, Lpj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v7, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v8, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 637
    .line 638
    .line 639
    move-result-object v5

    .line 640
    check-cast v5, Landroid/widget/ToggleButton;

    .line 641
    .line 642
    iget-object v7, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->n0:Lwj;

    .line 643
    .line 644
    iget-object v7, v7, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 645
    .line 646
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v7

    .line 650
    iget-object v9, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->n0:Lwj;

    .line 651
    .line 652
    iget-object v9, v9, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 653
    .line 654
    invoke-virtual {v9}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getStarred()Ljava/util/Date;

    .line 655
    .line 656
    .line 657
    move-result-object v9

    .line 658
    if-eqz v9, :cond_5

    .line 659
    .line 660
    move v9, v10

    .line 661
    goto :goto_1

    .line 662
    :cond_5
    const/4 v9, 0x0

    .line 663
    :goto_1
    const/4 v11, 0x3

    .line 664
    invoke-static {v11, v7, v9}, Ln61;->f(ILjava/lang/String;Z)Z

    .line 665
    .line 666
    .line 667
    move-result v7

    .line 668
    invoke-virtual {v5, v7}, Landroid/widget/ToggleButton;->setChecked(Z)V

    .line 669
    .line 670
    .line 671
    new-instance v7, Lpj;

    .line 672
    .line 673
    const/4 v9, 0x2

    .line 674
    invoke-direct {v7, v2, v9}, Lpj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v5, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 681
    .line 682
    .line 683
    move-result-object v5

    .line 684
    check-cast v5, Landroid/widget/Button;

    .line 685
    .line 686
    new-instance v6, Lpj;

    .line 687
    .line 688
    invoke-direct {v6, v2, v11}, Lpj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    check-cast v0, Landroid/widget/Button;

    .line 699
    .line 700
    new-instance v5, Lpj;

    .line 701
    .line 702
    const/4 v6, 0x4

    .line 703
    invoke-direct {v5, v2, v6}, Lpj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v8, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    check-cast v0, Landroid/widget/Button;

    .line 714
    .line 715
    invoke-virtual {v8, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 716
    .line 717
    .line 718
    move-result-object v1

    .line 719
    check-cast v1, Landroid/widget/Button;

    .line 720
    .line 721
    if-eqz v0, :cond_6

    .line 722
    .line 723
    if-eqz v1, :cond_6

    .line 724
    .line 725
    invoke-virtual {v8}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 726
    .line 727
    .line 728
    move-result-object v3

    .line 729
    new-instance v5, Lqj;

    .line 730
    .line 731
    invoke-direct {v5, v2, v0, v1, v8}, Lqj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;Landroid/widget/Button;Landroid/widget/Button;Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V

    .line 732
    .line 733
    .line 734
    invoke-virtual {v3, v5}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 735
    .line 736
    .line 737
    :cond_6
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 738
    .line 739
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 740
    .line 741
    iget-object v1, v1, Lsc1;->c:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 742
    .line 743
    invoke-virtual {v0, v1}, Ldf;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 744
    .line 745
    .line 746
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 747
    .line 748
    invoke-virtual {v0}, Ldf;->n()Ll93;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    if-eqz v0, :cond_7

    .line 753
    .line 754
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 755
    .line 756
    invoke-virtual {v0}, Ldf;->n()Ll93;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    invoke-virtual {v0, v10}, Ll93;->f0(Z)V

    .line 761
    .line 762
    .line 763
    :cond_7
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 764
    .line 765
    iget-object v0, v0, Lsc1;->o:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    .line 766
    .line 767
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->n0:Lwj;

    .line 768
    .line 769
    iget-object v1, v1, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 770
    .line 771
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v1

    .line 775
    invoke-virtual {v0, v1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setTitle(Ljava/lang/CharSequence;)V

    .line 776
    .line 777
    .line 778
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 779
    .line 780
    iget-object v0, v0, Lsc1;->c:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 781
    .line 782
    new-instance v1, Lpj;

    .line 783
    .line 784
    invoke-direct {v1, v2, v12}, Lpj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V

    .line 785
    .line 786
    .line 787
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 788
    .line 789
    .line 790
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 791
    .line 792
    iget-object v0, v0, Lsc1;->o:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    .line 793
    .line 794
    invoke-virtual {v2}, Lkc1;->r()Landroid/content/res/Resources;

    .line 795
    .line 796
    .line 797
    move-result-object v1

    .line 798
    const v3, 0x7f060371

    .line 799
    .line 800
    .line 801
    invoke-virtual {v1, v3, v4}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 802
    .line 803
    .line 804
    move-result v1

    .line 805
    invoke-virtual {v0, v1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setExpandedTitleColor(I)V

    .line 806
    .line 807
    .line 808
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->n0:Lwj;

    .line 809
    .line 810
    iget-object v1, v0, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 811
    .line 812
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v1

    .line 816
    invoke-virtual {v0, v1}, Lwj;->c(Ljava/lang/String;)Lk03;

    .line 817
    .line 818
    .line 819
    move-result-object v0

    .line 820
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 821
    .line 822
    .line 823
    move-result-object v1

    .line 824
    new-instance v3, Loj;

    .line 825
    .line 826
    invoke-direct {v3, v2, v10}, Loj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {v0, v1, v3}, Lad2;->e(Lba2;La83;)V

    .line 830
    .line 831
    .line 832
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 833
    .line 834
    iget-object v0, v0, Lsc1;->j:Landroid/widget/Button;

    .line 835
    .line 836
    new-instance v1, Lpj;

    .line 837
    .line 838
    const/4 v3, 0x7

    .line 839
    invoke-direct {v1, v2, v3}, Lpj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V

    .line 840
    .line 841
    .line 842
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 843
    .line 844
    .line 845
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 846
    .line 847
    iget-object v0, v0, Lsc1;->a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 848
    .line 849
    const v1, 0x7f0a00f8

    .line 850
    .line 851
    .line 852
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->n0:Lwj;

    .line 857
    .line 858
    iget-object v1, v1, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 859
    .line 860
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 861
    .line 862
    .line 863
    move-result-object v1

    .line 864
    const/4 v7, 0x5

    .line 865
    if-eqz v1, :cond_8

    .line 866
    .line 867
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v3

    .line 871
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 872
    .line 873
    .line 874
    move-result v3

    .line 875
    if-nez v3, :cond_8

    .line 876
    .line 877
    const/4 v3, 0x0

    .line 878
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 879
    .line 880
    .line 881
    new-instance v3, Lj8;

    .line 882
    .line 883
    invoke-direct {v3, v7, v2, v1}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 884
    .line 885
    .line 886
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 887
    .line 888
    .line 889
    :cond_8
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 890
    .line 891
    iget-object v0, v0, Lsc1;->i:Landroid/widget/Button;

    .line 892
    .line 893
    new-instance v1, Lpj;

    .line 894
    .line 895
    const/16 v3, 0x8

    .line 896
    .line 897
    invoke-direct {v1, v2, v3}, Lpj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V

    .line 898
    .line 899
    .line 900
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 901
    .line 902
    .line 903
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 904
    .line 905
    iget-object v0, v0, Lsc1;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 906
    .line 907
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 908
    .line 909
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 910
    .line 911
    .line 912
    invoke-direct {v1, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 913
    .line 914
    .line 915
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 916
    .line 917
    .line 918
    new-instance v0, Lni4;

    .line 919
    .line 920
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 921
    .line 922
    .line 923
    move-result-object v1

    .line 924
    const/4 v4, 0x1

    .line 925
    const/4 v5, 0x0

    .line 926
    const/4 v3, 0x1

    .line 927
    invoke-direct/range {v0 .. v5}, Lni4;-><init>(Lle1;Lcom/eddyizm/tempus/interfaces/ClickCallback;ZZLcom/eddyizm/tempus/subsonic/models/AlbumID3;)V

    .line 928
    .line 929
    .line 930
    iput-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->p0:Lni4;

    .line 931
    .line 932
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 933
    .line 934
    iget-object v1, v1, Lsc1;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 935
    .line 936
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 937
    .line 938
    .line 939
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->p0:Lni4;

    .line 940
    .line 941
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->t0:Lbl2;

    .line 942
    .line 943
    iput-object v1, v0, Lni4;->A:Lbl2;

    .line 944
    .line 945
    invoke-virtual {v2}, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->i0()V

    .line 946
    .line 947
    .line 948
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->n0:Lwj;

    .line 949
    .line 950
    iget-object v1, v0, Lwj;->c:Lpa;

    .line 951
    .line 952
    iget-object v0, v0, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 953
    .line 954
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 955
    .line 956
    .line 957
    move-result-object v0

    .line 958
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 959
    .line 960
    .line 961
    const/16 v1, 0x14

    .line 962
    .line 963
    invoke-static {v1, v0}, Lpa;->z(ILjava/lang/String;)Lk03;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 968
    .line 969
    .line 970
    move-result-object v1

    .line 971
    new-instance v3, Loj;

    .line 972
    .line 973
    invoke-direct {v3, v2, v9}, Loj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V

    .line 974
    .line 975
    .line 976
    invoke-virtual {v0, v1, v3}, Lad2;->e(Lba2;La83;)V

    .line 977
    .line 978
    .line 979
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 980
    .line 981
    iget-object v0, v0, Lsc1;->q:Landroid/widget/TextView;

    .line 982
    .line 983
    new-instance v1, Lpj;

    .line 984
    .line 985
    const/4 v3, 0x0

    .line 986
    invoke-direct {v1, v2, v3}, Lpj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V

    .line 987
    .line 988
    .line 989
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 990
    .line 991
    .line 992
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 993
    .line 994
    iget-object v0, v0, Lsc1;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 995
    .line 996
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 997
    .line 998
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 999
    .line 1000
    .line 1001
    invoke-direct {v1, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 1005
    .line 1006
    .line 1007
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 1008
    .line 1009
    iget-object v0, v0, Lsc1;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 1010
    .line 1011
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 1012
    .line 1013
    .line 1014
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 1015
    .line 1016
    iget-object v0, v0, Lsc1;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 1017
    .line 1018
    const/4 v3, 0x0

    .line 1019
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 1020
    .line 1021
    .line 1022
    new-instance v0, Lv8;

    .line 1023
    .line 1024
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v1

    .line 1028
    invoke-direct {v0, v1, v2}, Lv8;-><init>(Landroid/content/Context;Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;)V

    .line 1029
    .line 1030
    .line 1031
    iput-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->q0:Lv8;

    .line 1032
    .line 1033
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 1034
    .line 1035
    iget-object v1, v1, Lsc1;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 1036
    .line 1037
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 1038
    .line 1039
    .line 1040
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->n0:Lwj;

    .line 1041
    .line 1042
    iget-object v0, v0, Lwj;->g:Lk03;

    .line 1043
    .line 1044
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v1

    .line 1048
    new-instance v3, Loj;

    .line 1049
    .line 1050
    invoke-direct {v3, v2, v6}, Loj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v0, v1, v3}, Lad2;->e(Lba2;La83;)V

    .line 1054
    .line 1055
    .line 1056
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 1057
    .line 1058
    iget-object v0, v0, Lsc1;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 1059
    .line 1060
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1061
    .line 1062
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 1063
    .line 1064
    .line 1065
    const/4 v3, 0x0

    .line 1066
    invoke-direct {v1, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 1070
    .line 1071
    .line 1072
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 1073
    .line 1074
    iget-object v0, v0, Lsc1;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 1075
    .line 1076
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 1077
    .line 1078
    .line 1079
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 1080
    .line 1081
    iget-object v0, v0, Lsc1;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 1082
    .line 1083
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 1084
    .line 1085
    .line 1086
    new-instance v0, Ll7;

    .line 1087
    .line 1088
    invoke-direct {v0, v2, v10}, Ll7;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;Z)V

    .line 1089
    .line 1090
    .line 1091
    iput-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->r0:Ll7;

    .line 1092
    .line 1093
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 1094
    .line 1095
    iget-object v1, v1, Lsc1;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 1096
    .line 1097
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 1098
    .line 1099
    .line 1100
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->n0:Lwj;

    .line 1101
    .line 1102
    iget-object v0, v0, Lwj;->f:Lk03;

    .line 1103
    .line 1104
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v1

    .line 1108
    new-instance v3, Loj;

    .line 1109
    .line 1110
    invoke-direct {v3, v2, v7}, Loj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v0, v1, v3}, Lad2;->e(Lba2;La83;)V

    .line 1114
    .line 1115
    .line 1116
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 1117
    .line 1118
    iget-object v0, v0, Lsc1;->v:Landroidx/recyclerview/widget/RecyclerView;

    .line 1119
    .line 1120
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 1121
    .line 1122
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 1123
    .line 1124
    .line 1125
    iget v3, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->u0:I

    .line 1126
    .line 1127
    invoke-direct {v1, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    .line 1128
    .line 1129
    .line 1130
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 1131
    .line 1132
    .line 1133
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 1134
    .line 1135
    iget-object v0, v0, Lsc1;->v:Landroidx/recyclerview/widget/RecyclerView;

    .line 1136
    .line 1137
    new-instance v1, Lek1;

    .line 1138
    .line 1139
    iget v3, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->u0:I

    .line 1140
    .line 1141
    iget v4, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->v0:I

    .line 1142
    .line 1143
    invoke-direct {v1, v3, v4}, Lek1;-><init>(II)V

    .line 1144
    .line 1145
    .line 1146
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->i(Lkw3;)V

    .line 1147
    .line 1148
    .line 1149
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 1150
    .line 1151
    iget-object v0, v0, Lsc1;->v:Landroidx/recyclerview/widget/RecyclerView;

    .line 1152
    .line 1153
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 1154
    .line 1155
    .line 1156
    new-instance v0, Ls6;

    .line 1157
    .line 1158
    invoke-direct {v0, v2}, Ls6;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;)V

    .line 1159
    .line 1160
    .line 1161
    iput-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->s0:Ls6;

    .line 1162
    .line 1163
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 1164
    .line 1165
    iget-object v1, v1, Lsc1;->v:Landroidx/recyclerview/widget/RecyclerView;

    .line 1166
    .line 1167
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 1168
    .line 1169
    .line 1170
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->n0:Lwj;

    .line 1171
    .line 1172
    iget-object v1, v0, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 1173
    .line 1174
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v1

    .line 1178
    invoke-virtual {v0, v1}, Lwj;->c(Ljava/lang/String;)Lk03;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v0

    .line 1182
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v1

    .line 1186
    new-instance v3, Loj;

    .line 1187
    .line 1188
    invoke-direct {v3, v2, v12}, Loj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V

    .line 1189
    .line 1190
    .line 1191
    invoke-virtual {v0, v1, v3}, Lad2;->e(Lba2;La83;)V

    .line 1192
    .line 1193
    .line 1194
    new-instance v0, Lxg0;

    .line 1195
    .line 1196
    const/4 v3, 0x0

    .line 1197
    invoke-direct {v0, v3}, Lxg0;-><init>(I)V

    .line 1198
    .line 1199
    .line 1200
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 1201
    .line 1202
    iget-object v1, v1, Lsc1;->v:Landroidx/recyclerview/widget/RecyclerView;

    .line 1203
    .line 1204
    invoke-virtual {v0, v1}, Lxg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 1205
    .line 1206
    .line 1207
    return-object v8

    .line 1208
    :cond_9
    invoke-static {v10}, Lkf2;->n(Ljava/lang/String;)V

    .line 1209
    .line 1210
    .line 1211
    return-object v4

    .line 1212
    :cond_a
    invoke-static {v10}, Lkf2;->n(Ljava/lang/String;)V

    .line 1213
    .line 1214
    .line 1215
    return-object v4

    .line 1216
    :cond_b
    :goto_2
    move v1, v7

    .line 1217
    goto :goto_3

    .line 1218
    :cond_c
    move v1, v6

    .line 1219
    goto :goto_3

    .line 1220
    :cond_d
    move v7, v8

    .line 1221
    goto :goto_2

    .line 1222
    :cond_e
    move v5, v7

    .line 1223
    :cond_f
    move v1, v5

    .line 1224
    goto :goto_3

    .line 1225
    :cond_10
    move v1, v3

    .line 1226
    :cond_11
    :goto_3
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v0

    .line 1230
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v0

    .line 1234
    const-string v1, "Missing required view with ID: "

    .line 1235
    .line 1236
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v0

    .line 1240
    invoke-static {v0}, Lnz2;->n(Ljava/lang/String;)V

    .line 1241
    .line 1242
    .line 1243
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
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->w0:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->x0:La0;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 13
    .line 14
    return-void
.end method

.method public final P()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->p0:Lni4;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->t0:Lbl2;

    .line 9
    .line 10
    iput-object p0, v0, Lni4;->A:Lbl2;

    .line 11
    .line 12
    :cond_0
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
    iput-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->t0:Lbl2;

    .line 86
    .line 87
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->o0:Lli3;

    .line 88
    .line 89
    invoke-static {v7, v0}, Lbo2;->j(Lbl2;Lli3;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->o0:Lli3;

    .line 93
    .line 94
    iget-object v0, v0, Lli3;->b:Lk03;

    .line 95
    .line 96
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    new-instance v2, Loj;

    .line 101
    .line 102
    const/4 v3, 0x0

    .line 103
    invoke-direct {v2, p0, v3}, Loj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v1, v2}, Lad2;->e(Lba2;La83;)V

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->o0:Lli3;

    .line 110
    .line 111
    iget-object v0, v0, Lli3;->c:Lk03;

    .line 112
    .line 113
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    new-instance v2, Loj;

    .line 118
    .line 119
    const/4 v3, 0x3

    .line 120
    invoke-direct {v2, p0, v3}, Loj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v1, v2}, Lad2;->e(Lba2;La83;)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public final S()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->t0:Lbl2;

    .line 2
    .line 3
    invoke-static {v0}, Lsk2;->Z0(Ljava/util/concurrent/Future;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->w0:Landroid/os/Handler;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->x0:La0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

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

.method public final i0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->p0:Lni4;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->o0:Lli3;

    .line 6
    .line 7
    iget-object v0, v0, Lli3;->b:Lk03;

    .line 8
    .line 9
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->o0:Lli3;

    .line 16
    .line 17
    iget-object v1, v1, Lli3;->c:Lk03;

    .line 18
    .line 19
    invoke-virtual {v1}, Lad2;->d()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/Boolean;

    .line 24
    .line 25
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->p0:Lni4;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v1, 0x0

    .line 38
    :goto_0
    invoke-virtual {p0, v0, v1}, Lni4;->s(Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final onAlbumClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lgb;->x(Landroid/view/View;)Lv23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a009f

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onAlbumLongClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lgb;->x(Landroid/view/View;)Lv23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a009b

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onArtistClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lgb;->x(Landroid/view/View;)Lv23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a00e2

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onArtistLongClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lgb;->x(Landroid/view/View;)Lv23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a00df

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onMediaClick(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->t0:Lbl2;

    .line 2
    .line 3
    const-string v1, "TRACKS_OBJECT"

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "ITEM_POSITION"

    .line 10
    .line 11
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const-string v2, "artist"

    .line 16
    .line 17
    invoke-static {v0, v1, p1, v2}, Lbo2;->q(Lic2;Ljava/util/List;ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 21
    .line 22
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 23
    .line 24
    iget-object p0, p0, Lzg5;->n:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lau;

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    invoke-virtual {p0, p1}, Lau;->d(Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onMediaLongClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lgb;->x(Landroid/view/View;)Lv23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a0595

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
