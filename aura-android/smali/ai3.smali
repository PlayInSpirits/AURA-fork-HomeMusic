.class public Lai3;
.super Lpp0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public B0:Lvj3;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lpp0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static n0(F)F
    .locals 3

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    cmpg-float v1, p0, v0

    .line 4
    .line 5
    const/high16 v2, 0x3f000000    # 0.5f

    .line 6
    .line 7
    if-gtz v1, :cond_0

    .line 8
    .line 9
    sub-float/2addr p0, v2

    .line 10
    div-float/2addr p0, v2

    .line 11
    const/high16 v0, 0x3f400000    # 0.75f

    .line 12
    .line 13
    mul-float/2addr p0, v0

    .line 14
    const/high16 v0, 0x3e800000    # 0.25f

    .line 15
    .line 16
    :goto_0
    add-float/2addr p0, v0

    .line 17
    return p0

    .line 18
    :cond_0
    sub-float/2addr p0, v0

    .line 19
    div-float/2addr p0, v2

    .line 20
    mul-float/2addr p0, v0

    .line 21
    goto :goto_0
.end method

.method public static o0(F)F
    .locals 4

    .line 1
    const/high16 v0, 0x40000000    # 2.0f

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Math;->min(FF)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/high16 v0, 0x3e800000    # 0.25f

    .line 8
    .line 9
    invoke-static {v0, p0}, Ljava/lang/Math;->max(FF)F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/high16 v1, 0x3f800000    # 1.0f

    .line 14
    .line 15
    cmpg-float v2, p0, v1

    .line 16
    .line 17
    const/high16 v3, 0x3f000000    # 0.5f

    .line 18
    .line 19
    if-gtz v2, :cond_0

    .line 20
    .line 21
    sub-float/2addr p0, v0

    .line 22
    const/high16 v0, 0x3f400000    # 0.75f

    .line 23
    .line 24
    div-float/2addr p0, v0

    .line 25
    mul-float/2addr p0, v3

    .line 26
    add-float/2addr p0, v3

    .line 27
    return p0

    .line 28
    :cond_0
    sub-float/2addr p0, v1

    .line 29
    div-float/2addr p0, v1

    .line 30
    mul-float/2addr p0, v3

    .line 31
    add-float/2addr p0, v1

    .line 32
    return p0
.end method

.method public static p0(F)F
    .locals 1

    .line 1
    const/high16 v0, 0x40000000    # 2.0f

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Math;->min(FF)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/high16 v0, 0x3e800000    # 0.25f

    .line 8
    .line 9
    invoke-static {v0, p0}, Ljava/lang/Math;->max(FF)F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const v0, 0x3d4ccccd    # 0.05f

    .line 14
    .line 15
    .line 16
    div-float/2addr p0, v0

    .line 17
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    int-to-float p0, p0

    .line 22
    mul-float/2addr p0, v0

    .line 23
    return p0
.end method

.method public static q0(F)F
    .locals 1

    .line 1
    const/high16 v0, 0x40000000    # 2.0f

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Math;->min(FF)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/high16 v0, 0x3e800000    # 0.25f

    .line 8
    .line 9
    invoke-static {v0, p0}, Ljava/lang/Math;->max(FF)F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const v0, 0x3d4ccccd    # 0.05f

    .line 14
    .line 15
    .line 16
    div-float/2addr p0, v0

    .line 17
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    int-to-float p0, p0

    .line 22
    mul-float/2addr p0, v0

    .line 23
    return p0
.end method

.method public static r0(Landroid/widget/Button;Landroid/widget/Button;F)V
    .locals 3

    .line 1
    const/high16 v0, 0x3e800000    # 0.25f

    .line 2
    .line 3
    cmpl-float v0, p2, v0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 13
    .line 14
    .line 15
    const/high16 p0, 0x40000000    # 2.0f

    .line 16
    .line 17
    cmpg-float p0, p2, p0

    .line 18
    .line 19
    if-gez p0, :cond_1

    .line 20
    .line 21
    move v1, v2

    .line 22
    :cond_1
    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static t0(Lcom/google/android/material/materialswitch/MaterialSwitch;Landroid/view/View;ZZ)V
    .locals 3

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    move v2, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v2, v0

    .line 9
    :goto_0
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    if-eqz p3, :cond_1

    .line 15
    .line 16
    move v0, v1

    .line 17
    :cond_1
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static v0(Landroid/widget/Button;FZZF)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    cmpl-float p1, p1, v0

    .line 7
    .line 8
    if-nez p1, :cond_2

    .line 9
    .line 10
    if-nez p2, :cond_2

    .line 11
    .line 12
    if-nez p3, :cond_2

    .line 13
    .line 14
    cmpl-float p1, p4, v0

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    goto :goto_1

    .line 21
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 22
    :goto_1
    invoke-virtual {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final j0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Lkc1;->Z()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v2, 0x7f0d0046

    .line 12
    .line 13
    .line 14
    const/4 v10, 0x0

    .line 15
    invoke-virtual {v0, v2, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v11

    .line 19
    const v0, 0x7f0a0474

    .line 20
    .line 21
    .line 22
    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    move-object v3, v0

    .line 27
    check-cast v3, Landroid/widget/TextView;

    .line 28
    .line 29
    const v0, 0x7f0a046a

    .line 30
    .line 31
    .line 32
    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    move-object v4, v0

    .line 37
    check-cast v4, Landroid/widget/Button;

    .line 38
    .line 39
    const v0, 0x7f0a0473

    .line 40
    .line 41
    .line 42
    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    move-object v2, v0

    .line 47
    check-cast v2, Lcom/google/android/material/slider/Slider;

    .line 48
    .line 49
    const v0, 0x7f0a046b

    .line 50
    .line 51
    .line 52
    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    move-object v5, v0

    .line 57
    check-cast v5, Landroid/widget/Button;

    .line 58
    .line 59
    const v0, 0x7f0a0472

    .line 60
    .line 61
    .line 62
    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    move-object v6, v0

    .line 67
    check-cast v6, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 68
    .line 69
    const v0, 0x7f0a0470

    .line 70
    .line 71
    .line 72
    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    move-object v7, v0

    .line 77
    check-cast v7, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 78
    .line 79
    const v0, 0x7f0a046c

    .line 80
    .line 81
    .line 82
    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v15

    .line 86
    const v0, 0x7f0a0471

    .line 87
    .line 88
    .line 89
    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    move-object v12, v0

    .line 94
    check-cast v12, Landroid/widget/TextView;

    .line 95
    .line 96
    const v0, 0x7f0a046d

    .line 97
    .line 98
    .line 99
    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    move-object v13, v0

    .line 104
    check-cast v13, Landroid/widget/Button;

    .line 105
    .line 106
    const v0, 0x7f0a046f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    move-object v8, v0

    .line 114
    check-cast v8, Lcom/google/android/material/slider/Slider;

    .line 115
    .line 116
    const v0, 0x7f0a046e

    .line 117
    .line 118
    .line 119
    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    move-object v14, v0

    .line 124
    check-cast v14, Landroid/widget/Button;

    .line 125
    .line 126
    const/4 v0, 0x1

    .line 127
    new-array v9, v0, [Z

    .line 128
    .line 129
    move-object/from16 p1, v10

    .line 130
    .line 131
    const/4 v10, 0x0

    .line 132
    aput-boolean v10, v9, v10

    .line 133
    .line 134
    filled-new-array/range {p1 .. p1}, [Landroid/widget/Button;

    .line 135
    .line 136
    .line 137
    move-result-object v16

    .line 138
    invoke-static {}, Lu52;->c()Lv52;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iget-boolean v0, v0, Lv52;->a:Z

    .line 143
    .line 144
    const/high16 v10, 0x3f800000    # 1.0f

    .line 145
    .line 146
    if-eqz v0, :cond_0

    .line 147
    .line 148
    invoke-static {}, Lu52;->c()Lv52;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    iget v0, v0, Lv52;->y:F

    .line 153
    .line 154
    move-object/from16 v18, v9

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_0
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    move-object/from16 v18, v9

    .line 169
    .line 170
    const-string v9, "playback_speed"

    .line 171
    .line 172
    invoke-interface {v0, v9, v10}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    :goto_0
    invoke-static {v0}, Lai3;->q0(F)F

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 181
    .line 182
    .line 183
    move-result-object v9

    .line 184
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    move-object/from16 v19, v11

    .line 192
    .line 193
    const-string v11, "playback_speed_manual_pitch_value"

    .line 194
    .line 195
    invoke-interface {v9, v11, v10}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 196
    .line 197
    .line 198
    move-result v9

    .line 199
    invoke-static {v9}, Lai3;->p0(F)F

    .line 200
    .line 201
    .line 202
    move-result v9

    .line 203
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    const-string v11, "playback_speed_pitch"

    .line 215
    .line 216
    move-object/from16 v20, v15

    .line 217
    .line 218
    const/4 v15, 0x0

    .line 219
    invoke-interface {v10, v11, v15}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 220
    .line 221
    .line 222
    move-result v10

    .line 223
    invoke-virtual {v6, v10}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 224
    .line 225
    .line 226
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    const-string v11, "playback_speed_manual_pitch"

    .line 238
    .line 239
    invoke-interface {v10, v11, v15}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 240
    .line 241
    .line 242
    move-result v10

    .line 243
    invoke-virtual {v7, v10}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 244
    .line 245
    .line 246
    const/high16 v10, 0x3f000000    # 0.5f

    .line 247
    .line 248
    invoke-virtual {v2, v10}, Lcom/google/android/material/slider/Slider;->setValueFrom(F)V

    .line 249
    .line 250
    .line 251
    const/high16 v11, 0x3fc00000    # 1.5f

    .line 252
    .line 253
    invoke-virtual {v2, v11}, Lcom/google/android/material/slider/Slider;->setValueTo(F)V

    .line 254
    .line 255
    .line 256
    const/4 v11, 0x0

    .line 257
    invoke-virtual {v2, v11}, Lcom/google/android/material/slider/Slider;->setStepSize(F)V

    .line 258
    .line 259
    .line 260
    new-instance v11, Lrh3;

    .line 261
    .line 262
    invoke-direct {v11, v1, v15}, Lrh3;-><init>(Lai3;I)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2, v11}, Lcom/google/android/material/slider/Slider;->setLabelFormatter(Lp42;)V

    .line 266
    .line 267
    .line 268
    invoke-static {v0}, Lai3;->o0(F)F

    .line 269
    .line 270
    .line 271
    move-result v11

    .line 272
    invoke-virtual {v2, v11}, Lcom/google/android/material/slider/Slider;->setValue(F)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v8, v10}, Lcom/google/android/material/slider/Slider;->setValueFrom(F)V

    .line 276
    .line 277
    .line 278
    const/high16 v10, 0x3fc00000    # 1.5f

    .line 279
    .line 280
    invoke-virtual {v8, v10}, Lcom/google/android/material/slider/Slider;->setValueTo(F)V

    .line 281
    .line 282
    .line 283
    const/4 v10, 0x0

    .line 284
    invoke-virtual {v8, v10}, Lcom/google/android/material/slider/Slider;->setStepSize(F)V

    .line 285
    .line 286
    .line 287
    new-instance v10, Lrh3;

    .line 288
    .line 289
    const/4 v11, 0x1

    .line 290
    invoke-direct {v10, v1, v11}, Lrh3;-><init>(Lai3;I)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v8, v10}, Lcom/google/android/material/slider/Slider;->setLabelFormatter(Lp42;)V

    .line 294
    .line 295
    .line 296
    invoke-static {v9}, Lai3;->o0(F)F

    .line 297
    .line 298
    .line 299
    move-result v10

    .line 300
    invoke-virtual {v8, v10}, Lcom/google/android/material/slider/Slider;->setValue(F)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1, v3, v0}, Lai3;->x0(Landroid/widget/TextView;F)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1, v12, v9}, Lai3;->u0(Landroid/widget/TextView;F)V

    .line 307
    .line 308
    .line 309
    invoke-static {v4, v5, v0}, Lai3;->r0(Landroid/widget/Button;Landroid/widget/Button;F)V

    .line 310
    .line 311
    .line 312
    invoke-static {v13, v14, v9}, Lai3;->r0(Landroid/widget/Button;Landroid/widget/Button;F)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v6}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    invoke-virtual {v7}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    move-object/from16 v15, v20

    .line 324
    .line 325
    invoke-static {v7, v15, v0, v9}, Lai3;->t0(Lcom/google/android/material/materialswitch/MaterialSwitch;Landroid/view/View;ZZ)V

    .line 326
    .line 327
    .line 328
    new-instance v0, Lwh3;

    .line 329
    .line 330
    move-object v9, v2

    .line 331
    move-object v2, v3

    .line 332
    move-object v3, v4

    .line 333
    move-object v4, v5

    .line 334
    move-object/from16 v5, v16

    .line 335
    .line 336
    invoke-direct/range {v0 .. v9}, Lwh3;-><init>(Lai3;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;[Landroid/widget/Button;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/slider/Slider;Lcom/google/android/material/slider/Slider;)V

    .line 337
    .line 338
    .line 339
    move-object v10, v5

    .line 340
    move-object v5, v4

    .line 341
    move-object v4, v3

    .line 342
    move-object v3, v2

    .line 343
    move-object v2, v9

    .line 344
    move-object v9, v8

    .line 345
    move-object v8, v6

    .line 346
    iget-object v1, v2, Luq;->y:Ljava/util/ArrayList;

    .line 347
    .line 348
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    new-instance v0, Lxh3;

    .line 352
    .line 353
    const/4 v6, 0x0

    .line 354
    move-object/from16 v1, p0

    .line 355
    .line 356
    invoke-direct/range {v0 .. v6}, Lxh3;-><init>(Lai3;Lcom/google/android/material/slider/Slider;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;I)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 360
    .line 361
    .line 362
    new-instance v0, Lxh3;

    .line 363
    .line 364
    const/4 v6, 0x1

    .line 365
    invoke-direct/range {v0 .. v6}, Lxh3;-><init>(Lai3;Lcom/google/android/material/slider/Slider;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;I)V

    .line 366
    .line 367
    .line 368
    move-object v11, v3

    .line 369
    move-object/from16 v16, v4

    .line 370
    .line 371
    move-object/from16 v17, v12

    .line 372
    .line 373
    move-object v12, v5

    .line 374
    invoke-virtual {v12, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 375
    .line 376
    .line 377
    new-instance v0, Lyh3;

    .line 378
    .line 379
    move-object v5, v2

    .line 380
    move-object v2, v7

    .line 381
    move-object v6, v9

    .line 382
    move-object v4, v10

    .line 383
    move-object v3, v15

    .line 384
    move-object/from16 v7, v18

    .line 385
    .line 386
    invoke-direct/range {v0 .. v7}, Lyh3;-><init>(Lai3;Lcom/google/android/material/materialswitch/MaterialSwitch;Landroid/view/View;[Landroid/widget/Button;Lcom/google/android/material/slider/Slider;Lcom/google/android/material/slider/Slider;[Z)V

    .line 387
    .line 388
    .line 389
    move-object v3, v6

    .line 390
    move-object v7, v2

    .line 391
    move-object v2, v5

    .line 392
    move-object v5, v4

    .line 393
    invoke-virtual {v8, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 394
    .line 395
    .line 396
    new-instance v0, Lzh3;

    .line 397
    .line 398
    move-object v6, v2

    .line 399
    move-object v2, v7

    .line 400
    move-object v4, v8

    .line 401
    move-object/from16 v8, v18

    .line 402
    .line 403
    move-object v7, v3

    .line 404
    move-object v3, v15

    .line 405
    invoke-direct/range {v0 .. v8}, Lzh3;-><init>(Lai3;Lcom/google/android/material/materialswitch/MaterialSwitch;Landroid/view/View;Lcom/google/android/material/materialswitch/MaterialSwitch;[Landroid/widget/Button;Lcom/google/android/material/slider/Slider;Lcom/google/android/material/slider/Slider;[Z)V

    .line 406
    .line 407
    .line 408
    move-object v3, v7

    .line 409
    move-object v7, v2

    .line 410
    move-object v2, v6

    .line 411
    invoke-virtual {v7, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 412
    .line 413
    .line 414
    new-instance v0, Lwh3;

    .line 415
    .line 416
    move-object v9, v3

    .line 417
    move-object v8, v7

    .line 418
    move-object v3, v13

    .line 419
    move-object/from16 v2, v17

    .line 420
    .line 421
    move-object v7, v4

    .line 422
    move-object v4, v14

    .line 423
    invoke-direct/range {v0 .. v9}, Lwh3;-><init>(Lai3;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;[Landroid/widget/Button;Lcom/google/android/material/slider/Slider;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/slider/Slider;)V

    .line 424
    .line 425
    .line 426
    move-object v10, v4

    .line 427
    move-object v4, v2

    .line 428
    move-object v2, v6

    .line 429
    move-object v6, v10

    .line 430
    move-object v10, v5

    .line 431
    move-object v5, v3

    .line 432
    move-object v3, v9

    .line 433
    move-object v9, v8

    .line 434
    move-object v8, v7

    .line 435
    iget-object v1, v3, Luq;->y:Ljava/util/ArrayList;

    .line 436
    .line 437
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    new-instance v0, Lsh3;

    .line 441
    .line 442
    const/4 v7, 0x0

    .line 443
    move-object/from16 v1, p0

    .line 444
    .line 445
    invoke-direct/range {v0 .. v7}, Lsh3;-><init>(Lai3;Lcom/google/android/material/slider/Slider;Lcom/google/android/material/slider/Slider;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;I)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 449
    .line 450
    .line 451
    new-instance v0, Lsh3;

    .line 452
    .line 453
    const/4 v7, 0x1

    .line 454
    invoke-direct/range {v0 .. v7}, Lsh3;-><init>(Lai3;Lcom/google/android/material/slider/Slider;Lcom/google/android/material/slider/Slider;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;I)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 458
    .line 459
    .line 460
    new-instance v0, Lvg2;

    .line 461
    .line 462
    invoke-virtual/range {p0 .. p0}, Lkc1;->X()Lnc1;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    const/4 v7, 0x0

    .line 467
    invoke-direct {v0, v1, v7}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 468
    .line 469
    .line 470
    const v1, 0x7f1303ca

    .line 471
    .line 472
    .line 473
    invoke-virtual {v0, v1}, Lvg2;->p(I)V

    .line 474
    .line 475
    .line 476
    move-object/from16 v1, v19

    .line 477
    .line 478
    invoke-virtual {v0, v1}, Lvg2;->q(Landroid/view/View;)Lvg2;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    const v1, 0x7f1303c9

    .line 483
    .line 484
    .line 485
    move-object/from16 v7, p1

    .line 486
    .line 487
    invoke-virtual {v0, v1, v7}, Lvg2;->k(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 488
    .line 489
    .line 490
    new-instance v1, Lwr;

    .line 491
    .line 492
    const/4 v7, 0x5

    .line 493
    invoke-direct {v1, v7}, Lwr;-><init>(I)V

    .line 494
    .line 495
    .line 496
    const v7, 0x7f1303c8

    .line 497
    .line 498
    .line 499
    invoke-virtual {v0, v7, v1}, Lvg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-virtual {v0}, Lvg2;->create()Lf9;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    move-object v7, v3

    .line 508
    move-object v3, v0

    .line 509
    new-instance v0, Lvh3;

    .line 510
    .line 511
    move-object v1, v4

    .line 512
    move-object v4, v2

    .line 513
    move-object v2, v10

    .line 514
    move-object v10, v1

    .line 515
    move-object/from16 v1, p0

    .line 516
    .line 517
    move-object v13, v5

    .line 518
    move-object v14, v6

    .line 519
    move-object v5, v8

    .line 520
    move-object v6, v9

    .line 521
    move-object v9, v11

    .line 522
    move-object/from16 v11, v16

    .line 523
    .line 524
    move-object/from16 v8, v18

    .line 525
    .line 526
    invoke-direct/range {v0 .. v15}, Lvh3;-><init>(Lai3;[Landroid/widget/Button;Lf9;Lcom/google/android/material/slider/Slider;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/slider/Slider;[ZLandroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/view/View;)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v3, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 530
    .line 531
    .line 532
    return-object v3
.end method

.method public final s0(Lcom/google/android/material/slider/Slider;Lcom/google/android/material/slider/Slider;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;F)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/google/android/material/slider/Slider;->getValue()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lai3;->n0(F)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-float/2addr v0, p6

    .line 10
    invoke-static {v0}, Lai3;->p0(F)F

    .line 11
    .line 12
    .line 13
    move-result p6

    .line 14
    invoke-static {p6}, Lai3;->o0(F)F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p2, v0}, Lcom/google/android/material/slider/Slider;->setValue(F)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p3, p6}, Lai3;->u0(Landroid/widget/TextView;F)V

    .line 22
    .line 23
    .line 24
    invoke-static {p4, p5, p6}, Lai3;->r0(Landroid/widget/Button;Landroid/widget/Button;F)V

    .line 25
    .line 26
    .line 27
    invoke-static {p6}, Lud3;->s0(F)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lai3;->B0:Lvj3;

    .line 31
    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/google/android/material/slider/Slider;->getValue()F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-static {p1}, Lai3;->n0(F)F

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-static {p1}, Lai3;->q0(F)F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-virtual {p0, p1}, Lvj3;->a(F)V

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void
.end method

.method public final u0(Landroid/widget/TextView;F)V
    .locals 1

    .line 1
    const/high16 v0, 0x42c80000    # 100.0f

    .line 2
    .line 3
    mul-float/2addr p2, v0

    .line 4
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    const v0, 0x7f1303cf

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0, p2}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final w0(Lcom/google/android/material/slider/Slider;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;F)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/google/android/material/slider/Slider;->getValue()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lai3;->n0(F)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-float/2addr v0, p5

    .line 10
    invoke-static {v0}, Lai3;->q0(F)F

    .line 11
    .line 12
    .line 13
    move-result p5

    .line 14
    invoke-static {p5}, Lai3;->o0(F)F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p1, v0}, Lcom/google/android/material/slider/Slider;->setValue(F)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p2, p5}, Lai3;->x0(Landroid/widget/TextView;F)V

    .line 22
    .line 23
    .line 24
    invoke-static {p3, p4, p5}, Lai3;->r0(Landroid/widget/Button;Landroid/widget/Button;F)V

    .line 25
    .line 26
    .line 27
    invoke-static {p5}, Lud3;->r0(F)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lai3;->B0:Lvj3;

    .line 31
    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0, p5}, Lvj3;->a(F)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public final x0(Landroid/widget/TextView;F)V
    .locals 1

    .line 1
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const v0, 0x7f1303d6

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0, p2}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
